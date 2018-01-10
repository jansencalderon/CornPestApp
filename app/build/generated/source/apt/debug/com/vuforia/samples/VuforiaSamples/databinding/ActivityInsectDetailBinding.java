package com.vuforia.samples.VuforiaSamples.databinding;
import com.vuforia.samples.VuforiaSamples.R;
import com.vuforia.samples.VuforiaSamples.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityInsectDetailBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar, 8);
        sViewsWithIds.put(R.id.imageView, 9);
    }
    // views
    @NonNull
    public final android.support.design.widget.AppBarLayout appBar;
    @NonNull
    public final android.widget.ImageView imageView;
    @NonNull
    private final android.support.design.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    public final android.widget.TextView textView;
    @NonNull
    public final android.support.v7.widget.Toolbar toolbar;
    @NonNull
    public final android.support.design.widget.CollapsingToolbarLayout toolbarLayout;
    // variables
    @Nullable
    private com.vuforia.samples.MainApp.model.Insect mItem;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityInsectDetailBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds);
        this.appBar = (android.support.design.widget.AppBarLayout) bindings[8];
        this.imageView = (android.widget.ImageView) bindings[9];
        this.mboundView0 = (android.support.design.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.textView = (android.widget.TextView) bindings[3];
        this.textView.setTag(null);
        this.toolbar = (android.support.v7.widget.Toolbar) bindings[2];
        this.toolbar.setTag(null);
        this.toolbarLayout = (android.support.design.widget.CollapsingToolbarLayout) bindings[1];
        this.toolbarLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.item == variableId) {
            setItem((com.vuforia.samples.MainApp.model.Insect) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.vuforia.samples.MainApp.model.Insect Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    @Nullable
    public com.vuforia.samples.MainApp.model.Insect getItem() {
        return mItem;
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
        com.vuforia.samples.MainApp.model.Insect item = mItem;
        java.lang.String itemInsectSampling = null;
        java.lang.String itemInsectName = null;
        java.lang.String itemInsectTime = null;
        java.lang.String itemInsectThreshold = null;
        java.lang.String itemInsectManagement = null;
        java.lang.String itemInsectDesc = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.insectSampling
                    itemInsectSampling = item.getInsectSampling();
                    // read item.insectName
                    itemInsectName = item.getInsectName();
                    // read item.insectTime
                    itemInsectTime = item.getInsectTime();
                    // read item.insectThreshold
                    itemInsectThreshold = item.getInsectThreshold();
                    // read item.insectManagement
                    itemInsectManagement = item.getInsectManagement();
                    // read item.insectDesc
                    itemInsectDesc = item.getInsectDesc();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, itemInsectTime);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, itemInsectSampling);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, itemInsectThreshold);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, itemInsectManagement);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.textView, itemInsectDesc);
            this.toolbar.setTitle(itemInsectName);
            this.toolbarLayout.setTitle(itemInsectName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ActivityInsectDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityInsectDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityInsectDetailBinding>inflate(inflater, com.vuforia.samples.VuforiaSamples.R.layout.activity_insect_detail, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ActivityInsectDetailBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityInsectDetailBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.vuforia.samples.VuforiaSamples.R.layout.activity_insect_detail, null, false), bindingComponent);
    }
    @NonNull
    public static ActivityInsectDetailBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ActivityInsectDetailBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_insect_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityInsectDetailBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}