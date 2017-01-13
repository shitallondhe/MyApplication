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

public class PremiumFragment extends Fragment {

    EditText mEdtHealth,mEdtSex,mEdtArea,mEdtAge;/*mEdtInsured,mEdtRate,mEdtPremium*/;
    TextView mTxtHealth,mTxtSex,mTxtArea,mTxtAge,mTxtResult;
    Button mBtnResult;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_premium, container, false);




        mEdtHealth = (EditText)v.findViewById(R.id.edtHealth);
        mEdtSex = (EditText)v.findViewById(R.id.edtSex);
        mEdtArea = (EditText)v.findViewById(R.id.edtArea);
        mEdtAge = (EditText)v.findViewById(R.id.edtAge);

        mTxtHealth = (TextView)v.findViewById(R.id.txtHealth);
        mTxtSex = (TextView)v.findViewById(R.id.txtSex);
        mTxtArea = (TextView)v.findViewById(R.id.txtArea);
        mTxtAge = (TextView)v.findViewById(R.id.txtAge);
        mTxtResult = (TextView)v.findViewById(R.id.txtResult);

        mBtnResult = (Button)v.findViewById(R.id.btnResult);



        mBtnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mEdtHealth.getText().length()>0 && mEdtSex.getText().length()>0 && mEdtAge.getText().length()>0 && mEdtArea.getText().length()>0) {
                    int age;

                    char health = mEdtHealth.getText().charAt(0);
                    char sex = mEdtSex.getText().charAt(0);
                    char area = mEdtArea.getText().charAt(0);
                    age = Integer.parseInt(mEdtAge.getText().toString());



                    if (health == 'e' && sex == 'm' && area == 'c' && age >= 25 && age <= 35) {
                        mTxtResult.setText("\nInsured \nPremium rate = Rs. 4 per 1,000\nmaximum policy amount = Rs. 2,00,000");
                    } else if (health == 'e' && sex == 'f' && area == 'c' && age >= 25 && age <= 35) {
                        mTxtResult.setText("\nInsured \nPremium Rate = Rs. 3 per 1000 \nMaximum policy amount = Rs. 1,00,000");
                    } else if (health == 'p' && sex == 'm' && area == 'v' && age >= 25 && age <= 35) {
                        mTxtResult.setText("\nInsured\n Premium Rate = Rs. 6 per 1,000 \nMaximum policy amount = Rs. 10,000");

                    } else
                        mTxtResult.setText("\nYou cannot be insured\n");

                }
                else
                {
                    Toast.makeText(getActivity(), "Plz Enter All fields",Toast.LENGTH_LONG).show();
                }


            }
        });




        return v;
    }
    }
