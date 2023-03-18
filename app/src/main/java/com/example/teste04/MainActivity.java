package com.example.teste04;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificarNumeroPerfeito();
            }
        });
    }

    private void verificarNumeroPerfeito() {
        String valueString = editText.getText().toString();

        if (valueString.isEmpty()) {
            Toast.makeText(this, "Digite um número primeiro!", Toast.LENGTH_SHORT).show();
            return;
        }

        int value = Integer.parseInt(valueString);
        PerfectNumber perfectNumber = new PerfectNumber();

        if (perfectNumber.isPerfectNumber(value)) {
            Toast.makeText(this, value + " é um número perfeito!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, value + " não é um número perfeito.", Toast.LENGTH_SHORT).show();
        }
    }
}