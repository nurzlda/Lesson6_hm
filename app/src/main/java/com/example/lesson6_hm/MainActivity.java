package com.example.lesson6_hm;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText email, password;
    private Button loginButton;
    private TextView text1, text3, text4, text5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.edt_t);
        password = findViewById(R.id.edt_t2);
        loginButton = findViewById(R.id.btn);
        text1 = findViewById(R.id.text);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);
        text5 = findViewById(R.id.text5);
        loginButton.setOnClickListener(view -> {
            if (email.getText().toString().equals("admin") ||
                    password.getText().toString().equals("admin")){
                email.setVisibility(View.INVISIBLE);
                password.setVisibility(View.INVISIBLE);
                text1.setVisibility(View.INVISIBLE);
                text3.setVisibility(View.INVISIBLE);
                text4.setVisibility(View.INVISIBLE);
                text5.setVisibility(View.INVISIBLE);
                loginButton.setVisibility(View.INVISIBLE);


                Toast.makeText(this, "Вы успешно зарегистрировались",
                        Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Ввели неправильно пароль или почту" ,
                        Toast.LENGTH_SHORT).show();
            }

        });

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                loginButton.setBackground(getDrawable(R.drawable.ic_btn_orange));
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}