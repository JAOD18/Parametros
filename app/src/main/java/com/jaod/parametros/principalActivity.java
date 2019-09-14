package com.jaod.parametros;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;


public class principalActivity extends AppCompatActivity {

    private  ArrayAdapter<String> adaptador;
    private ListView lvContactos;
    public static ArrayList<String> datos=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
        MainActivity M = new MainActivity();
        if(M.nombre.toString().length()>0 & M.email.toString().length()>0){
            datos.add(M.nombre.toString()+"    "+M.email.toString());
        }

        adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, datos);
        lvContactos=(ListView)findViewById(R.id.lvContactos);
        lvContactos.setAdapter(adaptador);
        adaptador.notifyDataSetChanged();
    }
    public void Agregar(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
