package com.lanbitou.activities;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.lanbitou.R;

/**
 * 添加
 * Created by Henvealf on 16-5-14.
 */
public class AddBillActivity extends Activity {

    ImageButton backImgBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_bill);

        backImgBtn = (ImageButton) findViewById(R.id.add_bill_back_btn);

        backImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddBillActivity.this.finish();
            }
        });

    }
}
