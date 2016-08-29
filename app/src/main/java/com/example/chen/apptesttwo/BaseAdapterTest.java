package com.example.chen.apptesttwo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by chen on 2016-3-16.
 */
public class BaseAdapterTest extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_mylist);
        init();
    }
    public void init(){
        ListView myList= (ListView) findViewById(R.id.ll_mylist);
        BaseAdapter myAdapter=new BaseAdapter() {
            @Override
            public int getCount() {
                return 77;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                LinearLayout line=new LinearLayout(BaseAdapterTest.this);
                line.setOrientation(LinearLayout.VERTICAL);
                ImageView imageView=new ImageView(BaseAdapterTest.this);
                imageView.setImageResource(R.mipmap.ic_launcher);
                TextView textView=new TextView(BaseAdapterTest.this);
                textView.setText("第"+(position+1)+"个表项");
                textView.setTextSize(20);
                textView.setTextColor(Color.BLUE);
                line.addView(imageView);
                line.addView(textView);
                return line;
            }
        };
        myList.setAdapter(myAdapter);
    }
}
