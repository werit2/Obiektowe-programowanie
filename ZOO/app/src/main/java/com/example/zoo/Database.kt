package com.example.myapplication

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.BaseColumns

object TableInfo: BaseColumns {
    const val TABLE_NAME = "My notes"
    const val TABLE_COLUMN_TITLE = "title"
    const val TABLE_COLUMN_MESSAGE = "message"
}

object Command{
    const val SQL_CREATE_TABLE =
        "CREATE TABLE ${TableInfo.TABLE_NAME} (" +
                "${BaseColumns._ID} INTEGER PRIMARY KEY," +
                "${TableInfo.TABLE_COLUMN_TITLE} TEXT NOT NULL" +
                "${TableInfo.TABLE_COLUMN_MESSAGE} TEXT NOT NULL)"
    const val SQL_DELETE_TABLE = "DROP TABLE IF EXISTS ${TableInfo.TABLE_NAME}"

}

class Database(context: Context): SQLiteOpenHelper(context, TableInfo.TABLE_NAME, null, 1){
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(Command.SQL_CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL(Command.SQL_DELETE_TABLE)
        onCreate(db)
    }

}