package com.sb.tocaraul.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.sb.tocaraul.R;


public class PrincipalActivity extends AppCompatActivity {
    private ImageView btnInstagram, btnYoutube, btnTikTok, btnFacebook,
            btnPalcoMp3,btnWhatsApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal_activity);
        btnInstagram = findViewById(R.id.btnInstagram);
        btnYoutube = findViewById(R.id.btnYoutube);
        btnPalcoMp3 = findViewById(R.id.btnPalcoMp3);
        btnTikTok = findViewById(R.id.btnTikTok);
        btnFacebook = findViewById(R.id.btnFacebook);
        btnWhatsApp = findViewById(R.id.btnWhatsApp);
        btnInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/cantorsandrobatista/")));

            }
        });
        btnYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=8l0aKggH9Do&t=0s")));

            }
        });
        btnPalcoMp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.palcomp3.com.br/SandroBatistaCantor/")));

            }
        });

        btnWhatsApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/5511942815500")));

            }
        });
        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100072401779284")));

            }
        });
        btnTikTok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tiktok.com/@cantorsandrobatista")));

            }
        });
    }
    public void abrirChat(View view){
        startActivity(new Intent(this, ChatActivity.class));
        finish();
    }
}