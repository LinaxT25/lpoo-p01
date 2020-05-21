a)
	if (age >= 65)
		System.out.println("Age is greater than or equal to 65");
	else
		System.out.println("Age is less than 65");

(b)
	int x = 1, total = 0; //variavel "total" não foi inicializado
	while ( x <= 10)
	{
		total += x;
		++x;
	}
	
(c)	//não foi declarado o tipo primitivo da variavel "total"
	//"x" não foi declarado
	total = 0; //variavel "total" não foi inicializado
	while ( x <= 100) { //faltou abre e fecha chaves no laço
		total += x;
		++x;
	}
	
(d)	//não foi declarado o tipo primitivo da variavel "y"
	y = 0; //variavel "y" não foi inicializado
	while ( y < 0 ) {
		System.out.println(y);
		++y;
	}