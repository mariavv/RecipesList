package com.itplace.maria.recipeslist.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.itplace.maria.recipeslist.R;

/**
 * Карточка элемента RecyclerView.
 * Подробное описание рецепта.
 * TODO Отобразить подробное описание рецепта.
 * TODO на вход  CardActivity через intent должна получать идентификатор блюда и из репозитория получать информацию о блюде
 */
public class CardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
    }

    public static Intent createStartIntent(Context context) {
        return new Intent(context, CardActivity.class);
    }
}
