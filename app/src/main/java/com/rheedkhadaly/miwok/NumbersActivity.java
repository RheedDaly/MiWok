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

        words.add(new Word("One", "Lutti", R.drawable.number_one));
        words.add(new Word("Two", "Otiiko", R.drawable.number_two));
        words.add(new Word("Three", "Tolookosu", R.drawable.number_three));
        words.add(new Word("Four", "Oyyisa", R.drawable.number_four));
        words.add(new Word("Five", "Massokka", R.drawable.number_five));
        words.add(new Word("Six", "Temmokka", R.drawable.number_six));
        words.add(new Word("Seven", "Kenekaku", R.drawable.number_seven));
        words.add(new Word("Eight", "Kawinta", R.drawable.number_eight));
        words.add(new Word("Nine", "Wo'e", R.drawable.number_nine));
        words.add(new Word("Ten", "Na'aacha", R.drawable.number_ten));

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
