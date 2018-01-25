package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.RealmObjectSchema;
import io.realm.RealmSchema;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.LinkView;
import io.realm.internal.OsObject;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.SharedRealm;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CornFarmingRealmProxy extends com.vuforia.samples.MainApp.model.CornFarming
    implements RealmObjectProxy, CornFarmingRealmProxyInterface {

    static final class CornFarmingColumnInfo extends ColumnInfo {
        long idIndex;
        long cfNameIndex;
        long cfImageIndex;
        long cornFarmingDetailsIndex;

        CornFarmingColumnInfo(SharedRealm realm, Table table) {
            super(4);
            this.idIndex = addColumnDetails(table, "id", RealmFieldType.INTEGER);
            this.cfNameIndex = addColumnDetails(table, "cfName", RealmFieldType.STRING);
            this.cfImageIndex = addColumnDetails(table, "cfImage", RealmFieldType.STRING);
            this.cornFarmingDetailsIndex = addColumnDetails(table, "cornFarmingDetails", RealmFieldType.LIST);
        }

        CornFarmingColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new CornFarmingColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final CornFarmingColumnInfo src = (CornFarmingColumnInfo) rawSrc;
            final CornFarmingColumnInfo dst = (CornFarmingColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.cfNameIndex = src.cfNameIndex;
            dst.cfImageIndex = src.cfImageIndex;
            dst.cornFarmingDetailsIndex = src.cornFarmingDetailsIndex;
        }
    }

    private CornFarmingColumnInfo columnInfo;
    private ProxyState<com.vuforia.samples.MainApp.model.CornFarming> proxyState;
    private RealmList<com.vuforia.samples.MainApp.model.CornFarmingDetail> cornFarmingDetailsRealmList;
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("id");
        fieldNames.add("cfName");
        fieldNames.add("cfImage");
        fieldNames.add("cornFarmingDetails");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    CornFarmingRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (CornFarmingColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.vuforia.samples.MainApp.model.CornFarming>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.idIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(Integer value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$cfName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.cfNameIndex);
    }

    @Override
    public void realmSet$cfName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.cfNameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.cfNameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.cfNameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.cfNameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$cfImage() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.cfImageIndex);
    }

    @Override
    public void realmSet$cfImage(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.cfImageIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.cfImageIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.cfImageIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.cfImageIndex, value);
    }

    @Override
    public RealmList<com.vuforia.samples.MainApp.model.CornFarmingDetail> realmGet$cornFarmingDetails() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (cornFarmingDetailsRealmList != null) {
            return cornFarmingDetailsRealmList;
        } else {
            LinkView linkView = proxyState.getRow$realm().getLinkList(columnInfo.cornFarmingDetailsIndex);
            cornFarmingDetailsRealmList = new RealmList<com.vuforia.samples.MainApp.model.CornFarmingDetail>(com.vuforia.samples.MainApp.model.CornFarmingDetail.class, linkView, proxyState.getRealm$realm());
            return cornFarmingDetailsRealmList;
        }
    }

    @Override
    public void realmSet$cornFarmingDetails(RealmList<com.vuforia.samples.MainApp.model.CornFarmingDetail> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("cornFarmingDetails")) {
                return;
            }
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.vuforia.samples.MainApp.model.CornFarmingDetail> original = value;
                value = new RealmList<com.vuforia.samples.MainApp.model.CornFarmingDetail>();
                for (com.vuforia.samples.MainApp.model.CornFarmingDetail item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        LinkView links = proxyState.getRow$realm().getLinkList(columnInfo.cornFarmingDetailsIndex);
        links.clear();
        if (value == null) {
            return;
        }
        for (RealmModel linkedObject : (RealmList<? extends RealmModel>) value) {
            if (!(RealmObject.isManaged(linkedObject) && RealmObject.isValid(linkedObject))) {
                throw new IllegalArgumentException("Each element of 'value' must be a valid managed object.");
            }
            if (((RealmObjectProxy)linkedObject).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("Each element of 'value' must belong to the same Realm.");
            }
            links.add(((RealmObjectProxy)linkedObject).realmGet$proxyState().getRow$realm().getIndex());
        }
    }

    public static RealmObjectSchema createRealmObjectSchema(RealmSchema realmSchema) {
        if (!realmSchema.contains("CornFarming")) {
            RealmObjectSchema realmObjectSchema = realmSchema.create("CornFarming");
            realmObjectSchema.add("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("cfName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("cfImage", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            if (!realmSchema.contains("CornFarmingDetail")) {
                CornFarmingDetailRealmProxy.createRealmObjectSchema(realmSchema);
            }
            realmObjectSchema.add("cornFarmingDetails", RealmFieldType.LIST, realmSchema.get("CornFarmingDetail"));
            return realmObjectSchema;
        }
        return realmSchema.get("CornFarming");
    }

    public static CornFarmingColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_CornFarming")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'CornFarming' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_CornFarming");
        final long columnCount = table.getColumnCount();
        if (columnCount != 4) {
            if (columnCount < 4) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 4 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 4 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 4 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final CornFarmingColumnInfo columnInfo = new CornFarmingColumnInfo(sharedRealm, table);

        if (!table.hasPrimaryKey()) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary key not defined for field 'id' in existing Realm file. @PrimaryKey was added.");
        } else {
            if (table.getPrimaryKey() != columnInfo.idIndex) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary Key annotation definition was changed, from field " + table.getColumnName(table.getPrimaryKey()) + " to field id");
            }
        }

        if (!columnTypes.containsKey("id")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'id' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("id") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'id' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.idIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"@PrimaryKey field 'id' does not support null values in the existing Realm file. Migrate using RealmObjectSchema.setNullable(), or mark the field as @Required.");
        }
        if (!table.hasSearchIndex(table.getColumnIndex("id"))) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Index not defined for field 'id' in existing Realm file. Either set @Index or migrate using io.realm.internal.Table.removeSearchIndex().");
        }
        if (!columnTypes.containsKey("cfName")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'cfName' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("cfName") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'cfName' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.cfNameIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'cfName' is required. Either set @Required to field 'cfName' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("cfImage")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'cfImage' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("cfImage") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'cfImage' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.cfImageIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'cfImage' is required. Either set @Required to field 'cfImage' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("cornFarmingDetails")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'cornFarmingDetails'");
        }
        if (columnTypes.get("cornFarmingDetails") != RealmFieldType.LIST) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'CornFarmingDetail' for field 'cornFarmingDetails'");
        }
        if (!sharedRealm.hasTable("class_CornFarmingDetail")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_CornFarmingDetail' for field 'cornFarmingDetails'");
        }
        Table table_3 = sharedRealm.getTable("class_CornFarmingDetail");
        if (!table.getLinkTarget(columnInfo.cornFarmingDetailsIndex).hasSameSchema(table_3)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmList type for field 'cornFarmingDetails': '" + table.getLinkTarget(columnInfo.cornFarmingDetailsIndex).getName() + "' expected - was '" + table_3.getName() + "'");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_CornFarming";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.vuforia.samples.MainApp.model.CornFarming createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        com.vuforia.samples.MainApp.model.CornFarming obj = null;
        if (update) {
            Table table = realm.getTable(com.vuforia.samples.MainApp.model.CornFarming.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("id")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(com.vuforia.samples.MainApp.model.CornFarming.class), false, Collections.<String> emptyList());
                    obj = new io.realm.CornFarmingRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("cornFarmingDetails")) {
                excludeFields.add("cornFarmingDetails");
            }
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.CornFarmingRealmProxy) realm.createObjectInternal(com.vuforia.samples.MainApp.model.CornFarming.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.CornFarmingRealmProxy) realm.createObjectInternal(com.vuforia.samples.MainApp.model.CornFarming.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }
        if (json.has("cfName")) {
            if (json.isNull("cfName")) {
                ((CornFarmingRealmProxyInterface) obj).realmSet$cfName(null);
            } else {
                ((CornFarmingRealmProxyInterface) obj).realmSet$cfName((String) json.getString("cfName"));
            }
        }
        if (json.has("cfImage")) {
            if (json.isNull("cfImage")) {
                ((CornFarmingRealmProxyInterface) obj).realmSet$cfImage(null);
            } else {
                ((CornFarmingRealmProxyInterface) obj).realmSet$cfImage((String) json.getString("cfImage"));
            }
        }
        if (json.has("cornFarmingDetails")) {
            if (json.isNull("cornFarmingDetails")) {
                ((CornFarmingRealmProxyInterface) obj).realmSet$cornFarmingDetails(null);
            } else {
                ((CornFarmingRealmProxyInterface) obj).realmGet$cornFarmingDetails().clear();
                JSONArray array = json.getJSONArray("cornFarmingDetails");
                for (int i = 0; i < array.length(); i++) {
                    com.vuforia.samples.MainApp.model.CornFarmingDetail item = CornFarmingDetailRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    ((CornFarmingRealmProxyInterface) obj).realmGet$cornFarmingDetails().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.vuforia.samples.MainApp.model.CornFarming createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        com.vuforia.samples.MainApp.model.CornFarming obj = new com.vuforia.samples.MainApp.model.CornFarming();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((CornFarmingRealmProxyInterface) obj).realmSet$id(null);
                } else {
                    ((CornFarmingRealmProxyInterface) obj).realmSet$id((int) reader.nextInt());
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("cfName")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((CornFarmingRealmProxyInterface) obj).realmSet$cfName(null);
                } else {
                    ((CornFarmingRealmProxyInterface) obj).realmSet$cfName((String) reader.nextString());
                }
            } else if (name.equals("cfImage")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((CornFarmingRealmProxyInterface) obj).realmSet$cfImage(null);
                } else {
                    ((CornFarmingRealmProxyInterface) obj).realmSet$cfImage((String) reader.nextString());
                }
            } else if (name.equals("cornFarmingDetails")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((CornFarmingRealmProxyInterface) obj).realmSet$cornFarmingDetails(null);
                } else {
                    ((CornFarmingRealmProxyInterface) obj).realmSet$cornFarmingDetails(new RealmList<com.vuforia.samples.MainApp.model.CornFarmingDetail>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.vuforia.samples.MainApp.model.CornFarmingDetail item = CornFarmingDetailRealmProxy.createUsingJsonStream(realm, reader);
                        ((CornFarmingRealmProxyInterface) obj).realmGet$cornFarmingDetails().add(item);
                    }
                    reader.endArray();
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static com.vuforia.samples.MainApp.model.CornFarming copyOrUpdate(Realm realm, com.vuforia.samples.MainApp.model.CornFarming object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.vuforia.samples.MainApp.model.CornFarming) cachedRealmObject;
        } else {
            com.vuforia.samples.MainApp.model.CornFarming realmObject = null;
            boolean canUpdate = update;
            if (canUpdate) {
                Table table = realm.getTable(com.vuforia.samples.MainApp.model.CornFarming.class);
                long pkColumnIndex = table.getPrimaryKey();
                Number value = ((CornFarmingRealmProxyInterface) object).realmGet$id();
                long rowIndex = Table.NO_MATCH;
                if (value == null) {
                    rowIndex = table.findFirstNull(pkColumnIndex);
                } else {
                    rowIndex = table.findFirstLong(pkColumnIndex, value.longValue());
                }
                if (rowIndex != Table.NO_MATCH) {
                    try {
                        objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(com.vuforia.samples.MainApp.model.CornFarming.class), false, Collections.<String> emptyList());
                        realmObject = new io.realm.CornFarmingRealmProxy();
                        cache.put(object, (RealmObjectProxy) realmObject);
                    } finally {
                        objectContext.clear();
                    }
                } else {
                    canUpdate = false;
                }
            }

            if (canUpdate) {
                return update(realm, realmObject, object, cache);
            } else {
                return copy(realm, object, update, cache);
            }
        }
    }

    public static com.vuforia.samples.MainApp.model.CornFarming copy(Realm realm, com.vuforia.samples.MainApp.model.CornFarming newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.vuforia.samples.MainApp.model.CornFarming) cachedRealmObject;
        } else {
            // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
            com.vuforia.samples.MainApp.model.CornFarming realmObject = realm.createObjectInternal(com.vuforia.samples.MainApp.model.CornFarming.class, ((CornFarmingRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
            cache.put(newObject, (RealmObjectProxy) realmObject);
            ((CornFarmingRealmProxyInterface) realmObject).realmSet$cfName(((CornFarmingRealmProxyInterface) newObject).realmGet$cfName());
            ((CornFarmingRealmProxyInterface) realmObject).realmSet$cfImage(((CornFarmingRealmProxyInterface) newObject).realmGet$cfImage());

            RealmList<com.vuforia.samples.MainApp.model.CornFarmingDetail> cornFarmingDetailsList = ((CornFarmingRealmProxyInterface) newObject).realmGet$cornFarmingDetails();
            if (cornFarmingDetailsList != null) {
                RealmList<com.vuforia.samples.MainApp.model.CornFarmingDetail> cornFarmingDetailsRealmList = ((CornFarmingRealmProxyInterface) realmObject).realmGet$cornFarmingDetails();
                for (int i = 0; i < cornFarmingDetailsList.size(); i++) {
                    com.vuforia.samples.MainApp.model.CornFarmingDetail cornFarmingDetailsItem = cornFarmingDetailsList.get(i);
                    com.vuforia.samples.MainApp.model.CornFarmingDetail cachecornFarmingDetails = (com.vuforia.samples.MainApp.model.CornFarmingDetail) cache.get(cornFarmingDetailsItem);
                    if (cachecornFarmingDetails != null) {
                        cornFarmingDetailsRealmList.add(cachecornFarmingDetails);
                    } else {
                        cornFarmingDetailsRealmList.add(CornFarmingDetailRealmProxy.copyOrUpdate(realm, cornFarmingDetailsList.get(i), update, cache));
                    }
                }
            }

            return realmObject;
        }
    }

    public static long insert(Realm realm, com.vuforia.samples.MainApp.model.CornFarming object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.vuforia.samples.MainApp.model.CornFarming.class);
        long tableNativePtr = table.getNativePtr();
        CornFarmingColumnInfo columnInfo = (CornFarmingColumnInfo) realm.schema.getColumnInfo(com.vuforia.samples.MainApp.model.CornFarming.class);
        long pkColumnIndex = table.getPrimaryKey();
        Object primaryKeyValue = ((CornFarmingRealmProxyInterface) object).realmGet$id();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((CornFarmingRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, ((CornFarmingRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$cfName = ((CornFarmingRealmProxyInterface)object).realmGet$cfName();
        if (realmGet$cfName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.cfNameIndex, rowIndex, realmGet$cfName, false);
        }
        String realmGet$cfImage = ((CornFarmingRealmProxyInterface)object).realmGet$cfImage();
        if (realmGet$cfImage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.cfImageIndex, rowIndex, realmGet$cfImage, false);
        }

        RealmList<com.vuforia.samples.MainApp.model.CornFarmingDetail> cornFarmingDetailsList = ((CornFarmingRealmProxyInterface) object).realmGet$cornFarmingDetails();
        if (cornFarmingDetailsList != null) {
            long cornFarmingDetailsNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.cornFarmingDetailsIndex, rowIndex);
            for (com.vuforia.samples.MainApp.model.CornFarmingDetail cornFarmingDetailsItem : cornFarmingDetailsList) {
                Long cacheItemIndexcornFarmingDetails = cache.get(cornFarmingDetailsItem);
                if (cacheItemIndexcornFarmingDetails == null) {
                    cacheItemIndexcornFarmingDetails = CornFarmingDetailRealmProxy.insert(realm, cornFarmingDetailsItem, cache);
                }
                LinkView.nativeAdd(cornFarmingDetailsNativeLinkViewPtr, cacheItemIndexcornFarmingDetails);
            }
        }

        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.vuforia.samples.MainApp.model.CornFarming.class);
        long tableNativePtr = table.getNativePtr();
        CornFarmingColumnInfo columnInfo = (CornFarmingColumnInfo) realm.schema.getColumnInfo(com.vuforia.samples.MainApp.model.CornFarming.class);
        long pkColumnIndex = table.getPrimaryKey();
        com.vuforia.samples.MainApp.model.CornFarming object = null;
        while (objects.hasNext()) {
            object = (com.vuforia.samples.MainApp.model.CornFarming) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                Object primaryKeyValue = ((CornFarmingRealmProxyInterface) object).realmGet$id();
                long rowIndex = Table.NO_MATCH;
                if (primaryKeyValue == null) {
                    rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
                } else {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((CornFarmingRealmProxyInterface) object).realmGet$id());
                }
                if (rowIndex == Table.NO_MATCH) {
                    rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, ((CornFarmingRealmProxyInterface) object).realmGet$id());
                } else {
                    Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
                }
                cache.put(object, rowIndex);
                String realmGet$cfName = ((CornFarmingRealmProxyInterface)object).realmGet$cfName();
                if (realmGet$cfName != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.cfNameIndex, rowIndex, realmGet$cfName, false);
                }
                String realmGet$cfImage = ((CornFarmingRealmProxyInterface)object).realmGet$cfImage();
                if (realmGet$cfImage != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.cfImageIndex, rowIndex, realmGet$cfImage, false);
                }

                RealmList<com.vuforia.samples.MainApp.model.CornFarmingDetail> cornFarmingDetailsList = ((CornFarmingRealmProxyInterface) object).realmGet$cornFarmingDetails();
                if (cornFarmingDetailsList != null) {
                    long cornFarmingDetailsNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.cornFarmingDetailsIndex, rowIndex);
                    for (com.vuforia.samples.MainApp.model.CornFarmingDetail cornFarmingDetailsItem : cornFarmingDetailsList) {
                        Long cacheItemIndexcornFarmingDetails = cache.get(cornFarmingDetailsItem);
                        if (cacheItemIndexcornFarmingDetails == null) {
                            cacheItemIndexcornFarmingDetails = CornFarmingDetailRealmProxy.insert(realm, cornFarmingDetailsItem, cache);
                        }
                        LinkView.nativeAdd(cornFarmingDetailsNativeLinkViewPtr, cacheItemIndexcornFarmingDetails);
                    }
                }

            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.vuforia.samples.MainApp.model.CornFarming object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.vuforia.samples.MainApp.model.CornFarming.class);
        long tableNativePtr = table.getNativePtr();
        CornFarmingColumnInfo columnInfo = (CornFarmingColumnInfo) realm.schema.getColumnInfo(com.vuforia.samples.MainApp.model.CornFarming.class);
        long pkColumnIndex = table.getPrimaryKey();
        Object primaryKeyValue = ((CornFarmingRealmProxyInterface) object).realmGet$id();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((CornFarmingRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, ((CornFarmingRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        String realmGet$cfName = ((CornFarmingRealmProxyInterface)object).realmGet$cfName();
        if (realmGet$cfName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.cfNameIndex, rowIndex, realmGet$cfName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.cfNameIndex, rowIndex, false);
        }
        String realmGet$cfImage = ((CornFarmingRealmProxyInterface)object).realmGet$cfImage();
        if (realmGet$cfImage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.cfImageIndex, rowIndex, realmGet$cfImage, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.cfImageIndex, rowIndex, false);
        }

        long cornFarmingDetailsNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.cornFarmingDetailsIndex, rowIndex);
        LinkView.nativeClear(cornFarmingDetailsNativeLinkViewPtr);
        RealmList<com.vuforia.samples.MainApp.model.CornFarmingDetail> cornFarmingDetailsList = ((CornFarmingRealmProxyInterface) object).realmGet$cornFarmingDetails();
        if (cornFarmingDetailsList != null) {
            for (com.vuforia.samples.MainApp.model.CornFarmingDetail cornFarmingDetailsItem : cornFarmingDetailsList) {
                Long cacheItemIndexcornFarmingDetails = cache.get(cornFarmingDetailsItem);
                if (cacheItemIndexcornFarmingDetails == null) {
                    cacheItemIndexcornFarmingDetails = CornFarmingDetailRealmProxy.insertOrUpdate(realm, cornFarmingDetailsItem, cache);
                }
                LinkView.nativeAdd(cornFarmingDetailsNativeLinkViewPtr, cacheItemIndexcornFarmingDetails);
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.vuforia.samples.MainApp.model.CornFarming.class);
        long tableNativePtr = table.getNativePtr();
        CornFarmingColumnInfo columnInfo = (CornFarmingColumnInfo) realm.schema.getColumnInfo(com.vuforia.samples.MainApp.model.CornFarming.class);
        long pkColumnIndex = table.getPrimaryKey();
        com.vuforia.samples.MainApp.model.CornFarming object = null;
        while (objects.hasNext()) {
            object = (com.vuforia.samples.MainApp.model.CornFarming) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                Object primaryKeyValue = ((CornFarmingRealmProxyInterface) object).realmGet$id();
                long rowIndex = Table.NO_MATCH;
                if (primaryKeyValue == null) {
                    rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
                } else {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((CornFarmingRealmProxyInterface) object).realmGet$id());
                }
                if (rowIndex == Table.NO_MATCH) {
                    rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, ((CornFarmingRealmProxyInterface) object).realmGet$id());
                }
                cache.put(object, rowIndex);
                String realmGet$cfName = ((CornFarmingRealmProxyInterface)object).realmGet$cfName();
                if (realmGet$cfName != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.cfNameIndex, rowIndex, realmGet$cfName, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.cfNameIndex, rowIndex, false);
                }
                String realmGet$cfImage = ((CornFarmingRealmProxyInterface)object).realmGet$cfImage();
                if (realmGet$cfImage != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.cfImageIndex, rowIndex, realmGet$cfImage, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.cfImageIndex, rowIndex, false);
                }

                long cornFarmingDetailsNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.cornFarmingDetailsIndex, rowIndex);
                LinkView.nativeClear(cornFarmingDetailsNativeLinkViewPtr);
                RealmList<com.vuforia.samples.MainApp.model.CornFarmingDetail> cornFarmingDetailsList = ((CornFarmingRealmProxyInterface) object).realmGet$cornFarmingDetails();
                if (cornFarmingDetailsList != null) {
                    for (com.vuforia.samples.MainApp.model.CornFarmingDetail cornFarmingDetailsItem : cornFarmingDetailsList) {
                        Long cacheItemIndexcornFarmingDetails = cache.get(cornFarmingDetailsItem);
                        if (cacheItemIndexcornFarmingDetails == null) {
                            cacheItemIndexcornFarmingDetails = CornFarmingDetailRealmProxy.insertOrUpdate(realm, cornFarmingDetailsItem, cache);
                        }
                        LinkView.nativeAdd(cornFarmingDetailsNativeLinkViewPtr, cacheItemIndexcornFarmingDetails);
                    }
                }

            }
        }
    }

    public static com.vuforia.samples.MainApp.model.CornFarming createDetachedCopy(com.vuforia.samples.MainApp.model.CornFarming realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.vuforia.samples.MainApp.model.CornFarming unmanagedObject;
        if (cachedObject != null) {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.vuforia.samples.MainApp.model.CornFarming)cachedObject.object;
            } else {
                unmanagedObject = (com.vuforia.samples.MainApp.model.CornFarming)cachedObject.object;
                cachedObject.minDepth = currentDepth;
            }
        } else {
            unmanagedObject = new com.vuforia.samples.MainApp.model.CornFarming();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        }
        ((CornFarmingRealmProxyInterface) unmanagedObject).realmSet$id(((CornFarmingRealmProxyInterface) realmObject).realmGet$id());
        ((CornFarmingRealmProxyInterface) unmanagedObject).realmSet$cfName(((CornFarmingRealmProxyInterface) realmObject).realmGet$cfName());
        ((CornFarmingRealmProxyInterface) unmanagedObject).realmSet$cfImage(((CornFarmingRealmProxyInterface) realmObject).realmGet$cfImage());

        // Deep copy of cornFarmingDetails
        if (currentDepth == maxDepth) {
            ((CornFarmingRealmProxyInterface) unmanagedObject).realmSet$cornFarmingDetails(null);
        } else {
            RealmList<com.vuforia.samples.MainApp.model.CornFarmingDetail> managedcornFarmingDetailsList = ((CornFarmingRealmProxyInterface) realmObject).realmGet$cornFarmingDetails();
            RealmList<com.vuforia.samples.MainApp.model.CornFarmingDetail> unmanagedcornFarmingDetailsList = new RealmList<com.vuforia.samples.MainApp.model.CornFarmingDetail>();
            ((CornFarmingRealmProxyInterface) unmanagedObject).realmSet$cornFarmingDetails(unmanagedcornFarmingDetailsList);
            int nextDepth = currentDepth + 1;
            int size = managedcornFarmingDetailsList.size();
            for (int i = 0; i < size; i++) {
                com.vuforia.samples.MainApp.model.CornFarmingDetail item = CornFarmingDetailRealmProxy.createDetachedCopy(managedcornFarmingDetailsList.get(i), nextDepth, maxDepth, cache);
                unmanagedcornFarmingDetailsList.add(item);
            }
        }
        return unmanagedObject;
    }

    static com.vuforia.samples.MainApp.model.CornFarming update(Realm realm, com.vuforia.samples.MainApp.model.CornFarming realmObject, com.vuforia.samples.MainApp.model.CornFarming newObject, Map<RealmModel, RealmObjectProxy> cache) {
        ((CornFarmingRealmProxyInterface) realmObject).realmSet$cfName(((CornFarmingRealmProxyInterface) newObject).realmGet$cfName());
        ((CornFarmingRealmProxyInterface) realmObject).realmSet$cfImage(((CornFarmingRealmProxyInterface) newObject).realmGet$cfImage());
        RealmList<com.vuforia.samples.MainApp.model.CornFarmingDetail> cornFarmingDetailsList = ((CornFarmingRealmProxyInterface) newObject).realmGet$cornFarmingDetails();
        RealmList<com.vuforia.samples.MainApp.model.CornFarmingDetail> cornFarmingDetailsRealmList = ((CornFarmingRealmProxyInterface) realmObject).realmGet$cornFarmingDetails();
        cornFarmingDetailsRealmList.clear();
        if (cornFarmingDetailsList != null) {
            for (int i = 0; i < cornFarmingDetailsList.size(); i++) {
                com.vuforia.samples.MainApp.model.CornFarmingDetail cornFarmingDetailsItem = cornFarmingDetailsList.get(i);
                com.vuforia.samples.MainApp.model.CornFarmingDetail cachecornFarmingDetails = (com.vuforia.samples.MainApp.model.CornFarmingDetail) cache.get(cornFarmingDetailsItem);
                if (cachecornFarmingDetails != null) {
                    cornFarmingDetailsRealmList.add(cachecornFarmingDetails);
                } else {
                    cornFarmingDetailsRealmList.add(CornFarmingDetailRealmProxy.copyOrUpdate(realm, cornFarmingDetailsList.get(i), true, cache));
                }
            }
        }
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("CornFarming = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{cfName:");
        stringBuilder.append(realmGet$cfName() != null ? realmGet$cfName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{cfImage:");
        stringBuilder.append(realmGet$cfImage() != null ? realmGet$cfImage() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{cornFarmingDetails:");
        stringBuilder.append("RealmList<CornFarmingDetail>[").append(realmGet$cornFarmingDetails().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CornFarmingRealmProxy aCornFarming = (CornFarmingRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aCornFarming.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aCornFarming.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aCornFarming.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
