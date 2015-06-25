package org.owntracks.android.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import org.owntracks.android.db.Waypoint;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table WAYPOINT.
*/
public class WaypointDao extends AbstractDao<Waypoint, Long> {

    public static final String TABLENAME = "WAYPOINT";

    /**
     * Properties of entity Waypoint.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Description = new Property(1, String.class, "description", false, "DESCRIPTION");
        public final static Property Geocoder = new Property(2, String.class, "geocoder", false, "GEOCODER");
        public final static Property Latitude = new Property(3, Double.class, "latitude", false, "LATITUDE");
        public final static Property Longitude = new Property(4, Double.class, "longitude", false, "LONGITUDE");
        public final static Property Radius = new Property(5, Integer.class, "radius", false, "RADIUS");
        public final static Property Ssid = new Property(6, String.class, "ssid", false, "SSID");
        public final static Property Shared = new Property(7, Boolean.class, "shared", false, "SHARED");
        public final static Property Date = new Property(8, java.util.Date.class, "date", false, "DATE");
        public final static Property LastTriggered = new Property(9, Long.class, "lastTriggered", false, "LAST_TRIGGERED");
        public final static Property GeofenceId = new Property(10, String.class, "geofenceId", false, "GEOFENCE_ID");
        public final static Property ModeId = new Property(11, int.class, "modeId", false, "MODE_ID");
    };


    public WaypointDao(DaoConfig config) {
        super(config);
    }
    
    public WaypointDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'WAYPOINT' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'DESCRIPTION' TEXT," + // 1: description
                "'GEOCODER' TEXT," + // 2: geocoder
                "'LATITUDE' REAL," + // 3: latitude
                "'LONGITUDE' REAL," + // 4: longitude
                "'RADIUS' INTEGER," + // 5: radius
                "'SSID' TEXT," + // 6: ssid
                "'SHARED' INTEGER," + // 7: shared
                "'DATE' INTEGER," + // 8: date
                "'LAST_TRIGGERED' INTEGER," + // 9: lastTriggered
                "'GEOFENCE_ID' TEXT," + // 10: geofenceId
                "'MODE_ID' INTEGER NOT NULL );"); // 11: modeId
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'WAYPOINT'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Waypoint entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String description = entity.getDescription();
        if (description != null) {
            stmt.bindString(2, description);
        }
 
        String geocoder = entity.getGeocoder();
        if (geocoder != null) {
            stmt.bindString(3, geocoder);
        }
 
        Double latitude = entity.getLatitude();
        if (latitude != null) {
            stmt.bindDouble(4, latitude);
        }
 
        Double longitude = entity.getLongitude();
        if (longitude != null) {
            stmt.bindDouble(5, longitude);
        }
 
        Integer radius = entity.getRadius();
        if (radius != null) {
            stmt.bindLong(6, radius);
        }
 
        String ssid = entity.getSsid();
        if (ssid != null) {
            stmt.bindString(7, ssid);
        }
 
        Boolean shared = entity.getShared();
        if (shared != null) {
            stmt.bindLong(8, shared ? 1l: 0l);
        }
 
        java.util.Date date = entity.getDate();
        if (date != null) {
            stmt.bindLong(9, date.getTime());
        }
 
        Long lastTriggered = entity.getLastTriggered();
        if (lastTriggered != null) {
            stmt.bindLong(10, lastTriggered);
        }
 
        String geofenceId = entity.getGeofenceId();
        if (geofenceId != null) {
            stmt.bindString(11, geofenceId);
        }
        stmt.bindLong(12, entity.getModeId());
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Waypoint readEntity(Cursor cursor, int offset) {
        Waypoint entity = new Waypoint( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // description
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // geocoder
            cursor.isNull(offset + 3) ? null : cursor.getDouble(offset + 3), // latitude
            cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4), // longitude
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // radius
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // ssid
            cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0, // shared
            cursor.isNull(offset + 8) ? null : new java.util.Date(cursor.getLong(offset + 8)), // date
            cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9), // lastTriggered
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // geofenceId
            cursor.getInt(offset + 11) // modeId
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Waypoint entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setDescription(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setGeocoder(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setLatitude(cursor.isNull(offset + 3) ? null : cursor.getDouble(offset + 3));
        entity.setLongitude(cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4));
        entity.setRadius(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setSsid(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setShared(cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0);
        entity.setDate(cursor.isNull(offset + 8) ? null : new java.util.Date(cursor.getLong(offset + 8)));
        entity.setLastTriggered(cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9));
        entity.setGeofenceId(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setModeId(cursor.getInt(offset + 11));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Waypoint entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Waypoint entity) {
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