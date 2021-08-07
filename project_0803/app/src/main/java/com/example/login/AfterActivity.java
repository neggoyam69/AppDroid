package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class AfterActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogout, btnRevoke;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after);

        btnLogout = (Button)findViewById(R.id.btn_logout);
        btnRevoke = (Button)findViewById(R.id.btn_revoke);

        mAuth = FirebaseAuth.getInstance();

        btnLogout.setOnClickListener(this);
        btnRevoke.setOnClickListener(this);

    }

    private void signOut() {
        FirebaseAuth.getInstance().signOut();
    }

    private void revokeAccess() {
        mAuth.getCurrentUser().delete();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_logout:
                signOut();
                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);
                finish();
                break;

            case R.id.btn_revoke:
                revokeAccess();
                Intent intent1 = new Intent(getApplication(), CloseActivity.class);
                startActivity(intent1);
                finish();
                break;
        }
    }

}