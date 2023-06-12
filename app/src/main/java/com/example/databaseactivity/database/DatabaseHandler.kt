package com.example.databaseactivity.database

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteException
import android.database.sqlite.SQLiteOpenHelper


class DatabaseHandler(context: Context) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object{
        private const val DATABASE_VERSION = 1
        private const val DATABASE_NAME = "Sample db"
        private const val USER_PRIMARY_TABLE = "GroceryItemTable"

        private const val KEY_ID = "_id"
        private const val ITEM_NAME = "item_name"
        private const val CATEGORY_NAME = "item_category"
        private const val AVAILABLE_STOCK = "item_qty"
        private const val ITEM_PRICE = "item_price"

    }

    override fun onCreate(p0: SQLiteDatabase?) {
        val createGroceryListTable = ("CREATE TABLE " + USER_PRIMARY_TABLE + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + ITEM_NAME + " TEXT,"
                + CATEGORY_NAME + " TEXT," + AVAILABLE_STOCK + " TEXT," + ITEM_PRICE + " TEXT" + ")")
        p0?.execSQL(createGroceryListTable)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        p0!!.execSQL("DROP TABLE IF EXISTS " + USER_PRIMARY_TABLE)
        onCreate(p0)
    }

    fun addItem(item: ModelClass): Long {
        val db = this.writableDatabase

        val contentValues = ContentValues()
        contentValues.put(ITEM_NAME, item.nameOfGroceryItem1)
        contentValues.put(CATEGORY_NAME, item.nameOfGroceryCategory1)
        contentValues.put(AVAILABLE_STOCK, item.availableStock)
        contentValues.put(ITEM_PRICE, item.groceryItemPrice)

        val success = db.insert(USER_PRIMARY_TABLE, null, contentValues)

        db.close()
        return success
    }

    fun checkItemAlreadyExist(name1: String, category1: String): Boolean {
        val db = this.writableDatabase
        val checkAccount: Cursor = db.rawQuery("SELECT * FROM $USER_PRIMARY_TABLE WHERE $ITEM_NAME=? AND $CATEGORY_NAME=?", arrayOf(name1, category1), null)
        if(checkAccount.count >0)
            return true

        return false
    }

    fun viewItem(): ArrayList<ModelClass>{
        val groceryItemList: ArrayList<ModelClass> = ArrayList<ModelClass>()
        val selectQuery = "SELECT  * FROM $USER_PRIMARY_TABLE"

        val db = this.readableDatabase
        var cursor: Cursor? = null

        try {
            cursor = db.rawQuery(selectQuery, null)

        } catch (e: SQLiteException) {
            db.execSQL(selectQuery)
            return ArrayList()
        }

        var id: Int
        var name: String
        var category: String
        var availableStock: String
        var price: String

        if (cursor.moveToFirst()) {
            do {
                id = cursor.getInt(cursor.getColumnIndexOrThrow(KEY_ID))
                name = cursor.getString(cursor.getColumnIndexOrThrow(ITEM_NAME))
                category = cursor.getString(cursor.getColumnIndexOrThrow(CATEGORY_NAME))
                availableStock = cursor.getInt(cursor.getColumnIndexOrThrow(AVAILABLE_STOCK)).toString()
                price = cursor.getInt(cursor.getColumnIndexOrThrow(ITEM_PRICE)).toString()

                val item1 = ModelClass(id = id, nameOfGroceryItem1 = name, nameOfGroceryCategory1 = category,
                availableStock = availableStock, groceryItemPrice = price)
                groceryItemList.add(item1)

            } while (cursor.moveToNext())
        }
        return groceryItemList
    }

    fun updateItem(item: ModelClass): Int {
        val db = this.writableDatabase

        val contentValues = ContentValues()
        contentValues.put(ITEM_NAME, item.nameOfGroceryItem1)
        contentValues.put(CATEGORY_NAME, item.nameOfGroceryCategory1)
        contentValues.put(AVAILABLE_STOCK, item.availableStock)
        contentValues.put(ITEM_PRICE, item.groceryItemPrice)

        val success = db.update(USER_PRIMARY_TABLE, contentValues, KEY_ID + "=" + item.id, null)

        db.close()
        return success
    }

    fun deleteUser(item: ModelClass): Int {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(KEY_ID, item.id)

        val success = db.delete(USER_PRIMARY_TABLE, KEY_ID + "=" + item.id, null)

        db.close()
        return success
    }

}

