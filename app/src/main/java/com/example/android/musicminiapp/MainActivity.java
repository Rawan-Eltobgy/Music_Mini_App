package com.example.android.musicminiapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView artistButton = (TextView) findViewById(R.id.artist);
        TextView albumButton = (TextView) findViewById(R.id.album);
        TextView genreButton = (TextView) findViewById(R.id.genre);
        TextView paymentButton = (TextView) findViewById(R.id.payment_method);

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
