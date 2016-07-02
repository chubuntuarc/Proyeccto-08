package com.example.arciniega.proyecto08_lista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Sección de atributos
    private Button btnAceptar;
    private List<String> listaNombres;
    private EditText editNombre;
    private ListView listaMonos;
    // Construir el adaptador de datos para la lista (xml)
    private ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btnAceptar = (Button)findViewById(R.id.btnAceptar);
                listaNombres = new ArrayList<String>();
                editNombre = (EditText)findViewById(R.id.editNombre);
                listaMonos = (ListView)findViewById(R.id.listView);
                adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listaNombres);

                // Agregamos los datos del editText de la vista a la lista dinámica
                listaNombres.add(editNombre.getText().toString());
                listaMonos.setAdapter(adaptador);
            }
        });

    }
}
