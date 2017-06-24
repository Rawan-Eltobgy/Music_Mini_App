package com.example.android.musicminiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class GenreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Genres");
        setContentView(R.layout.activity_genre);
        Button homeButton = (Button) findViewById(R.id.home);
        Button artistButton = (Button) findViewById(R.id.artist);
        Button albumButton = (Button) findViewById(R.id.album);
        Button genreButton = (Button) findViewById(R.id.genre);
        Button paymentButton = (Button) findViewById(R.id.payment_method);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHome = new Intent(view.getContext(), MainActivity.class);
                startActivity(intentHome);
            }
        });

        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAlbum = new Intent(view.getContext(), ArtistActivity.class);
                startActivity(intentAlbum);
            }
        });

        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentArtist = new Intent(view.getContext(), AlbumActivity.class);
                startActivity(intentArtist);
            }
        });

        genreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentGenre = new Intent(view.getContext(), GenreActivity.class);
                startActivity(intentGenre);
            }
        });

        paymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPlaylist = new Intent(view.getContext(), PaymentActivity.class);
                startActivity(intentPlaylist);
            }
        });

    }
    }

