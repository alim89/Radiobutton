package com.example.a20140550.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static com.example.a20140550.radiobutton.R.id.btnid;

public class MainActivity extends AppCompatActivity {
    private RadioGroup RG;
    private RadioButton RdGener;
    private Button btn;
    private TextView txtres;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RG= (RadioGroup) findViewById(R.id.RGID);
        btn= (Button) findViewById(R.id.btnid);
        txtres= (TextView) findViewById(R.id.result);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selected=RG.getCheckedRadioButtonId();
                RdGener= (RadioButton) findViewById(selected);
            String s= RdGener.getText().toString();

                txtres.setText("You have selected "+ s);

            }
        });

    }
}
