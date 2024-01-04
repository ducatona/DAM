//Algoritmo que permite introducir un n�mero por teclado un n�mero natural mayor 
//que 1 y deber� devolver un mensaje diciendo sin el n�mero es primo. Adem�s, 
//deber� devolver si el n�mero introducido es par o impar. Se debe asegurar que el 
//n�mero introducido sea siempre natural y mayor que 1. (Un n�mero primo es todo 
//aquel que tenga como �nicos divisores �l mismo y el n�mero 1).

Algoritmo ejercicio1
	
	Definir num Como Entero;
	Definir aux Como Logico;
	
	aux=Falso;
	
	Repetir
		
		Escribir "Dime un numero en numero entero mayor que 1"
		Leer num
		
		Si num MOD 2 == 0  Entonces
			Escribir "El numero introducido  es par";
		SiNo
			Escribir "El numero introducido es impar";
		Fin Si
		
	Hasta Que num>1
	
	Para i=2 Hasta num-1 Con Paso 1 Hacer
		Si num MOD i ==0 Entonces
			aux=Verdadero;
		Fin Si
	Fin Para
	Si aux==Falso Entonces
		Escribir "Ademas es primo";
	SiNo
		Escribir "Ademas no es primo";
	Fin Si
FinAlgoritmo
