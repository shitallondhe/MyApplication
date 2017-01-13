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

public class MatrixOperationFragment extends Fragment {

    EditText editText1,editText2,editText3,editText4,editText5,editText6,editText7,editText8;
    TextView tv1,tv2,ans;
    Button btn_add,mul;

    Integer mat1[][]=new Integer[2][2];
    Integer mat2[][]=new Integer[2][2];
    Integer add[][]=new Integer[2][2];
    Integer mu[][]=new Integer[2][2];

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate
                (R.layout.fragment_matrix_operation, container, false);


        tv1 = (TextView) view.findViewById(R.id.txt1);
        tv2 = (TextView) view.findViewById(R.id.txt2);
        ans = (TextView) view.findViewById(R.id.txtans);

        editText1 = (EditText) view.findViewById(R.id.edt1);
        editText2 = (EditText) view.findViewById(R.id.edt2);
        editText3 = (EditText) view.findViewById(R.id.edt3);
        editText4 = (EditText) view.findViewById(R.id.edt4);

        editText5 = (EditText) view.findViewById(R.id.edt5);
        editText6 = (EditText) view.findViewById(R.id.edt6);
        editText7 = (EditText) view.findViewById(R.id.edt7);
        editText8 = (EditText) view.findViewById(R.id.edt8);

        btn_add = (Button) view.findViewById(R.id.btnadd);
        mul = (Button) view.findViewById(R.id.btnmul);


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText1.getText().length() > 0 && editText2.getText().length() > 0 && editText3.getText().length() > 0 && editText4.getText().length() > 0 &&
                        editText5.getText().length() > 0 && editText6.getText().length() > 0 && editText7.getText().length() > 0 && editText8.getText().length() > 0) {
                    getdata();
                    for (int i = 0; i < mat1.length; i++) {
                        for (int j = 0; j < mat2.length; j++) {
                            add[i][j] = mat1[i][j] + mat2[i][j];
                        }
                    }
                    StringBuilder sba = new StringBuilder();

                    for (int i = 0; i < mat1.length; i++) {
                        for (int j = 0; j < mat2.length; j++) {
                            sba.append(add[i][j] + " ");
                        }
                        sba.append(" " + '\n');
                    }

                    ans.setText(String.valueOf(sba));
                }
                else

                {
                    Toast.makeText(getActivity(),"Plz Enter The Matrix Values",Toast.LENGTH_LONG).show();
                }
            }


        });



        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (editText1.getText().length() > 0 && editText2.getText().length() > 0 && editText3.getText().length() > 0 && editText4.getText().length() > 0 &&
                        editText5.getText().length() > 0 && editText6.getText().length() > 0 && editText7.getText().length() > 0 && editText8.getText().length() > 0) {
                    getdata();

                    for(int i=0;i<mat1.length;i++)
                    {
                        for(int j=0;j<mat2.length;j++)
                        {
                            mu[i][j]=0;
                            for(int k=0;k<2;k++)
                            {
                                mu[i][j] = mu[i][j] + (mat1[i][k]*mat2[k][j]);
                            }
                        }
                    }
                    StringBuilder sba=new StringBuilder();

                    for(int i=0;i<mat1.length;i++)
                    {
                        for(int j=0;j<mat2.length;j++)
                        {

                            sba.append(mu[i][j]+" ");

                        }
                        sba.append(" "+'\n');
                    }

                    ans.setText(String.valueOf(sba));
                }
                else

                {
                    Toast.makeText(getActivity(),"Plz Enter The Matrix Values",Toast.LENGTH_LONG).show();
                }
            }



        });



        return view;

    }




    public void getdata()
    {
        mat1[0][0]=Integer.parseInt(editText1.getText().toString());
        mat1[0][1]=Integer.parseInt(editText2.getText().toString());
        mat1[1][0]=Integer.parseInt(editText3.getText().toString());
        mat1[1][1]=Integer.parseInt(editText4.getText().toString());

        mat2[0][0]=Integer.parseInt(editText5.getText().toString());
        mat2[0][1]=Integer.parseInt(editText6.getText().toString());
        mat2[1][0]=Integer.parseInt(editText7.getText().toString());
        mat2[1][1]=Integer.parseInt(editText8.getText().toString());

    }



    }





