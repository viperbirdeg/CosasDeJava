Algoritmo compararnumeros	
	Escribir "Ejemplo para comparar cual de dos numeros es mayor"
	
	num1<- 0
	num2 <- 0 
	
	Escribir "Ingresa el numero uno:"
	Leer num1
	Escribir "Ingresa el numero dos:"
	Leer num2

	Si num1 == num2 Entonces
		Escribir "Los dos numeros son iguales"
	SiNo 
		Si num1 es mayor que num2 Entonces
			Escribir "El primer numero es mayor y es: ", num1
		SiNO	
			Escribir "El segundo numero es mayor y es: ", num2
		Fin Si
	Fin si 
FinAlgoritmo
