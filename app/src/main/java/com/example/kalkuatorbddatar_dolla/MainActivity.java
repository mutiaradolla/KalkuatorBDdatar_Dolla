package com.example.kalkuatorbddatar_dolla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtAngka1, edtAngka2;
    Button btnPersegi, btnLingkaran, btnSegitiga;
    TextView txtLuas, txtKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtAngka1 = (EditText) findViewById(R.id.edtAngka1);
        edtAngka2 = (EditText) findViewById(R.id.edtAngka2);

        btnPersegi = (Button) findViewById(R.id.btnPersegi);
        btnLingkaran = (Button) findViewById(R.id.btnLingkaran);
        btnSegitiga = (Button) findViewById(R.id.btnSegitiga);

        txtLuas = (TextView) findViewById(R.id.txtLuas);
        txtKeliling = (TextView) findViewById(R.id.txtKeliling);

        btnPersegi.setOnClickListener(v ->{
            String sisi1 = edtAngka1.getText().toString();
            String sisi2 = edtAngka2.getText().toString();

            int s1 = Integer.parseInt(sisi1);
            int s2 = Integer.parseInt(sisi2);

            int Luas = s1*s2;
            int Keliling = 2*(s1 + s2);

            txtLuas.setText(String.valueOf(Luas));
            txtKeliling.setText(String.valueOf(Keliling));
        });

        btnSegitiga.setOnClickListener(v ->{
            String alas = edtAngka1.getText().toString();
            String tinggi = edtAngka2.getText().toString();

            int a = Integer.parseInt(alas);
            int t = Integer.parseInt(tinggi);

            int Luas = (a*t)/2;
            int Keliling = a + a + a;

            txtLuas.setText(String.valueOf(Luas));
            txtKeliling.setText(String.valueOf(Keliling));
        });

        btnLingkaran.setOnClickListener(v -> {
            String diameter = edtAngka1.getText().toString();

            int D = Integer.parseInt(diameter);

            double r = D/2;
            double Luas = 3.14 * r * r;
            double Keliling = 2 * 3.14 * r;

            txtLuas.setText(String.valueOf(Luas));
            txtKeliling.setText(String.valueOf(Keliling));
        });
    }

}