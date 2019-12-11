package com.example.group4_f2019_mad3125_fp.ui.addEmployee;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.group4_f2019_mad3125_fp.R;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.group4_f2019_mad3125_fp.R;

public class AddEmployeeFragment extends Fragment {

    RadioGroup rg_part_time, vehicle_layout;
    LinearLayout part_time_layout, intern_layout, full_time_layout, vehicle_details_layout;
    RadioButton rb_commission_based, rb_fixed_based, rb_part_time, rb_intern, rb_full_time;
    CheckBox has_vehicle_check;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_add_employee, container, false);
        has_vehicle_check = root.findViewById(R.id.has_vehicle_check);
        rb_commission_based = root.findViewById(R.id.rb_commission_based);
        rb_fixed_based = root.findViewById(R.id.rb_fixed_based);
        rb_part_time = root.findViewById(R.id.rb_part_time);
        rb_intern = root.findViewById(R.id.rb_intern);
        rb_full_time = root.findViewById(R.id.rb_full_time);
        part_time_layout = root.findViewById(R.id.part_time_layout);
        intern_layout = root.findViewById(R.id.intern_layout);
        full_time_layout = root.findViewById(R.id.full_time_layout);
        rg_part_time = root.findViewById(R.id.rg_part_time);
        vehicle_layout = root.findViewById(R.id.vehicle_layout);
        vehicle_details_layout = root.findViewById(R.id.vehicle_details_layout);

        has_vehicle_check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    vehicle_layout.setVisibility(View.VISIBLE);
                    vehicle_details_layout.setVisibility(View.VISIBLE);
                }
                else {
                    vehicle_layout.setVisibility(View.GONE);
                    vehicle_details_layout.setVisibility(View.GONE);
                }
            }
        });

        rb_full_time.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    full_time_layout.setVisibility(View.VISIBLE);
                else
                    full_time_layout.setVisibility(View.GONE);
            }
        });
        rb_intern.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    intern_layout.setVisibility(View.VISIBLE);
                else
                    intern_layout.setVisibility(View.GONE);
            }
        });
        rb_part_time.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    part_time_layout.setVisibility(View.VISIBLE);
                    rg_part_time.setVisibility(View.VISIBLE);
                    part_time_layout.setVisibility(View.VISIBLE);
                }
                else {
                    part_time_layout.setVisibility(View.GONE);
                    part_time_layout.setVisibility(View.GONE);
                    rg_part_time.setVisibility(View.GONE);
                }
            }
        });

        return root;
    }
}
