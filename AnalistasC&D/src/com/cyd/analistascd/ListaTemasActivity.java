package com.cyd.analistascd;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 
 * @author MAMAEWOK
 *
 */
public class ListaTemasActivity extends Activity {

	private ListView lista;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listado_temas);

		ArrayList<ListaEntrada> datos = new ArrayList<ListaEntrada>();

		datos.add(new ListaEntrada(R.drawable.psico, "La p�gina",
				"Curso de iniciaci�n a la pricografolog�a"));
		datos.add(new ListaEntrada(R.drawable.pericia, "La l�nea",
				"Curso de iniciaci�n a la pericia caligr�fica"));
		datos.add(new ListaEntrada(R.drawable.document, "La palabra ",
				"Curso de iniciaci�n a la documentoscopia"));
		datos.add(new ListaEntrada(R.drawable.psico, "La letra ",
				"Curso de iniciaci�n a la documentoscopia"));
		datos.add(new ListaEntrada(R.drawable.pericia, "Las dem�s cosas ",
				"Curso de iniciaci�n a la documentoscopia"));

		lista = (ListView) findViewById(R.id.ListView_listado);
		lista.setAdapter(new ListaAdaptador(this, R.layout.entrada_temas, datos) {
			@Override
			public void onEntrada(Object entrada, View view) {
				if (entrada != null) {
					TextView texto_superior_entrada = (TextView) view
							.findViewById(R.id.textView_superior);
					if (texto_superior_entrada != null)
						texto_superior_entrada.setText(((ListaEntrada) entrada)
								.get_textoEncima());

					TextView texto_inferior_entrada = (TextView) view
							.findViewById(R.id.textView_inferior);
					if (texto_inferior_entrada != null)
						texto_inferior_entrada.setText(((ListaEntrada) entrada)
								.get_textoDebajo());

					ImageView imagen_entrada = (ImageView) view
							.findViewById(R.id.imageView_imagen);
					if (imagen_entrada != null)
						imagen_entrada
								.setImageResource(((ListaEntrada) entrada)
										.get_idImagen());
				}
			}
		});

		lista.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> pariente, View view,
					int posicion, long id) {
				ListaEntrada elegido = (ListaEntrada) pariente
						.getItemAtPosition(posicion);
				
				startActivity(new Intent(ListaTemasActivity.this, ContenidoCursoActivity.class));
			}
		});

	}

}
