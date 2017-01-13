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

public class SteelGradeFragment extends Fragment {

    EditText mEdtHardness,mEdtCarbonContent,mEdtTensileStrngth,mEdtGrade;
    TextView mTxtHardness,mTxtCarbonCotent,mTxtTesileStrength,mTxtGrade;
    Button mBtnResult;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_steel_grade, container, false);


        mEdtHardness =(EditText)v.findViewById(R.id.edtHardness);
        mEdtCarbonContent =(EditText)v.findViewById(R.id.edtCarbonContent);
        mEdtTensileStrngth =(EditText)v.findViewById(R.id.edtTensileStrength);
        mEdtGrade =(EditText)v.findViewById(R.id.edtGrde);


        mTxtHardness = (TextView)v.findViewById(R.id.txtHardness);
        mTxtCarbonCotent = (TextView)v.findViewById(R.id.txtCarbonContent);
        mTxtTesileStrength = (TextView)v.findViewById(R.id.txtTensileStrength);
        mTxtGrade = (TextView)v.findViewById(R.id.txtGrade);

        mBtnResult =(Button)v.findViewById(R.id.btnResult);

        mEdtHardness.requestFocus();


        mBtnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mEdtHardness.getText().length()>0 && mEdtCarbonContent.getText().length()>0 && mEdtTensileStrngth.getText().length()>0) {
                    int hardness;
                    double carbon_content, tensile_strength;

                    hardness = Integer.parseInt(mEdtHardness.getText().toString());
                    carbon_content = Double.parseDouble(mEdtCarbonContent.getText().toString());
                    tensile_strength = Double.parseDouble(mEdtTensileStrngth.getText().toString());


                    if (hardness > 50 && carbon_content < 0.7 && tensile_strength > 5600) {
                        mEdtGrade.setText("Grade is 10 ");
                    } else if (hardness > 50 && carbon_content < 0.7 && tensile_strength < 5600) {
                        mEdtGrade.setText("Grade is 9 ");
                    } else if (hardness < 50 && carbon_content < 0.7 && tensile_strength > 5600) {
                        mEdtGrade.setText("Grade is 8 ");
                    } else if (hardness > 50 && carbon_content < 0.7 && tensile_strength > 5600) {
                        mEdtGrade.setText("Grade is 7 ");
                    } else if (hardness > 50 || carbon_content < 0.7 || tensile_strength > 5600) {
                        mEdtGrade.setText("Grade is 6");
                    } else {
                        mEdtGrade.setText("Grade is 5");
                    }
                }
                else
                {
                    Toast.makeText(getActivity(),"Plz Enter All Fields",Toast.LENGTH_LONG).show();
                }
                mEdtHardness.requestFocus();
            }
        });


 return  v;

    }

}
