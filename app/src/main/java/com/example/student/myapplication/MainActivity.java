package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClickSayMeShow(View v)
    {
        TextView txtView=(TextView)findViewById(R.id.textView3);
        EditText edittext=(EditText)findViewById(R.id.editText3);
        txtView.setText("Xin Chao: "+edittext.getText());
    }

    public void clickGoodbye(View v)
    {
        TextView txtView=(TextView)findViewById(R.id.textView3);
        EditText edittext=(EditText)findViewById(R.id.editText3);
        txtView.setText("Goodbye "+edittext.getText());
    }
}
