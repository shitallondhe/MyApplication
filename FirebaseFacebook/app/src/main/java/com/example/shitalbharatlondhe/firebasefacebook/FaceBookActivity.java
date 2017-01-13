package com.example.shitalbharatlondhe.firebasefacebook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FacebookAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class FaceBookActivity extends AppCompatActivity  implements View.OnClickListener{


    private static final String TAG = "FacebookLogin";

    private FirebaseAuth mAuth;

    private FirebaseAuth.AuthStateListener mAuthListener;

    private CallbackManager mCallbackManager;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_book);


//        findViewById(R.id.btnLogout).setOnClickListener(this);


        mAuth = FirebaseAuth.getInstance();


        mAuthListener = new FirebaseAuth.AuthStateListener() {

            @Override

            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {

                FirebaseUser user = firebaseAuth.getCurrentUser();

                if (user != null) {

                    // User is signed in

                    Log.d(TAG, "onAuthStateChanged:signed_in:" + user.getUid());

                } else {

                    // User is signed out

                    Log.d(TAG, "onAuthStateChanged:signed_out");

                }

                // [START_EXCLUDE]

                // updateUI(user);

                // [END_EXCLUDE]

            }

        };

         mCallbackManager = CallbackManager.Factory.create();

        LoginButton loginButton = (LoginButton) findViewById(R.id.login_button);

        loginButton.setReadPermissions("email", "public_profile");

        loginButton.registerCallback(mCallbackManager, new FacebookCallback<LoginResult>() {

            @Override

            public void onSuccess(LoginResult loginResult) {

                Log.d(TAG, "facebook:onSuccess:" + loginResult);

                handleFacebookAccessToken(loginResult.getAccessToken());

            }



            @Override

            public void onCancel() {

                Log.d(TAG, "facebook:onCancel");

                // [START_EXCLUDE]

                // updateUI(null);

                // [END_EXCLUDE]

            }



            @Override

            public void onError(FacebookException error) {

                Log.d(TAG, "facebook:onError", error);

                // [START_EXCLUDE]

                //updateUI(null);

                // [END_EXCLUDE]

            }

        });



    }

    @Override
    protected void onActivityResult ( int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        // Pass the activity result back to the Facebook SDK
        mCallbackManager.onActivityResult(requestCode, resultCode, data);
    }




    @Override

    public void onStart() {

        super.onStart();

        mAuth.addAuthStateListener(mAuthListener);

    }


    // [START on_stop_remove_listener]

    @Override

    public void onStop() {

        super.onStop();

        if (mAuthListener != null) {

            mAuth.removeAuthStateListener(mAuthListener);

        }

    }



    // [START auth_with_facebook]

    private void handleFacebookAccessToken(AccessToken token) {

        Log.d(TAG, "handleFacebookAccessToken:" + token);

        // [START_EXCLUDE silent]

        //showProgressDialog();

        // [END_EXCLUDE]



        AuthCredential credential = FacebookAuthProvider.getCredential(token.getToken());

        mAuth.signInWithCredential(credential)

                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {

                    @Override

                    public void onComplete(@NonNull Task<AuthResult> task) {

                        Log.d(TAG, "signInWithCredential:onComplete:" + task.isSuccessful());



                        // If sign in fails, display a message to the user. If sign in succeeds

                        // the auth state listener will be notified and logic to handle the

                        // signed in user can be handled in the listener.

                        if (!task.isSuccessful()) {

                            Log.w(TAG, "signInWithCredential", task.getException());

                            Toast.makeText(FaceBookActivity.this, "Authentication failed.",

                                    Toast.LENGTH_SHORT).show();

                        }



                    }

                });

    }

    // [END auth_with_facebook]



    public void signOut() {

        mAuth.signOut();

        LoginManager.getInstance().logOut();



        //updateUI(null);

    }



    /*private void updateUI(FirebaseUser user) {

        hideProgressDialog();

        if (user != null) {

            mStatusTextView.setText(getString(R.string.facebook_status_fmt, user.getDisplayName()));

            mDetailTextView.setText(getString(R.string.firebase_status_fmt, user.getUid()));



            findViewById(R.id.button_facebook_login).setVisibility(View.GONE);

            findViewById(R.id.button_facebook_signout).setVisibility(View.VISIBLE);

        } else {

            mStatusTextView.setText(R.string.signed_out);

            mDetailTextView.setText(null);



            findViewById(R.id.button_facebook_login).setVisibility(View.VISIBLE);

            findViewById(R.id.button_facebook_signout).setVisibility(View.GONE);

        }

    }

*/



    @Override
    public void onClick(View view) {


    }
}
