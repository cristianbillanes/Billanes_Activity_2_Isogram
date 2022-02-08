package com.example.billanes_activity_2_isogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    TextView Result;
    EditText letters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Result = findViewById(R.id.Result);
        letters = findViewById(R.id.letters);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        if(checked){
            String letters = this.letters.getText().toString();
            Result.setText(is_isogram(letters)+"");
        }
        else
            Result.setText("Result");
    }
    boolean is_isogram(String letters){
        letters = letters.toUpperCase();
        int num_letters = letters.length();
        char arr[] = letters.toCharArray();
        Arrays.sort(arr);

        for (int i = 0; i < num_letters - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }

}