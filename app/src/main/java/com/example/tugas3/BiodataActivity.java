package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BiodataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        final EditText xbionama = (EditText) findViewById(R.id.bionama);
        final EditText xbionim = (EditText) findViewById(R.id.bionim);
        final EditText xbioemail = (EditText) findViewById(R.id.bioemail);
        final EditText xbioalamat = (EditText) findViewById(R.id.bioalamat);
        final EditText xbionomor = (EditText) findViewById(R.id.bionomor);
        Button xtombol = (Button) findViewById(R.id.tombol);

        xtombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                //Parsing Data
                Intent intent = new Intent(BiodataActivity.this, LihatBiodataActivity.class);
                intent.putExtra("bionama", xbionama.getText().toString());
                intent.putExtra("bionim", xbionim.getText().toString());
                intent.putExtra("bioemail", xbioemail.getText().toString());
                intent.putExtra("bioalamat", xbioalamat.getText().toString());
                intent.putExtra("bionomor", xbionomor.getText().toString());

                startActivity(intent);
            }
        });
    }
}
