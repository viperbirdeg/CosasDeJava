Algoritmo calculodehrs
	Escribir "Desarrolle un algoritmo que permita calcular la nomina de unos trabajadores."
	horas <- 0
	dias <- 0
	salario <- 0
	horasextra1 <- 0
	horasextra2 <- 0 
	continuar <- "S"
	nomina <- 0
	salario = 100
	Repetir
	Escribir "Ingrese el numero de horas trabajadas por dia."
	Leer horas
	Escribir "Ingresa la horas extra de dias de semana y horas en sabado."
	Leer horasextra1
	Escribir "Ingresa las horas trabajadas en domingo."
	Leer horasextra2
	Si horas <= 8 y horas >= 0 Entonces 
		nomina <- horas * salario
	SiNO 
		Si >= 
			
		FinSi
	SiNo
	FinSi
	Escribir "¿Quieres reiniciar?, Escribe S para si (cualquier otro caracter sera considerado como no.)"
	Leer continuar 
Hasta Que (continuar <> "S") y (continuar <> "s")


FinAlgoritmo
// doble hasta 3 horas en semana y doble el sabado, triple el domingo, 