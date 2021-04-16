package com.nurayim.fragmentlesson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnReplaceFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButton();
    }

    private void initButton(){
        btnReplaceFragment = findViewById(R.id.btn_rep_fragment);
        btnReplaceFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_cont,FirstFragment.newInstance("Value1","Value2"));
                transaction.commit();


            }
        });



    }







}
// Fragment - либо в Frame Layout  fragment view
// map это ключ (значение) по этому ключи доасатнаь  arg