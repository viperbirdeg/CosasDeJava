Algoritmo comparaciondetresnumeros
	Escribir 'Comparar si un numero es mayor que otros dos'
	num1 <- 0
	num2 <- 0
	num3 <- 0
	Escribir 'Ingresa el numero uno:'
	Leer num1
	Escribir 'Ingresa el numero dos:'
	Leer num2
	Escribir 'Ingresa el numero tres:'
	Leer num3
	Si (num1==num2) Y (num2==num3) Entonces
		Escribir 'Los tres numeros son iguales'
	SiNo
		Si (num1>num2) Y (num1>num3) Entonces
			Escribir 'El numero uno es mayor'
		SiNo
			Si (num2>num1) Y (num2>num3) Entonces
				Escribir 'El numero dos es mayor'
			SiNo
				Si (num3>num1) Y (num3>num2) Entonces
					Escribir 'El numero tres es mayor'
				SiNo
					Si (num1==num2) Y (num1<>num3) Entonces
						Escribir 'Los numeros uno y dos son mayores e iguales '
					SiNo
						Si (num2==num3) Y (num2<>num1) Entonces
							Escribir 'Los numeros dos y tres son mayores e iguales '
						SiNo
							Si (num1==num3) Y (num1<>num2) Entonces
								Escribir 'Los numeros uno y tres son mayores e iguales '
							SiNo
								Escribir 'Lo siento carnal no se pudo.'
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
