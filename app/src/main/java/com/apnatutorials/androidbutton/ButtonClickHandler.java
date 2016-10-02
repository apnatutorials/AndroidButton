package com.apnatutorials.androidbutton;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonClickHandler implements View.OnClickListener {
    Context ctx ;

    public ButtonClickHandler(Context context) {
        this.ctx = context;

    }

    @Override
    public void onClick(View view) {
        Button button =(Button) view ;
        Toast.makeText(ctx, "You clicked : "+ button.getText(), Toast.LENGTH_SHORT).show();
    }
}
