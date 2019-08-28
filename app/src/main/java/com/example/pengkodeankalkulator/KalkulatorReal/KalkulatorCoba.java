package com.example.pengkodeankalkulator.KalkulatorReal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.pengkodeankalkulator.R;

public class KalkulatorCoba extends Activity implements View.OnClickListener {
    EditText vtxtA, vtxtB, vtxtC;

    protected float ytxtA, ytxtB, ytxtC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_coba);

        vtxtA = (EditText) findViewById(R.id.txtA);
        vtxtB = (EditText) findViewById(R.id.txtB);
        vtxtC = (EditText) findViewById(R.id.txtC);

        Button vBtnTambah = (Button) findViewById(R.id.btnTambah);
        Button vBtnKurang = (Button) findViewById(R.id.btnKurang);
        Button vBtnKali = (Button) findViewById(R.id.btnKali);
        Button vBtnBagi = (Button) findViewById(R.id.btnBagi);

        vBtnTambah.setOnClickListener(this);
        vBtnKurang.setOnClickListener(this);
        vBtnKali.setOnClickListener(this);
        vBtnBagi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        ytxtA = Float.parseFloat(vtxtA.getText().toString());
        ytxtB = Float.parseFloat(vtxtB.getText().toString());

        switch (v.getId()){
            case R.id.btnTambah:
                ytxtC = ytxtA + ytxtB;

                vtxtC.setText(Float.toString(ytxtC));
                break;

            case R.id.btnKurang:
                ytxtC = ytxtA - ytxtB;

                vtxtC.setText(Float.toString(ytxtC));
                break;

            case R.id.btnKali:
                ytxtC = ytxtA * ytxtB;

                vtxtC.setText(Float.toString(ytxtC));
                break;

            case R.id.btnBagi:
                ytxtC = ytxtA / ytxtB;

                vtxtC.setText(Float.toString(ytxtC));
                break;
        }

    }
}
