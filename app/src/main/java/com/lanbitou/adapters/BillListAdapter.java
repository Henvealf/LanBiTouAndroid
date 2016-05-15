package com.lanbitou.adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.lanbitou.R;

import java.util.zip.Inflater;

/**
 * Created by Henvealf on 16-5-14.
 */
public class BillListAdapter extends BaseAdapter{


    private final Context context;

    public BillListAdapter(Context context){
        this.context =context;
    }
    private String[] types = new String[]{
            "吃\n啊\n啊","喝","玩","乐","赌","公","奖"
    };

    private double[] moneys = new double[]{
            45.4, 100.3, -345678, 0.234, -2346.34, -1234, 23.56
    };

    private String[]  remarks = new String[]{
            "吃的那是一个爆啊",
            "哎呦我去乐码天啊,哈哈哈",
            "今天天不错,只是下了场暴雨",
            "我的天,你有说什么话",
            "朦朦胧胧的看不见谁",
            "当风已不在",
            "花却开的正酣",
    };

    @Override
    public int getCount() {
        return types.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View listItemView = inflater.inflate(R.layout.bill_list_item,null);
        TextView typeTv = (TextView) listItemView.findViewById(R.id.bill_list_item_type);
        TextView moneyTv;
        TextView remarkTv;

        for(int j = 0; j < types.length; j++){
            if(moneys[i] > 0){      //>0 为收 左边
                moneyTv = (TextView) listItemView.findViewById(R.id.bill_list_item_left_money);
                remarkTv = (TextView) listItemView.findViewById(R.id.bill_list_item_left_remark);
                typeTv.setBackgroundColor(Color.RED);
            }else {
                moneyTv = (TextView) listItemView.findViewById(R.id.bill_list_item_right_money);
                remarkTv = (TextView) listItemView.findViewById(R.id.bill_list_item_right_remark);
                typeTv.setBackgroundColor(Color.BLUE);
            }
            typeTv.setText(types[i]);
            moneyTv.setText(String.valueOf(moneys[i]));
            remarkTv.setText(remarks[i]);

        }

        return listItemView;
    }
}
