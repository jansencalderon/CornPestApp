
package android.databinding;
import com.vuforia.samples.VuforiaSamples.BR;
class DataBinderMapper  {
    final static int TARGET_MIN_SDK = 24;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.vuforia.samples.VuforiaSamples.R.layout.item_insect:
                    return com.vuforia.samples.VuforiaSamples.databinding.ItemInsectBinding.bind(view, bindingComponent);
                case com.vuforia.samples.VuforiaSamples.R.layout.activity_main:
                    return com.vuforia.samples.VuforiaSamples.databinding.ActivityMainBinding.bind(view, bindingComponent);
                case com.vuforia.samples.VuforiaSamples.R.layout.activity_disease_detail:
                    return com.vuforia.samples.VuforiaSamples.databinding.ActivityDiseaseDetailBinding.bind(view, bindingComponent);
                case com.vuforia.samples.VuforiaSamples.R.layout.activity_disease:
                    return com.vuforia.samples.VuforiaSamples.databinding.ActivityDiseaseBinding.bind(view, bindingComponent);
                case com.vuforia.samples.VuforiaSamples.R.layout.activity_insect_detail:
                    return com.vuforia.samples.VuforiaSamples.databinding.ActivityInsectDetailBinding.bind(view, bindingComponent);
                case com.vuforia.samples.VuforiaSamples.R.layout.activity_insects:
                    return com.vuforia.samples.VuforiaSamples.databinding.ActivityInsectsBinding.bind(view, bindingComponent);
                case com.vuforia.samples.VuforiaSamples.R.layout.item_disease:
                    return com.vuforia.samples.VuforiaSamples.databinding.ItemDiseaseBinding.bind(view, bindingComponent);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case 111467552: {
                if(tag.equals("layout/item_insect_0")) {
                    return com.vuforia.samples.VuforiaSamples.R.layout.item_insect;
                }
                break;
            }
            case 423753077: {
                if(tag.equals("layout/activity_main_0")) {
                    return com.vuforia.samples.VuforiaSamples.R.layout.activity_main;
                }
                break;
            }
            case 608488368: {
                if(tag.equals("layout/activity_disease_detail_0")) {
                    return com.vuforia.samples.VuforiaSamples.R.layout.activity_disease_detail;
                }
                break;
            }
            case 1295218690: {
                if(tag.equals("layout/activity_disease_0")) {
                    return com.vuforia.samples.VuforiaSamples.R.layout.activity_disease;
                }
                break;
            }
            case 1176944462: {
                if(tag.equals("layout/activity_insect_detail_0")) {
                    return com.vuforia.samples.VuforiaSamples.R.layout.activity_insect_detail;
                }
                break;
            }
            case 973888337: {
                if(tag.equals("layout/activity_insects_0")) {
                    return com.vuforia.samples.VuforiaSamples.R.layout.activity_insects;
                }
                break;
            }
            case -518122106: {
                if(tag.equals("layout/item_disease_0")) {
                    return com.vuforia.samples.VuforiaSamples.R.layout.item_disease;
                }
                break;
            }
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"item"
            ,"view"};
    }
}