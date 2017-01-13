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

public class OperationOnTwoArrayFragment  extends Fragment{

    EditText mEdtName,mEdtAge;
    TextView mTxtName,mTxtAge;
    Button mbtnAdd,mBtnPrevious,mBtnNext,mBtnFirst,mBtnLast;

    ArrayList<String> name = new ArrayList<String>();
    ArrayList<Integer> age = new ArrayList<Integer>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate
                (R.layout.fragment_operation_on_two_array, container, false);




        mEdtName= (EditText)v.findViewById(R.id.edtName);
        mEdtAge = (EditText)v.findViewById(R.id.edtAge);


        mTxtName = (TextView)v.findViewById(R.id.txtName);
        mTxtAge = (TextView)v.findViewById(R.id.txtAge);

        mbtnAdd = (Button)v.findViewById(R.id.btnAdd);
        mBtnPrevious = (Button)v.findViewById(R.id.btnPre);
        mBtnNext = (Button)v.findViewById(R.id.btnNext);
        mBtnFirst = (Button)v.findViewById(R.id.btnFirst);
        mBtnLast = (Button)v.findViewById(R.id.btnLast);

        mEdtName.requestFocus();

        mBtnFirst.setVisibility(View.GONE);
        mBtnNext.setVisibility(View.GONE);
        mBtnPrevious.setVisibility(View.GONE);
        mBtnLast.setVisibility(View.GONE);


        mbtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                if (mEdtName.getText().length() > 0 && mEdtAge.getText().length() > 0) {
                    if (name.size() >= 5 && age.size() >= 5) {
                        Toast.makeText(getActivity(), "Array is Full", Toast.LENGTH_LONG).show();
                        mEdtName.setText("");
                        mEdtAge.setText("");

                        mBtnFirst.setVisibility(View.VISIBLE);
                        mBtnNext.setVisibility(View.VISIBLE);
                        mBtnPrevious.setVisibility(View.VISIBLE);
                        mBtnLast.setVisibility(View.VISIBLE);
                    } else {
                        do {
                            String edtName = mEdtName.getText().toString();
                            name.add(edtName);
                            mEdtName.setText("");
                        } while (name.size() > 5);

                        do {
                            int edtAge = Integer.parseInt(mEdtAge.getText().toString());
                            age.add(edtAge);
                            mEdtAge.setText("");
                        } while (age.size() > 5);
                    }
                } else {
                    Toast.makeText(getActivity(), "Please enter both the Name and Age field", Toast.LENGTH_LONG).show();
                }
                mEdtName.requestFocus();




            }

        });

        mBtnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String edtName = name.get(0).toString();
                mEdtName.setText(edtName);
                int edtAge = age.get(0);
                mEdtAge.setText(Integer.toString(edtAge));

            }
        });

        mBtnLast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String edtName = name.get(4).toString();
                mEdtName.setText(edtName);
                int edtAge = age.get(4);
                mEdtAge.setText(Integer.toString(edtAge));



            }
        });

        mBtnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String edtNAme1 = mEdtName.getText().toString();
                String indexName1 = name.get((name.indexOf(edtNAme1))).toString();
                if (name.indexOf(indexName1) == 0) {
                    mEdtName.setText(name.get(4).toString());
                } else {
                    String edtName = mEdtName.getText().toString();
                    String indexName = name.get((name.indexOf(edtName)) - 1).toString();
                    mEdtName.setText(indexName);
                }
                int edtAge1 = Integer.parseInt(mEdtAge.getText().toString());
                int indexAge1 = age.get((age.indexOf(edtAge1)));
                if (age.indexOf(indexAge1) == 0) {
                    mEdtAge.setText(Integer.toString(age.get(4)));
                } else {
                    int edtAge = Integer.parseInt(mEdtAge.getText().toString());
                    int indexAge = age.get((age.indexOf(edtAge)) - 1);
                    mEdtAge.setText(Integer.toString(indexAge));
                }



            }
        });

        mBtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String edtNAme1 = mEdtName.getText().toString();
                String indexName1 = name.get((name.indexOf(edtNAme1))).toString();
                if (name.indexOf(indexName1) == 4) {
                    mEdtName.setText(name.get(0).toString());
                } else {
                    String edtName = mEdtName.getText().toString();
                    String indexName = name.get((name.indexOf(edtName)) + 1).toString();
                    mEdtName.setText(indexName);
                }
                int edtAge1 = Integer.parseInt(mEdtAge.getText().toString());
                int indexAge1 = age.get((age.indexOf(edtAge1)));
                if (age.indexOf(indexAge1) == 4) {
                    mEdtAge.setText(Integer.toString(age.get(0)));
                } else {
                    int edtAge = Integer.parseInt(mEdtAge.getText().toString());
                    int indexAge = age.get((age.indexOf(edtAge)) + 1);
                    mEdtAge.setText(Integer.toString(indexAge));
                }




            }
        });


  return v;

    }
    }
