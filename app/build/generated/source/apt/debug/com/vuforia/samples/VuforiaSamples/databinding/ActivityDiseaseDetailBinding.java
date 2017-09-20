package com.vuforia.samples.VuforiaSamples.databinding;
import com.vuforia.samples.VuforiaSamples.R;
import com.vuforia.samples.VuforiaSamples.BR;
import android.view.View;
public class ActivityDiseaseDetailBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar, 4);
        sViewsWithIds.put(R.id.imageView, 5);
    }
    // views
    public final android.support.design.widget.AppBarLayout appBar;
    public final android.widget.ImageView imageView;
    private final android.support.design.widget.CoordinatorLayout mboundView0;
    private final android.widget.TextView mboundView3;
    public final android.support.v7.widget.Toolbar toolbar;
    public final android.support.design.widget.CollapsingToolbarLayout toolbarLayout;
    // variables
    private com.vuforia.samples.MainApp.model.Disease mItem;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDiseaseDetailBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds);
        this.appBar = (android.support.design.widget.AppBarLayout) bindings[4];
        this.imageView = (android.widget.ImageView) bindings[5];
        this.mboundView0 = (android.support.design.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
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

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.item :
                setItem((com.vuforia.samples.MainApp.model.Disease) variable);
                return true;
        }
        return false;
    }

    public void setItem(com.vuforia.samples.MainApp.model.Disease Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }
    public com.vuforia.samples.MainApp.model.Disease getItem() {
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
        com.vuforia.samples.MainApp.model.Disease item = mItem;
        java.lang.String itemDisDesc = null;
        java.lang.String itemDisName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.disDesc
                    itemDisDesc = item.getDisDesc();
                    // read item.disName
                    itemDisName = item.getDisName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, itemDisDesc);
            this.toolbar.setTitle(itemDisName);
            this.toolbarLayout.setTitle(itemDisName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ActivityDiseaseDetailBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityDiseaseDetailBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityDiseaseDetailBinding>inflate(inflater, com.vuforia.samples.VuforiaSamples.R.layout.activity_disease_detail, root, attachToRoot, bindingComponent);
    }
    public static ActivityDiseaseDetailBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityDiseaseDetailBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.vuforia.samples.VuforiaSamples.R.layout.activity_disease_detail, null, false), bindingComponent);
    }
    public static ActivityDiseaseDetailBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityDiseaseDetailBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_disease_detail_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityDiseaseDetailBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}