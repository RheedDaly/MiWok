package com.rheedkhadaly.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rheed on 11/16/2016.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    static class ViewHolder {

        TextView textQuestions;

        TextView textQuestions;
    }

    public WordAdapter(Activity context, ArrayList<Word> words) {

        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
