package plascencia.manuel.clase_01_reciclerview.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import plascencia.manuel.clase_01_reciclerview.SuperHero
import plascencia.manuel.clase_01_reciclerview.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view: View): ViewHolder(view) {

   private val binding  =  ItemSuperheroBinding.bind(view)

    fun render(superHeroModel: SuperHero, onClickListener: (SuperHero)->Unit){
        binding.tvSuperHeroName.text=superHeroModel.superhero
        binding.tvRealName.text=superHeroModel.realName
        binding.tvPublisher.text=superHeroModel.publisher
        Glide.with(binding.ivSuperhero.context).load(superHeroModel.photo).into(binding.ivSuperhero)
        itemView.setOnClickListener{onClickListener(superHeroModel)

        }
    }

    private fun onClickListener(superHeroModel: SuperHero) {

    }


}