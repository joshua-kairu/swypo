package com.jlt.swypo;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

// begin fragment LaunchpadSectionFragment
// fragment that launches other parts of the demo app
public class LaunchpadSectionFragment extends Fragment {

    /** CONSTANTS */

    /** VARIABLES */

    /**
     * CONSTRUCTOR
     */

    // empty constructor for fragment subclasses
    public LaunchpadSectionFragment() {
    }

    /** METHODS */

    /** Getters and Setters */

    /**
     * Overrides
     */

    @Override
    // begin onCreateView
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState ) {

        // 0. use the launchpad section layout
        // 1. set up the demonstration of a collection-browsing activity
        // 2. set up the demonstration of navigating to external activities
        // 2a. create an intent that asks the user to pick a photo
        // 2b. relaunching should not return to the external activity
        // 3. return the launchpad section layout

        // 0. use the launchpad section layout

        View rootView = inflater.inflate( R.layout.fragment_section_launchpad, container, false );

        // 1. set up the demonstration of a collection-browsing activity

        rootView.findViewById( R.id.fsl_b_demo_collection )
                // begin .setOnClickListener
                .setOnClickListener(

                        // begin new View.OnClickListener
                        new View.OnClickListener() {

                            @Override
                            // begin onClick
                            public void onClick( View view ) {

                                // 0. start the collection demo activity

                                // 0. start the collection demo activity

                                Intent intent = new Intent( getActivity(), DisplayBooksActivity.class );

                                startActivity( intent );

                            } // end onClick

                        } // end new View.OnClickListener

                ); // end .setOnClickListener

        // 2. set up the demonstration of navigating to external activities

        rootView.findViewById( R.id.fsl_b_external_activity )

                // begin .setOnClickListener
                .setOnClickListener(

                        // begin new View.OnClickListener
                        new View.OnClickListener() {

                            @Override
                            // begin onClick
                            public void onClick( View view ) {

                                // 2a. create an intent that asks the user to pick a photo

                                Intent externalActivityIntent = new Intent( Intent.ACTION_PICK );

                                externalActivityIntent.setType( "image/*" );

                                // 2b. relaunching should not return to the external activity

                                // for devices running Android < 21, use FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET
                                // otherwise use FLAG_ACTIVITY_NEW_DOCUMENT
                                if( Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP ) { externalActivityIntent.addFlags( Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET ); }

                                else { externalActivityIntent.addFlags( Intent.FLAG_ACTIVITY_NEW_DOCUMENT ); }

                                startActivity( externalActivityIntent );

                            } // end onClick

                        } // end new View.OnClickListener

                ); // end .setOnClickListener

        // 3. return the launchpad section layout

        return rootView;

    } // end onCreateView

    /** Other Methods */

} // end fragment LaunchpadSectionFragment