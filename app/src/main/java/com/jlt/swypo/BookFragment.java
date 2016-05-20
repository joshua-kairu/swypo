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

// begin fragment BookFragment
// dummy fragment representing a section of the app
// shows the name of a book in the Bible
public class BookFragment extends Fragment {

    /** CONSTANTS */

    public static final String ARGUMENT_BOOK = "ARGUMENT_BOOK"; // identifier of the argument

    /** VARIABLES */

    /**
     * CONSTRUCTOR
     */

    // empty constructor for fragment subclasses
    public BookFragment() {
    }

    /** METHODS */

    /** Getters and Setters */

    /**
     * Overrides
     */

    @Override
    // begin onCreateView
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState ) {

        // 0. inflate the book display layout
        // 1. use the book in the arguments to initialize the text view
        // 2. return the inflated view

        // 0. inflate the book display layout

        View rootView = inflater.inflate( R.layout.fragment_collection_book, container, false );

        // 1. use the book in the arguments to initialize the text view

        Bundle arguments = getArguments();

        ( ( TextView ) rootView.findViewById( R.id.fcb_tv_text1 ) ).setText( arguments.getString( ARGUMENT_BOOK ) );

        // 2. return the inflated view

        return rootView;

    } // end onCreateView

    /** Other Methods */

} // end fragment BookFragment