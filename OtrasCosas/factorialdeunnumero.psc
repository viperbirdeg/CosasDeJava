Algoritmo factorialdeunnumero
	num1 <- 0            // Crea las variables
	num2 <- 0
	continuar <- 'S'
	vueltas <- 0
	contador <- 0

	Mientras continuar == 'S' o continuar == 's' Hacer		//Para continuar el codigo
		Escribir 'Dame el numero a factorializar.(En caso de no poner nada, se guardara como 0) '
		Leer num1
		num2 <- num1			//Guarda el valor final y una copia del original 
		Si num1 == 0 o num1 ==1 Entonces			//Los factoriales de 0 y 1 son 1
			Escribir '1'
		SiNo
			Repetir
				num1 <- num1 * (num2 - 1)		// hace la operacion 
				num2 <- num2 - 1					// cambia el valor original
			Hasta Que num2 - 1 == 0			//evita que multiplique por 0
			Escribir num1
		Fin Si
		Escribir '¿Quieres continuar?, Escribe S para si (cualquier otro caracter sera tomado como no)'
		Leer continuar
	FinMientras
FinAlgoritmo
