package com.example.mayakovstanislav.criminalintent;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by Mayakov Stanislav on 10.04.2017.
 */
public class CrimeFragment extends Fragment {
    private Crime mCrime;
    private EditText mTitledField;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {
      View v = inflater.inflate(R.layout.fragment_crime, parent,
              false);
      mTitledField = (EditText) v.findViewById(R.id.crime_title);
      mTitledField.addTextChangedListener( new TextWatcher() {
          @Override
          public void beforeTextChanged(CharSequence s, int start, int count, int after) {

          }

          @Override
          public void onTextChanged(CharSequence s, int start,
                                    int before, int count) {
              mCrime.setmTitle( s.toString() );

          }

          @Override
          public void afterTextChanged(Editable s) {

          }
      });
      return v;
    }
}
