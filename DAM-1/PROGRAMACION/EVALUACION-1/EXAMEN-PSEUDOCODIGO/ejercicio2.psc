//Algoritmo que permite introducir cinco n�meros por teclado y devuelve cu�ntos son 
//positivos, cu�ntos negativos y cu�ntos son cero

Algoritmo ejercicio2
	//DECLARACI�N DE VARIABLES A USAR
	Definir num Como Entero
	Definir contadorp Como Entero
	Definir contadorn Como Entero
	Definir contadoro Como Entero
	
	//ESTRUCTURA DE CONTROL QUE PERMITE 5 INTRODUCIONES POR TECLADO
	Para i=1 Hasta 5 Con Paso 1 Hacer
		Escribir "Dime un numero";
		Leer num
		//ESTRUCTURA QUE CUENTA LOS NEGATIVOS,POSITIVOS Y CEROS
		Si num<0 Entonces
			contadorn=contadorn+1;
		SiNo
			Si num>0 Entonces
				contadorp=contadorp+1;
			SiNo
				contadoro=contadoro+1
			Fin Si
		Fin Si
		 
	Fin Para
	
	Escribir "He contado "  contadorn  " numeros negativos, " contadorp " numeros positivos y " contadoro " ceros";
FinAlgoritmo
