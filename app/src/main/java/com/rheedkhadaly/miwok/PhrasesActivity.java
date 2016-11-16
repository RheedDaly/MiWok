package com.rheedkhadaly.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Where are you going?", "Minto wuksus"));
        words.add(new Word("What is your name?", "Tinne oyaase'ne"));
        words.add(new Word("My name is...", "Oyaaset..."));
        words.add(new Word("How are you feeling?", "Michekses?"));
        words.add(new Word("I'm feeling good.", "Kuchi achit"));
        words.add(new Word("Are you coming?", "eenes'aa?"));
        words.add(new Word("Yes, I'm coming", "hee' eenem"));
        words.add(new Word("I'm coming.", "eenem"));
        words.add(new Word("Let's go.", "Yoowutis"));
        words.add(new Word("Come here.", "enni'nem"));

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
