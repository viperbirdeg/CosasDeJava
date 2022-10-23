Algoritmo numeroparoimpar
	num1 <- 0
	continuar <- 'S'
	Mientras continuar == 'S' o continuar == 's' Hacer
		Escribir "Dame el numero a evaluar."
		Leer num1
		Si num1 mod 2 = 0 Entonces 
			Escribir "El numero es par"
		SiNo
			Escribir "El numero es impar"
		FinSi
		Escribir '¿Quieres continuar?, Escribe S para si (cualquier otro caracter sera tomado como no)'
		Leer continuar
	FinMientras

FinAlgoritmo
