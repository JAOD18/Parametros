package com.jaod.parametros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtnombre;
    private EditText txtemail;
    private EditText txttwitter;
    private EditText txttel;
    private EditText txtdate;
    public String entro="no";
    public static String nombre="";
    public static String email="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre = (EditText)findViewById(R.id.txtnombre);
        txtemail = (EditText)findViewById(R.id.txtemail);
        txttwitter = (EditText)findViewById(R.id.txttwitter);
        txttel= (EditText)findViewById(R.id.txttel);
        txtdate = (EditText)findViewById(R.id.txtdate);
    }

    public void Guardad (View view){
        Intent i = new Intent(this, principalActivity.class);
        i.putExtra("dato",txtnombre.getText().toString());
        //startActivity(i);
        i.putExtra("dato1",txtemail.getText().toString());
        nombre=txtnombre.getText().toString();
        email=txtemail.getText().toString();

        startActivity(i);
    }
}
