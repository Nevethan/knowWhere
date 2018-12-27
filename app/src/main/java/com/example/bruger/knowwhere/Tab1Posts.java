package com.example.bruger.knowwhere;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bruger on 29-11-2018.
 * source : http://camposha.info/source/android-viewpager-sliding-tabs-listviews-source
 */

public class Tab1Posts extends Fragment {

    List<Post> posts = new ArrayList<>();

    DataManager dataManager = DataManager.getInstance();

    private ListView listView;
    private PostCustomList mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1_fragment,container,false);

        listView = (ListView) view.findViewById(R.id.listView);

        posts = dataManager.returnPostList();

        mAdapter = new PostCustomList(this.getActivity(),posts);
        listView.setAdapter(mAdapter);

        return view;
    }

}
