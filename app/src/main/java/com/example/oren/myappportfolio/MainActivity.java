package com.example.oren.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View v) {
        Button b = (Button)v;
        String message = getString(R.string.launch_message_prefix)
                + b.getText().toString() + getString(R.string.launch_message_suffix);
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }
}
