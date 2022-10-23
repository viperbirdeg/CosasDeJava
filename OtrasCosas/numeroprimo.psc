Algoritmo numeroprimo
	continuar <- "S"
	evaluar <- 0
	Escribir "Dame el numero a evaluar:"
	Leer evaluar
	Si evaluar = 1 Entonces
		Escribir "El numero es primo."
	SiNo 
		Si evaluar = 2
			Escribir "El numero es primo."
		SiNo 
			Para i <- evaluar Hasta evaluar con paso -1 hacer 
				
				
			FinPara
		FinSi
	FinSi
	Repetir
		Escribir "¿Quieres continuar?, Escribe S para si (cualquier otro caracter sera considerado como no.)"
		Leer continuar 
	Hasta Que (continuar <> "S") y (continuar <> "s")
FinAlgoritmo
