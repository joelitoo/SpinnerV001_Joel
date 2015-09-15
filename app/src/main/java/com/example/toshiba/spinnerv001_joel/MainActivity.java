package com.example.toshiba.spinnerv001_joel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class MainActivity extends ActionBarActivity {

    Spinner Animales;
    Spinner Actores;

    String[] datosAnimales = {"SELECCIONE SU MASCOTA FAVORITA","Ardilla", "Caballo", "Conejo", "Mono", "Perro", "Tigre", "Venado"};
    String[] datosActores = {"SELECCIONE SU ACTOR FAVORITO","Cris", "Jimboy", "Juan", "Kevin", "Liam"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Animales = (Spinner) findViewById(R.id.animales);
        ArrayAdapter<String> animalesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,datosAnimales);
        Animales.setAdapter(animalesAdapter);

        Actores=(Spinner) findViewById(R.id.Actores);
        ArrayAdapter<String> actoresAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,datosActores);
        Actores.setAdapter(actoresAdapter);



        Animales.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {

                switch (i) {

                    case 0:


                        break;

                    case 1:

                        Intent ar = new Intent(MainActivity.this, Ardilla.class);
                        startActivity(ar);
                        break;

                    case 2:
                        Intent ca = new Intent(MainActivity.this, Caballo.class);
                        startActivity(ca);
                        break;
                    case 3:

                        Intent co = new Intent(MainActivity.this, Conejo.class);
                        startActivity(co);
                        break;
                    case 4:
                        Intent mo = new Intent(MainActivity.this, Mono.class);
                        startActivity(mo);
                        break;

                    case 5:
                        Intent pe = new Intent(MainActivity.this, Perro.class);
                        startActivity(pe);
                        break;

                    case 6:
                        Intent ti = new Intent(MainActivity.this, Tigre.class);
                        startActivity(ti);
                        break;

                    case 7:
                        Intent ve = new Intent(MainActivity.this, Venado.class);
                        startActivity(ve);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Actores.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

               switch (position)
               {
                   case 0:


                       break;



                   case 1:

                       Intent ar = new Intent(MainActivity.this, Chriss.class);
                       startActivity(ar);
                       break;

                   case 2:
                       Intent ca = new Intent(MainActivity.this, Jimboy.class);
                       startActivity(ca);
                       break;
                   case 3:

                       Intent co = new Intent(MainActivity.this, Juan.class);
                       startActivity(co);
                       break;
                   case 4:
                       Intent mo = new Intent(MainActivity.this, Kevin.class);
                       startActivity(mo);
                       break;

                   case 5:
                       Intent pe = new Intent(MainActivity.this, Liam.class);
                       startActivity(pe);
                       break;


               }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

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

    public void autor(View v)
    {
        Intent autor=new Intent(this,Acerca.class);
        startActivity(autor);
    }
}

