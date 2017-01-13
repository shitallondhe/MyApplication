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

public class DetermineCharcterTypeDemo extends Fragment {

    EditText mEdtEnerChar,mEdtCharIs;
    TextView mTxtEnterChar,mTxtCharIs;
    Button mBtnResult;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_charater_type, container, false);



        mEdtEnerChar = (EditText)v.findViewById(R.id.edtEnterCharacter);
        mEdtCharIs = (EditText)v.findViewById(R.id.edtCharateris);

        mTxtEnterChar =(TextView)v.findViewById(R.id.txtEnterCharacter);
        mTxtCharIs =(TextView)v.findViewById(R.id.txtCharacteris);

        mBtnResult = (Button)v.findViewById(R.id.btnResult);

        mBtnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mEdtEnerChar.getText().length()>0) {


                    char ch;
                    ch = (mEdtEnerChar.getText().charAt(0));

                    if (ch >= 65 && ch <= 90) {
                        mEdtCharIs.setText(" A capital letter");
                    } else if (ch >= 97 && ch <= 122) {
                        mEdtCharIs.setText(" A small letter");
                    } else if (ch >= 48 && ch <= 57) {
                        mEdtCharIs.setText("A digit");
                    } else if ((ch > 0 && ch <= 47) || (ch >= 58 && ch <= 64) ||
                            (ch >= 91 && ch <= 96) || (ch >= 123 && ch <= 127)) {
                        mEdtCharIs.setText(" A special symbol");

                    }
                }
                else
                {
                    Toast.makeText(getActivity(),"Plz enter The Character",Toast.LENGTH_LONG).show();
                }


            }
        });
 return  v;



    }


}
