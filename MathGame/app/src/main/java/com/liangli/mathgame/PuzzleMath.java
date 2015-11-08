package com.liangli.mathgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PuzzleMath extends AppCompatActivity {

    private Button myButton1, myButton2, myButton3, myButton4, myButton5, myButton6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle_math);

        myButton1 = (Button)findViewById(R.id.button);
        myButton2 = (Button)findViewById(R.id.button2);
        myButton3 = (Button)findViewById(R.id.button3);
        myButton4 = (Button)findViewById(R.id.button4);
        myButton5 = (Button)findViewById(R.id.button5);
        myButton6 = (Button)findViewById(R.id.button6);

        myButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Geometry!", Toast.LENGTH_LONG).show();
                //shows a little pop up to let users know.
                //Intent intent = new Intent(this, GeometryPage.class);
                setContentView(R.layout.activity_geometry_page);
                //startActivity(intent);
            }
        });

        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Trigonometry!", Toast.LENGTH_LONG).show();
                //shows a little pop up to let users know.
            }
        });

        myButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Calculus!", Toast.LENGTH_LONG).show();
                //shows a little pop up to let users know.
            }
        });

        myButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Algebra!", Toast.LENGTH_LONG).show();
                //shows a little pop up to let users know.
            }
        });

        myButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Linear Algebra!", Toast.LENGTH_LONG).show();
                //shows a little pop up to let users know.
            }
        });

        myButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Probability!", Toast.LENGTH_LONG).show();
                //shows a little pop up to let users know.
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_puzzle_math, menu);
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
