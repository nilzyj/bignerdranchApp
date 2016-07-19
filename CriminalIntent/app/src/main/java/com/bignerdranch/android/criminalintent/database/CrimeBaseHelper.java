package com.bignerdranch.android.criminalintent.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

<<<<<<< HEAD
import com.bignerdranch.android.criminalintent.database.CrimeDbSchema.CrimeTable;

/**
 * Created by dim on 2016/7/15.
=======
import static com.bignerdranch.android.criminalintent.database.CrimeDbSchema.*;

/**
 * Created by Administrator on 2016/7/16.
>>>>>>> 4f534b88b909081a6687fe18321ede3770203066
 */
public class CrimeBaseHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "crimeBase.db";

    public CrimeBaseHelper(Context context) {
<<<<<<< HEAD
        super(context, DATABASE_NAME, null ,VERSION);
=======
        super(context, DATABASE_NAME, null, VERSION);
>>>>>>> 4f534b88b909081a6687fe18321ede3770203066
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + CrimeTable.NAME + "(" +
                " _id integer primary key autoincrement, " +
                CrimeTable.Cols.UUID + ", " +
                CrimeTable.Cols.TITLE + ", " +
                CrimeTable.Cols.DATE + ", " +
<<<<<<< HEAD
                CrimeTable.Cols.SOLVED + ")");
=======
                CrimeTable.Cols.SOLVED + ", " +
                CrimeTable.Cols.SUSPECT + ")"
        );
>>>>>>> 4f534b88b909081a6687fe18321ede3770203066
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
