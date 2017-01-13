package com.example.shitalbharatlondhe.navigationview_master;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Double.parseDouble;

/**
 * Created by Shital Bharat Londhe on 25-Nov-16.
 */

public class ArithmeticOperationFragment extends Fragment {


    EditText mEdtFirstNumber, mEdtSecondNumber, mEdtFinalResult;
    TextView mTxtFirstNumber, mTxtSecondNumber;
    Button mBtnAddition, mBtnSubtarction, mBtnMultiplication, mBtnDivision;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_arithmetic_operation, container, false);

        mEdtFirstNumber = (EditText)v.findViewById(R.id.edtFirstNo);
        mEdtSecondNumber = (EditText)v.findViewById(R.id.edtSecondNo);
        mEdtFinalResult = (EditText)v.findViewById(R.id.edtResult);

        mTxtFirstNumber = (TextView)v.findViewById(R.id.txtFirstNo);
        mTxtSecondNumber = (TextView)v.findViewById(R.id.txtSecondNo);

        mBtnAddition = (Button)v.findViewById(R.id.btnAdd);
        mBtnSubtarction = (Button)v.findViewById(R.id.btnSub);
        mBtnMultiplication = (Button)v.findViewById(R.id.btnMult);
        mBtnDivision = (Button)v.findViewById(R.id.btnDiv);

        mBtnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double no1, no2, result;
                if((mEdtFirstNumber.getText().length()>0) && (mEdtSecondNumber.getText().length()>0)) {

                    no1 = parseDouble(mEdtFirstNumber.getText().toString());
                    no2 = parseDouble(mEdtSecondNumber.getText().toString());

                    result = no1 + no2;
                    mEdtFinalResult.setText(Double.toString(result));
                }
                else

                {
                    Toast.makeText(getActivity(), "Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();
                }

            }
        });

        mBtnSubtarction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double no1, no2, result;
                if((mEdtFirstNumber.getText().length()>0) && (mEdtSecondNumber.getText().length()>0)) {
                    no1 = parseDouble(mEdtFirstNumber.getText().toString());
                    no2 = parseDouble(mEdtSecondNumber.getText().toString());

                    result = no1 - no2;
                    mEdtFinalResult.setText(Double.toString(result));
                }
                else

                {
                    Toast.makeText(getActivity(), "Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        mBtnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double no1, no2, result;
                if((mEdtFirstNumber.getText().length()>0) && (mEdtSecondNumber.getText().length()>0)) {
                    no1 = parseDouble(mEdtFirstNumber.getText().toString());
                    no2 = parseDouble(mEdtSecondNumber.getText().toString());

                    result = no1 * no2;
                    mEdtFinalResult.setText(Double.toString(result));
                }
                else

                {
                    Toast.makeText(getActivity(), "Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();
                }

            }
        });

        mBtnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double no1,no2,result;

                if((mEdtFirstNumber.getText().length()>0) && (mEdtSecondNumber.getText().length()>0)) {
                    no1 = parseDouble(mEdtFirstNumber.getText().toString());
                    no2 = parseDouble(mEdtSecondNumber.getText().toString());

                    result = no1 / no2;
                    mEdtFinalResult.setText(Double.toString(result));
                }
                else
                {
                    Toast.makeText(getActivity(), "Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });
    return v;


    }

}
