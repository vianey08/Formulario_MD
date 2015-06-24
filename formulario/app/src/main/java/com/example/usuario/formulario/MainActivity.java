package com.example.usuario.formulario;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends Activity {
    private RadioGroup rg;
    EditText etnombre, etedad;
    Button bsiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //rg=(RadioGroup) findViewById(R.id.rg);
        //rg.clearCheck();
        etnombre=(EditText) findViewById(R.id.etnombre);
        etedad=(EditText) findViewById(R.id.etedad);

        bsiguiente = (Button) findViewById(R.id.bsiguiente);
    }

    public void onClicSiguiente(View view){
        Toast.makeText(getApplicationContext(), "prueba",Toast.LENGTH_SHORT).show();
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
