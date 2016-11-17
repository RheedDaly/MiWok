package com.rheedkhadaly.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String language = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView)findViewById(R.id.numbers);
        TextView family = (TextView)findViewById(R.id.family);
        TextView colors = (TextView)findViewById(R.id.colors);
        TextView phrases = (TextView)findViewById(R.id.phrases);

        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent num = new Intent(MainActivity.this, NumbersActivity.class);
                num.putExtra("lang", language);
                startActivity(num);
            }
        });

        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent num = new Intent(MainActivity.this, FamilyActivity.class);
                num.putExtra("lang", language);
                startActivity(num);
            }
        });

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent num = new Intent(MainActivity.this, ColorActivity.class);
                num.putExtra("lang", language);
                startActivity(num);
            }
        });

        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent num = new Intent(MainActivity.this, PhrasesActivity.class);
                num.putExtra("lang", language);
                startActivity(num);
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
        switch (item.getItemId()) {
            case android.R.id.home:

                Intent myIntent = new Intent(this, MainActivity.class);
                myIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(myIntent);
                break;
            case R.id.langEnglish:
                Toast.makeText(this, "English", Toast.LENGTH_SHORT).show();
                break;
            case R.id.langGerman:
                language = "GERMAN";
                Toast.makeText(this, "German", Toast.LENGTH_SHORT).show();
                break;
            case R.id.langFrench:
                Toast.makeText(this, "French", Toast.LENGTH_SHORT).show();
                break;
            case R.id.langItalian:
                Toast.makeText(this, "Italian", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
