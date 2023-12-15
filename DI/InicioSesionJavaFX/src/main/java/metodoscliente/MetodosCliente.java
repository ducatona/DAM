/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodoscliente;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author damt223
 */
public class MetodosCliente implements Serializable{

    private Socket servidor;
    private String ruta;

    public MetodosCliente(Socket servidor, String ruta) {
        this.servidor = servidor;

        // Esta ruta sirve para saber donde guardar los archivos
        this.ruta = ruta;
    }

    public void recibirArchivoZip(String nombreJuego) throws IOException {

        DataInputStream dis = new DataInputStream(servidor.getInputStream());
        DataOutputStream dos = new DataOutputStream(servidor.getOutputStream());

        System.out.printf("Pidiendo juego: %s\n", nombreJuego);

        dos.writeUTF(nombreJuego);

        System.out.println("Se ha enviado la peticion del archivo");

        String rutaArchivo = ruta + nombreJuego + ".zip"; // Ajusta la ruta según tu estructura

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(rutaArchivo))) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            System.out.println("Recibiendo archivo: " + nombreJuego + ".zip");

            // Recibimos y escribimos el archivo zip
            while ((bytesRead = dis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            System.out.printf("Archivo %s.zip recibido con éxito y guardado en: %s", nombreJuego, rutaArchivo);
        } catch (IOException e) {
            System.err.println("Error al recibir el archivo: " + e.getMessage());
        }
        descomprimirZip(rutaArchivo, ruta + nombreJuego); // Ajusta la ruta según tu estructura

        // Descargar Caratula
        dis.close();
        dos.close();

        servidor.close();
        System.out.println("Se cierra la conexcion por parte del cliente");
    }

    public void enviarArchivoZip(String nombreJuego) throws IOException {
        try{
            DataInputStream dis = new DataInputStream(servidor.getInputStream()); 
            DataOutputStream dos = new DataOutputStream(servidor.getOutputStream());
            
            System.out.printf("Mandando juego: %s\n", nombreJuego);

            dos.writeUTF(nombreJuego);

            // Poner la URL correspondiente que se pedirá por un botón
            String rutaArchivo = ruta + nombreJuego + ".zip"; // Esta línea se cambiará para que la ruta sea igual a la ruta indicada en la interfaz gráfica

            // Enviamos el archivo zip al servidor
            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(rutaArchivo))) {
                byte[] buffer = new byte[1024];
                int bytesRead;

                while ((bytesRead = bis.read(buffer)) != -1) {
                    dos.write(buffer, 0, bytesRead);
                }

                System.out.printf("Archivo %s.zip enviado al servidor con éxito.\n", nombreJuego);
            } catch (IOException e) {
                System.err.println("Error al enviar el archivo: " + e.getMessage());
            }
            
        } finally {
            // Cierra la conexión
            servidor.close();
            System.out.println("Se ha cerrado la conexión del servidor\n");
        }
    }
    
    public void mandarImagen(String nombreImagen){
        try {
            DataInputStream dis = new DataInputStream(servidor.getInputStream()); 
            DataOutputStream dos = new DataOutputStream(servidor.getOutputStream());
            
            System.out.printf("Enviando imagen: %s\n", nombreImagen);
            
            // Enviar el nombre del archivo al servidor
            dos.writeUTF(nombreImagen);
            
            // Obtener el tamaño de la imagen
            FileInputStream fis = new FileInputStream(ruta+nombreImagen);
            long fileSize = fis.available();
            
            // Enviar el tamaño de la imagen al servidor
            dos.writeLong(fileSize);
            
            // Enviar la imagen al servidor
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                dos.write(buffer, 0, bytesRead);
            }
            
            fis.close();
            System.out.println("Imagen enviada al servidor: " + nombreImagen);
        } catch (IOException ex) {
            Logger.getLogger(MetodosCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void recibirImagen(String nombreImagen) {
        try {
            DataInputStream dis = new DataInputStream(servidor.getInputStream());
            
            // Lee el nombre del archivo
            String fileName = dis.readUTF();
            System.out.println("Recibiendo imagen: " + fileName);
            
            // Lee el tamaño de la imagen
            long fileSize = dis.readLong();
            System.out.println("Tamaño de la imagen: " + fileSize + " bytes");
            
            // Lee la imagen y guárdala en el servidor
            FileOutputStream fos = new FileOutputStream(ruta+fileName);
            byte[] buffer = new byte[1024];
            int bytesRead;
            while (fileSize > 0 && (bytesRead = dis.read(buffer, 0, (int) Math.min(buffer.length, fileSize))) != -1) {
                fos.write(buffer, 0, bytesRead);
                fileSize -= bytesRead;
            }
            
            fos.close();
            System.out.println("Imagen recibida y guardada como " + fileName);
        } catch (IOException ex) {
            Logger.getLogger(MetodosCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void descomprimirZip(String urlArchivo, String destino) {
        try {
            String comando = String.format("powershell Expand-Archive -Path \"%s\" -DestinationPath \"%s\"", urlArchivo, destino);
            Process proceso = Runtime.getRuntime().exec(comando);

            // Esperar a que el proceso termine
            int resultado = proceso.waitFor();

            if (resultado == 0) {
                System.out.println("Descompresión completada con éxito.");
            } else {
                System.out.println("Error al descomprimir el archivo. Código de salida: " + resultado);
            }

        } catch (IOException | InterruptedException ex) {
            System.out.println("Error al ejecutar el comando unzip: " + ex.getMessage());
            ex.printStackTrace();
        }

        // Eliminar el archivo ZIP después de descomprimir
        if (new File(urlArchivo).delete()) {
            System.out.println("Archivo ZIP eliminado con éxito.");
        } else {
            System.out.println("No se pudo eliminar el archivo ZIP.");
        }
    }

    public static void generarPedido(int opcion, String rutaC, String nombreJuego, String nombreImagen) {
        final String direccion = "127.0.0.1";
        final int PUERTO = 6666;
        
        try {
            Socket servidor = new Socket(direccion, PUERTO);
            String ruta = rutaC; // Esta ruta va a ser donde se guarden los juegos
            MetodosCliente metodos = new MetodosCliente(servidor, ruta);
            HiloCliente hilo = new HiloCliente(metodos, servidor, opcion, nombreJuego, nombreImagen);

            hilo.start();

        } catch (IOException ex) {
            Logger.getLogger(MetodosCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
