package com.itplace.maria.recipeslist.ui;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.itplace.maria.recipeslist.R;
import com.itplace.maria.recipeslist.presenter.RecipesPresenter;
import com.itplace.maria.recipeslist.view.RecipesView;

/**
 * Карточка элемента RecyclerView.
 * Подробное описание рецепта.
 * TODO Отобразить подробное описание рецепта.
 * TODO на вход  CardActivity через intent должна получать идентификатор блюда и из репозитория получать информацию о блюде
 */
public class CardActivity extends AppCompatActivity {

    public static final String ARG_RECIPE_ID = "recipe_id";

    private RecipesPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        TextView text = findViewById(R.id.text);
        text.setText(getIntent().getStringExtra(ARG_RECIPE_ID));

        presenter = new RecipesPresenter();
        //presenter.attachView((RecipesView) this.getBaseContext());
        //presenter.loadCard(getIntent().getStringExtra(ARG_RECIPE_ID));
    }

    public static Intent createStartIntent(Context context, String recipeId) {
        Intent intent = new Intent(context, CardActivity.class);
        Bundle arguments = new Bundle();
        arguments.putString(ARG_RECIPE_ID, recipeId);
        intent.putExtras(arguments);
        return intent;
    }

    @Override
    public void onDestroy() {
        presenter.detachView();
        super.onDestroy();
    }
}
