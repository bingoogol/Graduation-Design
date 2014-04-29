package com.bingoogol.frogcare.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBOpenHelper extends SQLiteOpenHelper {

	public DBOpenHelper(Context context) {
		super(context, "frogcare.db", null, 1);
	}

	/**
	 * 数据库第一次创建的时候 调用的方法.
	 */
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("create table applock (_id integer primary key autoincrement , packname varchar(20)) ");

		// 黑名单号码 拦截模式. 1全部 2 电话 3短信
		//db.execSQL("create table blacknumber (_id integer primary key autoincrement , number varchar(20), mode varchar(2)) ");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}
}
