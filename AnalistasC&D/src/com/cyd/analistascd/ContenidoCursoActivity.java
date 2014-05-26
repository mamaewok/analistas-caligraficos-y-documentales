package com.cyd.analistascd;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

/**
 * 
 * @author MAMAEWOK
 *
 */

public class ContenidoCursoActivity extends Activity{

	private TextView titulo;
	private TextView contenido;
	private Typeface tipoTitulo;
	private Typeface tipoContenido;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contenido_curso);
		
		tipoTitulo = Typeface.createFromAsset(getAssets(), "fonts/Children.ttf");
		tipoContenido = Typeface.createFromAsset(getAssets(), "fonts/RobotoCondensed-Regular.ttf");
		
		contenido = (TextView)findViewById(R.id.contenido_curso);
		contenido.setTypeface(tipoContenido);
		
		titulo=(TextView)findViewById(R.id.titulo_curso);
		titulo.setTypeface(tipoTitulo);
		
		titulo.setText("Datos de T�TULO 1\n");
		contenido.setText("El contenido que aqu� podremos ver ser� el resultado a una Base de Datos creada y mantenido con sqlite."
				+ "SQLite es un sistema de gesti�n de bases de datos relacional compatible con ACID, contenida en una relativamente peque�a (~275 kiB)2 biblioteca escrita en C. SQLite es un proyecto de dominio p�blico1 creado por D. Richard Hipp."
				+ " A diferencia de los sistema de gesti�n de bases de datos cliente-servidor, el motor de SQLite no es un proceso independiente con el que el programa principal se comunica. En lugar de eso, la biblioteca SQLite se enlaza con el programa pasando a ser parte integral del mismo. El programa utiliza la funcionalidad de SQLite a trav�s de llamadas"
				+ " simples a subrutinas y funciones. Esto reduce la latencia en el acceso a la base de datos, debido a que las llamadas a funciones son"
				+ " m�s eficientes que la comunicaci�n entre procesos. El conjunto de la base de datos (definiciones, tablas, �ndices, y los propios dat"
				+ "os), son guardados como un s�lo fichero est�ndar en la m�quina host. Este dise�o simple se logra bloqueando todo el fichero de base"
				+ " de datos al principio de cada transacci�n."
				+ "En su versi�n 3, SQLite permite bases de datos de hasta 2 Terabytes de tama�o, y tambi�n permite la inclusi�n de campos tipo BLOB."
				+ "El autor de SQLite ofrece formaci�n, contratos de soporte t�cnico y caracter�sticas adicionales como compresi�n y cifrado."
				+ "SQLite es un sistema de gesti�n de bases de datos relacional compatible con ACID, contenida en una relativamente peque�a (~275 kiB)2 biblioteca escrita en C. SQLite es un proyecto de dominio p�blico1 creado por D. Richard Hipp."
				+ " A diferencia de los sistema de gesti�n de bases de datos cliente-servidor, el motor de SQLite no es un proceso independiente con el que el programa principal se comunica. En lugar de eso, la biblioteca SQLite se enlaza con el programa pasando a ser parte integral del mismo. El programa utiliza la funcionalidad de SQLite a trav�s de llamadas"
				+ " simples a subrutinas y funciones. Esto reduce la latencia en el acceso a la base de datos, debido a que las llamadas a funciones son"
				+ " m�s eficientes que la comunicaci�n entre procesos. El conjunto de la base de datos (definiciones, tablas, �ndices, y los propios dat"
				+ "os), son guardados como un s�lo fichero est�ndar en la m�quina host. Este dise�o simple se logra bloqueando todo el fichero de base"
				+ " de datos al principio de cada transacci�n."
				+ "En su versi�n 3, SQLite permite bases de datos de hasta 2 Terabytes de tama�o, y tambi�n permite la inclusi�n de campos tipo BLOB."
				+ "El autor de SQLite ofrece formaci�n, contratos de soporte t�cnico y caracter�sticas adicionales como compresi�n y cifrado."
				+ "SQLite es un sistema de gesti�n de bases de datos relacional compatible con ACID, contenida en una relativamente peque�a (~275 kiB)2 biblioteca escrita en C. SQLite es un proyecto de dominio p�blico1 creado por D. Richard Hipp."
				+ " A diferencia de los sistema de gesti�n de bases de datos cliente-servidor, el motor de SQLite no es un proceso independiente con el que el programa principal se comunica. En lugar de eso, la biblioteca SQLite se enlaza con el programa pasando a ser parte integral del mismo. El programa utiliza la funcionalidad de SQLite a trav�s de llamadas"
				+ " simples a subrutinas y funciones. Esto reduce la latencia en el acceso a la base de datos, debido a que las llamadas a funciones son"
				+ " m�s eficientes que la comunicaci�n entre procesos. El conjunto de la base de datos (definiciones, tablas, �ndices, y los propios dat"
				+ "os), son guardados como un s�lo fichero est�ndar en la m�quina host. Este dise�o simple se logra bloqueando todo el fichero de base"
				+ " de datos al principio de cada transacci�n."
				+ "En su versi�n 3, SQLite permite bases de datos de hasta 2 Terabytes de tama�o, y tambi�n permite la inclusi�n de campos tipo BLOB."
				+ "El autor de SQLite ofrece formaci�n, contratos de soporte t�cnico y caracter�sticas adicionales como compresi�n y cifrado."
				+ "SQLite es un sistema de gesti�n de bases de datos relacional compatible con ACID, contenida en una relativamente peque�a (~275 kiB)2 biblioteca escrita en C. SQLite es un proyecto de dominio p�blico1 creado por D. Richard Hipp."
				+ " A diferencia de los sistema de gesti�n de bases de datos cliente-servidor, el motor de SQLite no es un proceso independiente con el que el programa principal se comunica. En lugar de eso, la biblioteca SQLite se enlaza con el programa pasando a ser parte integral del mismo. El programa utiliza la funcionalidad de SQLite a trav�s de llamadas"
				+ " simples a subrutinas y funciones. Esto reduce la latencia en el acceso a la base de datos, debido a que las llamadas a funciones son"
				+ " m�s eficientes que la comunicaci�n entre procesos. El conjunto de la base de datos (definiciones, tablas, �ndices, y los propios dat"
				+ "os), son guardados como un s�lo fichero est�ndar en la m�quina host. Este dise�o simple se logra bloqueando todo el fichero de base"
				+ " de datos al principio de cada transacci�n."
				+ "En su versi�n 3, SQLite permite bases de datos de hasta 2 Terabytes de tama�o, y tambi�n permite la inclusi�n de campos tipo BLOB."
				+ "El autor de SQLite ofrece formaci�n, contratos de soporte t�cnico y caracter�sticas adicionales como compresi�n y cifrado."
				+ "SQLite es un sistema de gesti�n de bases de datos relacional compatible con ACID, contenida en una relativamente peque�a (~275 kiB)2 biblioteca escrita en C. SQLite es un proyecto de dominio p�blico1 creado por D. Richard Hipp."
				+ " A diferencia de los sistema de gesti�n de bases de datos cliente-servidor, el motor de SQLite no es un proceso independiente con el que el programa principal se comunica. En lugar de eso, la biblioteca SQLite se enlaza con el programa pasando a ser parte integral del mismo. El programa utiliza la funcionalidad de SQLite a trav�s de llamadas"
				+ " simples a subrutinas y funciones. Esto reduce la latencia en el acceso a la base de datos, debido a que las llamadas a funciones son"
				+ " m�s eficientes que la comunicaci�n entre procesos. El conjunto de la base de datos (definiciones, tablas, �ndices, y los propios dat"
				+ "os), son guardados como un s�lo fichero est�ndar en la m�quina host. Este dise�o simple se logra bloqueando todo el fichero de base"
				+ " de datos al principio de cada transacci�n."
				+ "En su versi�n 3, SQLite permite bases de datos de hasta 2 Terabytes de tama�o, y tambi�n permite la inclusi�n de campos tipo BLOB."
				+ "El autor de SQLite ofrece formaci�n, contratos de soporte t�cnico y caracter�sticas adicionales como compresi�n y cifrado.");
	}
}
