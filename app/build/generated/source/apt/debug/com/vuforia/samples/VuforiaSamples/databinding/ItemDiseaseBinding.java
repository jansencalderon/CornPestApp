package com.vuforia.samples.VuforiaSamples.databinding;
import com.vuforia.samples.VuforiaSamples.R;
import com.vuforia.samples.VuforiaSamples.BR;
import android.view.View;
public class ItemDiseaseBinding extends android.databinding.ViewDataBinding implements android.databinding.generated.callback.OnClickListener.Listener {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView, 2);
    }
    // views
    public final android.widget.ImageView imageView;
    private final android.support.v7.widget.CardView mboundView0;
    private final android.widget.TextView mboundView1;
    // variables
    private com.vuforia.samples.MainApp.model.Disease mItem;
    private com.vuforia.samples.MainApp.ui.diseases.DiseasesView mView;
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemDiseaseBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds);
        this.imageView = (android.widget.ImageView) bindings[2];
        this.mboundView0 = (android.support.v7.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new android.databinding.generated.callback.OnClickListener(this, 1);
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

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.item :
                setItem((com.vuforia.samples.MainApp.model.Disease) variable);
                return true;
            case BR.view :
                setView((com.vuforia.samples.MainApp.ui.diseases.DiseasesView) variable);
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
    public void setView(com.vuforia.samples.MainApp.ui.diseases.DiseasesView View) {
        this.mView = View;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.view);
        super.requestRebind();
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
        com.vuforia.samples.MainApp.model.Disease item = mItem;
        com.vuforia.samples.MainApp.ui.diseases.DiseasesView view = mView;
        java.lang.String itemDisName = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (item != null) {
                    // read item.disName
                    itemDisName = item.getDisName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, itemDisName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // item
        com.vuforia.samples.MainApp.model.Disease item = mItem;
        // view
        com.vuforia.samples.MainApp.ui.diseases.DiseasesView view = mView;
        // view != null
        boolean viewJavaLangObjectNull = false;



        viewJavaLangObjectNull = (view) != (null);
        if (viewJavaLangObjectNull) {



            view.OnItemClicked(item);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ItemDiseaseBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemDiseaseBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ItemDiseaseBinding>inflate(inflater, com.vuforia.samples.VuforiaSamples.R.layout.item_disease, root, attachToRoot, bindingComponent);
    }
    public static ItemDiseaseBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemDiseaseBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.vuforia.samples.VuforiaSamples.R.layout.item_disease, null, false), bindingComponent);
    }
    public static ItemDiseaseBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ItemDiseaseBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/item_disease_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ItemDiseaseBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): view
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}