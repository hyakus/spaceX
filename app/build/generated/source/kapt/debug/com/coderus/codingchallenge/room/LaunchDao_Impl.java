package com.coderus.codingchallenge.room;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.coderus.codingchallenge.objectmodel.RocketLaunch;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LaunchDao_Impl implements LaunchDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RocketLaunch> __insertionAdapterOfRocketLaunch;

  private final EntityDeletionOrUpdateAdapter<RocketLaunch> __deletionAdapterOfRocketLaunch;

  private final EntityDeletionOrUpdateAdapter<RocketLaunch> __updateAdapterOfRocketLaunch;

  public LaunchDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRocketLaunch = new EntityInsertionAdapter<RocketLaunch>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `launch` (`flightNumber`,`name`,`date_utc`,`details`,`success`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RocketLaunch value) {
        stmt.bindLong(1, value.getFlightNumber());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDateUTC() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDateUTC());
        }
        if (value.getDetails() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDetails());
        }
        final Integer _tmp;
        _tmp = value.getSuccess() == null ? null : (value.getSuccess() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, _tmp);
        }
      }
    };
    this.__deletionAdapterOfRocketLaunch = new EntityDeletionOrUpdateAdapter<RocketLaunch>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `launch` WHERE `flightNumber` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RocketLaunch value) {
        stmt.bindLong(1, value.getFlightNumber());
      }
    };
    this.__updateAdapterOfRocketLaunch = new EntityDeletionOrUpdateAdapter<RocketLaunch>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `launch` SET `flightNumber` = ?,`name` = ?,`date_utc` = ?,`details` = ?,`success` = ? WHERE `flightNumber` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RocketLaunch value) {
        stmt.bindLong(1, value.getFlightNumber());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDateUTC() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDateUTC());
        }
        if (value.getDetails() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDetails());
        }
        final Integer _tmp;
        _tmp = value.getSuccess() == null ? null : (value.getSuccess() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, _tmp);
        }
        stmt.bindLong(6, value.getFlightNumber());
      }
    };
  }

  @Override
  public void insertAll(final List<RocketLaunch> launches) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRocketLaunch.insert(launches);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final RocketLaunch launch) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRocketLaunch.insert(launch);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final RocketLaunch launch) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfRocketLaunch.handle(launch);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateLaunch(final RocketLaunch launch) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfRocketLaunch.handle(launch);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<RocketLaunch> getAllLaunches() {
    final String _sql = "SELECT * FROM launch";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfFlightNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "flightNumber");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDateUTC = CursorUtil.getColumnIndexOrThrow(_cursor, "date_utc");
      final int _cursorIndexOfDetails = CursorUtil.getColumnIndexOrThrow(_cursor, "details");
      final int _cursorIndexOfSuccess = CursorUtil.getColumnIndexOrThrow(_cursor, "success");
      final List<RocketLaunch> _result = new ArrayList<RocketLaunch>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final RocketLaunch _item;
        final int _tmpFlightNumber;
        _tmpFlightNumber = _cursor.getInt(_cursorIndexOfFlightNumber);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpDateUTC;
        _tmpDateUTC = _cursor.getString(_cursorIndexOfDateUTC);
        final String _tmpDetails;
        _tmpDetails = _cursor.getString(_cursorIndexOfDetails);
        final Boolean _tmpSuccess;
        final Integer _tmp;
        if (_cursor.isNull(_cursorIndexOfSuccess)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getInt(_cursorIndexOfSuccess);
        }
        _tmpSuccess = _tmp == null ? null : _tmp != 0;
        _item = new RocketLaunch(_tmpFlightNumber,_tmpName,_tmpDateUTC,_tmpDetails,_tmpSuccess);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
