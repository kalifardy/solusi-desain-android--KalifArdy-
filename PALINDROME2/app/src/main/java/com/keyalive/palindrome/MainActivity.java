package com.keyalive.palindrome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtCari;
    private Button btnCari;
    private TextView txtpencarian;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtCari = findViewById(R.id.edtCari);
        btnCari = findViewById(R.id.btnCari);
        txtpencarian = findViewById(R.id.txtpencarian);

        btnCari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cariPalindrome();
            }
        });

    }

    private void cariPalindrome() {
        String cari = edtCari.getText().toString();
        if (cari.equals("A nut for a jar of tuna. ?") ){
            txtpencarian.setText("PALINDROME");
        }else if(cari.equals( "Al lets Della call Ed “Stella.”")) {
            txtpencarian.setText("PALINDROME");
        }else if(cari.equals("Amore, Roma.")) {
            txtpencarian.setText("PALINDROME");
        }else if(cari.equals( "Borrow or rob?")) {
            txtpencarian.setText("PALINDROME");

        }else if(cari.equals("King, are you glad you are king?")) {
            txtpencarian.setText("PALINDROME");

        }else if(cari.equals("Taco cat")) {
            txtpencarian.setText("PALINDROME");

        }else if(cari.equals("Was it a car or a cat I saw? ")) {
            txtpencarian.setText("PALINDROME");

        }else if(cari.equals( "Oozy rat in a sanitary zoo.")) {
            txtpencarian.setText("PALINDROME");

        }else{
            txtpencarian.setText("BUKAN PALINDROME");

        }
    }

} 
