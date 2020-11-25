package com.sflynn.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MailActivity extends AppCompatActivity {
    public static final String MAIL_MESSAGE = "com.sflynn.assignment2.message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, MailActivity.class);
        TextView editText = findViewById(R.id.blankView);
        String message = editText.getText().toString();
        intent.putExtra(MAIL_MESSAGE, message);
        startActivity(intent);
    }
}