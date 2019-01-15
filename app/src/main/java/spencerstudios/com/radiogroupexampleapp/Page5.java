package spencerstudios.com.radiogroupexampleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Page5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);

        TextView textView = findViewById(R.id.text_view);

        //get intent passed from the previous page
        Intent intent = getIntent();
        //get the string bundled with the intent
        String text = intent.getStringExtra("selected_item");
        //set text
        textView.setText(text);


        //job done !
    }
}
