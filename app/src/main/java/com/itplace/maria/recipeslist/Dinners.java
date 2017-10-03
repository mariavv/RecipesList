package com.itplace.maria.recipeslist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Dinners extends Fragment {

    private static final String ARG_PAGE_DINNERS = "page_dinners";

    public static Dinners newInstance(int page) {
        Dinners fragment = new Dinners();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE_DINNERS, page);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.dinners_fragment, container, false);
    }
}

