package ch.ethz.coss.nervousnet.vm.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import ch.ethz.coss.nervousnet.vm.model.MagneticReading;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MAGNETIC_READING".
*/
public class MagneticReadingDao extends AbstractDao<MagneticReading, java.util.Date> {

    public static final String TABLENAME = "MAGNETIC_READING";

    /**
     * Properties of entity MagneticReading.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property TimeStamp = new Property(0, java.util.Date.class, "TimeStamp", true, "TIME_STAMP");
    };


    public MagneticReadingDao(DaoConfig config) {
        super(config);
    }
    
    public MagneticReadingDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MAGNETIC_READING\" (" + //
                "\"TIME_STAMP\" INTEGER PRIMARY KEY NOT NULL );"); // 0: TimeStamp
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MAGNETIC_READING\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, MagneticReading entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getTimeStamp().getTime());
    }

    /** @inheritdoc */
    @Override
    public java.util.Date readKey(Cursor cursor, int offset) {
        return new java.util.Date(cursor.getLong(offset + 0));
    }    

    /** @inheritdoc */
    @Override
    public MagneticReading readEntity(Cursor cursor, int offset) {
        MagneticReading entity = new MagneticReading( //
            new java.util.Date(cursor.getLong(offset + 0)) // TimeStamp
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, MagneticReading entity, int offset) {
        entity.setTimeStamp(new java.util.Date(cursor.getLong(offset + 0)));
     }
    
    /** @inheritdoc */
    @Override
    protected java.util.Date updateKeyAfterInsert(MagneticReading entity, long rowId) {
        return entity.getTimeStamp();
    }
    
    /** @inheritdoc */
    @Override
    public java.util.Date getKey(MagneticReading entity) {
        if(entity != null) {
            return entity.getTimeStamp();
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
