package com.example.javaproject.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.example.javaproject.greendao.CommonCheckType;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table COMMON_CHECK_TYPE.
*/
public class CommonCheckTypeDao extends AbstractDao<CommonCheckType, Long> {

    public static final String TABLENAME = "COMMON_CHECK_TYPE";

    /**
     * Properties of entity CommonCheckType.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property User_name = new Property(1, String.class, "user_name", false, "USER_NAME");
        public final static Property Check_parent_name = new Property(2, String.class, "check_parent_name", false, "CHECK_PARENT_NAME");
        public final static Property Check_parent_id = new Property(3, Integer.class, "check_parent_id", false, "CHECK_PARENT_ID");
        public final static Property Check_name = new Property(4, String.class, "check_name", false, "CHECK_NAME");
        public final static Property Check_id = new Property(5, Integer.class, "check_id", false, "CHECK_ID");
        public final static Property Check_count = new Property(6, Integer.class, "check_count", false, "CHECK_COUNT");
    };


    public CommonCheckTypeDao(DaoConfig config) {
        super(config);
    }
    
    public CommonCheckTypeDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'COMMON_CHECK_TYPE' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'USER_NAME' TEXT," + // 1: user_name
                "'CHECK_PARENT_NAME' TEXT," + // 2: check_parent_name
                "'CHECK_PARENT_ID' INTEGER," + // 3: check_parent_id
                "'CHECK_NAME' TEXT," + // 4: check_name
                "'CHECK_ID' INTEGER," + // 5: check_id
                "'CHECK_COUNT' INTEGER);"); // 6: check_count
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'COMMON_CHECK_TYPE'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, CommonCheckType entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String user_name = entity.getUser_name();
        if (user_name != null) {
            stmt.bindString(2, user_name);
        }
 
        String check_parent_name = entity.getCheck_parent_name();
        if (check_parent_name != null) {
            stmt.bindString(3, check_parent_name);
        }
 
        Integer check_parent_id = entity.getCheck_parent_id();
        if (check_parent_id != null) {
            stmt.bindLong(4, check_parent_id);
        }
 
        String check_name = entity.getCheck_name();
        if (check_name != null) {
            stmt.bindString(5, check_name);
        }
 
        Integer check_id = entity.getCheck_id();
        if (check_id != null) {
            stmt.bindLong(6, check_id);
        }
 
        Integer check_count = entity.getCheck_count();
        if (check_count != null) {
            stmt.bindLong(7, check_count);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public CommonCheckType readEntity(Cursor cursor, int offset) {
        CommonCheckType entity = new CommonCheckType( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // user_name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // check_parent_name
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // check_parent_id
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // check_name
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // check_id
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6) // check_count
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, CommonCheckType entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUser_name(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCheck_parent_name(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setCheck_parent_id(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setCheck_name(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setCheck_id(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setCheck_count(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(CommonCheckType entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(CommonCheckType entity) {
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
