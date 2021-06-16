package com.example.j3c119121_tiazahroni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class utama extends AppCompatActivity {
    Button btmbh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

        btmbh = (Button) findViewById(R.id.button_tambah);
    }

    //@Override
    public void klikGabung(View v) {
        // TODO Auto-generated method stub
        Intent i;
        switch(v.getId())
        {
            case R.id.button_tambah :
                i = new Intent(this,CreateData.class);
                startActivity(i);
                break;
            case R.id.button_databarang :
                i = new Intent(this, ViewData.class);
                startActivity(i);
                break;
        }
    }
}