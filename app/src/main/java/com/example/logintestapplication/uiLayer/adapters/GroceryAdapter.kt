package com.example.logintestapplication.uiLayer.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.logintestapplication.R
import com.example.logintestapplication.uiLayer.dataclass.Grocery


class GroceryAdapter(private val groceryList:ArrayList<Grocery>)
    : RecyclerView.Adapter<GroceryAdapter.GroceryViewHolder>() {

    var onItemClick: ((Grocery) -> Unit)? = null

    class GroceryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewGrocery1: TextView = itemView.findViewById(R.id.recyclerText)
        val textViewGrocery2: TextView = itemView.findViewById(R.id.recyclerText2)
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
        holder.textViewGrocery1.text = grocery.grocery1
        holder.textViewGrocery2.text = grocery.grocery2
        holder.grocerySample.setOnClickListener {
            onItemClick?.invoke(grocery)
        }
    }
}