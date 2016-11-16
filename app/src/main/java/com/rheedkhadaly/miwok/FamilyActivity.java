package com.rheedkhadaly.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Rheed on 11/16/2016.
 */

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Father", "epe", R.drawable.family_father));
        words.add(new Word("Mother", "Eta", R.drawable.family_mother));
        words.add(new Word("Son", "Angsi", R.drawable.family_son));
        words.add(new Word("Daughter", "Tune", R.drawable.family_daughter));
        words.add(new Word("Older Brother", "Taachi", R.drawable.family_older_brother));
        words.add(new Word("Younger Brother", "Chalitti", R.drawable.family_younger_brother));
        words.add(new Word("Older Sister", "Tete", R.drawable.family_older_sister));
        words.add(new Word("Younger Sister", "Kolliti", R.drawable.family_younger_sister));
        words.add(new Word("Grandmother", "Ama", R.drawable.family_grandmother));
        words.add(new Word("Grandfather", "Paapa", R.drawable.family_grandfather));

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