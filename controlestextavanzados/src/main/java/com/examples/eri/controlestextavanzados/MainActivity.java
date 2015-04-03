package com.examples.eri.controlestextavanzados;
/**
 * @autor eriDev
 * En este tutorial veremos como utilizar los componentes
 * de Texto, AutoCompleteTextView y MultiautoCompleteTextView
 *
 * */

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Tememos que definir nuestros controles para poder trabajar con ellos
        AutoCompleteTextView auto = (AutoCompleteTextView)findViewById(R.id.autoComp);
        MultiAutoCompleteTextView multi = (MultiAutoCompleteTextView)findViewById(R.id.multiComplet);

        /*Tenemos que crear un array de strings, para establecer unos valores y
         poder trabajar con ellos, este array lo
         podemos rellenar desde una bd, un fichero xml o declarandolo aqui, lo mas correcto es en un
         fichero xml por compatibilidad en otros idiomas y por simplicidad
         Iremos a Values y dentro de Strings creammos el array con los items que serán los paises
         para asignar esos valores que estan en un xml, con el método getResources y getStringArray*/
        String[] paises = getResources().getStringArray(R.array.paises_array) ;

        /*Ahora necesitamos un adaptador, se utiliza para el manejo de datos de asignacion de un view
        * android lo que hace con un adaptador es asignar la reponsabilidad del manejo de nuestros datos (paises)al
        * adaptador y ademas proporcionar un view, una lista desplegable donde salen las sugerencias de los paises
        * esa lista desplegable tiene otros componentes que el adaptador maneja
         * */
        ArrayAdapter<String> adapter;
//        Establecemos un layout que trae android por defecto con la lista para autoconplet, decimos ocn que datos
        // rellenamos
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,paises);

        //Ahora tenemos que definir con cuantos caracteres van a salir las sugerencias, con uno
        auto.setThreshold(1);
        multi.setThreshold(1);
        //Al multi hay que definirle como separar las palabras que va a introducir el user
        multi.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        //Asignamos el adaptador
        auto.setAdapter(adapter);
        multi.setAdapter(adapter);
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
