package com.example.j3c119121_tiazahroni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String un="Tia", ps="123";
    String un2="habibie", ps2="123";
    String un3="yanimi", ps3="123";
    String un4="abon", ps4="123";
    String un5="winnie", ps5="123";
    EditText e1,e2;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.etun);
        e2 = (EditText) findViewById(R.id.etps);
        b1 = (Button) findViewById(R.id.tmblorder);
        b2 = (Button) findViewById(R.id.tmbladmin);
    }
    public void infoid(View view) {
        Toast.makeText(this,"Masukkan username dan Password yang benar, lalu tekan Login", Toast.LENGTH_LONG).show();
    }
    public void aksilogin(View view) {
        String a = String.valueOf(e1.getText());
        String b = String.valueOf(e2.getText());
        String s;

        if (a.equals(un) && b.equals(ps)){
            s = "Login Berhasil";
            b1.setVisibility(View.VISIBLE);
        }
        else if (a.equals(un2) && b.equals(ps2)){
            s = "Login Berhasil";
            b2.setVisibility(View.VISIBLE);
        }
        else if (a.equals(un3) && b.equals(ps3)){
            s = "Login Berhasil";
            b2.setVisibility(View.VISIBLE);
        }
        else if (a.equals(un4) && b.equals(ps4)){
            s = "Login Berhasil";
            b2.setVisibility(View.VISIBLE);
        }
        else if (a.equals(un5) && b.equals(ps5)){
            s = "Login Berhasil";
            b2.setVisibility(View.VISIBLE);
        }
        else{
            s = "Username atau Password anda salah !";
        }
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();

    }
    public void formorder(View view) {
        Intent i = new Intent(this,MainActivity2.class);
        startActivity(i);
    }

    public void admin(View view) {
        Intent i = new Intent(this,utama.class);
        startActivity(i);
    }

}