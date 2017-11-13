package com.example.yvtc.yvtc2017111301;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ArrayList<Map<String, String>> groupList = new ArrayList();
    ArrayList<ArrayList<Map<String, String>>> childList = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HashMap<String, String> m1 = new HashMap<>();
        m1.put("name", "主餐");
        groupList.add(m1);
        HashMap<String, String> m2 = new HashMap<>();
        m2.put("name", "飲料");
        groupList.add(m2);

        HashMap<String, String> m11 = new HashMap<>();
        m11.put("name", "漢堡");
        HashMap<String, String> m12 = new HashMap<>();
        m12.put("name", "炸機");
        HashMap<String, String> m13 = new HashMap<>();
        m13.put("name", "Pizza");

        ArrayList<Map<String, String>> cList1 = new ArrayList();
        cList1.add(m11);
        cList1.add(m12);
        cList1.add(m13);

        childList.add(cList1);

        HashMap<String, String> m21 = new HashMap<>();
        m21.put("name", "可樂");
        HashMap<String, String> m22 = new HashMap<>();
        m22.put("name", "紅茶");
        HashMap<String, String> m23 = new HashMap<>();
        m23.put("name", "果汁");

        ArrayList<Map<String, String>> cList2 = new ArrayList();
        cList2.add(m21);
        cList2.add(m22);
        cList2.add(m23);

        childList.add(cList2);

    }
}
