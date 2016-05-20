package com.jlt.swypo;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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

// begin fragment DummySectionFragment
// dummy fragment representing a section of the app
public class DummySectionFragment extends Fragment {

    /** CONSTANTS */

    public static final String ARGUMENT_SECTION_NUMBER = "ARGUMENT_SECTION_NUMBER"; // argument for the section number

    /** VARIABLES */

    /**
     * CONSTRUCTOR
     */

    // empty constructor for fragment subclasses
    public DummySectionFragment() {
    }

    /** METHODS */

    /** Getters and Setters */

    /**
     * Overrides
     */

    @Override
    // begin onCreateView
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState ) {

        // 0. use the dummy section layout
        // 1. display the section number in the text view
        // 2. return the dummy section layout

        // 0. use the dummy section layout

        View rootView = inflater.inflate( R.layout.fragment_section_dummy, container, false );

        // 1. display the section number in the text view

        Bundle args = getArguments();

        ( ( TextView ) rootView.findViewById( R.id.fsd_tv_text1 ) ).setText( getString( R.string.dummy_section_text, args.getInt( ARGUMENT_SECTION_NUMBER ) ) );

        // 2. return the dummy section layout

        return rootView;

    } // end onCreateView

    /** Other Methods */

} // end fragment DummySectionFragment