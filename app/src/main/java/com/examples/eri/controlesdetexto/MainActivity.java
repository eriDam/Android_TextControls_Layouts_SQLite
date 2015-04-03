package com.examples.eri.controlesdetexto;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Declarar un control dentro de la clase java
        /*  Llamamos i/o asignamos el textView en nuestro código,
          * Para un text view no suele ser necesario or que muestra info, pero
          * se le puede cambiar el color por ej*/
        TextView tvSaludo = (TextView) findViewById(R.id.tvSaludo);

         /*Referencio el control editText normal*/
        final EditText edNormal = (EditText)findViewById(R.id.edNormal);

        /*Referencio el control editText pass*/
        final EditText edPasswd = (EditText)findViewById(R.id.edPasswd);

        //Declaramos los botones
        Button btn1 = (Button)findViewById(R.id.btn1);
        Button btn2 = (Button)findViewById(R.id.btn2);
        Button btn3 = (Button)findViewById(R.id.btn3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);


        /*Referencio el botón Mostrar*/
        Button btnMostrar = (Button)findViewById(R.id.btnMostrar);

        //Evento en el btnMostrar
        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"Has pulsado Mostrar.",Toast.LENGTH_SHORT).show();
                 /*Obtenemos el texto q ha introducido el usuario en el passwd y
                  * la convertimos a String, guardandola en una cadena*/
                 String s= edPasswd.getText().toString();
                 edNormal.setText("Tu password es: "+s);

            }
        });


    }
    //Este método recibe que botón/control se ha llamado
    @Override
    public void onClick(View view) {
   String sCadena = new String();
    //como saber que botn se ha pulsado,hacemos un swicth y recibimos el view el id
    switch(view.getId()){
        case R.id.btn1: sCadena = "Botón 1";
            break;
        case R.id.btn2: sCadena = "Botón 2";
            break;
        case R.id.btn3: sCadena = "Botón 3";
            break;

    }
        Toast.makeText(getBaseContext(),"Has pulsado "+sCadena,Toast.LENGTH_SHORT).show();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*
      * 1 forma de crear un evento en el botón cancelar
      *FUNCIÓN btnCancelar, tiene que ser público, no devolver nada void,
      *ponemos un nombre y tiene que recibir una vista View*/
    public void clickCancelar(View v){
        Toast.makeText(getBaseContext(),"Has pulsado Cancelar.",Toast.LENGTH_SHORT).show();
    }


}
