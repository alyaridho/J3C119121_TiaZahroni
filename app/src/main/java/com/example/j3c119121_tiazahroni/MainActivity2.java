package com.example.j3c119121_tiazahroni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {
    RadioButton r1,r2,r3,r4;
    CheckBox c1,c2,c3;
    Spinner sp1;
    EditText e3,e4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        r1 = (RadioButton) findViewById(R.id.rb1);
        r2 = (RadioButton) findViewById(R.id.rb2);
        r3 = (RadioButton) findViewById(R.id.rb3);
        r4 = (RadioButton) findViewById(R.id.rb4);
        c1 = (CheckBox) findViewById(R.id.cb1);
        c2 = (CheckBox) findViewById(R.id.cb2);
        c3 = (CheckBox) findViewById(R.id.cb3);
        sp1 = (Spinner) findViewById(R.id.sp1);
        e3 = (EditText) findViewById(R.id.etnama);
        e4 = (EditText) findViewById(R.id.etalamat);
    }

    public void checkout (View view){
        Intent i2 = new Intent(this,MainActivity3.class);

        String nama = String.valueOf(e3.getText());
        i2.putExtra("Nama org",nama);
        String alamat = String.valueOf(e4.getText());
        i2.putExtra("alamat org",alamat);

        String brand;
        if (r1.isChecked()) {
            brand = "Kue Ulang Tahun - Habibie";
        }
        else if(r2.isChecked()){
            brand ="Mie Pelangi - Yanimi";
        }
        else if(r3.isChecked()) {
            brand = "Abon Tongkol - A dan N";
        }
        else{
            brand ="Kue Kering - Winnie";
        }
        i2.putExtra("Pesanan 01",brand);

        String produk="";
        if (c1.isChecked()){ produk ="Keju";}
        if (c2.isChecked()){ produk +="Coklat";}
        if (c3.isChecked()){ produk +="Vanila";}
        i2.putExtra("Pesanan 02",produk);

        String kurir = sp1.getSelectedItem().toString();
        i2.putExtra("Pesanan 03",kurir);

        startActivity(i2);
    }
}