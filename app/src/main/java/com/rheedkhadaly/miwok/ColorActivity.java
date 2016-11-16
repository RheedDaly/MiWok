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

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Red", "Wetetti", R.drawable.color_red));
        words.add(new Word("Mustard Yellow", "Chiwiite", R.drawable.color_mustard_yellow));
        words.add(new Word("Dusty Yellow", "Topiise", R.drawable.color_dusty_yellow));
        words.add(new Word("Green", "Chokokki", R.drawable.color_green));
        words.add(new Word("Brown", "Takaakki", R.drawable.color_brown));
        words.add(new Word("Gray", "Topoppi", R.drawable.color_gray));
        words.add(new Word("Black", "Kululli", R.drawable.color_black));
        words.add(new Word("White", "Kelelli", R.drawable.color_white));

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
