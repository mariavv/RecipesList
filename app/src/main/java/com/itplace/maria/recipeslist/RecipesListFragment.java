package com.itplace.maria.recipeslist;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.itplace.maria.recipeslist.RecipeType.*;

/**
 * Для отображения списка элементов - рецептов
 */
public class RecipesListFragment extends Fragment /*implements RecipesFragmentPagerAdapter.RecipesFragmentPagerAdapterCallBack*/
                                                     implements RecipesAdapter.OnItemClickListener {

    private static final String ARG_TYPE_PAGE = "type_page";

    private RecyclerView recycler;

    //private RecipesFragmentPagerAdapter recipesFragmentPagerAdapter;
    private RecipesAdapter recipesAdapter;

    public static RecipesListFragment newInstance(RecipeType type) {
        RecipesListFragment fragment = new RecipesListFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_TYPE_PAGE, type);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recipes_list, container, false);
        recycler = v.findViewById(R.id.recycler);
        configureRecyclerView();

        //recipesFragmentPagerAdapter = new RecipesFragmentPagerAdapter();
        recipesAdapter.setOnItemClickListener(this);

        return v;
    }

    private void configureRecyclerView() {
        RecipesAdapter adapter = new RecipesAdapter();
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));

        Bundle args = getArguments();
        if (args != null) {
            RecipeType type = (RecipeType) args.getSerializable(ARG_TYPE_PAGE);
            if (type != null) {
                /*
                 * TODO Набросать рецептов.
                 */
                switch (type) {
                    case BREAKFAST:
                        adapter.addItem(new Recipe("1", BREAKFAST, "Кофе", "кофе, печенька", R.drawable.pic));
                        adapter.addItem(new Recipe("2", BREAKFAST, "Омлет", "яйца, молоко, соль", R.drawable.omlet));
                        adapter.addItem(new Recipe("3", BREAKFAST, "Салат с крабовыми палочками",
                                "крабовые палочки, капуста белокочанная, огурцы, кукуруза, сыр, майонез, соль",
                                R.drawable.salat_krab));
                        break;

                    case DINNER:
                        adapter.addItem(new Recipe("4", DINNER, "Вкусный ужин", "продукты", R.drawable.pic));
                        break;
                }
            }
        }
    }

    @Override
    public void onItemClick(int RecipeId) {
        Intent intent = CardActivity.createStartIntent(getContext());
        startActivity(intent);
    }

    /*@Override
    public void onItemClick(int position) {
        // TODO
        // Тут не стартует!
        Intent intent = CardActivity.createStartIntent(getContext());
        startActivity(intent);
    }*/
}
