package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void evaluate(View view) {
        int score = 0;

        //find elements
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        EditText editText = (EditText) findViewById(R.id.editText);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        Switch switch1 = (Switch) findViewById(R.id.switch1);
        Switch switch2 = (Switch) findViewById(R.id.switch2);
        Switch switch3 = (Switch) findViewById(R.id.switch3);

        //get value from elements
        Boolean isBoxChecked1 = checkBox1.isChecked();
        Boolean isBoxChecked2 = checkBox2.isChecked();
        Boolean isBoxChecked3 = checkBox3.isChecked();

        String edit = editText.getText().toString();

        int radio = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) radioGroup.findViewById(radio);
        String radioText = radioButton.getText().toString();

        Boolean isSwitchChecked1 = switch1.isChecked();
        Boolean isSwitchChecked2 = switch2.isChecked();
        Boolean isSwitchChecked3 = switch3.isChecked();


        //validate responses
        if (isBoxChecked1 == false && isBoxChecked2 == true && isBoxChecked3 == true) {
            score += 1;
        }

        if (edit.equals("London")) {
            score += 1;
        } else {
            //else statement as requiered :-)
        }

        if (radioText.equals("Paris")) {
            score += 1;
        }

        if (isSwitchChecked1 == false && isSwitchChecked2 == false && isSwitchChecked3 == true) {
            score += 1;
        }

        Toast.makeText(this, "you have " + score + " correct answers out of 4", Toast.LENGTH_LONG).show();

    }


}
