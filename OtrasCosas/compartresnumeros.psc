Algoritmo comparartresnumeros	//En configuracion
	Escribir "Comparar si un numero es mayor que otros dos"
		
	num1 <- 0
	num2 <- 0 
	num3 <- 0
		
	Escribir "Ingresa el numero uno:"
	Leer num1
	Escribir "Ingresa el numero dos:"
	Leer num2
	Escribir "Ingresa el numero tres:"
	Leer num3
		
	Si (num1 == num2) y (num1 == num3) Entonces
		Escribir "Los tres numeros son iguales" 
	SiNo
		Si (num1 == num2) y (num1 > num3) Entonces 
			Escribir "Los numeros uno y dos son iguales"
		SiNo 
			Escribir "El numero tres es mayor y es: ", num3
		FinSi
		Si (num1 == num3) y (num1 > num2) Entonces 
			Escribir "Los numeros uno y tres son iguales"
		SiNo
			Escribir "El numero dos es mayor y es: ", num2
		FinSi
		Si (num2 == num3) y (num2 > num1)
			Escribir "Los numeros dos y tres son iguales"
		SiNo 
			Escribir "El numero uno es mayor y es: ", num1
		FinSi
	FinSi
FinAlgoritmo
