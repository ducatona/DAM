Algoritmo Ejercicio12
	Definir anno Como Entero;
	
	Escribir "Ingresa un a�o";
	leer anno;
	si ano mod 4 == 0 Entonces
		si a�o mod 100 == 0 Entonces
			si a�o mod 400 == 0 Entonces
				Escribir "El a�o ",anno," es bisiesto";
			sino
				Escribir "El a�o ",anno," no es bisiesto";
			FinSi
		SiNo
			Escribir "El a�o ",anno," es bisiesto";
		FinSi
	SiNo
		Escribir "El a�o ",anno," no es bisiesto";
	FinSi
FinAlgoritmo
