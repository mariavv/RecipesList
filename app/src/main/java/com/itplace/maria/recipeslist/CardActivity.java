package com.itplace.maria.recipeslist;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
        Intent intent = new Intent(context, CardActivity.class);
        return intent;
    }
}
