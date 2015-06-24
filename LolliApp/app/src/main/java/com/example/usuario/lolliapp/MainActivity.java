package com.example.usuario.lolliapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

   EditText editText;
    TextView textView;
    public void onclic(View view){
        editText=(EditText) findViewById(R.id.editText);
        textView=(TextView) findViewById(R.id.textView);

        String s=editText.getText().toString();

        textView.setText(" adios "+s);

       // Intent i = new Intent(this,MainActivity2Activity.class );
        //Bundle b=new Bundle();
        //b.putString("nombre",s);
        //i.putExtras(b);
        //startActivity(i);
        //finish();


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
