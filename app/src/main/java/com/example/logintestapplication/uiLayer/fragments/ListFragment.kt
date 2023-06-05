package com.example.logintestapplication.uiLayer.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.logintestapplication.R
import com.example.logintestapplication.uiLayer.adapters.GroceryAdapter
import com.example.logintestapplication.uiLayer.dataclass.Grocery


class ListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var groceryList: ArrayList<Grocery>
    private lateinit var groceryAdapter: GroceryAdapter

    lateinit var generic : Array<String>
    lateinit var brand : Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialized()

        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        groceryAdapter = GroceryAdapter(groceryList)
        recyclerView.adapter = groceryAdapter
    }

    private fun dataInitialized(){
        groceryList = arrayListOf<Grocery>()

        brand = arrayOf(
            getString(R.string.brand1),
            getString(R.string.brand2),
            getString(R.string.brand3),
            getString(R.string.brand4),
            getString(R.string.brand5),
            getString(R.string.brand6),
            getString(R.string.brand7),
            getString(R.string.brand8),
            getString(R.string.brand9),
            getString(R.string.brand10),
        )
        generic = arrayOf(
            getString(R.string.generic1),
            getString(R.string.generic2),
            getString(R.string.generic3),
            getString(R.string.generic4),
            getString(R.string.generic5),
            getString(R.string.generic6),
            getString(R.string.generic7),
            getString(R.string.generic8),
            getString(R.string.generic9),
            getString(R.string.generic10),
        )

        for (i in generic.indices){
            val item = Grocery(brand[i], generic[i])
            groceryList.add(item)
        }

    }
}