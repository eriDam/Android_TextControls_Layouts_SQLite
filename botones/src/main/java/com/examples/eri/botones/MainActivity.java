package com.examples.eri.botones;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaramos los controles para utilizar
        Button btn1 = (Button)findViewById(R.id.btn1);
        //Utilizamos este método, en los parámetros, colocamos un 0 si no sacamos imagen
        //cuando seleccionamos el método vemos lo que necesita que le pasemos(int)
        //Si queremos añadir img utilizamos clase R
        btn1.setCompoundDrawablesWithIntrinsicBounds(
                0,  //left
                R.mipmap.andro_caja,  //top, coloco icono arriba normalmente carpeta drawable
                0,  //right
                0   //bottom
        );

        //Declaro/referencio el toggleButton
        ToggleButton toggleButton= (ToggleButton)findViewById(R.id.toggleButton);
        //Utilizo el setOnCheckedChangeListener para añadir el listener se utiliza cuando el
        //usuario pulsa
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked){
                //El botón está activo
                Toast.makeText(getApplicationContext(),"Botón Activado",Toast.LENGTH_SHORT).show();
            }else{
                //El botón está activo
                Toast.makeText(getApplicationContext(),"Botón Desactivado",Toast.LENGTH_SHORT).show();
            }
            }
        });

    }//fin onCreate

   //Creamos el método onClick
    public void onClickCheckBox(View v){
        //Creo una variable booleana y establezco si por default está activa o inactiva
        Boolean check = ((CheckBox)v).isChecked();
        if (check){
            //El botón está activo
            Toast.makeText(getApplicationContext(),"Botón Activado",Toast.LENGTH_SHORT).show();
        }
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
}
