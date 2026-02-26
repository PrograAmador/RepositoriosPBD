<?php
	// Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
	// Es posible que el codigo generado no sea completamente correcto. Si encuentra
	// errores por favor reportelos en el foro (http://pseint.sourceforge.net).

	$stdin = fopen('php://stdin', 'r');
	// Para leer variables de texto se utiliza una $x=rtrim(fgets($stdin) porque el string
	// que lee fgets incluye el caracter de fin de linea (entonces se usa rtrim para
	// quitarlo); y la alternativa fscanf($stdin,"%s",$x) solo lee una palabra (lo cual
	// no sería equivalente a la instrucción Leer del pseudocódigo).
	
	echo 'Hola Alberto Programer', PHP_EOL;
	echo 'Introduce dos numeros: ', PHP_EOL;
	$num1 = rtrim(fgets($stdin), PHP_EOL);
	$num2 = rtrim(fgets($stdin), PHP_EOL);
	$num3 = $num1+$num2;
	echo 'El resultado es: ', $num3, PHP_EOL;
?>
