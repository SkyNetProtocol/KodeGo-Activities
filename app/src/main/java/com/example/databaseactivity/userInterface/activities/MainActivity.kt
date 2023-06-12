package com.example.databaseactivity.userInterface.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.databaseactivity.R
import com.example.databaseactivity.database.DatabaseHandler
import com.example.databaseactivity.database.ModelClass
import com.example.databaseactivity.userInterface.adapters.GroceryListAdapter
import com.example.databaseactivity.userInterface.dataClass.GroceryList


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var groceryList1: ArrayList<GroceryList>
    private lateinit var groceryAdapter: GroceryListAdapter

    private lateinit var textViewName: TextView
    private lateinit var textViewCategory: TextView
    private lateinit var textViewQty: TextView
    private lateinit var textViewPrice: TextView

    private lateinit var tvNoRecord: TextView
    private lateinit var btnAdd: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd = findViewById(R.id.add_Item_In_List)
        groceryList1 = ArrayList()

        btnAdd.setOnClickListener { view ->
            addRecord(view)
        }
//Below comment is crashing
//        dataInsertToRecyclerView()
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        groceryList1.add(GroceryList("Piatos","Potato Snacks"))
        groceryList1.add(GroceryList("Piatos","Potato Snacks"))

        groceryAdapter = GroceryListAdapter(groceryList1)
        recyclerView.adapter = groceryAdapter
    }

    private fun addRecord(view: View){
        textViewName = findViewById(R.id.editTextName)
        textViewCategory = findViewById(R.id.editTextCategory)
        textViewQty = findViewById(R.id.editTextQty)
        textViewPrice = findViewById(R.id.editTextPrice)
        val name1 = textViewName.text.toString()
        val category1 = textViewCategory.text.toString()
        val qty1 = textViewQty.text.toString()
        val price1 = textViewPrice.text.toString()
        val databaseHandler: DatabaseHandler = DatabaseHandler(this)

        if (!name1.isEmpty() && !category1.isEmpty() && !qty1.isEmpty() && price1.isEmpty()){
            val status =
                databaseHandler.addItem(ModelClass(0, name1,category1,qty1,price1))

            if (status > -1){
                Toast.makeText(applicationContext, "Data Saved", Toast.LENGTH_LONG).show()

                dataInsertToRecyclerView()
            }
        }else{
            Toast.makeText(applicationContext,"All fields required", Toast.LENGTH_LONG).show()
        }
    }

    private fun dataInsertToRecyclerView() {
        tvNoRecord = findViewById(R.id.tvNoRecordsAvailable)

        if (getItemList().size > 0) {
            recyclerView.visibility = View.VISIBLE
            tvNoRecord.visibility = View.GONE

            recyclerView = findViewById(R.id.recyclerView)
            recyclerView.layoutManager = LinearLayoutManager(this)
            // line below is not expected (this, getItemList)
            groceryAdapter = GroceryListAdapter(groceryList1)
            recyclerView.adapter = groceryAdapter
        }else{
            recyclerView.visibility = View.GONE
            tvNoRecord.visibility = View.VISIBLE
        }
    }

    private fun getItemList(): ArrayList<ModelClass> {
        val databaseHandler: DatabaseHandler = DatabaseHandler(this)
        val itemList: ArrayList<ModelClass> = databaseHandler.viewItem()
        return itemList
    }

}

