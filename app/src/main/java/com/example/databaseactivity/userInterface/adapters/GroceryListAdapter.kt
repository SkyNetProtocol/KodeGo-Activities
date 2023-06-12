package com.example.databaseactivity.userInterface.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.databaseactivity.R
import com.example.databaseactivity.userInterface.dataClass.GroceryList

class GroceryListAdapter(private val groceryList:ArrayList<GroceryList>)
    : RecyclerView.Adapter<GroceryListAdapter.GroceryViewHolder>(){

    var onItemClick: ((GroceryList) -> Unit)? = null

    class GroceryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textView:TextView = itemView.findViewById(R.id.recyclerText)
        val textView2:TextView = itemView.findViewById(R.id.recyclerText2)
        val grocerySample: ConstraintLayout = itemView.findViewById(R.id.layoutBox)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroceryViewHolder {
        val viewGrocery = LayoutInflater.from(parent.context).inflate(R.layout.layout_box, parent, false)
        return GroceryViewHolder(viewGrocery)
    }

    override fun getItemCount(): Int {
        return groceryList.size
    }

    override fun onBindViewHolder(holder: GroceryViewHolder, position: Int) {
        val grocery = groceryList[position]
        holder.textView.text = grocery.grocery
        holder.textView2.text = grocery.grocery1
        holder.grocerySample.setOnClickListener {
            onItemClick?.invoke(grocery)
        }
    }

}