package com.example.uas_risna_lailatun_najmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editbb,edittb,editimt,edithasil;
    Button btnhitung;
    Double vberat,vtinggi,vimt;
    String vhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editbb = (EditText)findViewById(R.id.editbb);
        edittb = (EditText)findViewById(R.id.editttb);
        editimt = (EditText)findViewById(R.id.editimt);
        edithasil = (EditText)findViewById(R.id.edithasil);
        btnhitung = (Button)findViewById(R.id.btnhitung);
    }

    public void hitung(View view){
        vberat = Double.parseDouble(editbb.getText().toString());
        vtinggi = Double.parseDouble((edittb.getText().toString()));

        vimt = vberat / ((vtinggi/100)*(vtinggi/100));

        if (vimt < 18.5){
            vhasil = "Berat Badan di bawah normal";
        }
        else if (vimt >= 18.5 && vimt < 22.9){
            vhasil = "Berat Badan Normal";
        }
        else if (vimt >= 23 && vimt < 24.9){
            vhasil = "Berat Badan Berlebih";
        }
        else if (vimt >= 25 && vimt < 29.9){
            vhasil = "Obesitas Tahap I";
        }
        else {
            vhasil = "Obesitas Tahap II";
        }
        editimt.setText(""+vimt);
        edithasil.setText(""+vhasil);
    }
}