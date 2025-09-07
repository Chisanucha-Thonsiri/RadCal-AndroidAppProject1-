package com.example.radcal;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText enterR;
    Button buttonCalculate;
    Button buttonClear;
    TextView areaResult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterR = findViewById(R.id.enterR);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        buttonClear = findViewById(R.id.buttonClear);
        areaResult = findViewById(R.id.areaResult);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radiusText = enterR.getText().toString();
                if(!radiusText.isEmpty()) {
                    double radius = Double.parseDouble(radiusText);
                    double result = Math.PI * radius * radius;
                    areaResult.setText(getString(R.string.circle_area) + " = " + result);
                }else {
                    areaResult.setText(getString(R.string.enter_r));
                }
            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                areaResult.setText(getString(R.string.result));
            }
        });
    }
}
