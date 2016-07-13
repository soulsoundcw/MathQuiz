package edu.desu.mathquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //This method will check the answer.
    public void checkResult (View view) {

        EditText answerEditText = (EditText) findViewById(R.id.result_edit_text);

        int result = Integer.parseInt((answerEditText.getText().toString()));

        if (result == 9) {
            //add toast
            Toast.makeText(MainActivity.this, "Correct Answer", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Wrong Answer, Try Again", Toast.LENGTH_SHORT).show();
        }
    }


}




