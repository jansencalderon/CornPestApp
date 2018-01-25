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

public class CornFarmingDetailRealmProxy extends com.vuforia.samples.MainApp.model.CornFarmingDetail
    implements RealmObjectProxy, CornFarmingDetailRealmProxyInterface {

    static final class CornFarmingDetailColumnInfo extends ColumnInfo {
        long idIndex;
        long cfIdIndex;
        long contentIndex;
        long sequenceIndex;
        long typeIndex;

        CornFarmingDetailColumnInfo(SharedRealm realm, Table table) {
            super(5);
            this.idIndex = addColumnDetails(table, "id", RealmFieldType.INTEGER);
            this.cfIdIndex = addColumnDetails(table, "cfId", RealmFieldType.INTEGER);
            this.contentIndex = addColumnDetails(table, "content", RealmFieldType.STRING);
            this.sequenceIndex = addColumnDetails(table, "sequence", RealmFieldType.INTEGER);
            this.typeIndex = addColumnDetails(table, "type", RealmFieldType.STRING);
        }

        CornFarmingDetailColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new CornFarmingDetailColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final CornFarmingDetailColumnInfo src = (CornFarmingDetailColumnInfo) rawSrc;
            final CornFarmingDetailColumnInfo dst = (CornFarmingDetailColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.cfIdIndex = src.cfIdIndex;
            dst.contentIndex = src.contentIndex;
            dst.sequenceIndex = src.sequenceIndex;
            dst.typeIndex = src.typeIndex;
        }
    }

    private CornFarmingDetailColumnInfo columnInfo;
    private ProxyState<com.vuforia.samples.MainApp.model.CornFarmingDetail> proxyState;
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("id");
        fieldNames.add("cfId");
        fieldNames.add("content");
        fieldNames.add("sequence");
        fieldNames.add("type");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    CornFarmingDetailRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (CornFarmingDetailColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.vuforia.samples.MainApp.model.CornFarmingDetail>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(int value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$cfId() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.cfIdIndex);
    }

    @Override
    public void realmSet$cfId(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.cfIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.cfIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$content() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.contentIndex);
    }

    @Override
    public void realmSet$content(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.contentIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.contentIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.contentIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.contentIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$sequence() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.sequenceIndex);
    }

    @Override
    public void realmSet$sequence(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.sequenceIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.sequenceIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$type() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.typeIndex);
    }

    @Override
    public void realmSet$type(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.typeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.typeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.typeIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.typeIndex, value);
    }

    public static RealmObjectSchema createRealmObjectSchema(RealmSchema realmSchema) {
        if (!realmSchema.contains("CornFarmingDetail")) {
            RealmObjectSchema realmObjectSchema = realmSchema.create("CornFarmingDetail");
            realmObjectSchema.add("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
            realmObjectSchema.add("cfId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
            realmObjectSchema.add("content", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("sequence", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
            realmObjectSchema.add("type", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            return realmObjectSchema;
        }
        return realmSchema.get("CornFarmingDetail");
    }

    public static CornFarmingDetailColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_CornFarmingDetail")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'CornFarmingDetail' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_CornFarmingDetail");
        final long columnCount = table.getColumnCount();
        if (columnCount != 5) {
            if (columnCount < 5) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 5 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 5 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 5 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final CornFarmingDetailColumnInfo columnInfo = new CornFarmingDetailColumnInfo(sharedRealm, table);

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
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'id' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.idIndex) && table.findFirstNull(columnInfo.idIndex) != Table.NO_MATCH) {
            throw new IllegalStateException("Cannot migrate an object with null value in field 'id'. Either maintain the same type for primary key field 'id', or remove the object with null value before migration.");
        }
        if (!table.hasSearchIndex(table.getColumnIndex("id"))) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Index not defined for field 'id' in existing Realm file. Either set @Index or migrate using io.realm.internal.Table.removeSearchIndex().");
        }
        if (!columnTypes.containsKey("cfId")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'cfId' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("cfId") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'cfId' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.cfIdIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'cfId' does support null values in the existing Realm file. Use corresponding boxed type for field 'cfId' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("content")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'content' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("content") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'content' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.contentIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'content' is required. Either set @Required to field 'content' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("sequence")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'sequence' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("sequence") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'int' for field 'sequence' in existing Realm file.");
        }
        if (table.isColumnNullable(columnInfo.sequenceIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'sequence' does support null values in the existing Realm file. Use corresponding boxed type for field 'sequence' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("type")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'type' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("type") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'type' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.typeIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'type' is required. Either set @Required to field 'type' or migrate using RealmObjectSchema.setNullable().");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_CornFarmingDetail";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.vuforia.samples.MainApp.model.CornFarmingDetail createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.vuforia.samples.MainApp.model.CornFarmingDetail obj = null;
        if (update) {
            Table table = realm.getTable(com.vuforia.samples.MainApp.model.CornFarmingDetail.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(com.vuforia.samples.MainApp.model.CornFarmingDetail.class), false, Collections.<String> emptyList());
                    obj = new io.realm.CornFarmingDetailRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.CornFarmingDetailRealmProxy) realm.createObjectInternal(com.vuforia.samples.MainApp.model.CornFarmingDetail.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.CornFarmingDetailRealmProxy) realm.createObjectInternal(com.vuforia.samples.MainApp.model.CornFarmingDetail.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }
        if (json.has("cfId")) {
            if (json.isNull("cfId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'cfId' to null.");
            } else {
                ((CornFarmingDetailRealmProxyInterface) obj).realmSet$cfId((int) json.getInt("cfId"));
            }
        }
        if (json.has("content")) {
            if (json.isNull("content")) {
                ((CornFarmingDetailRealmProxyInterface) obj).realmSet$content(null);
            } else {
                ((CornFarmingDetailRealmProxyInterface) obj).realmSet$content((String) json.getString("content"));
            }
        }
        if (json.has("sequence")) {
            if (json.isNull("sequence")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'sequence' to null.");
            } else {
                ((CornFarmingDetailRealmProxyInterface) obj).realmSet$sequence((int) json.getInt("sequence"));
            }
        }
        if (json.has("type")) {
            if (json.isNull("type")) {
                ((CornFarmingDetailRealmProxyInterface) obj).realmSet$type(null);
            } else {
                ((CornFarmingDetailRealmProxyInterface) obj).realmSet$type((String) json.getString("type"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.vuforia.samples.MainApp.model.CornFarmingDetail createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        com.vuforia.samples.MainApp.model.CornFarmingDetail obj = new com.vuforia.samples.MainApp.model.CornFarmingDetail();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                } else {
                    ((CornFarmingDetailRealmProxyInterface) obj).realmSet$id((int) reader.nextInt());
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("cfId")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'cfId' to null.");
                } else {
                    ((CornFarmingDetailRealmProxyInterface) obj).realmSet$cfId((int) reader.nextInt());
                }
            } else if (name.equals("content")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((CornFarmingDetailRealmProxyInterface) obj).realmSet$content(null);
                } else {
                    ((CornFarmingDetailRealmProxyInterface) obj).realmSet$content((String) reader.nextString());
                }
            } else if (name.equals("sequence")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'sequence' to null.");
                } else {
                    ((CornFarmingDetailRealmProxyInterface) obj).realmSet$sequence((int) reader.nextInt());
                }
            } else if (name.equals("type")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((CornFarmingDetailRealmProxyInterface) obj).realmSet$type(null);
                } else {
                    ((CornFarmingDetailRealmProxyInterface) obj).realmSet$type((String) reader.nextString());
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

    public static com.vuforia.samples.MainApp.model.CornFarmingDetail copyOrUpdate(Realm realm, com.vuforia.samples.MainApp.model.CornFarmingDetail object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.vuforia.samples.MainApp.model.CornFarmingDetail) cachedRealmObject;
        } else {
            com.vuforia.samples.MainApp.model.CornFarmingDetail realmObject = null;
            boolean canUpdate = update;
            if (canUpdate) {
                Table table = realm.getTable(com.vuforia.samples.MainApp.model.CornFarmingDetail.class);
                long pkColumnIndex = table.getPrimaryKey();
                long rowIndex = table.findFirstLong(pkColumnIndex, ((CornFarmingDetailRealmProxyInterface) object).realmGet$id());
                if (rowIndex != Table.NO_MATCH) {
                    try {
                        objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(com.vuforia.samples.MainApp.model.CornFarmingDetail.class), false, Collections.<String> emptyList());
                        realmObject = new io.realm.CornFarmingDetailRealmProxy();
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

    public static com.vuforia.samples.MainApp.model.CornFarmingDetail copy(Realm realm, com.vuforia.samples.MainApp.model.CornFarmingDetail newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.vuforia.samples.MainApp.model.CornFarmingDetail) cachedRealmObject;
        } else {
            // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
            com.vuforia.samples.MainApp.model.CornFarmingDetail realmObject = realm.createObjectInternal(com.vuforia.samples.MainApp.model.CornFarmingDetail.class, ((CornFarmingDetailRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
            cache.put(newObject, (RealmObjectProxy) realmObject);
            ((CornFarmingDetailRealmProxyInterface) realmObject).realmSet$cfId(((CornFarmingDetailRealmProxyInterface) newObject).realmGet$cfId());
            ((CornFarmingDetailRealmProxyInterface) realmObject).realmSet$content(((CornFarmingDetailRealmProxyInterface) newObject).realmGet$content());
            ((CornFarmingDetailRealmProxyInterface) realmObject).realmSet$sequence(((CornFarmingDetailRealmProxyInterface) newObject).realmGet$sequence());
            ((CornFarmingDetailRealmProxyInterface) realmObject).realmSet$type(((CornFarmingDetailRealmProxyInterface) newObject).realmGet$type());
            return realmObject;
        }
    }

    public static long insert(Realm realm, com.vuforia.samples.MainApp.model.CornFarmingDetail object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.vuforia.samples.MainApp.model.CornFarmingDetail.class);
        long tableNativePtr = table.getNativePtr();
        CornFarmingDetailColumnInfo columnInfo = (CornFarmingDetailColumnInfo) realm.schema.getColumnInfo(com.vuforia.samples.MainApp.model.CornFarmingDetail.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((CornFarmingDetailRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((CornFarmingDetailRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, ((CornFarmingDetailRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.cfIdIndex, rowIndex, ((CornFarmingDetailRealmProxyInterface)object).realmGet$cfId(), false);
        String realmGet$content = ((CornFarmingDetailRealmProxyInterface)object).realmGet$content();
        if (realmGet$content != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contentIndex, rowIndex, realmGet$content, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.sequenceIndex, rowIndex, ((CornFarmingDetailRealmProxyInterface)object).realmGet$sequence(), false);
        String realmGet$type = ((CornFarmingDetailRealmProxyInterface)object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.vuforia.samples.MainApp.model.CornFarmingDetail.class);
        long tableNativePtr = table.getNativePtr();
        CornFarmingDetailColumnInfo columnInfo = (CornFarmingDetailColumnInfo) realm.schema.getColumnInfo(com.vuforia.samples.MainApp.model.CornFarmingDetail.class);
        long pkColumnIndex = table.getPrimaryKey();
        com.vuforia.samples.MainApp.model.CornFarmingDetail object = null;
        while (objects.hasNext()) {
            object = (com.vuforia.samples.MainApp.model.CornFarmingDetail) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                long rowIndex = Table.NO_MATCH;
                Object primaryKeyValue = ((CornFarmingDetailRealmProxyInterface) object).realmGet$id();
                if (primaryKeyValue != null) {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((CornFarmingDetailRealmProxyInterface) object).realmGet$id());
                }
                if (rowIndex == Table.NO_MATCH) {
                    rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, ((CornFarmingDetailRealmProxyInterface) object).realmGet$id());
                } else {
                    Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
                }
                cache.put(object, rowIndex);
                Table.nativeSetLong(tableNativePtr, columnInfo.cfIdIndex, rowIndex, ((CornFarmingDetailRealmProxyInterface)object).realmGet$cfId(), false);
                String realmGet$content = ((CornFarmingDetailRealmProxyInterface)object).realmGet$content();
                if (realmGet$content != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.contentIndex, rowIndex, realmGet$content, false);
                }
                Table.nativeSetLong(tableNativePtr, columnInfo.sequenceIndex, rowIndex, ((CornFarmingDetailRealmProxyInterface)object).realmGet$sequence(), false);
                String realmGet$type = ((CornFarmingDetailRealmProxyInterface)object).realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.vuforia.samples.MainApp.model.CornFarmingDetail object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.vuforia.samples.MainApp.model.CornFarmingDetail.class);
        long tableNativePtr = table.getNativePtr();
        CornFarmingDetailColumnInfo columnInfo = (CornFarmingDetailColumnInfo) realm.schema.getColumnInfo(com.vuforia.samples.MainApp.model.CornFarmingDetail.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((CornFarmingDetailRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((CornFarmingDetailRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, ((CornFarmingDetailRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.cfIdIndex, rowIndex, ((CornFarmingDetailRealmProxyInterface)object).realmGet$cfId(), false);
        String realmGet$content = ((CornFarmingDetailRealmProxyInterface)object).realmGet$content();
        if (realmGet$content != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contentIndex, rowIndex, realmGet$content, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.contentIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.sequenceIndex, rowIndex, ((CornFarmingDetailRealmProxyInterface)object).realmGet$sequence(), false);
        String realmGet$type = ((CornFarmingDetailRealmProxyInterface)object).realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.typeIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.vuforia.samples.MainApp.model.CornFarmingDetail.class);
        long tableNativePtr = table.getNativePtr();
        CornFarmingDetailColumnInfo columnInfo = (CornFarmingDetailColumnInfo) realm.schema.getColumnInfo(com.vuforia.samples.MainApp.model.CornFarmingDetail.class);
        long pkColumnIndex = table.getPrimaryKey();
        com.vuforia.samples.MainApp.model.CornFarmingDetail object = null;
        while (objects.hasNext()) {
            object = (com.vuforia.samples.MainApp.model.CornFarmingDetail) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                long rowIndex = Table.NO_MATCH;
                Object primaryKeyValue = ((CornFarmingDetailRealmProxyInterface) object).realmGet$id();
                if (primaryKeyValue != null) {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((CornFarmingDetailRealmProxyInterface) object).realmGet$id());
                }
                if (rowIndex == Table.NO_MATCH) {
                    rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, ((CornFarmingDetailRealmProxyInterface) object).realmGet$id());
                }
                cache.put(object, rowIndex);
                Table.nativeSetLong(tableNativePtr, columnInfo.cfIdIndex, rowIndex, ((CornFarmingDetailRealmProxyInterface)object).realmGet$cfId(), false);
                String realmGet$content = ((CornFarmingDetailRealmProxyInterface)object).realmGet$content();
                if (realmGet$content != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.contentIndex, rowIndex, realmGet$content, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.contentIndex, rowIndex, false);
                }
                Table.nativeSetLong(tableNativePtr, columnInfo.sequenceIndex, rowIndex, ((CornFarmingDetailRealmProxyInterface)object).realmGet$sequence(), false);
                String realmGet$type = ((CornFarmingDetailRealmProxyInterface)object).realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.typeIndex, rowIndex, realmGet$type, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.typeIndex, rowIndex, false);
                }
            }
        }
    }

    public static com.vuforia.samples.MainApp.model.CornFarmingDetail createDetachedCopy(com.vuforia.samples.MainApp.model.CornFarmingDetail realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.vuforia.samples.MainApp.model.CornFarmingDetail unmanagedObject;
        if (cachedObject != null) {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.vuforia.samples.MainApp.model.CornFarmingDetail)cachedObject.object;
            } else {
                unmanagedObject = (com.vuforia.samples.MainApp.model.CornFarmingDetail)cachedObject.object;
                cachedObject.minDepth = currentDepth;
            }
        } else {
            unmanagedObject = new com.vuforia.samples.MainApp.model.CornFarmingDetail();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        }
        ((CornFarmingDetailRealmProxyInterface) unmanagedObject).realmSet$id(((CornFarmingDetailRealmProxyInterface) realmObject).realmGet$id());
        ((CornFarmingDetailRealmProxyInterface) unmanagedObject).realmSet$cfId(((CornFarmingDetailRealmProxyInterface) realmObject).realmGet$cfId());
        ((CornFarmingDetailRealmProxyInterface) unmanagedObject).realmSet$content(((CornFarmingDetailRealmProxyInterface) realmObject).realmGet$content());
        ((CornFarmingDetailRealmProxyInterface) unmanagedObject).realmSet$sequence(((CornFarmingDetailRealmProxyInterface) realmObject).realmGet$sequence());
        ((CornFarmingDetailRealmProxyInterface) unmanagedObject).realmSet$type(((CornFarmingDetailRealmProxyInterface) realmObject).realmGet$type());
        return unmanagedObject;
    }

    static com.vuforia.samples.MainApp.model.CornFarmingDetail update(Realm realm, com.vuforia.samples.MainApp.model.CornFarmingDetail realmObject, com.vuforia.samples.MainApp.model.CornFarmingDetail newObject, Map<RealmModel, RealmObjectProxy> cache) {
        ((CornFarmingDetailRealmProxyInterface) realmObject).realmSet$cfId(((CornFarmingDetailRealmProxyInterface) newObject).realmGet$cfId());
        ((CornFarmingDetailRealmProxyInterface) realmObject).realmSet$content(((CornFarmingDetailRealmProxyInterface) newObject).realmGet$content());
        ((CornFarmingDetailRealmProxyInterface) realmObject).realmSet$sequence(((CornFarmingDetailRealmProxyInterface) newObject).realmGet$sequence());
        ((CornFarmingDetailRealmProxyInterface) realmObject).realmSet$type(((CornFarmingDetailRealmProxyInterface) newObject).realmGet$type());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("CornFarmingDetail = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{cfId:");
        stringBuilder.append(realmGet$cfId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{content:");
        stringBuilder.append(realmGet$content() != null ? realmGet$content() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{sequence:");
        stringBuilder.append(realmGet$sequence());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{type:");
        stringBuilder.append(realmGet$type() != null ? realmGet$type() : "null");
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
        CornFarmingDetailRealmProxy aCornFarmingDetail = (CornFarmingDetailRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aCornFarmingDetail.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aCornFarmingDetail.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aCornFarmingDetail.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
