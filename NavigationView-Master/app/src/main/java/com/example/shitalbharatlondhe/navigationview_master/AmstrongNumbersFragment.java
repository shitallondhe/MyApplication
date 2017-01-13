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

/**
 * Created by Shital Bharat Londhe on 25-Nov-16.
 */

public class AmstrongNumbersFragment extends Fragment {


    EditText mEdtFinalResult,edt;
    TextView mTxtFinalResult, mTxtTitle;
    Button mBtnResult;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_amstrong_number, container, false);

    mEdtFinalResult=(EditText) v.findViewById(R.id.edtFinalREsult);

    mTxtFinalResult=(TextView) v.findViewById(R.id.txtFinalResult);
       edt  =(EditText)v.findViewById(R.id.edtFinalREsult);


        mTxtTitle=(TextView) v.findViewById(R.id.txtTitle);

    mBtnResult=(Button) v.findViewById(R.id.btnResult);

    mEdtFinalResult.setVisibility(View.GONE);

    mBtnResult.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){


            int number, temp, digit1, digit2, digit3;
            int n=10;
            int []a = new int[n];



            mEdtFinalResult.setVisibility(View.VISIBLE);


            number = 001;


            while (number <= 500)

            {

                digit1 = number - ((number / 10) * 10);

                digit2 = (number / 10) - ((number / 100) * 10);

                digit3 = (number / 100) - ((number / 1000) * 10);

                temp = (digit1 * digit1 * digit1) + (digit2 * digit2 * digit2) + (digit3 * digit3 * digit3);



                if (temp == number)

                {

                    edt.append(temp+" \n ");


                }

                number++;
            }


        }
    });

    return v;

}


}
