package com.cs17b004.widgetexplortion;

import android.provider.MediaStore;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b;
    RadioGroup rg;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);
        rg=(RadioGroup)findViewById(R.id.radiogroup);
        iv = (ImageView) findViewById(R.id.imageView);
        CheckBox t = (CheckBox) findViewById(R.id.checkBox);
        t.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    iv.animate().alpha(0.3f).setDuration(2000);
                else
                    iv.animate().alpha(1).setDuration(2000);
            }
        });
        //CheckBox t2=(CheckBox)findViewById(R.id.checkBox2);
        b.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              EditText e2 = findViewById(R.id.editText);
              String s = e2.getText().toString();
              b.setText(s);
          }
      });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
             checkedId=rg.getCheckedRadioButtonId();
             //RadioButton x=(RadioButton)findViewById(checkedId);
             //   String s = x.getText().toString();
                EditText e = findViewById(R.id.editText2);
                if (checkedId==R.id.radioButton)
                    e.setText("12am");
                else if (checkedId==R.id.radioButton2)
                    e.setText("6am");
                else if(checkedId==R.id.radioButton3)
                    e.setText("12pm");
              /*  if (s =="London")
                    e.setText("12am");
                else if (s == "Beijing")
                    e.setText("6am");
                else if (s == "New york")
                    e.setText("12pm");*/

            }
        });
        Switch s=(Switch)findViewById(R.id.switch1);
        s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                TextView t=(TextView)findViewById(R.id.textView);
                if(isChecked)
                    t.setVisibility(View.INVISIBLE);
                else
                    t.setVisibility(View.VISIBLE);
            }
        });


    }
}




