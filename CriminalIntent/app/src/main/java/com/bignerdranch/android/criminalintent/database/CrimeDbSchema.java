package com.bignerdranch.android.criminalintent.database;

/**
<<<<<<< HEAD
 * Created by dim on 2016/7/15.
 */
public class CrimeDbSchema {
    //定义描述数据表元素的String常量
    public static final class CrimeTable {
        public static final String NAME = "crimes";
        //数据表字段
=======
 * Created by Administrator on 2016/7/16.
 */
public class CrimeDbSchema {
    public static final class CrimeTable {
        public static final String NAME = "crimes";

>>>>>>> 4f534b88b909081a6687fe18321ede3770203066
        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
<<<<<<< HEAD
        }
    }


=======
            public static final String SUSPECT = "suspect";
        }
    }
>>>>>>> 4f534b88b909081a6687fe18321ede3770203066
}
