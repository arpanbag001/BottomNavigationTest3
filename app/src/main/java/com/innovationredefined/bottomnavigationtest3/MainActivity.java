package com.innovationredefined.bottomnavigationtest3;

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
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        customizeBottomNavigationView(bottomNavigationView);
    }

    void customizeBottomNavigationView(BottomNavigationView bottomNavigationView){
        LayoutInflater layoutInflater = LayoutInflater.from(this);

        String bottomNavigationMenuItemLabel;
        Drawable bottomNavigationMenuItemImage;

        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) bottomNavigationView.getChildAt(0);

        for (int i = 0; i < bottomNavigationMenuView.getChildCount(); i++) {
            BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) bottomNavigationMenuView.getChildAt(i);
            bottomNavigationMenuItemLabel = ((TextView) ((BaselineLayout) bottomNavigationItemView.getChildAt(1)).getChildAt(0)) .getText().toString();
            bottomNavigationMenuItemImage = ((ImageView)bottomNavigationItemView.getChildAt(0)).getDrawable();
            bottomNavigationItemView.removeAllViews();
            ConstraintLayout customMenuItemView = (ConstraintLayout) layoutInflater.inflate(R.layout.bottom_nav_menu_item_customized, null, false);
            ((ImageView)((ConstraintLayout)customMenuItemView.getChildAt(0)).getChildAt(0)).setImageDrawable(bottomNavigationMenuItemImage);
            ((TextView)((ConstraintLayout)customMenuItemView.getChildAt(0)).getChildAt(1)).setText(bottomNavigationMenuItemLabel);
            bottomNavigationItemView.addView(customMenuItemView);
        }
    }

}
