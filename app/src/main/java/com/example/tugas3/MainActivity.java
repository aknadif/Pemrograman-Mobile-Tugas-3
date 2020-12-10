package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void panggil(View view)
    {String nomor = "02717851501" ;
        Intent panggil = new Intent(Intent.ACTION_DIAL);
        panggil.setData(Uri.fromParts("tel",nomor,null));
        startActivity(panggil);
    }
    public void webamikom(View view)
    {String url = "https://www.amikomsolo.ac.id/" ;
        Intent webamikom = new Intent(Intent.ACTION_VIEW);
        webamikom.setData(Uri. parse(url));
        startActivity(webamikom);
    }
    public void aboutme(View view)
    {Intent tentangku= new Intent(MainActivity.this,AboutActivity.class);
        startActivity(tentangku);
    }
    public void map(View view)
    {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=STMIK Cipta Darma Surakarta, Jalan Veteran, Dusun I, Singopuran, Sukoharjo Regency, Central Java");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
    public void biodata(View view)
    {
        Intent biodataku= new Intent(MainActivity.this,BiodataActivity.class);
        startActivity(biodataku);
    }
    public void absen(View view)
    {
        Intent absenku= new Intent( MainActivity.this,AbsenActivity.class);
        startActivity(absenku);
    }
}
