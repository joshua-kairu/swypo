package com.jlt.swypo;

import android.os.PersistableBundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Swypo
 *
 * A simple implementation of Android's Tabs
 *
 * Copyright (C) 2016 Kairu Joshua Wambugu
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 */

// begin activity MainActivity
public class MainActivity extends AppCompatActivity implements ActionBar.TabListener {

    /** CONSTANTS */

    /** VARIABLES */

    /** App Sections Pager Adapters */

    private AppSectionsPagerAdapter appSectionsPagerAdapter; // pager adapter for displaying the three primary sections of the app

    /** View Pagers */

    private ViewPager viewPager; // the view pager that will display the three primary sections of the app, one at a time

    /** METHODS */

    /** Getters and Setters */

    /** Overrides */

    @Override
    // begin onCreate
    public void onCreate( Bundle savedInstanceState ) {

        super.onCreate( savedInstanceState );

        setContentView( R.layout.activity_main );

        // 0. create the adapter that will return a fragment for each of the three primary sections of the app
        // 1. set up the action bar
        // 2. specify that the home/up button not be enabled
        // 3. specify that we will display tabs in the action bar
        // 4. set up the view pager
        // 4a. attach the adapter
        // 4b. set a listener for when the user swipes
        // 4b1. when swiping, select the corresponding tab
        // 5. for each of the sections in the app, add a tab to the action bar
        // 5a. create a tab with text matching the corresponding page title
        // 5b. specify this activity as the listener
        // 6. when the tab is selected
        // 6a. switch to the corresponding page in the view pager

        // 0. create the adapter that will return a fragment for each of the three primary sections of the app

        appSectionsPagerAdapter = new AppSectionsPagerAdapter( getSupportFragmentManager() );

        // 1. set up the action bar

        final ActionBar actionBar = getSupportActionBar();

        // 2. specify that the home/up button not be enabled


        actionBar.setHomeButtonEnabled( false );

        // 3. specify that we will display tabs in the action bar

        actionBar.setNavigationMode( ActionBar.NAVIGATION_MODE_TABS );

        // 4. set up the view pager

        viewPager = ( ViewPager ) findViewById( R.id.am_vp_pager );

        // 4a. attach the adapter

        viewPager.setAdapter( appSectionsPagerAdapter );

        // 4b. set a listener for when the user swipes

        // begin viewPager.addOnPageChangeListener
        viewPager.addOnPageChangeListener(

                // begin new ViewPager.SimpleOnPageChangeListener
                new ViewPager.SimpleOnPageChangeListener() {

                    @Override
                    // begin onPageSelected
                    public void onPageSelected( int position ) {

                        // 4b1. when swiping, select the corresponding tab

                        actionBar.setSelectedNavigationItem( position );

                    } // end onPageSelected

                } // end new ViewPager.SimpleOnPageChangeListener

        ); // end viewPager.addOnPageChangeListener

        // 5. for each of the sections in the app, add a tab to the action bar

        // begin for to go through the adapted tabs
        for ( int i = 0; i < appSectionsPagerAdapter.getCount(); i++ ) {

            actionBar.addTab(

                    actionBar.newTab()

                            // 5a. create a tab with text matching the corresponding page title

                            .setText( appSectionsPagerAdapter.getPageTitle( i ) )

                            // 5b. specify this activity as the listener

                            .setTabListener( this )

            );

        } // end for to go through the adapted tabs

        // 6. when the tab is selected -> done in onTabSelected
        // 6a. switch to the corresponding page in the view pager -> done in onTabSelected

    } // end onCreate

    /**
     * Other Methods
     */

    // begin method initializeUI
    private int initializeUI() {

        return -1;

    } // end method initializeUI

    @Override
    // begin onTabSelected
    public void onTabSelected( ActionBar.Tab tab, FragmentTransaction ft ) {

        // 6. when the tab is selected
        // 6a. switch to the corresponding page in the view pager

        // 6. when the tab is selected

        // 6a. switch to the corresponding page in the view pager

        viewPager.setCurrentItem( tab.getPosition() );

    } // end onTabSelected

    @Override
    public void onTabUnselected( ActionBar.Tab tab, FragmentTransaction ft ) {

    }

    @Override
    public void onTabReselected( ActionBar.Tab tab, FragmentTransaction ft ) {

    }
} // end activity MainActivity