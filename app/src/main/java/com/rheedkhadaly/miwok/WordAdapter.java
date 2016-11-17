package com.rheedkhadaly.miwok;

import android.app.Activity;
import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by Rheed on 11/16/2016.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    TextToSpeech tts;

    private String language;

    static class ViewHolder {
        ImageView defaultImageView;
        TextView defaultTextViewOne;
        TextView defaultTextViewTwo;
        ImageButton defaultImageButton;
    }

    public WordAdapter(Activity context, String languages, ArrayList<Word> words) {
        super(context, 0, words);

        this.language = languages;
    }

    public String getLanguage() {
        return language.toUpperCase();
    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater mInflater;
        final ViewHolder holder;

        Word currentWord = getItem(position);

        if (convertView == null) {
            mInflater = LayoutInflater.from(getContext());
            convertView = mInflater.inflate(R.layout.list_item, parent, false);

            holder = new ViewHolder();

            holder.defaultImageView = (ImageView) convertView.findViewById(R.id.default_image_view);
            holder.defaultTextViewOne = (TextView) convertView.findViewById(R.id.default_text_view_one);
            holder.defaultTextViewTwo = (TextView) convertView.findViewById(R.id.default_text_view_two);
            holder.defaultImageButton = (ImageButton) convertView.findViewById(R.id.default_image_button);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        if(getLanguage().equals("GERMAN")) {
            tts = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int status) {
                    if (status != TextToSpeech.ERROR) {
                        tts.setLanguage(Locale.GERMAN);
                    }
                }
            });
        } else {
            tts = new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
                @Override
                public void onInit(int status) {
                    if (status != TextToSpeech.ERROR) {
                        tts.setLanguage(Locale.ENGLISH);
                    }
                }
            });
        }



        holder.defaultImageView.setImageResource(currentWord.getmImageResourceId());
        holder.defaultTextViewOne.setText(currentWord.getmMiwokTranslation());
        holder.defaultTextViewTwo.setText(currentWord.getmDefaultTranslation());

        holder.defaultImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (position) {
                    case 0:

                        tts.speak(holder.defaultTextViewOne.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                        tts.speak(holder.defaultTextViewTwo.getText().toString(), TextToSpeech.QUEUE_ADD, null);

                        Toast.makeText(getContext(), getLanguage(), Toast.LENGTH_SHORT).show();

                        break;
                    case 1:

                        tts.speak(holder.defaultTextViewOne.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                        tts.speak(holder.defaultTextViewTwo.getText().toString(), TextToSpeech.QUEUE_ADD, null);

                        break;
                    case 2:

                        tts.speak(holder.defaultTextViewOne.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                        tts.speak(holder.defaultTextViewTwo.getText().toString(), TextToSpeech.QUEUE_ADD, null);

                        break;
                    case 3:

                        tts.speak(holder.defaultTextViewOne.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                        tts.speak(holder.defaultTextViewTwo.getText().toString(), TextToSpeech.QUEUE_ADD, null);

                        break;
                    case 4:

                        tts.speak(holder.defaultTextViewOne.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                        tts.speak(holder.defaultTextViewTwo.getText().toString(), TextToSpeech.QUEUE_ADD, null);

                        break;
                    case 5:

                        tts.speak(holder.defaultTextViewOne.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                        tts.speak(holder.defaultTextViewTwo.getText().toString(), TextToSpeech.QUEUE_ADD, null);

                        break;
                    case 6:

                        tts.speak(holder.defaultTextViewOne.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                        tts.speak(holder.defaultTextViewTwo.getText().toString(), TextToSpeech.QUEUE_ADD, null);

                        break;
                    case 7:

                        tts.speak(holder.defaultTextViewOne.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                        tts.speak(holder.defaultTextViewTwo.getText().toString(), TextToSpeech.QUEUE_ADD, null);

                        break;
                    case 8:

                        tts.speak(holder.defaultTextViewOne.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                        tts.speak(holder.defaultTextViewTwo.getText().toString(), TextToSpeech.QUEUE_ADD, null);

                        break;
                    case 9:

                        tts.speak(holder.defaultTextViewOne.getText().toString(), TextToSpeech.QUEUE_ADD, null);
                        tts.speak(holder.defaultTextViewTwo.getText().toString(), TextToSpeech.QUEUE_ADD, null);

                        break;
                }
            }
        });

        return convertView;
    }
}
