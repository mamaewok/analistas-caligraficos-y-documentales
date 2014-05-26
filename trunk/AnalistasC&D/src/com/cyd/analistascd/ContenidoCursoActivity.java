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
		
		titulo.setText("Datos de TÍTULO 1\n");
		contenido.setText("El contenido que aquí podremos ver será el resultado a una Base de Datos creada y mantenido con sqlite."
				+ "SQLite es un sistema de gestión de bases de datos relacional compatible con ACID, contenida en una relativamente pequeña (~275 kiB)2 biblioteca escrita en C. SQLite es un proyecto de dominio público1 creado por D. Richard Hipp."
				+ " A diferencia de los sistema de gestión de bases de datos cliente-servidor, el motor de SQLite no es un proceso independiente con el que el programa principal se comunica. En lugar de eso, la biblioteca SQLite se enlaza con el programa pasando a ser parte integral del mismo. El programa utiliza la funcionalidad de SQLite a través de llamadas"
				+ " simples a subrutinas y funciones. Esto reduce la latencia en el acceso a la base de datos, debido a que las llamadas a funciones son"
				+ " más eficientes que la comunicación entre procesos. El conjunto de la base de datos (definiciones, tablas, índices, y los propios dat"
				+ "os), son guardados como un sólo fichero estándar en la máquina host. Este diseño simple se logra bloqueando todo el fichero de base"
				+ " de datos al principio de cada transacción."
				+ "En su versión 3, SQLite permite bases de datos de hasta 2 Terabytes de tamaño, y también permite la inclusión de campos tipo BLOB."
				+ "El autor de SQLite ofrece formación, contratos de soporte técnico y características adicionales como compresión y cifrado."
				+ "SQLite es un sistema de gestión de bases de datos relacional compatible con ACID, contenida en una relativamente pequeña (~275 kiB)2 biblioteca escrita en C. SQLite es un proyecto de dominio público1 creado por D. Richard Hipp."
				+ " A diferencia de los sistema de gestión de bases de datos cliente-servidor, el motor de SQLite no es un proceso independiente con el que el programa principal se comunica. En lugar de eso, la biblioteca SQLite se enlaza con el programa pasando a ser parte integral del mismo. El programa utiliza la funcionalidad de SQLite a través de llamadas"
				+ " simples a subrutinas y funciones. Esto reduce la latencia en el acceso a la base de datos, debido a que las llamadas a funciones son"
				+ " más eficientes que la comunicación entre procesos. El conjunto de la base de datos (definiciones, tablas, índices, y los propios dat"
				+ "os), son guardados como un sólo fichero estándar en la máquina host. Este diseño simple se logra bloqueando todo el fichero de base"
				+ " de datos al principio de cada transacción."
				+ "En su versión 3, SQLite permite bases de datos de hasta 2 Terabytes de tamaño, y también permite la inclusión de campos tipo BLOB."
				+ "El autor de SQLite ofrece formación, contratos de soporte técnico y características adicionales como compresión y cifrado."
				+ "SQLite es un sistema de gestión de bases de datos relacional compatible con ACID, contenida en una relativamente pequeña (~275 kiB)2 biblioteca escrita en C. SQLite es un proyecto de dominio público1 creado por D. Richard Hipp."
				+ " A diferencia de los sistema de gestión de bases de datos cliente-servidor, el motor de SQLite no es un proceso independiente con el que el programa principal se comunica. En lugar de eso, la biblioteca SQLite se enlaza con el programa pasando a ser parte integral del mismo. El programa utiliza la funcionalidad de SQLite a través de llamadas"
				+ " simples a subrutinas y funciones. Esto reduce la latencia en el acceso a la base de datos, debido a que las llamadas a funciones son"
				+ " más eficientes que la comunicación entre procesos. El conjunto de la base de datos (definiciones, tablas, índices, y los propios dat"
				+ "os), son guardados como un sólo fichero estándar en la máquina host. Este diseño simple se logra bloqueando todo el fichero de base"
				+ " de datos al principio de cada transacción."
				+ "En su versión 3, SQLite permite bases de datos de hasta 2 Terabytes de tamaño, y también permite la inclusión de campos tipo BLOB."
				+ "El autor de SQLite ofrece formación, contratos de soporte técnico y características adicionales como compresión y cifrado."
				+ "SQLite es un sistema de gestión de bases de datos relacional compatible con ACID, contenida en una relativamente pequeña (~275 kiB)2 biblioteca escrita en C. SQLite es un proyecto de dominio público1 creado por D. Richard Hipp."
				+ " A diferencia de los sistema de gestión de bases de datos cliente-servidor, el motor de SQLite no es un proceso independiente con el que el programa principal se comunica. En lugar de eso, la biblioteca SQLite se enlaza con el programa pasando a ser parte integral del mismo. El programa utiliza la funcionalidad de SQLite a través de llamadas"
				+ " simples a subrutinas y funciones. Esto reduce la latencia en el acceso a la base de datos, debido a que las llamadas a funciones son"
				+ " más eficientes que la comunicación entre procesos. El conjunto de la base de datos (definiciones, tablas, índices, y los propios dat"
				+ "os), son guardados como un sólo fichero estándar en la máquina host. Este diseño simple se logra bloqueando todo el fichero de base"
				+ " de datos al principio de cada transacción."
				+ "En su versión 3, SQLite permite bases de datos de hasta 2 Terabytes de tamaño, y también permite la inclusión de campos tipo BLOB."
				+ "El autor de SQLite ofrece formación, contratos de soporte técnico y características adicionales como compresión y cifrado."
				+ "SQLite es un sistema de gestión de bases de datos relacional compatible con ACID, contenida en una relativamente pequeña (~275 kiB)2 biblioteca escrita en C. SQLite es un proyecto de dominio público1 creado por D. Richard Hipp."
				+ " A diferencia de los sistema de gestión de bases de datos cliente-servidor, el motor de SQLite no es un proceso independiente con el que el programa principal se comunica. En lugar de eso, la biblioteca SQLite se enlaza con el programa pasando a ser parte integral del mismo. El programa utiliza la funcionalidad de SQLite a través de llamadas"
				+ " simples a subrutinas y funciones. Esto reduce la latencia en el acceso a la base de datos, debido a que las llamadas a funciones son"
				+ " más eficientes que la comunicación entre procesos. El conjunto de la base de datos (definiciones, tablas, índices, y los propios dat"
				+ "os), son guardados como un sólo fichero estándar en la máquina host. Este diseño simple se logra bloqueando todo el fichero de base"
				+ " de datos al principio de cada transacción."
				+ "En su versión 3, SQLite permite bases de datos de hasta 2 Terabytes de tamaño, y también permite la inclusión de campos tipo BLOB."
				+ "El autor de SQLite ofrece formación, contratos de soporte técnico y características adicionales como compresión y cifrado.");
	}
}
