package com.jlt.swypo;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

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

// begin activity DisplayBooksActivity
public class DisplayBooksActivity extends AppCompatActivity {

    /** CONSTANTS */

    /** VARIABLES */

    /** Demo Collection Fragment State Pager Adapters */

    private DemoCollectionFragmentStatePagerAdapter demoCollectionFragmentStatePagerAdapter; // a collection fragment state pager adapter

    /** View Pagers */

    private ViewPager viewPager; // view pager to display the collection

    /** METHODS */

    /** Getters and Setters */

    /** Overrides */

    @Override
    // begin onCreate
    public void onCreate( Bundle savedInstanceState ) {

        super.onCreate( savedInstanceState );

        // ** USE THE MAIN ACTIVITY'S LAYOUT TO MANIPULATE THE VIEW PAGER **

        setContentView( R.layout.activity_main );

        // 0. create an adapter that when requested, will return a fragment representing an object in the collection
        // 1. set up the app bar
        // 1a. set the app bar title
        // 2. specify the Home button to show the Up caret
        // 3. set up the view pager
        // 4. attach the adapter created above

        // 0. create an adapter that when requested, will return a fragment representing an object in the collection

        demoCollectionFragmentStatePagerAdapter = new DemoCollectionFragmentStatePagerAdapter( getSupportFragmentManager(), getResources().getStringArray( R.array.books_array ) );

        // 1. set up the app bar

        final ActionBar actionBar = getSupportActionBar();

        // 1a. set the app bar title

        actionBar.setTitle( getResources().getString( R.string.books_collection ) );

        // 2. specify the Home button to show the Up caret

        actionBar.setDisplayHomeAsUpEnabled( true );

        // 3. set up the view pager

        viewPager = ( ViewPager ) findViewById( R.id.am_vp_pager );

        // 4. attach the adapter created above

        viewPager.setAdapter( demoCollectionFragmentStatePagerAdapter );

    } // end onCreate

    @Override
    // begin onOptionsItemSelected
    public boolean onOptionsItemSelected( MenuItem item ) {

        // 0. if the home item is selected
        // 0a. create a simple intent that starts the hierarchical parent activity
        // 0b. if the activity is not part of the application's task
        // 0b1. create a new task using a synthesized back stack
        // 0b2. add any ancestor activities
        // 0b3. finish this activity
        // 0c. else this activity is part of the application's task
        // 0c1. simply navigate up to the hierarchical parent activity
        // 1. super things

        // begin switch to know what to do
        switch ( item.getItemId() ) {

            // 0. if the home item is selected

            case android.R.id.home:

                // 0a. create a simple intent that starts the hierarchical parent activity

                Intent upIntent = new Intent( this, MainActivity.class );

                // 0b. if the activity is not part of the application's task

                // begin if for if we should recreate the up task
                if( NavUtils.shouldUpRecreateTask( this, upIntent ) == true ) {

                    // 0b1. create a new task using a synthesized back stack

                    TaskStackBuilder

                            .create( this )

                            // 0b2. add any ancestor activities

                            // Add a new Intent to the task stack.
                            // The most recently added Intent will invoke the Activity at the
                            // top of the final task stack.
                            .addNextIntent( upIntent )

                            // Start the task stack constructed by this builder

                            .startActivities();

                    // 0b3. finish this activity

                    finish();

                } // end if for if we should recreate the up task

                // 0c. else this activity is part of the application's task
                // 0c1. simply navigate up to the hierarchical parent activity

                // Navigate from sourceActivity to the activity specified by upIntent,
                // finishing sourceActivity in the process
                else { NavUtils.navigateUpTo( this, upIntent ); }

                return true;

        } // end switch to know what to do

        // 1. super things

        return super.onOptionsItemSelected( item );

    } // end onOptionsItemSelected

    /**
     * Other Methods
     */

    // begin method initializeUI
    private int initializeUI() {

        return -1;

     } // end method initializeUI

} // end activity DisplayBooksActivity