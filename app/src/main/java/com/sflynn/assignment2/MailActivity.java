package com.sflynn.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//created with the help of
//https://stackoverflow.com/questions/4186021/how-to-start-new-activity-on-button-click

public class MailActivity extends AppCompatActivity {

    TextView to = (EditText)findViewById(R.id.to);
    TextView subject = (EditText)findViewById(R.id.subject);
    TextView compose = (EditText)findViewById(R.id.compose);
    Button save = (Button)findViewById(R.id.button);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);
    }

    //returns user to the main menu after clicking save
    public void sendMessage(View view) {
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent(getApplicationContext(), MainActivity.class);
                String toMessage = to.getText().toString();
                String subjectMessage = subject.getText().toString();
                String composeMessage = compose.getText().toString();
                sendIntent.putExtra("to", toMessage);
                sendIntent.putExtra("subject", subjectMessage);
                sendIntent.putExtra("compose", composeMessage);
                MailActivity.this.startActivity(sendIntent);
            }
        });

    }
}

