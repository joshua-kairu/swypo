package com.jlt.swypo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

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

// begin class DemoCollectionFragmentStatePagerAdapter
// PagerAdapter that will provide fragments representing each object in a collection
// a FragmentStatePagerAdapter destroys and recreates fragments as needed,
// saving a restoring their state in the process
// This helps to save memory and is preferred when
// navigating between objects in a potentially large collection
// this class returns a fragment representing an object in a collection
public class DemoCollectionFragmentStatePagerAdapter extends FragmentStatePagerAdapter {

    /** CONSTANTS */

    /** VARIABLES */

    /** Arrays */

    private String[] booksString; // array to hold the strings of the books

    /** CONSTRUCTOR */

    // begin constructor
    public DemoCollectionFragmentStatePagerAdapter( FragmentManager fragmentManager, String[] booksString ) {

        // 0. handle super things
        // 1. initialize the array that will be used

        // 0. handle super things

        super( fragmentManager );

        // 1. initialize the array that will be used

        this.booksString = booksString;

    } // end constructor

    /** METHODS */

    /** Getters and Setters */

    /** Overrides */

    @Override
    // begin getItem
    // returns the Fragment associated with a specified position.
    public Fragment getItem( int position ) {

        // 0. initialize the fragment with the book at the current position

        // 0. initialize the fragment with the book at the current position

        Fragment fragment = new BookFragment();

        Bundle args = new Bundle();

        args.putString( BookFragment.ARGUMENT_BOOK, booksString[ position ] );

        fragment.setArguments( args );

        return fragment;

    } // end getItem

    @Override
    // getCount
    // Returns the number of views available.
    public int getCount() { return booksString.length; }

    @Override
    // getPageTitle
    // gets the title of the current page
    public CharSequence getPageTitle( int position ) { return booksString[ position ]; }

    /** Other Methods */

} // end class DemoCollectionFragmentStatePagerAdapter