Algoritmo ejercicio1
	
	Definir n Como Entero
	Definir i Como Entero
	Definir contador Como Entero
	
	contador=0
	
	Repetir
		Escribir "Introduce un n�mero entero mayor que 1 para comprobar si es primo y par o impar."
		Leer n
	Hasta Que n>1
	
	
	Para i=1 Hasta n Con Paso 1
		si n mod i == 0
			contador = contador+1
		FinSi
	FinPara
	
	si contador == 2
		Escribir "El n�mero es primo."
	SiNo
		Escribir "El n�mero introducido no es primo."
	FinSi
	
	si n mod 2 == 0
		Escribir "El n�mero es par."
	SiNo
		Escribir "El n�mero es impar."
	FinSi
	
FinAlgoritmo
