package com.demo.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gv = (GridView) findViewById(R.id.gv);

        //어떤 클래스로 기능을 추가할때는 항상 컨텍스트를 보내줘야한다.

        MyGridAdapter adapter = new MyGridAdapter(this.getApplicationContext());
        gv.setAdapter(adapter);
    }
}
