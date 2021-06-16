package com.example.j3c119121_tiazahroni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class home extends AppCompatActivity implements View.OnClickListener {
    ImageView btnhome, btnpesan, btnpesanan, btnprofile;
    ImageView abon, bolu, yanimie, winnie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnhome = (ImageView) findViewById(R.id.nav_home);
        btnpesan = (ImageView) findViewById(R.id.nav_pesan);
        btnpesanan = (ImageView) findViewById(R.id.nav_pesanan);
        btnprofile = (ImageView) findViewById(R.id.nav_profile);

        abon = (ImageView) findViewById(R.id.umkmabon);
        bolu = (ImageView) findViewById(R.id.umkmbolu);
        winnie = (ImageView) findViewById(R.id.umkmwinnie);
        yanimie = (ImageView) findViewById(R.id.umkmyanimie);

    }

    @Override
    public void onClick(View v) {

    }

    public void kliknavigasi(View v) {
        // TODO Auto-generated method stub
        Intent i;
        switch (v.getId()) {
            case R.id.nav_home:
                i = new Intent(this, home.class);
                startActivity(i);
                break;
            case R.id.nav_pesan:
                i = new Intent(this, MainActivity2.class);
                startActivity(i);
                break;
            case R.id.nav_pesanan:
                i = new Intent(this, MainActivity3.class);
                startActivity(i);
                break;
            case R.id.nav_profile:
                i = new Intent(this, profile.class);
                startActivity(i);
                break;
        }
    }

    public void toko(View v) {
        // TODO Auto-generated method stub
        Intent j;
        switch (v.getId()) {
            case R.id.umkmabon:
                j = new Intent(this, abon.class);
                startActivity(j);
                break;
            case R.id.umkmbolu:
                j = new Intent(this, habibi.class);
                startActivity(j);
                break;
            case R.id.umkmwinnie:
                j = new Intent(this, winnie.class);
                startActivity(j);
                break;
            case R.id.umkmyanimie:
                j = new Intent(this, yanimie.class);
                startActivity(j);
                break;
        }
    }
}