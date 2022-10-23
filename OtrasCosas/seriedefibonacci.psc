Algoritmo seriedefibonacci
	num1 <- 0
	num2 <- 1
	num3 <- 0
	vueltas <- 0
	contador <- 0
	continuar <- "S"
	Repetir
		Escribir "Dime cuantos caracteres imprimir: "
		Leer vueltas
		Repetir
			Escribir "[ ", num1 " ]"
			num3 <- num1 + num2 
			num1 <- num2 
			num2 <- num3 
			contador <- contador + 1
		Hasta Que contador == vueltas
		Escribir "¿Quieres continuar?, Escribe S para si (cualquier otro caracter sera considerado como no.)"
		Leer continuar 
		contador <- 0
		num1 <- 0
		num2 <- 1
	Hasta Que (continuar <> "S") y (continuar <> "s")
FinAlgoritmo
