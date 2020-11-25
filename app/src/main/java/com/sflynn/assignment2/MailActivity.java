package com.sflynn.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
//created with the help of
//https://stackoverflow.com/questions/4186021/how-to-start-new-activity-on-button-click

public class MailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);
    }

    //returns user to the main menu after clicking save
    public void sendMessage(View view) {
        Intent sendIntent = new Intent(this, MainActivity.class);
        TextView editText = findViewById(R.id.blankView);
        //String message = editText.getText().toString();
        MailActivity.this.startActivity(sendIntent);
    }
}
