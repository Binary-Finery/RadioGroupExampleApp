package spencerstudios.com.radiogroupexampleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    //create a radio group object
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find the radio groups view id
        radioGroup = findViewById(R.id.radio_group);

        //create button object and find its view
        Button buttonSubmit = findViewById(R.id.btn_submit);

        //add click listener to button
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //get the id of the radio button that is selected from the radio group
                int id = radioGroup.getCheckedRadioButtonId();
                RadioButton radioButton = findViewById(id);

                //get the text from the selected radio button
                String text = radioButton.getText().toString();

                //create an intent so we can navigate to the target page (activity)
                Intent intent = new Intent(MainActivity.this, Page5.class);

                //bundle the text with the intent
                intent.putExtra("selected_item", text);

                //start the next activity
                startActivity(intent);
            }
        });
    }
}
