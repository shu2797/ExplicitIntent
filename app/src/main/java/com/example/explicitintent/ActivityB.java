package com.example.explicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        String qString = extras.getString("qString");
        final TextView textView = (TextView)
                findViewById(R.id.textView);
        textView.setText(qString);
    }

    public void onClick(View view) {
        finish();
    }
    @Override
    public void finish() {
        Intent data = new Intent();
        EditText editText1 = (EditText) findViewById(R.id.editText);
        String returnString = editText1.getText().toString();
        data.putExtra("returnData", returnString);
        setResult(RESULT_OK, data);
        super.finish();
    }
}
