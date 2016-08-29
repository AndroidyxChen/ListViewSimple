package com.example.chen.apptesttwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        ListView listView1 = (ListView) findViewById(R.id.list1);
        String[] arr1 = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期天"};
        ArrayAdapter adapter1 = new ArrayAdapter(this, R.layout.test_item, arr1);
        listView1.setAdapter(adapter1);
        ListView listView2 = (ListView) findViewById(R.id.list2);
        String[] arr2 = {"中国", "俄罗斯", "美国", "韩国", "新加坡", "英国", "德国"};
        ArrayAdapter adapter2 = new ArrayAdapter(this, R.layout.test_item, arr2);
        listView2.setAdapter(adapter2);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(MainActivity.this, ListActivityTest.class));
            }
        });
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(MainActivity.this, BaseAdapterTest.class));
            }
        });
    }
}
