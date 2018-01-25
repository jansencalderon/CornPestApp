package com.vuforia.samples.VuforiaSamples.databinding;
import com.vuforia.samples.VuforiaSamples.R;
import com.vuforia.samples.VuforiaSamples.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemLessonDetailHeaderBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    public final android.widget.TextView title;
    // variables
    @Nullable
    private com.vuforia.samples.MainApp.ui.cornFarming.details.CornFarmingDetailsView mView;
    @Nullable
    private com.vuforia.samples.MainApp.model.CornFarmingDetail mDetail;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemLessonDetailHeaderBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.title = (android.widget.TextView) bindings[1];
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.view == variableId) {
            setView((com.vuforia.samples.MainApp.ui.cornFarming.details.CornFarmingDetailsView) variable);
        }
        else if (BR.detail == variableId) {
            setDetail((com.vuforia.samples.MainApp.model.CornFarmingDetail) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setView(@Nullable com.vuforia.samples.MainApp.ui.cornFarming.details.CornFarmingDetailsView View) {
        this.mView = View;
    }
    @Nullable
    public com.vuforia.samples.MainApp.ui.cornFarming.details.CornFarmingDetailsView getView() {
        return mView;
    }
    public void setDetail(@Nullable com.vuforia.samples.MainApp.model.CornFarmingDetail Detail) {
        this.mDetail = Detail;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.detail);
        super.requestRebind();
    }
    @Nullable
    public com.vuforia.samples.MainApp.model.CornFarmingDetail getDetail() {
        return mDetail;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.vuforia.samples.MainApp.model.CornFarmingDetail detail = mDetail;
        java.lang.String detailContent = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (detail != null) {
                    // read detail.content
                    detailContent = detail.getContent();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.title, detailContent);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ItemLessonDetailHeaderBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemLessonDetailHeaderBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemLessonDetailHeaderBinding>inflate(inflater, com.vuforia.samples.VuforiaSamples.R.layout.item_lesson_detail_header, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ItemLessonDetailHeaderBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemLessonDetailHeaderBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.vuforia.samples.VuforiaSamples.R.layout.item_lesson_detail_header, null, false), bindingComponent);
    }
    @NonNull
    public static ItemLessonDetailHeaderBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ItemLessonDetailHeaderBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_lesson_detail_header_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemLessonDetailHeaderBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): view
        flag 1 (0x2L): detail
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}