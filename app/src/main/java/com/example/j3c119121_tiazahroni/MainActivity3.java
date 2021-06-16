package com.example.j3c119121_tiazahroni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5;
    Intent iA3;
    String nama,alamat,merek,produk,kurir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        t1 = (TextView) findViewById(R.id.nama);
        t2 = (TextView) findViewById(R.id.alamat);
        t3 = (TextView) findViewById(R.id.merek);
        t4 = (TextView) findViewById(R.id.produk);
        t5 = (TextView) findViewById(R.id.kurir);

        iA3 = getIntent();
        nama = iA3.getStringExtra("Nama org");
        t1.setText("Nama  :"+nama);

        alamat = iA3.getStringExtra("alamat org");
        t2.setText("Alamat  :"+alamat);

        merek = iA3.getStringExtra("Pesanan 01");
        t3.setText("Menu  :"+merek);

        produk = iA3.getStringExtra("Pesanan 02");
        t4.setText("Varian  :"+produk);

        kurir = iA3.getStringExtra("Pesanan 03");
        t5.setText("Kurir  :"+kurir);
    }
}