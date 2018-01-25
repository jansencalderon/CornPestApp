package io.realm;


public interface CornFarmingRealmProxyInterface {
    public Integer realmGet$id();
    public void realmSet$id(Integer value);
    public String realmGet$cfName();
    public void realmSet$cfName(String value);
    public String realmGet$cfImage();
    public void realmSet$cfImage(String value);
    public RealmList<com.vuforia.samples.MainApp.model.CornFarmingDetail> realmGet$cornFarmingDetails();
    public void realmSet$cornFarmingDetails(RealmList<com.vuforia.samples.MainApp.model.CornFarmingDetail> value);
}
