package com.vuforia.samples.MainApp.ui.diseases;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.vuforia.samples.MainApp.helper.ResourceHelper;
import com.vuforia.samples.MainApp.model.Disease;
import com.vuforia.samples.VuforiaSamples.R;
import com.vuforia.samples.VuforiaSamples.databinding.ItemDiseaseBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mark Jansen Calderon on 1/12/2017.
 */

public class DiseasesListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private DiseasesView view;
    private List<Disease> list;
    private static final int VIEW_TYPE_MORE = 1;
    private static final int VIEW_TYPE_DEFAULT = 0;
    private boolean loading;

    public DiseasesListAdapter(DiseasesView view) {
        this.view = view;
        list = new ArrayList<>();

    }


    @Override
    public int getItemViewType(int position) {
        return VIEW_TYPE_DEFAULT;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemDiseaseBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()), R.layout.item_disease, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        Disease item = list.get(position);
        viewHolder.binding.setItem(item);
        viewHolder.binding.setView(view);
        Glide.with(holder.itemView.getContext())
                .load(ResourceHelper.getDrawableResourceId(holder.itemView.getContext(),item.getDisImage()))
                .centerCrop()
                .into(viewHolder.binding.imageView);

    }

    public void setList(List<Disease> list) {
        this.list.clear();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    public void clear() {
        list.clear();
        notifyDataSetChanged();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemDiseaseBinding binding;

        public ViewHolder(ItemDiseaseBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
