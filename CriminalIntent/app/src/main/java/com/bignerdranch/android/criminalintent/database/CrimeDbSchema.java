package com.bignerdranch.android.criminalintent.database;

/**
 * Created by dim on 2016/7/15.
 */
public class CrimeDbSchema {
    //定义描述数据表元素的String常量
    public static final class CrimeTable {
        public static final String NAME = "crimes";
        //数据表字段
        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
        }
    }


}
