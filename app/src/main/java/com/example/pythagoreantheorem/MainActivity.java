package com.example.pythagoreantheorem;

import androidx.appcompat.app.AppCompatActivity;
import java.math.*;
import android.widget.*;
import android.os.Bundle;
import android.view.*;


public class MainActivity extends AppCompatActivity {

    private EditText ValueA;
    private EditText ValueB;

    private TextView ValueC;
    private TextView ErrorBar;

    private Button ExecutionB;

    private int errorToken = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.ValueA = this.findViewById(R.id.VA);
        this.ValueB = this.findViewById(R.id.VB);
        this.ValueC = this.findViewById(R.id.VC);
        this.ErrorBar = this.findViewById(R.id.EBar);

        this.ExecutionB = this.findViewById(R.id.EB);

        this.ValueC.setText("");
        this.ErrorBar.setText("");

    }

    public void getValueC (View v)
    {
        if(v == this.ExecutionB)
        {
            double tmp = 0;

            String A = ValueA.getText().toString();
            double dA = 0;
            if(!"".equals(dA))
            {
                try{
                    dA = Double.parseDouble(A);
                } catch(Exception e){
                    this.errorToken = 1;
                }
            }
            String B = ValueB.getText().toString();
            double dB = 0;
            if(!"".equals(dB))
            {
                try{
                    dB = Double.parseDouble(B);
                } catch(Exception e){
                    this.errorToken = 1;
                }
            }

            if(this.errorToken == 0)
            {
                tmp = Math.sqrt(dA*dA + dB*dB);
                String tmpS = String.valueOf(tmp);
                this.ValueC.setText(tmpS);
            }
            else
            {
                this.ErrorBar.setText("Type the valid datatype");
            }



        }
    }




}