package ch.ethz.coss.nervousnet.vm.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import ch.ethz.coss.nervousnet.vm.model.HumidityData;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "HUMIDITY_DATA".
*/
public class HumidityDataDao extends AbstractDao<HumidityData, Long> {

    public static final String TABLENAME = "HUMIDITY_DATA";

    /**
     * Properties of entity HumidityData.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property TimeStamp = new Property(1, Long.class, "TimeStamp", false, "TIME_STAMP");
        public final static Property Humidity = new Property(2, Float.class, "Humidity", false, "HUMIDITY");
        public final static Property Volatility = new Property(3, long.class, "Volatility", false, "VOLATILITY");
        public final static Property ShareFlag = new Property(4, Boolean.class, "ShareFlag", false, "SHARE_FLAG");
    };


    public HumidityDataDao(DaoConfig config) {
        super(config);
    }
    
    public HumidityDataDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"HUMIDITY_DATA\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"TIME_STAMP\" INTEGER," + // 1: TimeStamp
                "\"HUMIDITY\" REAL," + // 2: Humidity
                "\"VOLATILITY\" INTEGER NOT NULL ," + // 3: Volatility
                "\"SHARE_FLAG\" INTEGER);"); // 4: ShareFlag
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"HUMIDITY_DATA\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, HumidityData entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long TimeStamp = entity.getTimeStamp();
        if (TimeStamp != null) {
            stmt.bindLong(2, TimeStamp);
        }
 
        Float Humidity = entity.getHumidity();
        if (Humidity != null) {
            stmt.bindDouble(3, Humidity);
        }
        stmt.bindLong(4, entity.getVolatility());
 
        Boolean ShareFlag = entity.getShareFlag();
        if (ShareFlag != null) {
            stmt.bindLong(5, ShareFlag ? 1L: 0L);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public HumidityData readEntity(Cursor cursor, int offset) {
        HumidityData entity = new HumidityData( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // TimeStamp
            cursor.isNull(offset + 2) ? null : cursor.getFloat(offset + 2), // Humidity
            cursor.getLong(offset + 3), // Volatility
            cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0 // ShareFlag
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, HumidityData entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTimeStamp(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setHumidity(cursor.isNull(offset + 2) ? null : cursor.getFloat(offset + 2));
        entity.setVolatility(cursor.getLong(offset + 3));
        entity.setShareFlag(cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0);
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(HumidityData entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(HumidityData entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
