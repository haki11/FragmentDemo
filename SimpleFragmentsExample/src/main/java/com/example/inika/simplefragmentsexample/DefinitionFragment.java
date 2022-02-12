package com.example.inika.simplefragmentsexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class DefinitionFragment extends Fragment {
    TextView tvConcept,tvDefinition;

    @Override

    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        //
        View view = inflater.inflate(R.layout.definition_fragment, container, false);
        tvConcept= (TextView) view.findViewById(R.id.concepts);
        tvDefinition= (TextView)view.findViewById(R.id.definition);

        return view;

    }
    public void display(String value1, String value2){
        tvConcept.setText(value1);
        tvDefinition.setText(value2);

    }
}