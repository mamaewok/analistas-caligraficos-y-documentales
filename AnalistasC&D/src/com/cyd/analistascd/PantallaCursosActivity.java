package com.cyd.analistascd;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Listado.
 * 
 * @author Ainhoa Suárez Sánchez
 */
public class PantallaCursosActivity extends Activity {

	// private ListView lista;
	private GridView lista;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listado_cursos);

		ArrayList<ListaEntrada> datos = new ArrayList<ListaEntrada>();

		datos.add(new ListaEntrada(R.drawable.psico, "PSICOGRAFOLOGÍA",
				"Curso de iniciación a la pricografología"));
		datos.add(new ListaEntrada(R.drawable.pericia, "PERÍCIA CALIGRÁFICA",
				"Curso de iniciación a la pericia caligráfica"));
		datos.add(new ListaEntrada(R.drawable.document, "DOCUMENTOSCOPIA",
				"Curso de iniciación a la documentoscopia"));

		// lista = (ListView) findViewById(R.id.ListView_listado);
		lista = (GridView) findViewById(R.id.GridView_listado);
		lista.setAdapter(new ListaAdaptador(this, R.layout.entrada_cursos, datos) {
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

				startActivity(new Intent(PantallaCursosActivity.this, ListaTemasActivity.class));
			}
		});

	}

}
