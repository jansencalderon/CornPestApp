package com.vuforia.samples.MainApp.ui.cornFarming;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.vuforia.samples.MainApp.helper.ResourceHelper;
import com.vuforia.samples.MainApp.model.CornFarming;
import com.vuforia.samples.MainApp.ui.cornFarming.CornFarmingView;
import com.vuforia.samples.VuforiaSamples.R;
import com.vuforia.samples.VuforiaSamples.databinding.ItemCornFarmingBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark Jansen Calderon on 1/12/2017.
 */

public class CornFarmingListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private CornFarmingView view;
    private List<CornFarming> list;
    private static final int VIEW_TYPE_MORE = 1;
    private static final int VIEW_TYPE_DEFAULT = 0;
    private boolean loading;

    public CornFarmingListAdapter(CornFarmingView view) {
        this.view = view;
        list = new ArrayList<>();

    }


    @Override
    public int getItemViewType(int position) {
        return VIEW_TYPE_DEFAULT;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemCornFarmingBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()), R.layout.item_corn_farming, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        CornFarming item = list.get(position);
        viewHolder.binding.setItem(item);
        viewHolder.binding.setView(view);
        Glide.with(holder.itemView.getContext())
                .load(ResourceHelper.getDrawableResourceId(holder.itemView.getContext(),item.getCfImage()))
                .centerCrop()
                .into(viewHolder.binding.imageView);

    }

    public void setList(List<CornFarming> list) {
        this.list.clear();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    public void clear() {
        list.clear();
        notifyDataSetChanged();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemCornFarmingBinding binding;

        public ViewHolder(ItemCornFarmingBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
