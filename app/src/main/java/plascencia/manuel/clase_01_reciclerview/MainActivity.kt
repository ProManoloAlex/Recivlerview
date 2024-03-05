package plascencia.manuel.clase_01_reciclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import plascencia.manuel.clase_01_reciclerview.adapter.SuperHeroAdapter
import plascencia.manuel.clase_01_reciclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SuperHeroProvider.superHeroList
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val manager= LinearLayoutManager(this)
        val decoration= DividerItemDecoration(this,manager.orientation)
        binding.recyclerSuperHero.layoutManager=LinearLayoutManager(this)
        binding.recyclerSuperHero.adapter=SuperHeroAdapter(SuperHeroProvider.superHeroList) { superHero ->
            onItemSelected(
                superHero
            )
        }
        binding.recyclerSuperHero.addItemDecoration(decoration)
    }

    fun onItemSelected(superHero: SuperHero){
    Toast.makeText(this,superHero.superhero,Toast.LENGTH_SHORT).show()
    }

}