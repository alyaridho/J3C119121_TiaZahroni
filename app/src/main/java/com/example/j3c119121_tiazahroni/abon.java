package com.example.j3c119121_tiazahroni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class abon extends AppCompatActivity {
    ImageView btnhome,btnpesan,btnpesanan,btnprofile;
    Button order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abon);
        btnhome= (ImageView) findViewById(R.id.nav_home);
        btnpesan = (ImageView)findViewById(R.id.nav_pesan);
        btnpesanan = (ImageView)findViewById(R.id.nav_pesanan);
        btnprofile = (ImageView)findViewById(R.id.nav_profile);

        order = (Button)findViewById(R.id.tmblpesan);
    }

    public void kliknavigasi(View v) {
        // TODO Auto-generated method stub
        Intent i;
        switch (v.getId()) {
            case R.id.nav_home:
                i = new Intent(this, home.class);
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
    public void order(View view) {
        Intent i = new Intent(this,MainActivity2.class);
        startActivity(i);
    }
}