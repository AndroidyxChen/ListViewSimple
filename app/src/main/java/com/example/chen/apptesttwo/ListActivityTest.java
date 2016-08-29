package com.example.chen.apptesttwo;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

/**
 * Created by chen on 2016-3-16.
 */
public class ListActivityTest extends ListActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] arr1 = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期天"};
        ArrayAdapter adapter1 = new ArrayAdapter(this, R.layout.test_item, arr1);
        setListAdapter(adapter1);//设置该窗口显示列表
    }
}
