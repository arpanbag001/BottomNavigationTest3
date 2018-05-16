package com.innovationredefined.bottomnavigationtest3;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.internal.BaselineLayout;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenu;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        customizeBottomNavigationViewAccordingToOrientation(bottomNavigationView,this.getResources().getConfiguration().orientation);
        setupBottomNavigationViewWithViewpager(bottomNavigationView);

    }

    void setupBottomNavigationViewWithViewpager(BottomNavigationView bottomNavigationView){
        SampleFragmentAdapter fragmentAdapter = new SampleFragmentAdapter(getSupportFragmentManager());
        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(fragmentAdapter);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_item_one:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.menu_item_two:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.menu_item_three:
                        viewPager.setCurrentItem(2);
                        break;
                    case R.id.menu_item_four:
                        viewPager.setCurrentItem(3);
                        break;
                }
                return false;
            }
        });
    }

    void customizeBottomNavigationViewAccordingToOrientation(BottomNavigationView bottomNavigationView, int orientation){
        if(orientation== Configuration.ORIENTATION_PORTRAIT)
            customizeBottomNavigationView(bottomNavigationView,false,true);
        else if(orientation==Configuration.ORIENTATION_LANDSCAPE)
            customizeBottomNavigationView(bottomNavigationView,true,true);
    }

    @SuppressLint("RestrictedAPI")
    void customizeBottomNavigationView(BottomNavigationView bottomNavigationView, boolean shouldShowLabels, boolean shouldDisableShiftMOde) {
        LayoutInflater layoutInflater = LayoutInflater.from(this);

        String bottomNavigationMenuItemLabel;
        Drawable bottomNavigationMenuItemImage;

        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) bottomNavigationView.getChildAt(0);

        //Disable shift mode
        if (shouldDisableShiftMOde) {
            try {
                Field shiftingMode = bottomNavigationMenuView.getClass().getDeclaredField("mShiftingMode");
                shiftingMode.setAccessible(true);
                shiftingMode.setBoolean(bottomNavigationMenuView, false);
                shiftingMode.setAccessible(false);
                for (int i = 0; i < bottomNavigationMenuView.getChildCount(); i++) {
                    BottomNavigationItemView item = (BottomNavigationItemView) bottomNavigationMenuView.getChildAt(i);
                    item.setShiftingMode(false);
                    item.setChecked(item.getItemData().isChecked());
                }
            } catch (NoSuchFieldException e) {
                Log.e("BNVHelper", "Unable to get shift mode field", e);
            } catch (IllegalAccessException e) {
                Log.e("BNVHelper", "Unable to change value of shift mode", e);
            }
        }
        //Customize menu items
        for (int i = 0; i < bottomNavigationMenuView.getChildCount(); i++) {
            //Get the menu item
            BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) bottomNavigationMenuView.getChildAt(i);

            //Extract images and labels
            bottomNavigationMenuItemLabel = ((TextView) ((BaselineLayout) bottomNavigationItemView.getChildAt(1)).getChildAt(0)).getText().toString();
            bottomNavigationMenuItemImage = ((ImageView) bottomNavigationItemView.getChildAt(0)).getDrawable();

            //Remove the imageviews and textviews
            bottomNavigationItemView.removeAllViews();

            //Inflate the custom menu item
            ConstraintLayout customMenuItemView = (ConstraintLayout) layoutInflater.inflate(R.layout.bottom_nav_menu_item_customized, null, false);

            //Set the previously extracted data
            ((ImageView) ((ConstraintLayout) customMenuItemView.getChildAt(0)).getChildAt(0)).setImageDrawable(bottomNavigationMenuItemImage);
            ((TextView) ((ConstraintLayout) customMenuItemView.getChildAt(0)).getChildAt(1)).setText(bottomNavigationMenuItemLabel);

            //Hide the Labels if necessary
            if (!shouldShowLabels)
                ((ConstraintLayout) customMenuItemView.getChildAt(0)).getChildAt(1).setVisibility(View.GONE);

            //Add the custom MenuItemView
            bottomNavigationItemView.addView(customMenuItemView);

        }
    }

}
