package com.moronkreacionz.currencyconverter20170227;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import static android.view.Gravity.CENTER;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){

        EditText editText = (EditText) findViewById(R.id.currencyValueEditText);

        Double usdCurrencyDouble = Double.parseDouble(editText.getText().toString());
        Double inrCurrencyDouble = usdCurrencyDouble * 66.71;
        TextView textView = (TextView) findViewById(R.id.convertedTextView );
        textView.setText( "INR "+inrCurrencyDouble.toString() );
        textView.setGravity(CENTER);

        Log.i("inputusd","input currency value is $" +editText.getText().toString() );
        //Log.i("convertedinr","converted currency value in "+ inrCurrencyDouble.toString() );
        Log.i("convertedinr","converted currency value in "+ textView.getText().toString() );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
