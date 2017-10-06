package com.itplace.maria.recipeslist;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
    }

    public static Intent createStartIntent(Context context) {
        Intent intent = new Intent(context, CardActivity.class);
        return intent;
    }
}
