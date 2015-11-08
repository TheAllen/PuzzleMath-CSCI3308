package com.liangli.mathgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class GeometryPage extends AppCompatActivity {

    private Button level1,level2,level3,level4,level5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometry_page);

        Button level1 = (Button) findViewById(R.id.button7);
        Button level2 = (Button) findViewById(R.id.button8);
        Button level3 = (Button) findViewById(R.id.button9);
        Button level4 = (Button) findViewById(R.id.button10);
        Button level5 = (Button) findViewById(R.id.button11);
        Button level6 = (Button) findViewById(R.id.button12);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_geometry_page, menu);
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
