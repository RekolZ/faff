package com.example.faff.recadapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.faff.R
import java.util.Collections.list

class StateRecycler(val context:Context, val list:ArrayList<state>):RecyclerView.Adapter<StateRecycler.MyWH>(){
    class MyWH(itemView: View): RecyclerView.ViewHolder(itemView){
        val image: ImageView = itemView.findViewById(R.id.img_state)
        val titleView: TextView = itemView.findViewById(R.id.title_state)
        val textView: TextView = itemView.findViewById(R.id.text_state)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyWH {
        val root = LayoutInflater.from(context).inflate(R.layout.state_adapter,parent,false)
        return StateRecycler.MyWH(root)
    }

    override fun onBindViewHolder(holder: StateRecycler.MyWH, position: Int) {
        holder.image.setImageResource(list[position].image_state)
        holder.textView.setText(list[position].title)
        holder.textView.setText(list[position].text_state)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
