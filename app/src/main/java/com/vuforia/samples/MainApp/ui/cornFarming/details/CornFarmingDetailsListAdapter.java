package com.vuforia.samples.MainApp.ui.cornFarming.details;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.vuforia.samples.MainApp.app.Constant;
import com.vuforia.samples.MainApp.helper.ResourceHelper;
import com.vuforia.samples.MainApp.model.CornFarming;
import com.vuforia.samples.MainApp.model.CornFarmingDetail;
import com.vuforia.samples.VuforiaSamples.R;
import com.vuforia.samples.VuforiaSamples.databinding.ItemLessonDetailHeaderBinding;
import com.vuforia.samples.VuforiaSamples.databinding.ItemLessonDetailImageBinding;
import com.vuforia.samples.VuforiaSamples.databinding.ItemLessonDetailTextBinding;

import java.util.ArrayList;
import java.util.List;


class CornFarmingDetailsListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int VIEW_HEADER = 3;
    private static final int VIEW_TEXT = 1;
    private static final int VIEW_IMAGE = 2;
    private static final String TAG = CornFarming.class.getSimpleName();

    private final List<CornFarmingDetail> cornFarmingDetails;
    private final CornFarmingDetailsView cornFarmingDetailsView;

    CornFarmingDetailsListAdapter(CornFarmingDetailsView view) {
        this.cornFarmingDetailsView = view;
        cornFarmingDetails = new ArrayList<>();
    }

    @Override
    public int getItemViewType(int position) {
        switch (cornFarmingDetails.get(position).getType()) {
            case Constant.DETAIL_TYPE_HEADER:
                return VIEW_HEADER;
            case Constant.DETAIL_TYPE_TEXT:
                return VIEW_TEXT;
            case Constant.DETAIL_TYPE_IMAGE:
                return VIEW_IMAGE;
        }
        return super.getItemViewType(position);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case VIEW_HEADER:
                ItemLessonDetailHeaderBinding itemLessonDetailHeaderBinding = DataBindingUtil.inflate(
                        LayoutInflater.from(parent.getContext()),
                        R.layout.item_lesson_detail_header,
                        parent,
                        false);
                return new LessonHeaderViewHolder(itemLessonDetailHeaderBinding);
            case VIEW_TEXT:
                ItemLessonDetailTextBinding itemLessonDetailTextBinding = DataBindingUtil.inflate(
                        LayoutInflater.from(parent.getContext()),
                        R.layout.item_lesson_detail_text,
                        parent,
                        false);
                return new LessonDetailTextViewHolder(itemLessonDetailTextBinding);
            case VIEW_IMAGE:
                ItemLessonDetailImageBinding itemLessonDetailImageBinding = DataBindingUtil.inflate(
                        LayoutInflater.from(parent.getContext()),
                        R.layout.item_lesson_detail_image,
                        parent,
                        false);
                return new LessonDetailImageViewHolder(itemLessonDetailImageBinding);
            default:
                return null;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case VIEW_HEADER:
                LessonHeaderViewHolder lessonHeaderViewHolder = (LessonHeaderViewHolder) holder;
                lessonHeaderViewHolder.itemLessonDetailHeaderBinding.setDetail(cornFarmingDetails.get(position));
                break;
            case VIEW_TEXT:
                final CornFarmingDetail cornFarmingDetail = cornFarmingDetails.get(position);
                final LessonDetailTextViewHolder lessonDetailTextViewHolder = (LessonDetailTextViewHolder) holder;
                lessonDetailTextViewHolder.itemLessonDetailTextBinding.setDetail(cornFarmingDetail);
                lessonDetailTextViewHolder.itemLessonDetailTextBinding.setView(cornFarmingDetailsView);

                /*lessonDetailTextViewHolder.itemLessonDetailTextBinding.txtBody
                        .setOnLongClickListener(new View.OnLongClickListener() {
                            @Override
                            public boolean onLongClick(View view) {
                                cornFarmingDetailsView.onDetailClick(lessonDetail);
                                return true;
                            }
                        });
                lessonDetailTextViewHolder.itemLessonDetailTextBinding.txtBody
                        .setOnTouchListener(new View.OnTouchListener() {

                            final float STEP = 200;
                            float mRatio = 1.0f;
                            int mBaseDist;
                            float mBaseRatio;
                            float fontsize = 13;

                            @Override
                            public boolean onTouch(View view, MotionEvent motionEvent) {
                                if (motionEvent.getPointerCount() == 2) {
                                    int action = motionEvent.getAction();
                                    int pureaction = action & MotionEvent.ACTION_MASK;
                                    if (pureaction == MotionEvent.ACTION_POINTER_DOWN) {
                                        mBaseDist = getDistance(motionEvent);
                                        mBaseRatio = mRatio;
                                    } else {
                                        float delta = (getDistance(motionEvent) - mBaseDist) / STEP;
                                        float multi = (float) Math.pow(2, delta);
                                        mRatio = Math.min(1024.0f, Math.max(0.1f, mBaseRatio * multi));
                                        lessonDetailTextViewHolder.itemLessonDetailTextBinding.txtBody.setTextSize(mRatio + 13);
                                    }
                                }
                                return false;
                            }

                            int getDistance(MotionEvent event) {
                                int dx = (int) (event.getX(0) - event.getX(1));
                                int dy = (int) (event.getY(0) - event.getY(1));
                                return (int) (Math.sqrt(dx * dx + dy * dy));
                            }
                        });
                lessonDetailTextViewHolder.itemLessonDetailTextBinding.txtBody.setLongClickable(true);
                */
                break;
            case VIEW_IMAGE:
                LessonDetailImageViewHolder lessonDetailImageViewHolder = (LessonDetailImageViewHolder) holder;
                lessonDetailImageViewHolder.itemLessonDetailImageBinding.setDetail(cornFarmingDetails.get(position));
                lessonDetailImageViewHolder.itemLessonDetailImageBinding.setView(cornFarmingDetailsView);
                if (cornFarmingDetails.get(position).getContent().contains(".gif")) {
                    GlideDrawableImageViewTarget imageViewTarget = new GlideDrawableImageViewTarget(lessonDetailImageViewHolder.itemLessonDetailImageBinding.imageLessonDetail);
                    Glide.with(holder.itemView.getContext())
                            .load(ResourceHelper.getRawResourceId(holder.itemView.getContext(), cornFarmingDetails.get(position)
                                    .getContent()))
                            .diskCacheStrategy(DiskCacheStrategy.NONE)
                            .into(imageViewTarget);
                } else {
                    Glide.with(holder.itemView.getContext())
                            .load(ResourceHelper.getDrawableResourceId(holder.itemView.getContext(),
                                    cornFarmingDetails.get(position).getContent()))
                            .asBitmap()
                            .diskCacheStrategy(DiskCacheStrategy.NONE)
                            .into(lessonDetailImageViewHolder.itemLessonDetailImageBinding.imageLessonDetail);
                }

                break;
        }
    }

    @Override
    public int getItemCount() {
        return cornFarmingDetails.size();
    }

    /**
     * @param cornFarmingDetails list of lesson details to display
     */
    void setLessonDetails(List<CornFarmingDetail> cornFarmingDetails) {
        this.cornFarmingDetails.clear();
        this.cornFarmingDetails.addAll(cornFarmingDetails);
        notifyDataSetChanged();
    }

    private class LessonHeaderViewHolder extends RecyclerView.ViewHolder {
        private final ItemLessonDetailHeaderBinding itemLessonDetailHeaderBinding;

        LessonHeaderViewHolder(ItemLessonDetailHeaderBinding itemLessonDetailHeaderBinding) {
            super(itemLessonDetailHeaderBinding.getRoot());
            this.itemLessonDetailHeaderBinding = itemLessonDetailHeaderBinding;
        }
    }

    private class LessonDetailTextViewHolder extends RecyclerView.ViewHolder {
        private final ItemLessonDetailTextBinding itemLessonDetailTextBinding;

        LessonDetailTextViewHolder(ItemLessonDetailTextBinding itemLessonDetailTextBinding) {
            super(itemLessonDetailTextBinding.getRoot());
            this.itemLessonDetailTextBinding = itemLessonDetailTextBinding;
        }
    }

    private class LessonDetailImageViewHolder extends RecyclerView.ViewHolder {
        private final ItemLessonDetailImageBinding itemLessonDetailImageBinding;

        LessonDetailImageViewHolder(ItemLessonDetailImageBinding itemLessonDetailImageBinding) {
            super(itemLessonDetailImageBinding.getRoot());
            this.itemLessonDetailImageBinding = itemLessonDetailImageBinding;
        }
    }


}