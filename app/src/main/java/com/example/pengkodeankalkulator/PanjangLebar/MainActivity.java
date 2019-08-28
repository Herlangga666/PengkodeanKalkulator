package com.example.pengkodeankalkulator.PanjangLebar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pengkodeankalkulator.R;

public class MainActivity extends AppCompatActivity {
    private EditText editpanjang, editlebar;
    private Button btnhitung;
    private TextView txtluas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Hitung Luas Persegi Panjang");

        editpanjang = (EditText)findViewById(R.id.edit_panjang);
        editlebar = (EditText)findViewById(R.id.edit_lebar);
        btnhitung = (Button)findViewById(R.id.btn_hitung);
        txtluas = (TextView)findViewById(R.id.txt_luas);

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = editpanjang.getText().toString().trim();
                String lebar = editlebar.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);

                double luas = p * l;

                txtluas.setText("Luas : " + luas);
            }
        });
    }
}
