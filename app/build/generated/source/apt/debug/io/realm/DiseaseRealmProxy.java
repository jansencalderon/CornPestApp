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

public class DiseaseRealmProxy extends com.vuforia.samples.MainApp.model.Disease
    implements RealmObjectProxy, DiseaseRealmProxyInterface {

    static final class DiseaseColumnInfo extends ColumnInfo {
        long idIndex;
        long disNameIndex;
        long disDescIndex;
        long disManagementIndex;
        long disSymptomsIndex;
        long disImageIndex;
        long imageRecognitionIndex;

        DiseaseColumnInfo(SharedRealm realm, Table table) {
            super(7);
            this.idIndex = addColumnDetails(table, "id", RealmFieldType.INTEGER);
            this.disNameIndex = addColumnDetails(table, "disName", RealmFieldType.STRING);
            this.disDescIndex = addColumnDetails(table, "disDesc", RealmFieldType.STRING);
            this.disManagementIndex = addColumnDetails(table, "disManagement", RealmFieldType.STRING);
            this.disSymptomsIndex = addColumnDetails(table, "disSymptoms", RealmFieldType.STRING);
            this.disImageIndex = addColumnDetails(table, "disImage", RealmFieldType.STRING);
            this.imageRecognitionIndex = addColumnDetails(table, "imageRecognition", RealmFieldType.STRING);
        }

        DiseaseColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new DiseaseColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final DiseaseColumnInfo src = (DiseaseColumnInfo) rawSrc;
            final DiseaseColumnInfo dst = (DiseaseColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.disNameIndex = src.disNameIndex;
            dst.disDescIndex = src.disDescIndex;
            dst.disManagementIndex = src.disManagementIndex;
            dst.disSymptomsIndex = src.disSymptomsIndex;
            dst.disImageIndex = src.disImageIndex;
            dst.imageRecognitionIndex = src.imageRecognitionIndex;
        }
    }

    private DiseaseColumnInfo columnInfo;
    private ProxyState<com.vuforia.samples.MainApp.model.Disease> proxyState;
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("id");
        fieldNames.add("disName");
        fieldNames.add("disDesc");
        fieldNames.add("disManagement");
        fieldNames.add("disSymptoms");
        fieldNames.add("disImage");
        fieldNames.add("imageRecognition");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    DiseaseRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (DiseaseColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.vuforia.samples.MainApp.model.Disease>(this);
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
    public String realmGet$disName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.disNameIndex);
    }

    @Override
    public void realmSet$disName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.disNameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.disNameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.disNameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.disNameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$disDesc() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.disDescIndex);
    }

    @Override
    public void realmSet$disDesc(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.disDescIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.disDescIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.disDescIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.disDescIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$disManagement() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.disManagementIndex);
    }

    @Override
    public void realmSet$disManagement(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.disManagementIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.disManagementIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.disManagementIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.disManagementIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$disSymptoms() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.disSymptomsIndex);
    }

    @Override
    public void realmSet$disSymptoms(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.disSymptomsIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.disSymptomsIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.disSymptomsIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.disSymptomsIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$disImage() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.disImageIndex);
    }

    @Override
    public void realmSet$disImage(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.disImageIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.disImageIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.disImageIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.disImageIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$imageRecognition() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.imageRecognitionIndex);
    }

    @Override
    public void realmSet$imageRecognition(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.imageRecognitionIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.imageRecognitionIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.imageRecognitionIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.imageRecognitionIndex, value);
    }

    public static RealmObjectSchema createRealmObjectSchema(RealmSchema realmSchema) {
        if (!realmSchema.contains("Disease")) {
            RealmObjectSchema realmObjectSchema = realmSchema.create("Disease");
            realmObjectSchema.add("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
            realmObjectSchema.add("disName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("disDesc", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("disManagement", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("disSymptoms", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("disImage", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("imageRecognition", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            return realmObjectSchema;
        }
        return realmSchema.get("Disease");
    }

    public static DiseaseColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_Disease")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'Disease' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_Disease");
        final long columnCount = table.getColumnCount();
        if (columnCount != 7) {
            if (columnCount < 7) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 7 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 7 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 7 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final DiseaseColumnInfo columnInfo = new DiseaseColumnInfo(sharedRealm, table);

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
        if (!columnTypes.containsKey("disName")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'disName' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("disName") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'disName' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.disNameIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'disName' is required. Either set @Required to field 'disName' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("disDesc")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'disDesc' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("disDesc") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'disDesc' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.disDescIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'disDesc' is required. Either set @Required to field 'disDesc' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("disManagement")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'disManagement' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("disManagement") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'disManagement' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.disManagementIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'disManagement' is required. Either set @Required to field 'disManagement' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("disSymptoms")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'disSymptoms' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("disSymptoms") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'disSymptoms' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.disSymptomsIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'disSymptoms' is required. Either set @Required to field 'disSymptoms' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("disImage")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'disImage' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("disImage") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'disImage' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.disImageIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'disImage' is required. Either set @Required to field 'disImage' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("imageRecognition")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'imageRecognition' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("imageRecognition") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'imageRecognition' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.imageRecognitionIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'imageRecognition' is required. Either set @Required to field 'imageRecognition' or migrate using RealmObjectSchema.setNullable().");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_Disease";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.vuforia.samples.MainApp.model.Disease createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.vuforia.samples.MainApp.model.Disease obj = null;
        if (update) {
            Table table = realm.getTable(com.vuforia.samples.MainApp.model.Disease.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(com.vuforia.samples.MainApp.model.Disease.class), false, Collections.<String> emptyList());
                    obj = new io.realm.DiseaseRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.DiseaseRealmProxy) realm.createObjectInternal(com.vuforia.samples.MainApp.model.Disease.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.DiseaseRealmProxy) realm.createObjectInternal(com.vuforia.samples.MainApp.model.Disease.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }
        if (json.has("disName")) {
            if (json.isNull("disName")) {
                ((DiseaseRealmProxyInterface) obj).realmSet$disName(null);
            } else {
                ((DiseaseRealmProxyInterface) obj).realmSet$disName((String) json.getString("disName"));
            }
        }
        if (json.has("disDesc")) {
            if (json.isNull("disDesc")) {
                ((DiseaseRealmProxyInterface) obj).realmSet$disDesc(null);
            } else {
                ((DiseaseRealmProxyInterface) obj).realmSet$disDesc((String) json.getString("disDesc"));
            }
        }
        if (json.has("disManagement")) {
            if (json.isNull("disManagement")) {
                ((DiseaseRealmProxyInterface) obj).realmSet$disManagement(null);
            } else {
                ((DiseaseRealmProxyInterface) obj).realmSet$disManagement((String) json.getString("disManagement"));
            }
        }
        if (json.has("disSymptoms")) {
            if (json.isNull("disSymptoms")) {
                ((DiseaseRealmProxyInterface) obj).realmSet$disSymptoms(null);
            } else {
                ((DiseaseRealmProxyInterface) obj).realmSet$disSymptoms((String) json.getString("disSymptoms"));
            }
        }
        if (json.has("disImage")) {
            if (json.isNull("disImage")) {
                ((DiseaseRealmProxyInterface) obj).realmSet$disImage(null);
            } else {
                ((DiseaseRealmProxyInterface) obj).realmSet$disImage((String) json.getString("disImage"));
            }
        }
        if (json.has("imageRecognition")) {
            if (json.isNull("imageRecognition")) {
                ((DiseaseRealmProxyInterface) obj).realmSet$imageRecognition(null);
            } else {
                ((DiseaseRealmProxyInterface) obj).realmSet$imageRecognition((String) json.getString("imageRecognition"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.vuforia.samples.MainApp.model.Disease createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        com.vuforia.samples.MainApp.model.Disease obj = new com.vuforia.samples.MainApp.model.Disease();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                } else {
                    ((DiseaseRealmProxyInterface) obj).realmSet$id((int) reader.nextInt());
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("disName")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((DiseaseRealmProxyInterface) obj).realmSet$disName(null);
                } else {
                    ((DiseaseRealmProxyInterface) obj).realmSet$disName((String) reader.nextString());
                }
            } else if (name.equals("disDesc")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((DiseaseRealmProxyInterface) obj).realmSet$disDesc(null);
                } else {
                    ((DiseaseRealmProxyInterface) obj).realmSet$disDesc((String) reader.nextString());
                }
            } else if (name.equals("disManagement")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((DiseaseRealmProxyInterface) obj).realmSet$disManagement(null);
                } else {
                    ((DiseaseRealmProxyInterface) obj).realmSet$disManagement((String) reader.nextString());
                }
            } else if (name.equals("disSymptoms")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((DiseaseRealmProxyInterface) obj).realmSet$disSymptoms(null);
                } else {
                    ((DiseaseRealmProxyInterface) obj).realmSet$disSymptoms((String) reader.nextString());
                }
            } else if (name.equals("disImage")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((DiseaseRealmProxyInterface) obj).realmSet$disImage(null);
                } else {
                    ((DiseaseRealmProxyInterface) obj).realmSet$disImage((String) reader.nextString());
                }
            } else if (name.equals("imageRecognition")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((DiseaseRealmProxyInterface) obj).realmSet$imageRecognition(null);
                } else {
                    ((DiseaseRealmProxyInterface) obj).realmSet$imageRecognition((String) reader.nextString());
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

    public static com.vuforia.samples.MainApp.model.Disease copyOrUpdate(Realm realm, com.vuforia.samples.MainApp.model.Disease object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.vuforia.samples.MainApp.model.Disease) cachedRealmObject;
        } else {
            com.vuforia.samples.MainApp.model.Disease realmObject = null;
            boolean canUpdate = update;
            if (canUpdate) {
                Table table = realm.getTable(com.vuforia.samples.MainApp.model.Disease.class);
                long pkColumnIndex = table.getPrimaryKey();
                long rowIndex = table.findFirstLong(pkColumnIndex, ((DiseaseRealmProxyInterface) object).realmGet$id());
                if (rowIndex != Table.NO_MATCH) {
                    try {
                        objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(com.vuforia.samples.MainApp.model.Disease.class), false, Collections.<String> emptyList());
                        realmObject = new io.realm.DiseaseRealmProxy();
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

    public static com.vuforia.samples.MainApp.model.Disease copy(Realm realm, com.vuforia.samples.MainApp.model.Disease newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.vuforia.samples.MainApp.model.Disease) cachedRealmObject;
        } else {
            // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
            com.vuforia.samples.MainApp.model.Disease realmObject = realm.createObjectInternal(com.vuforia.samples.MainApp.model.Disease.class, ((DiseaseRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
            cache.put(newObject, (RealmObjectProxy) realmObject);
            ((DiseaseRealmProxyInterface) realmObject).realmSet$disName(((DiseaseRealmProxyInterface) newObject).realmGet$disName());
            ((DiseaseRealmProxyInterface) realmObject).realmSet$disDesc(((DiseaseRealmProxyInterface) newObject).realmGet$disDesc());
            ((DiseaseRealmProxyInterface) realmObject).realmSet$disManagement(((DiseaseRealmProxyInterface) newObject).realmGet$disManagement());
            ((DiseaseRealmProxyInterface) realmObject).realmSet$disSymptoms(((DiseaseRealmProxyInterface) newObject).realmGet$disSymptoms());
            ((DiseaseRealmProxyInterface) realmObject).realmSet$disImage(((DiseaseRealmProxyInterface) newObject).realmGet$disImage());
            ((DiseaseRealmProxyInterface) realmObject).realmSet$imageRecognition(((DiseaseRealmProxyInterface) newObject).realmGet$imageRecognition());
            return realmObject;
        }
    }

    public static long insert(Realm realm, com.vuforia.samples.MainApp.model.Disease object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.vuforia.samples.MainApp.model.Disease.class);
        long tableNativePtr = table.getNativePtr();
        DiseaseColumnInfo columnInfo = (DiseaseColumnInfo) realm.schema.getColumnInfo(com.vuforia.samples.MainApp.model.Disease.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((DiseaseRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((DiseaseRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, ((DiseaseRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$disName = ((DiseaseRealmProxyInterface)object).realmGet$disName();
        if (realmGet$disName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.disNameIndex, rowIndex, realmGet$disName, false);
        }
        String realmGet$disDesc = ((DiseaseRealmProxyInterface)object).realmGet$disDesc();
        if (realmGet$disDesc != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.disDescIndex, rowIndex, realmGet$disDesc, false);
        }
        String realmGet$disManagement = ((DiseaseRealmProxyInterface)object).realmGet$disManagement();
        if (realmGet$disManagement != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.disManagementIndex, rowIndex, realmGet$disManagement, false);
        }
        String realmGet$disSymptoms = ((DiseaseRealmProxyInterface)object).realmGet$disSymptoms();
        if (realmGet$disSymptoms != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.disSymptomsIndex, rowIndex, realmGet$disSymptoms, false);
        }
        String realmGet$disImage = ((DiseaseRealmProxyInterface)object).realmGet$disImage();
        if (realmGet$disImage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.disImageIndex, rowIndex, realmGet$disImage, false);
        }
        String realmGet$imageRecognition = ((DiseaseRealmProxyInterface)object).realmGet$imageRecognition();
        if (realmGet$imageRecognition != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.imageRecognitionIndex, rowIndex, realmGet$imageRecognition, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.vuforia.samples.MainApp.model.Disease.class);
        long tableNativePtr = table.getNativePtr();
        DiseaseColumnInfo columnInfo = (DiseaseColumnInfo) realm.schema.getColumnInfo(com.vuforia.samples.MainApp.model.Disease.class);
        long pkColumnIndex = table.getPrimaryKey();
        com.vuforia.samples.MainApp.model.Disease object = null;
        while (objects.hasNext()) {
            object = (com.vuforia.samples.MainApp.model.Disease) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                long rowIndex = Table.NO_MATCH;
                Object primaryKeyValue = ((DiseaseRealmProxyInterface) object).realmGet$id();
                if (primaryKeyValue != null) {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((DiseaseRealmProxyInterface) object).realmGet$id());
                }
                if (rowIndex == Table.NO_MATCH) {
                    rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, ((DiseaseRealmProxyInterface) object).realmGet$id());
                } else {
                    Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
                }
                cache.put(object, rowIndex);
                String realmGet$disName = ((DiseaseRealmProxyInterface)object).realmGet$disName();
                if (realmGet$disName != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.disNameIndex, rowIndex, realmGet$disName, false);
                }
                String realmGet$disDesc = ((DiseaseRealmProxyInterface)object).realmGet$disDesc();
                if (realmGet$disDesc != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.disDescIndex, rowIndex, realmGet$disDesc, false);
                }
                String realmGet$disManagement = ((DiseaseRealmProxyInterface)object).realmGet$disManagement();
                if (realmGet$disManagement != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.disManagementIndex, rowIndex, realmGet$disManagement, false);
                }
                String realmGet$disSymptoms = ((DiseaseRealmProxyInterface)object).realmGet$disSymptoms();
                if (realmGet$disSymptoms != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.disSymptomsIndex, rowIndex, realmGet$disSymptoms, false);
                }
                String realmGet$disImage = ((DiseaseRealmProxyInterface)object).realmGet$disImage();
                if (realmGet$disImage != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.disImageIndex, rowIndex, realmGet$disImage, false);
                }
                String realmGet$imageRecognition = ((DiseaseRealmProxyInterface)object).realmGet$imageRecognition();
                if (realmGet$imageRecognition != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.imageRecognitionIndex, rowIndex, realmGet$imageRecognition, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.vuforia.samples.MainApp.model.Disease object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.vuforia.samples.MainApp.model.Disease.class);
        long tableNativePtr = table.getNativePtr();
        DiseaseColumnInfo columnInfo = (DiseaseColumnInfo) realm.schema.getColumnInfo(com.vuforia.samples.MainApp.model.Disease.class);
        long pkColumnIndex = table.getPrimaryKey();
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((DiseaseRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((DiseaseRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, ((DiseaseRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        String realmGet$disName = ((DiseaseRealmProxyInterface)object).realmGet$disName();
        if (realmGet$disName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.disNameIndex, rowIndex, realmGet$disName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.disNameIndex, rowIndex, false);
        }
        String realmGet$disDesc = ((DiseaseRealmProxyInterface)object).realmGet$disDesc();
        if (realmGet$disDesc != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.disDescIndex, rowIndex, realmGet$disDesc, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.disDescIndex, rowIndex, false);
        }
        String realmGet$disManagement = ((DiseaseRealmProxyInterface)object).realmGet$disManagement();
        if (realmGet$disManagement != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.disManagementIndex, rowIndex, realmGet$disManagement, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.disManagementIndex, rowIndex, false);
        }
        String realmGet$disSymptoms = ((DiseaseRealmProxyInterface)object).realmGet$disSymptoms();
        if (realmGet$disSymptoms != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.disSymptomsIndex, rowIndex, realmGet$disSymptoms, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.disSymptomsIndex, rowIndex, false);
        }
        String realmGet$disImage = ((DiseaseRealmProxyInterface)object).realmGet$disImage();
        if (realmGet$disImage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.disImageIndex, rowIndex, realmGet$disImage, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.disImageIndex, rowIndex, false);
        }
        String realmGet$imageRecognition = ((DiseaseRealmProxyInterface)object).realmGet$imageRecognition();
        if (realmGet$imageRecognition != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.imageRecognitionIndex, rowIndex, realmGet$imageRecognition, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.imageRecognitionIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.vuforia.samples.MainApp.model.Disease.class);
        long tableNativePtr = table.getNativePtr();
        DiseaseColumnInfo columnInfo = (DiseaseColumnInfo) realm.schema.getColumnInfo(com.vuforia.samples.MainApp.model.Disease.class);
        long pkColumnIndex = table.getPrimaryKey();
        com.vuforia.samples.MainApp.model.Disease object = null;
        while (objects.hasNext()) {
            object = (com.vuforia.samples.MainApp.model.Disease) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                long rowIndex = Table.NO_MATCH;
                Object primaryKeyValue = ((DiseaseRealmProxyInterface) object).realmGet$id();
                if (primaryKeyValue != null) {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((DiseaseRealmProxyInterface) object).realmGet$id());
                }
                if (rowIndex == Table.NO_MATCH) {
                    rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, ((DiseaseRealmProxyInterface) object).realmGet$id());
                }
                cache.put(object, rowIndex);
                String realmGet$disName = ((DiseaseRealmProxyInterface)object).realmGet$disName();
                if (realmGet$disName != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.disNameIndex, rowIndex, realmGet$disName, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.disNameIndex, rowIndex, false);
                }
                String realmGet$disDesc = ((DiseaseRealmProxyInterface)object).realmGet$disDesc();
                if (realmGet$disDesc != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.disDescIndex, rowIndex, realmGet$disDesc, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.disDescIndex, rowIndex, false);
                }
                String realmGet$disManagement = ((DiseaseRealmProxyInterface)object).realmGet$disManagement();
                if (realmGet$disManagement != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.disManagementIndex, rowIndex, realmGet$disManagement, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.disManagementIndex, rowIndex, false);
                }
                String realmGet$disSymptoms = ((DiseaseRealmProxyInterface)object).realmGet$disSymptoms();
                if (realmGet$disSymptoms != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.disSymptomsIndex, rowIndex, realmGet$disSymptoms, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.disSymptomsIndex, rowIndex, false);
                }
                String realmGet$disImage = ((DiseaseRealmProxyInterface)object).realmGet$disImage();
                if (realmGet$disImage != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.disImageIndex, rowIndex, realmGet$disImage, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.disImageIndex, rowIndex, false);
                }
                String realmGet$imageRecognition = ((DiseaseRealmProxyInterface)object).realmGet$imageRecognition();
                if (realmGet$imageRecognition != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.imageRecognitionIndex, rowIndex, realmGet$imageRecognition, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.imageRecognitionIndex, rowIndex, false);
                }
            }
        }
    }

    public static com.vuforia.samples.MainApp.model.Disease createDetachedCopy(com.vuforia.samples.MainApp.model.Disease realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.vuforia.samples.MainApp.model.Disease unmanagedObject;
        if (cachedObject != null) {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.vuforia.samples.MainApp.model.Disease)cachedObject.object;
            } else {
                unmanagedObject = (com.vuforia.samples.MainApp.model.Disease)cachedObject.object;
                cachedObject.minDepth = currentDepth;
            }
        } else {
            unmanagedObject = new com.vuforia.samples.MainApp.model.Disease();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        }
        ((DiseaseRealmProxyInterface) unmanagedObject).realmSet$id(((DiseaseRealmProxyInterface) realmObject).realmGet$id());
        ((DiseaseRealmProxyInterface) unmanagedObject).realmSet$disName(((DiseaseRealmProxyInterface) realmObject).realmGet$disName());
        ((DiseaseRealmProxyInterface) unmanagedObject).realmSet$disDesc(((DiseaseRealmProxyInterface) realmObject).realmGet$disDesc());
        ((DiseaseRealmProxyInterface) unmanagedObject).realmSet$disManagement(((DiseaseRealmProxyInterface) realmObject).realmGet$disManagement());
        ((DiseaseRealmProxyInterface) unmanagedObject).realmSet$disSymptoms(((DiseaseRealmProxyInterface) realmObject).realmGet$disSymptoms());
        ((DiseaseRealmProxyInterface) unmanagedObject).realmSet$disImage(((DiseaseRealmProxyInterface) realmObject).realmGet$disImage());
        ((DiseaseRealmProxyInterface) unmanagedObject).realmSet$imageRecognition(((DiseaseRealmProxyInterface) realmObject).realmGet$imageRecognition());
        return unmanagedObject;
    }

    static com.vuforia.samples.MainApp.model.Disease update(Realm realm, com.vuforia.samples.MainApp.model.Disease realmObject, com.vuforia.samples.MainApp.model.Disease newObject, Map<RealmModel, RealmObjectProxy> cache) {
        ((DiseaseRealmProxyInterface) realmObject).realmSet$disName(((DiseaseRealmProxyInterface) newObject).realmGet$disName());
        ((DiseaseRealmProxyInterface) realmObject).realmSet$disDesc(((DiseaseRealmProxyInterface) newObject).realmGet$disDesc());
        ((DiseaseRealmProxyInterface) realmObject).realmSet$disManagement(((DiseaseRealmProxyInterface) newObject).realmGet$disManagement());
        ((DiseaseRealmProxyInterface) realmObject).realmSet$disSymptoms(((DiseaseRealmProxyInterface) newObject).realmGet$disSymptoms());
        ((DiseaseRealmProxyInterface) realmObject).realmSet$disImage(((DiseaseRealmProxyInterface) newObject).realmGet$disImage());
        ((DiseaseRealmProxyInterface) realmObject).realmSet$imageRecognition(((DiseaseRealmProxyInterface) newObject).realmGet$imageRecognition());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Disease = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{disName:");
        stringBuilder.append(realmGet$disName() != null ? realmGet$disName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{disDesc:");
        stringBuilder.append(realmGet$disDesc() != null ? realmGet$disDesc() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{disManagement:");
        stringBuilder.append(realmGet$disManagement() != null ? realmGet$disManagement() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{disSymptoms:");
        stringBuilder.append(realmGet$disSymptoms() != null ? realmGet$disSymptoms() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{disImage:");
        stringBuilder.append(realmGet$disImage() != null ? realmGet$disImage() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{imageRecognition:");
        stringBuilder.append(realmGet$imageRecognition() != null ? realmGet$imageRecognition() : "null");
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
        DiseaseRealmProxy aDisease = (DiseaseRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aDisease.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aDisease.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aDisease.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
