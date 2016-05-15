package com.lanbitou.fragments;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.lanbitou.R;
import com.lanbitou.activities.AddBillActivity;
import com.lanbitou.activities.MainActivity;
import com.lanbitou.adapters.BillListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * 点击右下角的按钮弹出文件夹分类
 * 点击添加弹出添加的Activity.里面有三个选项,即 类型(限制在4个字符内),类型,钱数,备注,时间.
 * Created by Henvealf on 16-5-13.
 */
public class BillFragment extends Fragment{

    private Button addBillBtn;
    public BillFragment(){

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_bill, container,false);
        addBillBtn = (Button) view.findViewById(R.id.add_bill_btn);

        addBillBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),AddBillActivity.class);
                startActivity(i);
            }
        });

        ListAdapter adapter = new BillListAdapter(this.getActivity());

        ListView list = (ListView) view.findViewById(R.id.bill_list);
        list.setAdapter(adapter);
        return view;
    }
}
