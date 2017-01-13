package com.example.shitalbharatlondhe.navigationview_master;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Defining Variables
    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing Toolbar and setting it as the actionbar
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Initializing NavigationView
        navigationView = (NavigationView)
                findViewById(R.id.navigation_view);

        //Setting Navigation View Item Selected Listener to handle the item click of the navigation menu
        navigationView.setNavigationItemSelectedListener
                (new NavigationView.OnNavigationItemSelectedListener() {

            // This method will trigger on item Click of navigation menu
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {


                //Checking if the item is in checked state or not, if not make it in checked state
                if(menuItem.isChecked())
                    menuItem.setChecked(false);
                else
                    menuItem.setChecked(true);

                //Closing drawer on item click
                drawerLayout.closeDrawers();

                //Check to see which item was being clicked and perform appropriate action
                switch (menuItem.getItemId()){


                    //Replacing the main content with AreaOfCircleFragment Which is our Inbox View;
                    case R.id.area_of_circle:
                        Toast.makeText(getApplicationContext(),"Area of Circle",
                                Toast.LENGTH_SHORT).show();
                        AreaOfCircleFragment fragment = new AreaOfCircleFragment();
                        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.frame,fragment);
                        fragmentTransaction.commit();
                        return true;


                    case R.id.even_odd_number:
                        Toast.makeText(getApplicationContext(),"Odd Even Number Selected",Toast.LENGTH_SHORT).show();
                        OddEvenNumbersFragment oefragment = new OddEvenNumbersFragment();
                        android.support.v4.app.FragmentTransaction oefragmentTransaction = getSupportFragmentManager().beginTransaction();
                        oefragmentTransaction.replace(R.id.frame,oefragment);
                        oefragmentTransaction.commit();
                        return true;



                    case R.id.temp_conversion:
                        Toast.makeText(getApplicationContext(),"Temp Conversion Selected",Toast.LENGTH_SHORT).show();
                        TempConversionFragment tcfragment = new TempConversionFragment();
                        android.support.v4.app.FragmentTransaction tcfragmentTransaction = getSupportFragmentManager().beginTransaction();
                        tcfragmentTransaction.replace(R.id.frame,tcfragment);
                        tcfragmentTransaction.commit();
                        return true;

                    case R.id.length_conversion:
                        Toast.makeText(getApplicationContext(),"Length Conversion Selected",Toast.LENGTH_SHORT).show();
                        LengthConversionFragment lcfragment = new  LengthConversionFragment();
                        android.support.v4.app.FragmentTransaction lcfragmentTransaction = getSupportFragmentManager().beginTransaction();
                        lcfragmentTransaction.replace(R.id.frame,lcfragment);
                        lcfragmentTransaction.commit();
                        return true;


                    case R.id.simple_interest:
                        Toast.makeText(getApplicationContext(),"Simple Interest Selected",Toast.LENGTH_SHORT).show();
                        SimpleInterestFragment sifragment = new SimpleInterestFragment();
                        android.support.v4.app.FragmentTransaction sifragmentTransaction = getSupportFragmentManager().beginTransaction();
                        sifragmentTransaction.replace(R.id.frame,sifragment);
                        sifragmentTransaction.commit();
                        return true;

                    case R.id.string_equality:
                        Toast.makeText(getApplicationContext(),"String Equality Selected",Toast.LENGTH_SHORT).show();
                        StringEqualityFragment sefragment = new StringEqualityFragment();
                        android.support.v4.app.FragmentTransaction sefragmentTransaction = getSupportFragmentManager().beginTransaction();
                        sefragmentTransaction.replace(R.id.frame,sefragment);
                        sefragmentTransaction.commit();
                        return true;


                    case R.id.array_operations:
                        Toast.makeText(getApplicationContext(),"Array Operation Selected",Toast.LENGTH_SHORT).show();
                      ArrayOperationsFragment aofragment = new ArrayOperationsFragment();
                        android.support.v4.app.FragmentTransaction aofragmentTransaction = getSupportFragmentManager().beginTransaction();
                        aofragmentTransaction.replace(R.id.frame,aofragment);
                        aofragmentTransaction.commit();
                        return true;



                    case R.id.amstrong_numbers:
                        Toast.makeText(getApplicationContext(),"Amstrong Number Selected",Toast.LENGTH_SHORT).show();
                       AmstrongNumbersFragment anfragment = new AmstrongNumbersFragment();
                        android.support.v4.app.FragmentTransaction anfragmentTransaction = getSupportFragmentManager().beginTransaction();
                        anfragmentTransaction.replace(R.id.frame,anfragment);
                        anfragmentTransaction.commit();
                        return true;


                    case R.id.random_numbers:
                        Toast.makeText(getApplicationContext(),"Random Number Selected",Toast.LENGTH_SHORT).show();
                        RandomNumberFragment rnfragment = new RandomNumberFragment();
                        android.support.v4.app.FragmentTransaction rnfragmentTransaction = getSupportFragmentManager().beginTransaction();
                        rnfragmentTransaction.replace(R.id.frame,rnfragment);
                        rnfragmentTransaction.commit();
                        return true;


                    case R.id.arithmetic_operations:
                        Toast.makeText(getApplicationContext(),"Arithmetic Operation Selected",Toast.LENGTH_SHORT).show();
                        ArithmeticOperationFragment arfragment = new   ArithmeticOperationFragment();
                        android.support.v4.app.FragmentTransaction arfragmentTransaction = getSupportFragmentManager().beginTransaction();
                        arfragmentTransaction.replace(R.id.frame,arfragment);
                        arfragmentTransaction.commit();
                        return true;


                    case R.id.swapping_element:
                        Toast.makeText(getApplicationContext(),"Swapping Element Selected",Toast.LENGTH_SHORT).show();
                        SwappingElementsFragment selementfragment = new SwappingElementsFragment();
                        android.support.v4.app.FragmentTransaction selementfragmentTransaction = getSupportFragmentManager().beginTransaction();
                        selementfragmentTransaction.replace(R.id.frame,selementfragment);
                        selementfragmentTransaction.commit();
                        return true;




                    case R.id.student_marks:
                        Toast.makeText(getApplicationContext(),"Students Marks Selected",Toast.LENGTH_SHORT).show();
                         StudentMarksFragment smfragment = new StudentMarksFragment();
                        android.support.v4.app.FragmentTransaction smfragmentTransaction = getSupportFragmentManager().beginTransaction();
                        smfragmentTransaction.replace(R.id.frame,smfragment);
                        smfragmentTransaction.commit();
                        return true;



                    case R.id.compound_interest:
                        Toast.makeText(getApplicationContext(),"Compound Interest Selected",Toast.LENGTH_SHORT).show();
                        CompoundInterestFragment cifragment = new CompoundInterestFragment();
                        android.support.v4.app.FragmentTransaction cifragmentTransaction = getSupportFragmentManager().beginTransaction();
                        cifragmentTransaction.replace(R.id.frame,cifragment);
                        cifragmentTransaction.commit();
                        return true;



                    case R.id.gross_salary:
                        Toast.makeText(getApplicationContext(),"Gross Salary Selected",Toast.LENGTH_SHORT).show();
                        GrossSalaryFragment gsfragment = new GrossSalaryFragment();
                        android.support.v4.app.FragmentTransaction gsfragmentTransaction = getSupportFragmentManager().beginTransaction();
                        gsfragmentTransaction.replace(R.id.frame,gsfragment);
                        gsfragmentTransaction.commit();
                        return true;

                    case R.id.driver_insurance:
                        Toast.makeText(getApplicationContext(),"Driver Insurnce Selected",Toast.LENGTH_SHORT).show();
                        DriverInsurnceFragment difragment = new DriverInsurnceFragment();
                        android.support.v4.app.FragmentTransaction difragmentTransaction = getSupportFragmentManager().beginTransaction();
                        difragmentTransaction.replace(R.id.frame,difragment);
                        difragmentTransaction.commit();
                        return true;



                    case R.id.charater_determine:
                        Toast.makeText(getApplicationContext(),"Determination of character Selected",Toast.LENGTH_SHORT).show();
                        DetermineCharcterTypeDemo dcfragment = new DetermineCharcterTypeDemo();
                        android.support.v4.app.FragmentTransaction dcfragmentTransaction = getSupportFragmentManager().beginTransaction();
                        dcfragmentTransaction.replace(R.id.frame,dcfragment);
                        dcfragmentTransaction.commit();
                        return true;



                    case R.id.calculate_premium:
                        Toast.makeText(getApplicationContext(),"Premium Calculation Selected",Toast.LENGTH_SHORT).show();
                        PremiumFragment pffragment = new PremiumFragment();
                        android.support.v4.app.FragmentTransaction pffragmentTransaction = getSupportFragmentManager().beginTransaction();
                        pffragmentTransaction.replace(R.id.frame,pffragment);
                        pffragmentTransaction.commit();
                        return true;


                    case R.id.steel_grade:
                        Toast.makeText(getApplicationContext(),"Steel Grade Selected",Toast.LENGTH_SHORT).show();
                        SteelGradeFragment sgfragment = new SteelGradeFragment();
                        android.support.v4.app.FragmentTransaction sgfragmentTransaction = getSupportFragmentManager().beginTransaction();
                        sgfragmentTransaction.replace(R.id.frame,sgfragment);
                        sgfragmentTransaction.commit();
                        return true;


                    case R.id.note_demo:
                        Toast.makeText(getApplicationContext(),"Note Demo Selected",Toast.LENGTH_SHORT).show();
                        NoteDemoFragment ndfragment = new NoteDemoFragment();
                        android.support.v4.app.FragmentTransaction ndfragmentTransaction = getSupportFragmentManager().beginTransaction();
                        ndfragmentTransaction.replace(R.id.frame,ndfragment);
                        ndfragmentTransaction.commit();
                        return true;


                    case R.id.telephone_bill:
                        Toast.makeText(getApplicationContext(),"Telephone Bill Selected",Toast.LENGTH_SHORT).show();
                        TelephoneBillsFragment tffragment = new TelephoneBillsFragment();
                        android.support.v4.app.FragmentTransaction tffragmentTransaction = getSupportFragmentManager().beginTransaction();
                        tffragmentTransaction.replace(R.id.frame,tffragment);
                        tffragmentTransaction.commit();
                        return true;


                    case R.id.matrix_operation:
                        Toast.makeText(getApplicationContext(),"Matrix Operation Selected",Toast.LENGTH_SHORT).show();
                       MatrixOperationFragment mofragment = new MatrixOperationFragment();
                        android.support.v4.app.FragmentTransaction mofragmentTransaction = getSupportFragmentManager().beginTransaction();
                        mofragmentTransaction.replace(R.id.frame,mofragment);
                        mofragmentTransaction.commit();
                        return true;

                    case R.id.two_array_operation:
                        Toast.makeText(getApplicationContext(),"Two Array Operation Selected",Toast.LENGTH_SHORT).show();
                        OperationOnTwoArrayFragment taofragment = new OperationOnTwoArrayFragment();
                        android.support.v4.app.FragmentTransaction taofragmentTransaction = getSupportFragmentManager().beginTransaction();
                        taofragmentTransaction.replace(R.id.frame,taofragment);
                        taofragmentTransaction.commit();
                        return true;



                    case R.id.calculator:
                        Toast.makeText(getApplicationContext(),"Calculator Selected",Toast.LENGTH_SHORT).show();
                         CAlculatorFragment  cafragment = new CAlculatorFragment();
                        android.support.v4.app.FragmentTransaction cafragmentTransaction = getSupportFragmentManager().beginTransaction();
                        cafragmentTransaction.replace(R.id.frame,cafragment);
                        cafragmentTransaction.commit();
                        return true;




                    default:
                        Toast.makeText(getApplicationContext(),"Somethings Wrong",Toast.LENGTH_SHORT).show();
                        return true;

                }
            }
        });

        // Initializing Drawer Layout and ActionBarToggle
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle actionBarDrawerToggle
                = new ActionBarDrawerToggle(this,drawerLayout,toolbar,
                R.string.openDrawer, R.string.closeDrawer){

            @Override
            public void onDrawerClosed(View drawerView) {
                // Code here will be triggered once the drawer closes as we dont want anything to happen so we leave this blank
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                // Code here will be triggered once the drawer open as we dont want anything to happen so we leave this blank
                super.onDrawerOpened(drawerView);
            }
        };

        //Setting the actionbarToggle to drawer layout
        drawerLayout.setDrawerListener(actionBarDrawerToggle);

        //calling sync state is necessay or else your hamburger icon wont show up
        actionBarDrawerToggle.syncState();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
