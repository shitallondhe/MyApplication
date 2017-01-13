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

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Shital Bharat Londhe on 25-Nov-16.
 */

public class ArrayOperationsFragment extends Fragment {

    EditText mEdtEElement,mEdtSumOfOdd,mEdtSumOfEven;
    TextView mTxtArrayOperation,mTxtSortedArray,mTxtSortedArrayResult,mTxtSumOfOdd,mTxtSumOfEven;
    Button mBtnAddElement,mBtnResult;

    // int [] number = new int[10];
    ArrayList<Integer> number = new ArrayList<Integer>();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_array_operations, container, false);

        mTxtSortedArray = (TextView)v.findViewById(R.id.txtResult);
        mTxtSortedArrayResult = (TextView)v.findViewById(R.id.txtSARes);
        mTxtSumOfEven= (TextView)v.findViewById(R.id.txtSumOfEven);
        mTxtSumOfOdd = (TextView)v.findViewById(R.id.txtSumOfOdd);
        mTxtArrayOperation = (TextView)v.findViewById(R.id.txtArroper);


        mBtnAddElement = (Button)v.findViewById(R.id.btnAdd);
        mBtnResult = (Button)v.findViewById(R.id.btn_Result);


        mEdtEElement =(EditText)v.findViewById(R.id.edtEtrNum);
        mEdtSumOfEven = (EditText)v.findViewById(R.id.edtEven);
        mEdtSumOfOdd= (EditText)v.findViewById(R.id.edtOdd);


        mBtnResult.setEnabled(false);
        mEdtEElement.requestFocus();


        mBtnAddElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mEdtEElement.getText().length() > 0 ) {
                    if (number.size() >= 10 ) {
                        Toast.makeText(getActivity(), "Array is Full", Toast.LENGTH_LONG).show();
                        mEdtEElement.setText("");

                    } else {
                        do {
                            int edtNumber =Integer.parseInt(mEdtEElement.getText().toString());
                            number.add(edtNumber);
                            mEdtEElement.setText("");
                        } while (number.size() > 10);
                        mEdtEElement.requestFocus();

                    }
                } else {
                    Toast.makeText(getActivity(), "Please Enter 10 Number In Array", Toast.LENGTH_LONG).show();
                }
                mBtnResult.setEnabled(true);
                mEdtEElement.requestFocus();





            }
        });


        mBtnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int num=10;
                int sumEven=0,sumOdd=0;
                int i = 0;
                int [] even = new int[10];
                int [] odd = new int [10];

                Collections.sort(number);

                mTxtSortedArrayResult.setText(String.valueOf(number));



                Integer names[]= (Integer[]) number.toArray(new Integer[number.size()]);//Used for stroing values of arrylist to array

                for( i = 0; i < num; i++)

                {


                    if(names[i] % 2 == 0)

                    {

                        sumEven = sumEven + names[i];
                        even[i] = sumEven;
                        mEdtSumOfEven.setText(String.valueOf(even[i]));

                    }

                    else

                    {

                        sumOdd = sumOdd + names[i];
                        odd[i] = sumOdd;
                        mEdtSumOfOdd.setText(String.valueOf(odd[i]));



                    }

                }





            }
        });
        return v;


    }
}
