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

public class InsectRealmProxy extends com.vuforia.samples.MainApp.model.Insect
    implements RealmObjectProxy, InsectRealmProxyInterface {

    static final class InsectColumnInfo extends ColumnInfo {
        long idIndex;
        long insectNameIndex;
        long insectDescIndex;
        long insectTimeIndex;
        long insectSamplingIndex;
        long insectThresholdIndex;
        long insectManagementIndex;
        long insectImageIndex;
        long imageRecognitionIndex;

        InsectColumnInfo(SharedRealm realm, Table table) {
            super(9);
            this.idIndex = addColumnDetails(table, "id", RealmFieldType.INTEGER);
            this.insectNameIndex = addColumnDetails(table, "insectName", RealmFieldType.STRING);
            this.insectDescIndex = addColumnDetails(table, "insectDesc", RealmFieldType.STRING);
            this.insectTimeIndex = addColumnDetails(table, "insectTime", RealmFieldType.STRING);
            this.insectSamplingIndex = addColumnDetails(table, "insectSampling", RealmFieldType.STRING);
            this.insectThresholdIndex = addColumnDetails(table, "insectThreshold", RealmFieldType.STRING);
            this.insectManagementIndex = addColumnDetails(table, "insectManagement", RealmFieldType.STRING);
            this.insectImageIndex = addColumnDetails(table, "insectImage", RealmFieldType.STRING);
            this.imageRecognitionIndex = addColumnDetails(table, "imageRecognition", RealmFieldType.STRING);
        }

        InsectColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new InsectColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final InsectColumnInfo src = (InsectColumnInfo) rawSrc;
            final InsectColumnInfo dst = (InsectColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.insectNameIndex = src.insectNameIndex;
            dst.insectDescIndex = src.insectDescIndex;
            dst.insectTimeIndex = src.insectTimeIndex;
            dst.insectSamplingIndex = src.insectSamplingIndex;
            dst.insectThresholdIndex = src.insectThresholdIndex;
            dst.insectManagementIndex = src.insectManagementIndex;
            dst.insectImageIndex = src.insectImageIndex;
            dst.imageRecognitionIndex = src.imageRecognitionIndex;
        }
    }

    private InsectColumnInfo columnInfo;
    private ProxyState<com.vuforia.samples.MainApp.model.Insect> proxyState;
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("id");
        fieldNames.add("insectName");
        fieldNames.add("insectDesc");
        fieldNames.add("insectTime");
        fieldNames.add("insectSampling");
        fieldNames.add("insectThreshold");
        fieldNames.add("insectManagement");
        fieldNames.add("insectImage");
        fieldNames.add("imageRecognition");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    InsectRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (InsectColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.vuforia.samples.MainApp.model.Insect>(this);
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
    public String realmGet$insectName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.insectNameIndex);
    }

    @Override
    public void realmSet$insectName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.insectNameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.insectNameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.insectNameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.insectNameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$insectDesc() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.insectDescIndex);
    }

    @Override
    public void realmSet$insectDesc(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.insectDescIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.insectDescIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.insectDescIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.insectDescIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$insectTime() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.insectTimeIndex);
    }

    @Override
    public void realmSet$insectTime(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.insectTimeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.insectTimeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.insectTimeIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.insectTimeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$insectSampling() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.insectSamplingIndex);
    }

    @Override
    public void realmSet$insectSampling(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.insectSamplingIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.insectSamplingIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.insectSamplingIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.insectSamplingIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$insectThreshold() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.insectThresholdIndex);
    }

    @Override
    public void realmSet$insectThreshold(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.insectThresholdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.insectThresholdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.insectThresholdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.insectThresholdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$insectManagement() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.insectManagementIndex);
    }

    @Override
    public void realmSet$insectManagement(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.insectManagementIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.insectManagementIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.insectManagementIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.insectManagementIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$insectImage() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.insectImageIndex);
    }

    @Override
    public void realmSet$insectImage(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.insectImageIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.insectImageIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.insectImageIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.insectImageIndex, value);
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
        if (!realmSchema.contains("Insect")) {
            RealmObjectSchema realmObjectSchema = realmSchema.create("Insect");
            realmObjectSchema.add("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("insectName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("insectDesc", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("insectTime", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("insectSampling", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("insectThreshold", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("insectManagement", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("insectImage", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("imageRecognition", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            return realmObjectSchema;
        }
        return realmSchema.get("Insect");
    }

    public static InsectColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_Insect")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'Insect' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_Insect");
        final long columnCount = table.getColumnCount();
        if (columnCount != 9) {
            if (columnCount < 9) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 9 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 9 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 9 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final InsectColumnInfo columnInfo = new InsectColumnInfo(sharedRealm, table);

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
        if (!columnTypes.containsKey("insectName")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'insectName' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("insectName") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'insectName' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.insectNameIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'insectName' is required. Either set @Required to field 'insectName' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("insectDesc")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'insectDesc' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("insectDesc") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'insectDesc' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.insectDescIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'insectDesc' is required. Either set @Required to field 'insectDesc' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("insectTime")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'insectTime' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("insectTime") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'insectTime' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.insectTimeIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'insectTime' is required. Either set @Required to field 'insectTime' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("insectSampling")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'insectSampling' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("insectSampling") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'insectSampling' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.insectSamplingIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'insectSampling' is required. Either set @Required to field 'insectSampling' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("insectThreshold")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'insectThreshold' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("insectThreshold") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'insectThreshold' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.insectThresholdIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'insectThreshold' is required. Either set @Required to field 'insectThreshold' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("insectManagement")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'insectManagement' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("insectManagement") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'insectManagement' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.insectManagementIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'insectManagement' is required. Either set @Required to field 'insectManagement' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("insectImage")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'insectImage' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("insectImage") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'insectImage' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.insectImageIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'insectImage' is required. Either set @Required to field 'insectImage' or migrate using RealmObjectSchema.setNullable().");
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
        return "class_Insect";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.vuforia.samples.MainApp.model.Insect createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.vuforia.samples.MainApp.model.Insect obj = null;
        if (update) {
            Table table = realm.getTable(com.vuforia.samples.MainApp.model.Insect.class);
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
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(com.vuforia.samples.MainApp.model.Insect.class), false, Collections.<String> emptyList());
                    obj = new io.realm.InsectRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.InsectRealmProxy) realm.createObjectInternal(com.vuforia.samples.MainApp.model.Insect.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.InsectRealmProxy) realm.createObjectInternal(com.vuforia.samples.MainApp.model.Insect.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }
        if (json.has("insectName")) {
            if (json.isNull("insectName")) {
                ((InsectRealmProxyInterface) obj).realmSet$insectName(null);
            } else {
                ((InsectRealmProxyInterface) obj).realmSet$insectName((String) json.getString("insectName"));
            }
        }
        if (json.has("insectDesc")) {
            if (json.isNull("insectDesc")) {
                ((InsectRealmProxyInterface) obj).realmSet$insectDesc(null);
            } else {
                ((InsectRealmProxyInterface) obj).realmSet$insectDesc((String) json.getString("insectDesc"));
            }
        }
        if (json.has("insectTime")) {
            if (json.isNull("insectTime")) {
                ((InsectRealmProxyInterface) obj).realmSet$insectTime(null);
            } else {
                ((InsectRealmProxyInterface) obj).realmSet$insectTime((String) json.getString("insectTime"));
            }
        }
        if (json.has("insectSampling")) {
            if (json.isNull("insectSampling")) {
                ((InsectRealmProxyInterface) obj).realmSet$insectSampling(null);
            } else {
                ((InsectRealmProxyInterface) obj).realmSet$insectSampling((String) json.getString("insectSampling"));
            }
        }
        if (json.has("insectThreshold")) {
            if (json.isNull("insectThreshold")) {
                ((InsectRealmProxyInterface) obj).realmSet$insectThreshold(null);
            } else {
                ((InsectRealmProxyInterface) obj).realmSet$insectThreshold((String) json.getString("insectThreshold"));
            }
        }
        if (json.has("insectManagement")) {
            if (json.isNull("insectManagement")) {
                ((InsectRealmProxyInterface) obj).realmSet$insectManagement(null);
            } else {
                ((InsectRealmProxyInterface) obj).realmSet$insectManagement((String) json.getString("insectManagement"));
            }
        }
        if (json.has("insectImage")) {
            if (json.isNull("insectImage")) {
                ((InsectRealmProxyInterface) obj).realmSet$insectImage(null);
            } else {
                ((InsectRealmProxyInterface) obj).realmSet$insectImage((String) json.getString("insectImage"));
            }
        }
        if (json.has("imageRecognition")) {
            if (json.isNull("imageRecognition")) {
                ((InsectRealmProxyInterface) obj).realmSet$imageRecognition(null);
            } else {
                ((InsectRealmProxyInterface) obj).realmSet$imageRecognition((String) json.getString("imageRecognition"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.vuforia.samples.MainApp.model.Insect createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        com.vuforia.samples.MainApp.model.Insect obj = new com.vuforia.samples.MainApp.model.Insect();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((InsectRealmProxyInterface) obj).realmSet$id(null);
                } else {
                    ((InsectRealmProxyInterface) obj).realmSet$id((int) reader.nextInt());
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("insectName")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((InsectRealmProxyInterface) obj).realmSet$insectName(null);
                } else {
                    ((InsectRealmProxyInterface) obj).realmSet$insectName((String) reader.nextString());
                }
            } else if (name.equals("insectDesc")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((InsectRealmProxyInterface) obj).realmSet$insectDesc(null);
                } else {
                    ((InsectRealmProxyInterface) obj).realmSet$insectDesc((String) reader.nextString());
                }
            } else if (name.equals("insectTime")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((InsectRealmProxyInterface) obj).realmSet$insectTime(null);
                } else {
                    ((InsectRealmProxyInterface) obj).realmSet$insectTime((String) reader.nextString());
                }
            } else if (name.equals("insectSampling")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((InsectRealmProxyInterface) obj).realmSet$insectSampling(null);
                } else {
                    ((InsectRealmProxyInterface) obj).realmSet$insectSampling((String) reader.nextString());
                }
            } else if (name.equals("insectThreshold")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((InsectRealmProxyInterface) obj).realmSet$insectThreshold(null);
                } else {
                    ((InsectRealmProxyInterface) obj).realmSet$insectThreshold((String) reader.nextString());
                }
            } else if (name.equals("insectManagement")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((InsectRealmProxyInterface) obj).realmSet$insectManagement(null);
                } else {
                    ((InsectRealmProxyInterface) obj).realmSet$insectManagement((String) reader.nextString());
                }
            } else if (name.equals("insectImage")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((InsectRealmProxyInterface) obj).realmSet$insectImage(null);
                } else {
                    ((InsectRealmProxyInterface) obj).realmSet$insectImage((String) reader.nextString());
                }
            } else if (name.equals("imageRecognition")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((InsectRealmProxyInterface) obj).realmSet$imageRecognition(null);
                } else {
                    ((InsectRealmProxyInterface) obj).realmSet$imageRecognition((String) reader.nextString());
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

    public static com.vuforia.samples.MainApp.model.Insect copyOrUpdate(Realm realm, com.vuforia.samples.MainApp.model.Insect object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.vuforia.samples.MainApp.model.Insect) cachedRealmObject;
        } else {
            com.vuforia.samples.MainApp.model.Insect realmObject = null;
            boolean canUpdate = update;
            if (canUpdate) {
                Table table = realm.getTable(com.vuforia.samples.MainApp.model.Insect.class);
                long pkColumnIndex = table.getPrimaryKey();
                Number value = ((InsectRealmProxyInterface) object).realmGet$id();
                long rowIndex = Table.NO_MATCH;
                if (value == null) {
                    rowIndex = table.findFirstNull(pkColumnIndex);
                } else {
                    rowIndex = table.findFirstLong(pkColumnIndex, value.longValue());
                }
                if (rowIndex != Table.NO_MATCH) {
                    try {
                        objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(com.vuforia.samples.MainApp.model.Insect.class), false, Collections.<String> emptyList());
                        realmObject = new io.realm.InsectRealmProxy();
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

    public static com.vuforia.samples.MainApp.model.Insect copy(Realm realm, com.vuforia.samples.MainApp.model.Insect newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.vuforia.samples.MainApp.model.Insect) cachedRealmObject;
        } else {
            // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
            com.vuforia.samples.MainApp.model.Insect realmObject = realm.createObjectInternal(com.vuforia.samples.MainApp.model.Insect.class, ((InsectRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
            cache.put(newObject, (RealmObjectProxy) realmObject);
            ((InsectRealmProxyInterface) realmObject).realmSet$insectName(((InsectRealmProxyInterface) newObject).realmGet$insectName());
            ((InsectRealmProxyInterface) realmObject).realmSet$insectDesc(((InsectRealmProxyInterface) newObject).realmGet$insectDesc());
            ((InsectRealmProxyInterface) realmObject).realmSet$insectTime(((InsectRealmProxyInterface) newObject).realmGet$insectTime());
            ((InsectRealmProxyInterface) realmObject).realmSet$insectSampling(((InsectRealmProxyInterface) newObject).realmGet$insectSampling());
            ((InsectRealmProxyInterface) realmObject).realmSet$insectThreshold(((InsectRealmProxyInterface) newObject).realmGet$insectThreshold());
            ((InsectRealmProxyInterface) realmObject).realmSet$insectManagement(((InsectRealmProxyInterface) newObject).realmGet$insectManagement());
            ((InsectRealmProxyInterface) realmObject).realmSet$insectImage(((InsectRealmProxyInterface) newObject).realmGet$insectImage());
            ((InsectRealmProxyInterface) realmObject).realmSet$imageRecognition(((InsectRealmProxyInterface) newObject).realmGet$imageRecognition());
            return realmObject;
        }
    }

    public static long insert(Realm realm, com.vuforia.samples.MainApp.model.Insect object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.vuforia.samples.MainApp.model.Insect.class);
        long tableNativePtr = table.getNativePtr();
        InsectColumnInfo columnInfo = (InsectColumnInfo) realm.schema.getColumnInfo(com.vuforia.samples.MainApp.model.Insect.class);
        long pkColumnIndex = table.getPrimaryKey();
        Object primaryKeyValue = ((InsectRealmProxyInterface) object).realmGet$id();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((InsectRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, ((InsectRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$insectName = ((InsectRealmProxyInterface)object).realmGet$insectName();
        if (realmGet$insectName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insectNameIndex, rowIndex, realmGet$insectName, false);
        }
        String realmGet$insectDesc = ((InsectRealmProxyInterface)object).realmGet$insectDesc();
        if (realmGet$insectDesc != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insectDescIndex, rowIndex, realmGet$insectDesc, false);
        }
        String realmGet$insectTime = ((InsectRealmProxyInterface)object).realmGet$insectTime();
        if (realmGet$insectTime != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insectTimeIndex, rowIndex, realmGet$insectTime, false);
        }
        String realmGet$insectSampling = ((InsectRealmProxyInterface)object).realmGet$insectSampling();
        if (realmGet$insectSampling != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insectSamplingIndex, rowIndex, realmGet$insectSampling, false);
        }
        String realmGet$insectThreshold = ((InsectRealmProxyInterface)object).realmGet$insectThreshold();
        if (realmGet$insectThreshold != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insectThresholdIndex, rowIndex, realmGet$insectThreshold, false);
        }
        String realmGet$insectManagement = ((InsectRealmProxyInterface)object).realmGet$insectManagement();
        if (realmGet$insectManagement != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insectManagementIndex, rowIndex, realmGet$insectManagement, false);
        }
        String realmGet$insectImage = ((InsectRealmProxyInterface)object).realmGet$insectImage();
        if (realmGet$insectImage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insectImageIndex, rowIndex, realmGet$insectImage, false);
        }
        String realmGet$imageRecognition = ((InsectRealmProxyInterface)object).realmGet$imageRecognition();
        if (realmGet$imageRecognition != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.imageRecognitionIndex, rowIndex, realmGet$imageRecognition, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.vuforia.samples.MainApp.model.Insect.class);
        long tableNativePtr = table.getNativePtr();
        InsectColumnInfo columnInfo = (InsectColumnInfo) realm.schema.getColumnInfo(com.vuforia.samples.MainApp.model.Insect.class);
        long pkColumnIndex = table.getPrimaryKey();
        com.vuforia.samples.MainApp.model.Insect object = null;
        while (objects.hasNext()) {
            object = (com.vuforia.samples.MainApp.model.Insect) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                Object primaryKeyValue = ((InsectRealmProxyInterface) object).realmGet$id();
                long rowIndex = Table.NO_MATCH;
                if (primaryKeyValue == null) {
                    rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
                } else {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((InsectRealmProxyInterface) object).realmGet$id());
                }
                if (rowIndex == Table.NO_MATCH) {
                    rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, ((InsectRealmProxyInterface) object).realmGet$id());
                } else {
                    Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
                }
                cache.put(object, rowIndex);
                String realmGet$insectName = ((InsectRealmProxyInterface)object).realmGet$insectName();
                if (realmGet$insectName != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.insectNameIndex, rowIndex, realmGet$insectName, false);
                }
                String realmGet$insectDesc = ((InsectRealmProxyInterface)object).realmGet$insectDesc();
                if (realmGet$insectDesc != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.insectDescIndex, rowIndex, realmGet$insectDesc, false);
                }
                String realmGet$insectTime = ((InsectRealmProxyInterface)object).realmGet$insectTime();
                if (realmGet$insectTime != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.insectTimeIndex, rowIndex, realmGet$insectTime, false);
                }
                String realmGet$insectSampling = ((InsectRealmProxyInterface)object).realmGet$insectSampling();
                if (realmGet$insectSampling != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.insectSamplingIndex, rowIndex, realmGet$insectSampling, false);
                }
                String realmGet$insectThreshold = ((InsectRealmProxyInterface)object).realmGet$insectThreshold();
                if (realmGet$insectThreshold != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.insectThresholdIndex, rowIndex, realmGet$insectThreshold, false);
                }
                String realmGet$insectManagement = ((InsectRealmProxyInterface)object).realmGet$insectManagement();
                if (realmGet$insectManagement != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.insectManagementIndex, rowIndex, realmGet$insectManagement, false);
                }
                String realmGet$insectImage = ((InsectRealmProxyInterface)object).realmGet$insectImage();
                if (realmGet$insectImage != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.insectImageIndex, rowIndex, realmGet$insectImage, false);
                }
                String realmGet$imageRecognition = ((InsectRealmProxyInterface)object).realmGet$imageRecognition();
                if (realmGet$imageRecognition != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.imageRecognitionIndex, rowIndex, realmGet$imageRecognition, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.vuforia.samples.MainApp.model.Insect object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.vuforia.samples.MainApp.model.Insect.class);
        long tableNativePtr = table.getNativePtr();
        InsectColumnInfo columnInfo = (InsectColumnInfo) realm.schema.getColumnInfo(com.vuforia.samples.MainApp.model.Insect.class);
        long pkColumnIndex = table.getPrimaryKey();
        Object primaryKeyValue = ((InsectRealmProxyInterface) object).realmGet$id();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((InsectRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, ((InsectRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        String realmGet$insectName = ((InsectRealmProxyInterface)object).realmGet$insectName();
        if (realmGet$insectName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insectNameIndex, rowIndex, realmGet$insectName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.insectNameIndex, rowIndex, false);
        }
        String realmGet$insectDesc = ((InsectRealmProxyInterface)object).realmGet$insectDesc();
        if (realmGet$insectDesc != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insectDescIndex, rowIndex, realmGet$insectDesc, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.insectDescIndex, rowIndex, false);
        }
        String realmGet$insectTime = ((InsectRealmProxyInterface)object).realmGet$insectTime();
        if (realmGet$insectTime != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insectTimeIndex, rowIndex, realmGet$insectTime, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.insectTimeIndex, rowIndex, false);
        }
        String realmGet$insectSampling = ((InsectRealmProxyInterface)object).realmGet$insectSampling();
        if (realmGet$insectSampling != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insectSamplingIndex, rowIndex, realmGet$insectSampling, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.insectSamplingIndex, rowIndex, false);
        }
        String realmGet$insectThreshold = ((InsectRealmProxyInterface)object).realmGet$insectThreshold();
        if (realmGet$insectThreshold != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insectThresholdIndex, rowIndex, realmGet$insectThreshold, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.insectThresholdIndex, rowIndex, false);
        }
        String realmGet$insectManagement = ((InsectRealmProxyInterface)object).realmGet$insectManagement();
        if (realmGet$insectManagement != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insectManagementIndex, rowIndex, realmGet$insectManagement, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.insectManagementIndex, rowIndex, false);
        }
        String realmGet$insectImage = ((InsectRealmProxyInterface)object).realmGet$insectImage();
        if (realmGet$insectImage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.insectImageIndex, rowIndex, realmGet$insectImage, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.insectImageIndex, rowIndex, false);
        }
        String realmGet$imageRecognition = ((InsectRealmProxyInterface)object).realmGet$imageRecognition();
        if (realmGet$imageRecognition != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.imageRecognitionIndex, rowIndex, realmGet$imageRecognition, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.imageRecognitionIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.vuforia.samples.MainApp.model.Insect.class);
        long tableNativePtr = table.getNativePtr();
        InsectColumnInfo columnInfo = (InsectColumnInfo) realm.schema.getColumnInfo(com.vuforia.samples.MainApp.model.Insect.class);
        long pkColumnIndex = table.getPrimaryKey();
        com.vuforia.samples.MainApp.model.Insect object = null;
        while (objects.hasNext()) {
            object = (com.vuforia.samples.MainApp.model.Insect) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                Object primaryKeyValue = ((InsectRealmProxyInterface) object).realmGet$id();
                long rowIndex = Table.NO_MATCH;
                if (primaryKeyValue == null) {
                    rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
                } else {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((InsectRealmProxyInterface) object).realmGet$id());
                }
                if (rowIndex == Table.NO_MATCH) {
                    rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, ((InsectRealmProxyInterface) object).realmGet$id());
                }
                cache.put(object, rowIndex);
                String realmGet$insectName = ((InsectRealmProxyInterface)object).realmGet$insectName();
                if (realmGet$insectName != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.insectNameIndex, rowIndex, realmGet$insectName, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.insectNameIndex, rowIndex, false);
                }
                String realmGet$insectDesc = ((InsectRealmProxyInterface)object).realmGet$insectDesc();
                if (realmGet$insectDesc != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.insectDescIndex, rowIndex, realmGet$insectDesc, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.insectDescIndex, rowIndex, false);
                }
                String realmGet$insectTime = ((InsectRealmProxyInterface)object).realmGet$insectTime();
                if (realmGet$insectTime != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.insectTimeIndex, rowIndex, realmGet$insectTime, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.insectTimeIndex, rowIndex, false);
                }
                String realmGet$insectSampling = ((InsectRealmProxyInterface)object).realmGet$insectSampling();
                if (realmGet$insectSampling != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.insectSamplingIndex, rowIndex, realmGet$insectSampling, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.insectSamplingIndex, rowIndex, false);
                }
                String realmGet$insectThreshold = ((InsectRealmProxyInterface)object).realmGet$insectThreshold();
                if (realmGet$insectThreshold != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.insectThresholdIndex, rowIndex, realmGet$insectThreshold, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.insectThresholdIndex, rowIndex, false);
                }
                String realmGet$insectManagement = ((InsectRealmProxyInterface)object).realmGet$insectManagement();
                if (realmGet$insectManagement != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.insectManagementIndex, rowIndex, realmGet$insectManagement, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.insectManagementIndex, rowIndex, false);
                }
                String realmGet$insectImage = ((InsectRealmProxyInterface)object).realmGet$insectImage();
                if (realmGet$insectImage != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.insectImageIndex, rowIndex, realmGet$insectImage, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.insectImageIndex, rowIndex, false);
                }
                String realmGet$imageRecognition = ((InsectRealmProxyInterface)object).realmGet$imageRecognition();
                if (realmGet$imageRecognition != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.imageRecognitionIndex, rowIndex, realmGet$imageRecognition, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.imageRecognitionIndex, rowIndex, false);
                }
            }
        }
    }

    public static com.vuforia.samples.MainApp.model.Insect createDetachedCopy(com.vuforia.samples.MainApp.model.Insect realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.vuforia.samples.MainApp.model.Insect unmanagedObject;
        if (cachedObject != null) {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.vuforia.samples.MainApp.model.Insect)cachedObject.object;
            } else {
                unmanagedObject = (com.vuforia.samples.MainApp.model.Insect)cachedObject.object;
                cachedObject.minDepth = currentDepth;
            }
        } else {
            unmanagedObject = new com.vuforia.samples.MainApp.model.Insect();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        }
        ((InsectRealmProxyInterface) unmanagedObject).realmSet$id(((InsectRealmProxyInterface) realmObject).realmGet$id());
        ((InsectRealmProxyInterface) unmanagedObject).realmSet$insectName(((InsectRealmProxyInterface) realmObject).realmGet$insectName());
        ((InsectRealmProxyInterface) unmanagedObject).realmSet$insectDesc(((InsectRealmProxyInterface) realmObject).realmGet$insectDesc());
        ((InsectRealmProxyInterface) unmanagedObject).realmSet$insectTime(((InsectRealmProxyInterface) realmObject).realmGet$insectTime());
        ((InsectRealmProxyInterface) unmanagedObject).realmSet$insectSampling(((InsectRealmProxyInterface) realmObject).realmGet$insectSampling());
        ((InsectRealmProxyInterface) unmanagedObject).realmSet$insectThreshold(((InsectRealmProxyInterface) realmObject).realmGet$insectThreshold());
        ((InsectRealmProxyInterface) unmanagedObject).realmSet$insectManagement(((InsectRealmProxyInterface) realmObject).realmGet$insectManagement());
        ((InsectRealmProxyInterface) unmanagedObject).realmSet$insectImage(((InsectRealmProxyInterface) realmObject).realmGet$insectImage());
        ((InsectRealmProxyInterface) unmanagedObject).realmSet$imageRecognition(((InsectRealmProxyInterface) realmObject).realmGet$imageRecognition());
        return unmanagedObject;
    }

    static com.vuforia.samples.MainApp.model.Insect update(Realm realm, com.vuforia.samples.MainApp.model.Insect realmObject, com.vuforia.samples.MainApp.model.Insect newObject, Map<RealmModel, RealmObjectProxy> cache) {
        ((InsectRealmProxyInterface) realmObject).realmSet$insectName(((InsectRealmProxyInterface) newObject).realmGet$insectName());
        ((InsectRealmProxyInterface) realmObject).realmSet$insectDesc(((InsectRealmProxyInterface) newObject).realmGet$insectDesc());
        ((InsectRealmProxyInterface) realmObject).realmSet$insectTime(((InsectRealmProxyInterface) newObject).realmGet$insectTime());
        ((InsectRealmProxyInterface) realmObject).realmSet$insectSampling(((InsectRealmProxyInterface) newObject).realmGet$insectSampling());
        ((InsectRealmProxyInterface) realmObject).realmSet$insectThreshold(((InsectRealmProxyInterface) newObject).realmGet$insectThreshold());
        ((InsectRealmProxyInterface) realmObject).realmSet$insectManagement(((InsectRealmProxyInterface) newObject).realmGet$insectManagement());
        ((InsectRealmProxyInterface) realmObject).realmSet$insectImage(((InsectRealmProxyInterface) newObject).realmGet$insectImage());
        ((InsectRealmProxyInterface) realmObject).realmSet$imageRecognition(((InsectRealmProxyInterface) newObject).realmGet$imageRecognition());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Insect = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{insectName:");
        stringBuilder.append(realmGet$insectName() != null ? realmGet$insectName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{insectDesc:");
        stringBuilder.append(realmGet$insectDesc() != null ? realmGet$insectDesc() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{insectTime:");
        stringBuilder.append(realmGet$insectTime() != null ? realmGet$insectTime() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{insectSampling:");
        stringBuilder.append(realmGet$insectSampling() != null ? realmGet$insectSampling() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{insectThreshold:");
        stringBuilder.append(realmGet$insectThreshold() != null ? realmGet$insectThreshold() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{insectManagement:");
        stringBuilder.append(realmGet$insectManagement() != null ? realmGet$insectManagement() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{insectImage:");
        stringBuilder.append(realmGet$insectImage() != null ? realmGet$insectImage() : "null");
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
        InsectRealmProxy aInsect = (InsectRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aInsect.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aInsect.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aInsect.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
