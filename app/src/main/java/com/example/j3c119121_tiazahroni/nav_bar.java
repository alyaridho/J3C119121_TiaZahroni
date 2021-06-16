package com.example.j3c119121_tiazahroni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class nav_bar extends AppCompatActivity implements View.OnClickListener{
public ImageView btnhome, btnpesan, btnpesanan, btnprofile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_bar);
        btnhome = (ImageView)findViewById(R.id.nav_home);
        btnpesan = (ImageView)findViewById(R.id.nav_pesan);
        btnpesanan = (ImageView)findViewById(R.id.nav_pesanan);
        btnprofile = (ImageView)findViewById(R.id.nav_profile);


    }
//    public void klikhome(View v) {
//        Intent i = new Intent(this, home.class);
//        startActivity(i);
//    }
//    public void klikpesan(View v) {
//        Intent i = new Intent(this, MainActivity2.class);
//        startActivity(i);
//    }
//    public void klikpesanan(View v) {
//        Intent i = new Intent(this, MainActivity3.class);
//        startActivity(i);
//    }
//    public void klikprofile(View v) {
//        Intent i = new Intent(this, profile.class);
//        startActivity(i);
//    }

    //@Override
    public void kliknavigasi(View v) {
        // TODO Auto-generated method stub
        Intent i;
        switch(v.getId())
        {
            case R.id.nav_home :
                i = new Intent(this,home.class);
                startActivity(i);
                break;
            case R.id.nav_pesan :
                i = new Intent(this, MainActivity2.class);
                startActivity(i);
                break;
            case R.id.nav_pesanan :
                i = new Intent(this, MainActivity3.class);
                startActivity(i);
                break;
            case R.id.nav_profile :
                i = new Intent(this, profile.class);
                startActivity(i);
                break;
        }
    }

    //@Override
    public void onClick(View v) {

    }
}