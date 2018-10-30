package com.madesan.expensetracker;

import android.content.Context;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ProjectsListDBhelper extends SQLiteOpenHelper{
	private static final String DB_NAME = "ProjectsList";
	private static final int DB_VERSION = 1;
	
	public ProjectsListDBhelper(Context context){
		super(context, DB_NAME, null, DB_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db){
		db.execSQL("CREATE TABLE PROJECT(_id INTEGER PRIMARY KEY AUTOINCREMENT, "
		+ "LOCATION TEXT, "
		+ "DESCRIPTION TEXT, "
		+ "ALLOTED_BUDGET REAL, "
		+ "EXPENDED_AMOUNT REAL, "
		+ "CONSTRUCTION_STAGE TEXT);");
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldV, int newV){
		// TODO: Implement this method
	}

}
