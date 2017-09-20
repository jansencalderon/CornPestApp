package com.vuforia.samples.VuforiaSamples.databinding;
import com.vuforia.samples.VuforiaSamples.R;
import com.vuforia.samples.VuforiaSamples.BR;
import android.view.View;
public class ActivityDiseaseBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 1);
        sViewsWithIds.put(R.id.recyclerView, 2);
    }
    // views
    private final android.widget.LinearLayout mboundView0;
    public final android.support.v7.widget.RecyclerView recyclerView;
    public final android.support.v7.widget.Toolbar toolbar;
    // variables
    private com.vuforia.samples.MainApp.ui.diseases.DiseasesView mView;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDiseaseBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerView = (android.support.v7.widget.RecyclerView) bindings[2];
        this.toolbar = (android.support.v7.widget.Toolbar) bindings[1];
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
            case BR.view :
                setView((com.vuforia.samples.MainApp.ui.diseases.DiseasesView) variable);
                return true;
        }
        return false;
    }

    public void setView(com.vuforia.samples.MainApp.ui.diseases.DiseasesView View) {
        this.mView = View;
    }
    public com.vuforia.samples.MainApp.ui.diseases.DiseasesView getView() {
        return mView;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ActivityDiseaseBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityDiseaseBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityDiseaseBinding>inflate(inflater, com.vuforia.samples.VuforiaSamples.R.layout.activity_disease, root, attachToRoot, bindingComponent);
    }
    public static ActivityDiseaseBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityDiseaseBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.vuforia.samples.VuforiaSamples.R.layout.activity_disease, null, false), bindingComponent);
    }
    public static ActivityDiseaseBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityDiseaseBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_disease_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityDiseaseBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): view
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}