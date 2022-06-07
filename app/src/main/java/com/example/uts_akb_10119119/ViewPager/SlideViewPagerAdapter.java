package com.example.uts_akb_10119119.ViewPager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.uts_akb_10119119.R;

//NIM     : 10119119
//NAMA    : MUHAMMAD HADYAN NUR ADABI
//KELAS   : IF-3

public class SlideViewPagerAdapter extends PagerAdapter {

    Context ctx;

    public SlideViewPagerAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_screen,container,false);

        ImageView logo =view.findViewById(R.id.logo);
        ImageView dot1 =view.findViewById(R.id.dot1);
        ImageView dot2 =view.findViewById(R.id.dot2);
        ImageView dot3 =view.findViewById(R.id.dot3);
        ImageView btn_next =view.findViewById(R.id.btn_next);
        ImageView btn_back =view.findViewById(R.id.btn_back);

        TextView judul =view.findViewById(R.id.judul);
        TextView desc  =view.findViewById(R.id.desc);
        switch (position)
        {
            case 0:
                logo.setImageResource(R.drawable.slide1);
                dot1.setImageResource(R.drawable.selected);
                dot2.setImageResource(R.drawable.unselect);
                dot3.setImageResource(R.drawable.unselect);

                desc.setText("Swipe kiri dan kanan untuk mengubah tampilan");
                btn_back.setVisibility(View.GONE);
                btn_next.setVisibility(View.VISIBLE);
                break;
            case 1:
                logo.setImageResource(R.drawable.user);
                dot1.setImageResource(R.drawable.unselect);
                dot2.setImageResource(R.drawable.selected);
                dot3.setImageResource(R.drawable.unselect);

                desc.setText("Swipe kiri dan kanan untuk mengubah tampilan");
                btn_back.setVisibility(View.VISIBLE);
                btn_next.setVisibility(View.VISIBLE);
                break;
            case 2:
                logo.setImageResource(R.drawable.notes);
                dot1.setImageResource(R.drawable.unselect);
                dot2.setImageResource(R.drawable.unselect);
                dot3.setImageResource(R.drawable.selected);

                desc.setText("Swipe kiri dan kanan untuk mengubah tampilan");
                btn_back.setVisibility(View.VISIBLE);
                btn_next.setVisibility(View.GONE);
                break;
        }

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
