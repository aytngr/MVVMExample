package gr.aytn.mvvmexample.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.Observer
import gr.aytn.mvvmexample.R
import gr.aytn.mvvmexample.databinding.ActivityMainBinding
import gr.aytn.mvvmexample.viewmodel.CityViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val model: CityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        model.getCityData().observe(this, Observer{city ->
            binding.cityImage.setImageDrawable(ResourcesCompat.getDrawable(resources,city.img,applicationContext.theme))
            binding.cityNameTV.text = city.name
            binding.populationTV.text = city.population.toString()
        })
    }


}