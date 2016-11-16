package com.rheedkhadaly.miwok;

import android.app.Activity;
import android.speech.tts.TextToSpeech;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by Rheed on 11/16/2016.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    TextToSpeech tts;

    static class ViewHolder {

        TextView miwokTextView;
        TextView defaultTextView;
    }

    public WordAdapter(Activity context, ArrayList<Word> words) {

        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater mInflater;
        final ViewHolder holder;

        Word currentWord = getItem(position);

        if (convertView == null) {
            mInflater = LayoutInflater.from(getContext());
            convertView = mInflater.inflate(R.layout.list_item, parent, false);

            holder = new ViewHolder();

            holder.miwokTextView = (TextView) convertView.findViewById(R.id.miwok_text_view);
            holder.defaultTextView = (TextView) convertView.findViewById(R.id.default_text_view);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        tts = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    tts.setLanguage(Locale.ENGLISH);
                }
            }
        });

        holder.miwokTextView.setText(currentWord.getmMiwokTranslation());
        holder.defaultTextView.setText(currentWord.getmDefaultTranslation());

        return convertView;
    }
}
