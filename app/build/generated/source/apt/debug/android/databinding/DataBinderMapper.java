
package android.databinding;
import com.vuforia.samples.VuforiaSamples.BR;
class DataBinderMapper  {
    final static int TARGET_MIN_SDK = 17;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.vuforia.samples.VuforiaSamples.R.layout.item_insect:
                    return com.vuforia.samples.VuforiaSamples.databinding.ItemInsectBinding.bind(view, bindingComponent);
                case com.vuforia.samples.VuforiaSamples.R.layout.item_lesson_detail_image:
                    return com.vuforia.samples.VuforiaSamples.databinding.ItemLessonDetailImageBinding.bind(view, bindingComponent);
                case com.vuforia.samples.VuforiaSamples.R.layout.item_lesson_detail_header:
                    return com.vuforia.samples.VuforiaSamples.databinding.ItemLessonDetailHeaderBinding.bind(view, bindingComponent);
                case com.vuforia.samples.VuforiaSamples.R.layout.dialog_result:
                    return com.vuforia.samples.VuforiaSamples.databinding.DialogResultBinding.bind(view, bindingComponent);
                case com.vuforia.samples.VuforiaSamples.R.layout.item_lesson_detail_text:
                    return com.vuforia.samples.VuforiaSamples.databinding.ItemLessonDetailTextBinding.bind(view, bindingComponent);
                case com.vuforia.samples.VuforiaSamples.R.layout.item_corn_farming:
                    return com.vuforia.samples.VuforiaSamples.databinding.ItemCornFarmingBinding.bind(view, bindingComponent);
                case com.vuforia.samples.VuforiaSamples.R.layout.activity_insect_detail:
                    return com.vuforia.samples.VuforiaSamples.databinding.ActivityInsectDetailBinding.bind(view, bindingComponent);
                case com.vuforia.samples.VuforiaSamples.R.layout.activity_result:
                    return com.vuforia.samples.VuforiaSamples.databinding.ActivityResultBinding.bind(view, bindingComponent);
                case com.vuforia.samples.VuforiaSamples.R.layout.activity_main:
                    return com.vuforia.samples.VuforiaSamples.databinding.ActivityMainBinding.bind(view, bindingComponent);
                case com.vuforia.samples.VuforiaSamples.R.layout.activity_disease_detail:
                    return com.vuforia.samples.VuforiaSamples.databinding.ActivityDiseaseDetailBinding.bind(view, bindingComponent);
                case com.vuforia.samples.VuforiaSamples.R.layout.activity_disease:
                    return com.vuforia.samples.VuforiaSamples.databinding.ActivityDiseaseBinding.bind(view, bindingComponent);
                case com.vuforia.samples.VuforiaSamples.R.layout.camera_overlay:
                    return com.vuforia.samples.VuforiaSamples.databinding.CameraOverlayBinding.bind(view, bindingComponent);
                case com.vuforia.samples.VuforiaSamples.R.layout.activity_insects:
                    return com.vuforia.samples.VuforiaSamples.databinding.ActivityInsectsBinding.bind(view, bindingComponent);
                case com.vuforia.samples.VuforiaSamples.R.layout.item_disease:
                    return com.vuforia.samples.VuforiaSamples.databinding.ItemDiseaseBinding.bind(view, bindingComponent);
                case com.vuforia.samples.VuforiaSamples.R.layout.activity_corn_farming:
                    return com.vuforia.samples.VuforiaSamples.databinding.ActivityCornFarmingBinding.bind(view, bindingComponent);
                case com.vuforia.samples.VuforiaSamples.R.layout.activity_corn_farming_detail:
                    return com.vuforia.samples.VuforiaSamples.databinding.ActivityCornFarmingDetailBinding.bind(view, bindingComponent);
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
            case -1746756578: {
                if(tag.equals("layout/item_lesson_detail_image_0")) {
                    return com.vuforia.samples.VuforiaSamples.R.layout.item_lesson_detail_image;
                }
                break;
            }
            case 1429464940: {
                if(tag.equals("layout/item_lesson_detail_header_0")) {
                    return com.vuforia.samples.VuforiaSamples.R.layout.item_lesson_detail_header;
                }
                break;
            }
            case 579274944: {
                if(tag.equals("layout/dialog_result_0")) {
                    return com.vuforia.samples.VuforiaSamples.R.layout.dialog_result;
                }
                break;
            }
            case -1964874356: {
                if(tag.equals("layout/item_lesson_detail_text_0")) {
                    return com.vuforia.samples.VuforiaSamples.R.layout.item_lesson_detail_text;
                }
                break;
            }
            case 288713997: {
                if(tag.equals("layout/item_corn_farming_0")) {
                    return com.vuforia.samples.VuforiaSamples.R.layout.item_corn_farming;
                }
                break;
            }
            case 1176944462: {
                if(tag.equals("layout/activity_insect_detail_0")) {
                    return com.vuforia.samples.VuforiaSamples.R.layout.activity_insect_detail;
                }
                break;
            }
            case -1122809831: {
                if(tag.equals("layout/activity_result_0")) {
                    return com.vuforia.samples.VuforiaSamples.R.layout.activity_result;
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
            case 1742639020: {
                if(tag.equals("layout/camera_overlay_0")) {
                    return com.vuforia.samples.VuforiaSamples.R.layout.camera_overlay;
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
            case -121227247: {
                if(tag.equals("layout/activity_corn_farming_0")) {
                    return com.vuforia.samples.VuforiaSamples.R.layout.activity_corn_farming;
                }
                break;
            }
            case -1471435583: {
                if(tag.equals("layout/activity_corn_farming_detail_0")) {
                    return com.vuforia.samples.VuforiaSamples.R.layout.activity_corn_farming_detail;
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
            ,"detail"
            ,"item"
            ,"view"};
    }
}