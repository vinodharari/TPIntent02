package com.example.vharari.tpintent02;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String recipients = "itsvins63@gmail.com";
        String subject = "test from Intent02";
        String body = "from body";

        Intent email = new Intent(Intent.ACTION_SEND, Uri.parse("mailto:"));
        email.putExtra(Intent.EXTRA_EMAIL, recipients);
        email.putExtra(Intent.EXTRA_SUBJECT, subject.toString());
        email.putExtra(Intent.EXTRA_TEXT, body.toString());
        startActivity(Intent.createChooser(email, "Choose an email client from..."));
    }
}
