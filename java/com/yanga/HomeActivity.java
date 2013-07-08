package com.yanga;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;

public class HomeActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        CustomFragmentPagerAdapter adapter = new CustomFragmentPagerAdapter(getSupportFragmentManager());
        PageItem profile = new PageItem();
        profile.title = "Profile";
        profile.fragmentKind = PageItem.PROFILE;
        adapter.addItem(profile);

        PageItem activities = new PageItem();
        activities.title = "Activities";
        activities.fragmentKind = PageItem.DACTIVITIES;
        adapter.addItem(activities);

        pager.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                break;
            case R.id.home_action_login_logout:
                    startActivity(new Intent(HomeActivity.this,LoginActivity.class));
                    finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
