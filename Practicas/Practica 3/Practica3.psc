Algoritmo Practica3
	Escribir "**Bienvenido al raton jugueton**"
	Escribir "Leyendo altura (cm)..."
	Leer altura;
	
	Si altura < 0 O altura > 230
		Escribir "Error de lectura, baja de la bascula y vuelve a subir."
	FinSi
	
	Si altura < 140 Y altura > 0
		diferencia <- 140 - altura
		Escribir "Lo siento, te faltan " diferencia "cms para subir"
	FinSi
	
	Escribir "Leyendo peso (kg)..."
	Leer peso;
	pesomin <- altura * 2/8
	
	Si peso > 120 
		Escribir "Lo siento. Sobrepasas " peso-120 "kg el limite de la atracción"
		SiNo
			Si peso < pesomin 
				Escribir "Lo siento. Te faltan " pesomin-peso "kg para subir a la atracción"
			SiNo
				Escribir "Pesas " peso "kg, Peso minimo calculado: " pesomin
				Escribir "¡¡SUBE A LA ATRACCIÓN¡¡"
			Finsi
	Finsi
	
FinAlgoritmo
