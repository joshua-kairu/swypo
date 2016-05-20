package com.jlt.swypo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

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

// begin class AppSectionsPagerAdapter
public class AppSectionsPagerAdapter extends FragmentPagerAdapter {

    /** CONSTANTS */

    /** VARIABLES */

    /** CONSTRUCTOR */

    // constructor
    // does super things
    public AppSectionsPagerAdapter( FragmentManager fragmentManager ) { super( fragmentManager ); }

    /** METHODS */

    /** Getters and Setters */

    /** Overrides */

    @Override
    // begin getItem
    public Fragment getItem( int position ) {

        // 0. if the first item is shown
        // 0a. return the launchpad section fragment
        // 1. for all other items
        // 1a. use the dummy placeholders

        // begin switch to know what to do
        switch ( position ) {

            // 0. if the first item is shown

            case 0:

                // 0a. return the launchpad section fragment

                return new LaunchpadSectionFragment();

            // 1. for all other items

            default:

                // 1a. use the dummy placeholders

                Fragment fragment = new DummySectionFragment();

                Bundle args = new Bundle();

                args.putInt( DummySectionFragment.ARGUMENT_SECTION_NUMBER, position + 1 );

                fragment.setArguments( args );

                return fragment;

        } // end switch to know what to do

    } // end getItem

    @Override
    // getCount
    public int getCount() { return 3; }

    @Override
    // getPageTitle
    public CharSequence getPageTitle( int position ) { return "Section " + ( position + 1 ); }

    /** Other Methods */

} // end class AppSectionsPagerAdapter