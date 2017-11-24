package com.amin.al_khaida.m.quiz2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText Enama,Ejabatan, Egapok;
    private Button Bproses;
    Double gaji,tunjangan,pajak, Gaber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Enama = (EditText) findViewById(R.id.inputNama);
        Ejabatan = ( EditText) findViewById(R.id.inputJabatan);
        Egapok = (EditText) findViewById(R.id.InputGapok);

        Bproses = (Button) findViewById(R.id.btnProses);
        Bproses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nama = Enama.getText().toString();
                String jabatan = Ejabatan.getText().toString();
                gaji = Double.parseDouble(Egapok.getText().toString());


                if (jabatan.equalsIgnoreCase("Direktur")){
                    tunjangan = 0.5 * gaji;
                    pajak = 0.055 * gaji;
                    Gaber = gaji+tunjangan-pajak;

                }else if (jabatan.equalsIgnoreCase("Manager")){
                    tunjangan = 0.25 * gaji;
                    pajak = 0.055 * gaji;
                    Gaber = gaji+tunjangan-pajak;

                } else {
                    tunjangan = 0.3 * gaji;
                    pajak = 0.055 * gaji;
                    Gaber = gaji+tunjangan-pajak;

                }

                Intent proses = new Intent(MainActivity.this, Gaji.class);
                proses.putExtra("nama", nama);
                proses.putExtra("jabatan", jabatan);
                proses.putExtra("tunjangan" , tunjangan.toString());
                proses.putExtra("pajak" , pajak.toString());
                proses.putExtra("Gaber" , Gaber.toString());

                startActivity(proses);
                finish();
            }
        });

    }
}
