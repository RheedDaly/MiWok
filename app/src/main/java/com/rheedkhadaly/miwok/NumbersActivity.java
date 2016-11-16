package com.rheedkhadaly.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Rheed on 11/11/2016.
 */

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("One", "Lutti"));
        words.add(new Word("Two", "Otiiko"));
        words.add(new Word("Three", "Tolookosu"));
        words.add(new Word("Four", "Oyyisa"));
        words.add(new Word("Five", "Massokka"));
        words.add(new Word("Six", "Temmokka"));
        words.add(new Word("Seven", "Kenekaku"));
        words.add(new Word("Eight", "Kawinta"));
        words.add(new Word("Nine", "Wo'e"));
        words.add(new Word("Ten", "Na'aacha"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:

                Intent myIntent = new Intent(this, MainActivity.class);
                myIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(myIntent);

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
