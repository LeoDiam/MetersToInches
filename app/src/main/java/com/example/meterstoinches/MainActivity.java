package com.example.meterstoinches;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText enterMeters;
    private Button convertB;
    private TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterMeters = (EditText) findViewById(R.id.metersEditText);
        resultTextView = (TextView) findViewById(R.id.result2id);
        convertB = (Button) findViewById(R.id.convertid);
        convertB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double multiplier = 39.37;
                double result = 0.0;

               if(enterMeters.getText().toString().equals("")){
                   resultTextView.setText(R.string.error_message);
                   resultTextView.setTextColor(Color.RED);
               }else{
                   double meterValue = Double.parseDouble(enterMeters.getText().toString());
                result = meterValue * multiplier;
                   resultTextView.setTextColor(Color.DKGRAY);
                resultTextView.setText(String.format("%.2f",result)+" inches!");
            }
            }
        });
    }
}