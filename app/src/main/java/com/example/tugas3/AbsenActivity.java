package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AbsenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absen);
        final EditText xabsnama = (EditText) findViewById(R.id.absnama);
        final EditText xabsnim = (EditText) findViewById(R.id.absnim);
        final EditText xabskelas = (EditText) findViewById(R.id.abskelas);
        final EditText xabssmt = (EditText) findViewById(R.id.abssmt);
        final EditText xabsmatkul = (EditText) findViewById(R.id.absmatkul);
        final EditText xabsdate = (EditText) findViewById(R.id.absdate);
        Button xabstombol = (Button) findViewById(R.id.tombolabsen);

        xabstombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Parsing Data
                Intent intent = new Intent(AbsenActivity.this, LihatAbsenActivity.class);
                intent.putExtra("absnama", xabsnama.getText().toString());
                intent.putExtra("absnim", xabsnim.getText().toString());
                intent.putExtra("abskelas", xabskelas.getText().toString());
                intent.putExtra("abssmt", xabssmt.getText().toString());
                intent.putExtra("absmatkul", xabsmatkul.getText().toString());
                intent.putExtra("absdate", xabsdate.getText().toString());

                startActivity(intent);
            }
        });

    }
}
