Algoritmo coprimos
	num1 <- 0
	num2 <- 0 
	num3 <- 0 
	continuar <- "S"
	Repetir
		Escribir "Dime que numeros quieres evaluar: "
		Leer num1 , num2 
		Si num1 == num2 Entonces 
			Escribir "Los numeros no son coprimos."
		SiNo 
			si num2 > num1 Entonces 
				num3 <- num2 
				num2 <- num1 
				num1 <- num3 
				num3 <- 0 
			FinSi
			Mientras num1 mod num2 <> 0 Hacer
				num3 <- num1 mod num2 
				num1 <- num2 
				num2 <- num3 
			Fin Mientras
			Si num2 == 1 Entonces 
				Escribir "Los numeros son coprimos."
			SiNo 
				Escribir "Los numeros no son coprimos."
				
			FinSi
		FinSi
		Escribir "¿Quieres continuar?, Escribe S para si (cualquier otro caracter sera considerado como no)."
		Leer continuar 
	Hasta Que (continuar <> "S") y (continuar <> "s")	
FinAlgoritmo
