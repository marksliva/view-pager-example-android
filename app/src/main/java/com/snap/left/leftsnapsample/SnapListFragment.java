package com.snap.left.leftsnapsample;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SnapListFragment extends ListFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 50; i++ ) {
            strings.add(String.valueOf(i));
        }
        View view = inflater.inflate(R.layout.snap_list_fragment, container, false);
        ListView listView = (ListView) view.findViewById(R.id.snap_list_list);
        listView.setAdapter(new ArrayAdapter<>(getContext(), R.layout.list_item, strings));
        return view;
    }
}
