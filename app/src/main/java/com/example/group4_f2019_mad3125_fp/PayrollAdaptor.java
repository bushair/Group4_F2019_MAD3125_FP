package com.example.group4_f2019_mad3125_fp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class PayrollAdaptor extends RecyclerView.Adapter<PayrollAdapter.ViewHolder>
{
    private Context context;
    private List<PayrollData> payrollDataList;
    private OnPayrollClicked onPayrollClicked;

    public PayrollAdapter(Context context, List<PayrollData> payrollDataList, OnPayrollClicked onPayrollClicked) {
        this.context = context;
        this.payrollDataList = payrollDataList;
        this.onPayrollClicked = onPayrollClicked;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        
    }


}
