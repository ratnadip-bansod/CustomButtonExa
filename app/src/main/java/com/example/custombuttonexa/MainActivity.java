package com.example.custombuttonexa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button angryButton = (Button) findViewById(R.id.angry_btn);

        angryButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence buttonText=angryButton.getText();
                StringBuffer newText=new StringBuffer(buttonText);
                newText.reverse();
                angryButton.setText(newText);
            }
        });
    }
}
