package com.example.alumnot.moneda;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MyActivity extends Activity {
    AnimationDrawable animacion;
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        texto=(TextView)findViewById(R.id.textView);
        animacion = (AnimationDrawable)getResources().getDrawable(
        R.drawable.animacion);

        ImageView vista = (ImageView)findViewById(R.id.imageView);

        vista.setBackgroundColor(Color.WHITE);

        vista.setImageDrawable(animacion);

        vista.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {

                if(animacion.isRunning())
                {
                    animacion.stop();
                    if(animacion.getCurrent().equals(animacion.getFrame(0)))
                    {
                        //Toast.makeText(MyActivity.this,"adsad",Toast.LENGTH_LONG).show();
                        texto.setText("VIVE");
                    }
                    else
                    {
                        texto.setText("MUERE");
                    }
                }
                else
                {
                    texto.setText(" ");
                    animacion.start();
                }


            }

        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
