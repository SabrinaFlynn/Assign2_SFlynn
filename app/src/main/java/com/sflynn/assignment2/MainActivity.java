package com.sflynn.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView openCamera = findViewById(R.id.openCamera);
    }
    //when user click open camera, camera should open
    public void onClickOpen (View view){
        Intent openIntent = new Intent();
        openIntent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(openIntent);
    }

    //potential path for gallery
    public static String getGalleryPath() {
        String dir;
        return dir = Environment.getExternalStorageDirectory() + "/" + Environment.DIRECTORY_DCIM + "/";
        }
    // also potential path for gallery
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

    public void onClickCall (View view){

    }



    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
    }


}