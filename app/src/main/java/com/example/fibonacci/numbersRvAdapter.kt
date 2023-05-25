
package com.example.fibonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.recyclerview.widget.RecyclerView.Adapter

class NumbersRvAdapter(var numberList: List<Int>): RecyclerView.Adapter<NumbersViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder{
        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.number_list_item, parent, false)      // it creates a view
        return NumbersViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
        val currentNumbers = numberList.get(position)
        holder.tvNumber
        holder.tvNumber.text = currentNumbers.toString()
    }

    override fun getItemCount(): Int {
        return numberList.size
    }
}
class NumbersViewHolder(itemView: View): ViewHolder(itemView){
    var tvNumber = itemView.findViewById<TextView>(R.id.tvNumber)
}

////////////////////////////////////
//
//class NumbersRVAdapter(var fiboList: List<Int>):RecyclerView.Adapter<NumbersViewHolder>(){
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumbersViewHolder {
//        val numView=LayoutInflater.from(parent.context)
//            .inflate(R.layout.recycleviews_fibonac,parent,false)
//        return NumbersViewHolder(numView)
//    }
//
//    override fun onBindViewHolder(holder: NumbersViewHolder, position: Int) {
////   turned tostring for it to be a string
//        val currentNumber=fiboList.get(position).toString()
//        holder.tvfibo.text=currentNumber
//    }
//
//    override fun getItemCount(): Int {
//        return fiboList.size
//    }
//
//
//}
//
//class NumbersViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
//    var tvfibo=itemView.findViewById<TextView>(R.id.tvfibo)
//}