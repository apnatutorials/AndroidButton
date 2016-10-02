package com.apnatutorials.androidbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTextAndImage = (Button) findViewById(R.id.btnTextAndImage);
        btnTextAndImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button) view;
                Toast.makeText(MainActivity.this, "You clicked : " + b.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        Button btnButtonSelector = (Button) findViewById(R.id.btnButtonSelector);
        btnButtonSelector.setOnClickListener(this);

        Button btnSimpleButton = (Button) findViewById(R.id.btnSimpleButton);
        btnSimpleButton.setOnClickListener(new ButtonClickHandler(this));
    }

    /**
     * Method called when user click on borderless button
     */
    public void handleBorderLessButtonClick(View v) {
        Button b = (Button) v;
        Toast.makeText(MainActivity.this, "You clicked : " + b.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        Button b = (Button) view;
        Toast.makeText(MainActivity.this, "You clicked : " + b.getText(), Toast.LENGTH_SHORT).show();
    }
}
