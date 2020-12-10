package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LihatAbsenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_absen);

        TextView xlihatabsnama = (TextView) findViewById(R.id.lihatabsnama);
        TextView xlihatabsnim = (TextView) findViewById(R.id.lihatabsnim);
        TextView xlihatabkelas = (TextView) findViewById(R.id.lihatabskelas);
        TextView xlihatabssmt = (TextView) findViewById(R.id.lihatabssmt);
        TextView xlihatabsmatkul = (TextView) findViewById(R.id.lihatabsmatkul);
        TextView xlihatabsdate = (TextView) findViewById(R.id.lihatabsdate);

        xlihatabsnama.setText("Nama  " + getIntent().getStringExtra("absnama"));
        xlihatabsnim.setText("Nim  " + getIntent().getStringExtra("absnim"));
        xlihatabkelas.setText("Kelas  " + getIntent().getStringExtra("abskelas"));
        xlihatabssmt.setText("Semester " + getIntent().getStringExtra("abssmt"));
        xlihatabsmatkul.setText("Mata Kuliah : " + getIntent().getStringExtra("absmatkul"));
        xlihatabsdate.setText("Tanggal : " + getIntent().getStringExtra("absdate"));
    }
}
