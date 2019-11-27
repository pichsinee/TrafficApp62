package sdu.cs.pichsinee.trafficapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    //Explicit
    Context context;
    int[] ints;
    String[] titleStrings, detailStrings;

    public MyAdapter(Context context, int[] ints, String[] titleStrings, String[] detailStrings) {
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() { //นับจำนวนข้อมูลทั้งหมดใน DB
        return ints.length;
    }

    @Override
    public Object getItem(int i) {  //ไม่ใช้
        return null;
    }

    @Override
    public long getItemId(int i) {  //ไม่ใช้
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {    //นำข้อมูลมาแสดงผลบนแอป
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false); //ดึงค่าจาก XML มาแสดงบนแอป

        ImageView imv_icon = view1.findViewById(R.id.imv_icon);
        TextView tv_title = view1.findViewById(R.id.tv_title);
        TextView tv_detail = view1.findViewById(R.id.tv_detail);

        //นำข้อมูลจาก DB ไปแสดงผลบนแอป
        imv_icon.setImageResource(ints[i]);
        tv_title.setText(titleStrings[i]);
        tv_detail.setText(detailStrings[i]);
        return view1;
    }
}//end class
