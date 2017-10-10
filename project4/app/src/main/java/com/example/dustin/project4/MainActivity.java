package com.example.dustin.project4;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements RecyclerFrag.OnFragmentInteractionListener {
    RecyclerFrag frag;
    final static String TAG = "HEY LISTEN_ACTIVITY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frag = new RecyclerFrag();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.frag_container, frag).commit();
        Log.v(TAG, "Fragment Added");
    }

    @Override
    public void onFragmentInteraction() {

    }
}
