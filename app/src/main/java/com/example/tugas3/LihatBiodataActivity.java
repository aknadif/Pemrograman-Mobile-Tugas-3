package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LihatBiodataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_biodata);
        TextView xlihatbionama = (TextView) findViewById(R.id.lihatbionama);
        TextView xlihatbionim = (TextView) findViewById(R.id.lihatbionim);
        TextView xlihatbioemail = (TextView) findViewById(R.id.lihatbioemail);
        TextView xlihatbioalamat = (TextView) findViewById(R.id.lihatbioalamat);
        TextView xlihatbionomor = (TextView) findViewById(R.id.lihatbionomor);

        xlihatbionama.setText("Nama  " + getIntent().getStringExtra("bionama"));
        xlihatbionim.setText("Nim  " + getIntent().getStringExtra("bionim"));
        xlihatbioemail.setText("Email  " + getIntent().getStringExtra("bioemail"));
        xlihatbioalamat.setText("Alamat " + getIntent().getStringExtra("bioalamat"));
        xlihatbionomor.setText("Nomor HP : " + getIntent().getStringExtra("bionomor"));

    }
}
