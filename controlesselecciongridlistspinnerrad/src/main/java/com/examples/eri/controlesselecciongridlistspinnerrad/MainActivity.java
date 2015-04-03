package com.examples.eri.controlesselecciongridlistspinnerrad;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
//Declaro el array
    //private String[] colores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1º Definir el radioGroup
        RadioGroup rGroup = (RadioGroup)findViewById(R.id.rGroupTema);

        //2ºEstablecer una propiedad o valor por defecto
        //Si queremos comprobar que valor ha puolsado usamos el setOnCheckedChangeListener
        rGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){//por defecto nos pasa el id de cada componente
                    case R.id.radioButton:
                        Toast.makeText(getApplicationContext(), "Opción 1", Toast.LENGTH_SHORT).show();
                    break;
                    case R.id.radioButton2:
                        Toast.makeText(getApplicationContext(), "Opción 2", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButton3:
                        Toast.makeText(getApplicationContext(), "Opción 3", Toast.LENGTH_SHORT).show();
                        break;
                }
                }
        });

//        //1º Declarar el Spinner
//        Spinner spinnr = (Spinner)findViewById(R.id.spinner);
//
//       //Creamos un adaptador, en este caso creamos el arrayAdpater con una secuencia de carácteres
//        ArrayAdapter<CharSequence> adapter;
//
//        //Inicializamos el adaptador de forma distinta con el createFromResource,
//        // tenemos que pasarle una serie de campos, this, nuestro array de colores y
//        //establecer un layout preconfigurado, en este caso uso el simpleSpinnerItem
//        adapter = ArrayAdapter.createFromResource(this,R.array.colores,android.R.layout.simple_spinner_item);
//        //Por último añadimos el adaptador a nuestro spinner
//        spinnr.setAdapter(adapter);


/*         Dejo comentado el ejemplo anterior:


        //1º Inicializamos el array colores;
        colores = new String[]{"Rojo", "Azul", "Naranja", "Verde", "Marrón", "Negro", "Blanco"};

        //2º Creo un adaptador,los adapatadores son un componente que nos permite adaptar los datos al view
        ArrayAdapter<String> adapter;
        //3ºInicializo el adaptador, coloco this para referenciar a la clase
        //utilizo un layout preconfigurado de android, especificamos el array de datos
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, colores);

        //Cuando ya tenemos el adaptador, declaramos el ListView
        GridView gv = (GridView) findViewById(R.id.gridView);
        //Establecemos el adapatador al lv
        gv.setAdapter(adapter);

        //Si queremos que al pulsar la lista, cada item haga algo como un botón,
        //tenemos que crear el evento setOnclickListenner
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
           //Position nos da la posicion del item q ha pulsado el user
            Toast.makeText(getApplicationContext(),"Has seleccionado: "+colores[position],Toast.LENGTH_SHORT).show();
            }

        });
        */
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
