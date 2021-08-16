package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    EditText response;
    TextView result;
    Stack<Integer> stackCalculator = new Stack<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        response = (EditText) findViewById(R.id.editTextNumber);
        result = (TextView) findViewById(R.id.textView4);

    }

    public void empilhar(View v) {
        int responseValue = Integer.parseInt(response.getText().toString());
        stackCalculator.push(responseValue);
        result.setText(stackCalculator.toString());
    }

    public void desempilhar(View v) {
        try {
            stackCalculator.pop();
            result.setText(stackCalculator.toString());
        }
        catch(Exception e) {
            result.setText(e.toString());
        }
    }

    public void adicao(View v) {
        try {
            int aux = stackCalculator.pop();
            aux += stackCalculator.pop();
            stackCalculator.push(aux);
            result.setText(stackCalculator.toString());
        }
        catch(Exception e) {
            result.setText(e.toString());
        }
    }

    public void subtracao(View v) {
        try {
            int aux = stackCalculator.pop();
            aux -= stackCalculator.pop();
            stackCalculator.push(aux);
            result.setText(stackCalculator.toString());
        }
        catch(Exception e) {
            result.setText(e.toString());
        }
    }

    public void multiplicacao(View v) {
        try {
            int aux = stackCalculator.pop();
            aux *= stackCalculator.pop();
            stackCalculator.push(aux);
            result.setText(stackCalculator.toString());
        }
        catch(Exception ex) {
            result.setText(ex.toString());
        }
    }

    public void divisao(View v) {
        try {
            int aux = stackCalculator.pop();
            aux /= stackCalculator.pop();
            stackCalculator.push(aux);
            result.setText(stackCalculator.toString());
        }
        catch(Exception e) {
            result.setText(e.toString());
        }
    }
}