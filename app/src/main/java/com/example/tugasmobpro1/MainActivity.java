package com.example.tugasmobpro1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Login;
    Button Register;
    Button Facebook;
    Button Twitter;
    Button Gplus;
    EditText Username;
    EditText Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login = (Button)findViewById(R.id.login);
        Register = (Button)findViewById(R.id.register);
        Username = (EditText)findViewById(R.id.username);
        Password = (EditText)findViewById(R.id.password);
        Facebook = (Button)findViewById(R.id.facebook);
        Twitter = (Button)findViewById(R.id.twitter);
        Gplus = (Button)findViewById(R.id.gplus);

        setLogin();
        setRegister();
        setFacebook();
        setTwitter();
        setGplus();
    }



    public void setLogin(){
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Username.getText().toString().equals("user") && Password.getText().toString().equals("user")) {
                    Intent pindah = new Intent(MainActivity.this, LoginSukses.class);
                    startActivity(pindah);
                } else {
                    Toast.makeText(MainActivity.this, "data yang anda masukkan salah", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void setRegister(){
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(MainActivity.this, Register.class);
                startActivity(register);
            }
        });
    }

    public void setFacebook(){
        Facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"));
                startActivity(intent);
            }
        });
    }

    public void setTwitter(){
        Twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com"));
                startActivity(intent);
            }
        });
    }

    public void setGplus(){
        Gplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.plus.google.com"));
                startActivity(intent);
            }
        });
    }
}
