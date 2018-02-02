package com.eventu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

/**
 * Allows the user to select either club or student for registration
 */
public class AccountTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_type);
        // Set up the login form.

        Button clubButton = findViewById(R.id.club_button);
        clubButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchRegistrationActivity(true);
            }
        });
        Button studentButton = findViewById(R.id.student_button);
        studentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchRegistrationActivity(false);
            }
        });
    }

    /**
     * Sends all the appropriate fields to the RegisterActivity
     */
    void launchRegistrationActivity(boolean isClub) {
        ArrayList<String> domains = getIntent().getStringArrayListExtra("schoolDomains");
        String schoolName = getIntent().getStringExtra("schoolName");

        Intent intent = new Intent(AccountTypeActivity.this, RegisterActivity.class);
        intent.putExtra("isClub", isClub);
        intent.putExtra("schoolName", schoolName);
        intent.putExtra("schoolDomains", domains);
        startActivity(intent);
    }
}
