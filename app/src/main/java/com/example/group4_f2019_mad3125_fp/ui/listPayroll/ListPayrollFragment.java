package com.example.group4_f2019_mad3125_fp.ui.listPayroll;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.group4_f2019_mad3125_fp.OnPayrollClicked;
import com.example.group4_f2019_mad3125_fp.PayrollAdapter;
import com.example.group4_f2019_mad3125_fp.PayrollData;
import com.example.group4_f2019_mad3125_fp.PayrollDetails;
import com.example.group4_f2019_mad3125_fp.R;

import java.util.ArrayList;
import java.util.List;

public class ListPayrollFragment extends Fragment {

    RecyclerView payroll_list;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_list_payroll, container, false);
        payroll_list = root.findViewById(R.id.payroll_list);

        setAdapter();
        return root;
    }

    private void setAdapter() {
        getData();

        PayrollAdapter adapter = new PayrollAdapter(getActivity(), payrollDataList, new OnPayrollClicked() {
            @Override
            public void onPayrollClicked(int position) {
                Intent intent = new Intent(getActivity(), PayrollDetails.class);
                startActivity(intent);
            }
        });

        LinearLayoutManager manager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
        payroll_list.setLayoutManager(manager);
        payroll_list.setAdapter(adapter);
    }

    private List<PayrollData> payrollDataList;
    private void getData() {
        payrollDataList = new ArrayList<>();
        PayrollData data;
        for (int i=0; i<10; i++){
            data = new PayrollData("name"+i, "plate"+i, "job"+i);
            payrollDataList.add(data);
        }

    }
}
