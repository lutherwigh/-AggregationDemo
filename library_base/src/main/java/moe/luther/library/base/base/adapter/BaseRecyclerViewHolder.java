package moe.luther.library.base.base.adapter;

import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class BaseRecyclerViewHolder extends RecyclerView.ViewHolder {

    private ViewDataBinding binding;

    public BaseRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public ViewDataBinding getBinding() {
        return binding;
    }

    public void setBinding(ViewDataBinding binding) {
        this.binding = binding;
    }
}
