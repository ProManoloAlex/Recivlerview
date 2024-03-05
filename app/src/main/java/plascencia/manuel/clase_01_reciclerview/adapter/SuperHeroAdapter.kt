package plascencia.manuel.clase_01_reciclerview.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import plascencia.manuel.clase_01_reciclerview.R
import plascencia.manuel.clase_01_reciclerview.SuperHero
import plascencia.manuel.clase_01_reciclerview.SuperHeroProvider.Companion.superHeroList

class SuperHeroAdapter (private val superheroList: List<SuperHero>,private val onClickListener: (SuperHero)->Unit): RecyclerView.Adapter<SuperHeroViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
    val layoutInflater=LayoutInflater.from(parent.context)
    return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_superhero,parent,false))
    }

    override fun getItemCount():Int= superHeroList.size

    @SuppressLint("SuspiciousIndentation")
    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
    val item = superHeroList[position]
        holder.render(item,onClickListener)
    }
}