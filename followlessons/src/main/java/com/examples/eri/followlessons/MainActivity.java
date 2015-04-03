package com.examples.eri.followlessons;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
private ImageButton ibtn_managerBd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Al pulsar el imageButton me gusta se mostará una lista con dos fragments, de momento sale un mensaje
        // Cerrar la actividad para que el usuario no pueda volver atrás presionando el btn back
        ibtn_managerBd = (ImageButton) findViewById(R.id.ibtn_managerBd);
        ibtn_managerBd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MessageBox("Abriendo manager BD");
                //arrancar la siguiente activity
                Intent abreManager;
                abreManager = new Intent().setClass(
                        MainActivity.this, ManagerBdActivity.class);
                startActivity(abreManager);
            }
        });

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
    //Metodo para usar el mesaje Box sin tener que escribir el Toast
    public void MessageBox(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
