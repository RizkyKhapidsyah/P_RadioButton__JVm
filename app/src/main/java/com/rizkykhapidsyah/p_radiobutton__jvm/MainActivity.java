package com.rizkykhapidsyah.p_radiobutton__jvm;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout Layout_IDJAVA;
    RadioButton RB_Merah_IDJAVA;
    RadioButton RB_Hijau_IDJAVA;
    RadioButton RB_Biru_IDJAVA;
    RadioGroup RadioGroup_IDXML;

    String Kalimat = "Warna Background Menjadi :";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Layout_IDJAVA = findViewById(R.id.Layout_IDXML);
        Layout_IDJAVA.setBackgroundColor(Color.TRANSPARENT);

        RB_Merah_IDJAVA = findViewById(R.id.RB_Merah_IDXML);
        RB_Hijau_IDJAVA = findViewById(R.id.RB_Hijau_IDXML);
        RB_Biru_IDJAVA = findViewById(R.id.RB_Biru_IDXML);

        RadioGroup_IDXML = findViewById(R.id.RadioGroup_IDXML);
        RadioGroup_IDXML.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.RB_Merah_IDXML:
                        Toast.makeText(getApplicationContext(),
                                Kalimat + RB_Merah_IDJAVA.getText().toString(),
                                Toast.LENGTH_LONG).show();
                        Layout_IDJAVA.setBackgroundColor(Color.RED);
                        break;
                    case R.id.RB_Hijau_IDXML:
                        Toast.makeText(getApplicationContext(),
                                Kalimat + RB_Hijau_IDJAVA.getText().toString(),
                                Toast.LENGTH_LONG).show();
                        Layout_IDJAVA.setBackgroundColor(Color.GREEN);
                        break;
                    case R.id.RB_Biru_IDXML:
                        Toast.makeText(getApplicationContext(),
                                Kalimat + RB_Biru_IDJAVA.getText().toString(),
                                Toast.LENGTH_LONG).show();
                        Layout_IDJAVA.setBackgroundColor(Color.BLUE);
                        break;
                }
            }
        });

    }
}
