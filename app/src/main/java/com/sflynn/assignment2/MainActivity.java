package com.sflynn.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.io.File;
/**
@author Sabrina Flynn
 With like of thanks to
https://stackoverflow.com/questions/4458752/get-the-path-of-a-gallery-folder-in-android?answertab=active#tab-top
https://stackoverflow.com/questions/14481569/open-image-with-intent-from-internal-storage
https://www.geeksforgeeks.org/android-how-to-open-camera-through-intent-and-display-captured-image/

*/
public class MainActivity extends AppCompatActivity {

    TextView openCamera = findViewById(R.id.openCamera);
    TextView viewPicture = (TextView) findViewById(R.id.viewPicture);
    TextView callActivity = (TextView)findViewById(R.id.callActivity);
    Button send = (Button)findViewById(R.id.sendButton);
    TextView blankText = (TextView)findViewById(R.id.blankView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blankText = (TextView)findViewById(R.id.to);
        Intent toIntent = getIntent();
        String toStr = toIntent.getStringExtra("to");
        blankText = (TextView)findViewById(R.id.subject);
        Intent subjectIntent = getIntent();
        String subjectStr = subjectIntent.getStringExtra("subject");
        blankText = (TextView)findViewById(R.id.compose);
        Intent composeIntent = getIntent();
        String composeStr = composeIntent.getStringExtra("compose");
    }
    //when user click open camera, camera should open
    public void onClickOpen (View view){
        Intent openIntent = new Intent();
        openIntent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(openIntent);
    }

    //potential path for gallery
    final String path = android.os.Environment.DIRECTORY_DCIM;

    //When the user clicks view picture, gallery should open
    public void onClickView (View view){
        Intent viewIntent = new Intent();
        viewIntent.setAction(Intent.ACTION_VIEW);
        File file = new File(path);
        Uri uri = Uri.fromFile(file);
        viewIntent.setDataAndType(uri,"image/*");
        startActivity(viewIntent);
            }

           // opens MailActivity when user clicks Call an Activity
    public void onClickCall (View view){
        Intent callIntent = new Intent(this, MailActivity.class);
        MainActivity.this.startActivity(callIntent);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent getIntent = getIntent();
        String strTo = getIntent.getStringExtra("to");
        String strSubject = getIntent.getStringExtra("subject");
        String strCompose = getIntent.getStringExtra("compose");

    }
}