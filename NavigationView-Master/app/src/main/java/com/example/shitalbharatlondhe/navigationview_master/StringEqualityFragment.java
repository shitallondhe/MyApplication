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


/**
 * Created by Shital Bharat Londhe on 25-Nov-16.
 */

public class StringEqualityFragment extends Fragment {



    EditText mEdtFirstString,mEdtSecondString;
    TextView mTxtFirstString,mTxtSecondString,mTxtStringCompare,mTxtStringResult;
    Button mBtnStringResult;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_string_equality, container, false);



        mEdtFirstString= (EditText)v.findViewById(R.id.edtFirstString);
        mEdtSecondString = (EditText)v.findViewById(R.id.edtSecondString);
        mTxtStringResult = (TextView) v.findViewById(R.id.txtStringResult);

        mTxtFirstString = (TextView)v.findViewById(R.id.txtFirstString);
        mTxtSecondString = (TextView)v.findViewById(R.id.txtSecondString);

        mBtnStringResult = (Button)v.findViewById(R.id.btnStrComp);


        mBtnStringResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEdtFirstString.getText().toString().length() > 0 && mEdtSecondString.getText().toString().length() > 0) {
                    String s1, s2;

                    s1 = (mEdtFirstString.getText().toString());
                    s2 = (mEdtSecondString.getText().toString());

                    if (s1.equals(s2)) {
                        mTxtStringResult.setText("Both String Are Equal");

                    } else {
                        mTxtStringResult.setText("Both String Are not Equal");
                    }
                }


                else

                {
                    Toast.makeText(getActivity(), "Please Enter The Both String", Toast.LENGTH_LONG).show();
                }
            }
        });
        return v;


    }


    }
