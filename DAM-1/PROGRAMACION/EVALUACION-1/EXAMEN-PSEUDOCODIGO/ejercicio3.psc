//Algoritmo que devuelve la suma de los n�meros pares comprendidos entre 0 y 50.

Algoritmo ejercicio3
	//DECLARACI�N DE VARIABLES A USAR
	Definir suma Como Entero
	
	//ESTRUCTURA DE CONTROL PARA SUMAR SOLO LOS PARES
	Para i=0 Hasta 50 Con Paso 1 Hacer
		Si i MOD 2 == 0 Entonces
			suma=suma+i
		Fin Si
	Fin Para
	
	//MOSTRAR LA SUMA AL USUARIO
	Escribir "La suma de los n�meros pares comprendidos entre 0 y 50 es " suma;
	
FinAlgoritmo
