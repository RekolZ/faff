package com.example.faff.recadapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.faff.R

data class feel(val image:Int, val name_feel:String)
class MyFeel{val list = arrayListOf(feel(R.drawable.meow,"faggot"),
    feel(R.drawable.prrr,"Расслабленым"),
    feel(R.drawable.meowmeow,"Сосредоточеным"),
    feel(R.drawable.meeeeeow,"Взволнованым"))
}

class FeelRecycler (val context: Context,val list: ArrayList<feel>):RecyclerView.Adapter<FeelRecycler.MyVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeelRecycler.MyVH {
        val root = LayoutInflater.from(context).inflate(R.layout.feel_adapter,parent,false)
        return MyVH(root)
    }
    class MyVH(itemView:View):RecyclerView.ViewHolder(itemView){
        val image:ImageView = itemView.findViewById(R.id.img_feel)
        val TextView: TextView = itemView.findViewById(R.id.text_feel)
    }
    override fun onBindViewHolder(holder: FeelRecycler.MyVH, position: Int) {
        holder.image.setImageResource(list[position].image)
        holder.TextView.setText(list[position].name_feel)
    }
    override fun getItemCount(): Int {
        return list.size
    }
    data class state(val title:String,val text_state:String,val image_state:Int)
    class MyState{
        val list = arrayListOf(
            state("Заголовок блока", "Краткое описание",R.drawable.meow),
            state("Заголовок блока", "Краткое описание123",R.drawable.meow)
        )
    }
}