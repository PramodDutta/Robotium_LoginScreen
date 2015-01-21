package com.witmergers.loginrobo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button)findViewById(R.id.button);
        final EditText e1 = (EditText)findViewById(R.id.editText_1);
        final EditText e2 = (EditText)findViewById(R.id.editText_2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 String usernamw = e1.getText().toString();
                 String pass =     e2.getText().toString();


                Toast.makeText(getApplicationContext(),"Username : "+usernamw+" Password : "+pass,Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplication(),MainActivity2.class);
                startActivity(i);
                
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
            Toast.makeText(getApplicationContext(),"Yo,",Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

   
}
