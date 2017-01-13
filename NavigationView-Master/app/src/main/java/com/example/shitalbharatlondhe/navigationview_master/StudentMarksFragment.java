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

/**
 * Created by Shital Bharat Londhe on 25-Nov-16.
 */

public class StudentMarksFragment extends Fragment {

    EditText mEdtOne,mEdtTwo,mEdtThree,mEdtFour,mEdtFive,mEdtSix,mEdtAvg,mEdtResult;
    TextView mTxtOne,mTxtTwo,mTxtThree,mTxtFour,mTxtFive,mTxtSix;
    Button mBtnResult;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_student_marks, container, false);

        mEdtOne = (EditText)v.findViewById(R.id.edtFirst);
        mEdtTwo = (EditText)v.findViewById(R.id.edtSecond);
        mEdtThree = (EditText)v.findViewById(R.id.edtThird);
        mEdtFour = (EditText)v.findViewById(R.id.edtFourth);
        mEdtFive = (EditText)v.findViewById(R.id.edtFifth);
        mEdtSix = (EditText)v.findViewById(R.id.edtSixth);
        mEdtAvg  = (EditText)v.findViewById(R.id.edtAvg);
        mEdtResult  = (EditText)v.findViewById(R.id.edtResult);

        mTxtOne = (TextView)v.findViewById(R.id.txtFirst);
        mTxtTwo = (TextView)v.findViewById(R.id.txtSecond);
        mTxtThree = (TextView)v.findViewById(R.id.txtThird);
        mTxtFour = (TextView)v.findViewById(R.id.txtFourth);
        mTxtFive = (TextView)v.findViewById(R.id.txtFifth);
        mTxtSix = (TextView)v.findViewById(R.id.txtSixth);

        mBtnResult = (Button)v.findViewById(R.id.btnResult);

        mBtnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mEdtOne.getText().length()>0 && mEdtTwo.getText().length()>0 && mEdtThree.getText().length()>0 && mEdtFour.getText().length()>0 && mEdtFive.getText().length()>0 && mEdtSix.getText().length()>0) {
                    int i, first, second, third, fourth, fifth, sixth;
                    double avg;
                    ArrayList mylist = new ArrayList();

                    first = Integer.parseInt(mEdtOne.getText().toString());
                    second = Integer.parseInt(mEdtTwo.getText().toString());
                    third = Integer.parseInt(mEdtThree.getText().toString());
                    fourth = Integer.parseInt(mEdtFour.getText().toString());
                    fifth = Integer.parseInt(mEdtFive.getText().toString());
                    sixth = Integer.parseInt(mEdtSix.getText().toString());

                    avg = ((first + second + third + fourth + fifth + sixth) / 6);

                    mEdtAvg.setText(String.valueOf(avg));


                    if (avg > 75 && avg < 100) {
                        mEdtResult.setText("Your grade is Distinction");
                    } else if (avg >= 60 && avg < 75) {
                        mEdtResult.setText("Your grade is First Class");
                    } else if (avg >= 50 && avg < 60) {
                        mEdtResult.setText("Your grade is Second Class");
                    } else if (avg >= 35 && avg < 50) {
                        mEdtResult.setText("Your grade is Pass Class");
                    } else if (first < 35 && second < 35 && third < 35 && fourth < 35 && fifth < 35 && sixth < 35) {
                        mEdtResult.setText("Your grade is fail");
                    } else {
                        mEdtResult.setText("Your Result is A.T.K.T.");
                    }
                }
                else
                {
                    Toast.makeText(getActivity(),"Please Enter All the Fields",Toast.LENGTH_LONG).show();
                }


            }
        });


  return v;


    }
}
