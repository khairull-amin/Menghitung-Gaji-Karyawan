package com.amin.al_khaida.m.quiz2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class Gaji extends AppCompatActivity {

    EditText Ednama,Edjabatan, Edtunjangan, Edpajak, Edgaber;
    Button btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaji);

        Ednama = (EditText) findViewById(R.id.editNama);
        Edjabatan = (EditText) findViewById(R.id.editJabatan);
        Edtunjangan = (EditText) findViewById(R.id.editTunjangan);
        Edpajak = (EditText) findViewById(R.id.editPajak);
        Edgaber = (EditText) findViewById(R.id.editGapok);
        btnBack = (Button) findViewById(R.id.btnButton);


        Intent intent = getIntent();
        String nama = intent.getStringExtra("nama");
        String jabatan = intent.getStringExtra("jabatan");
        String tunjangan = intent.getStringExtra("tunjangan");
        String pajak = intent.getStringExtra("pajak");
        String gaber = intent.getStringExtra("Gaber");

        Ednama.setText(nama);
        Edjabatan.setText(jabatan);
        Edtunjangan.setText(tunjangan);
        Edpajak.setText(pajak);
        Edgaber.setText(gaber);

btnBack.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent kembali= new Intent(Gaji.this , MainActivity.class);
        startActivity(kembali);
        finish();
    }
});

    }
}
