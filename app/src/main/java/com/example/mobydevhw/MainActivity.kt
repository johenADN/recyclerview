package com.example.mobydevhw

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mobydevhw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listOfProduct = listOf<Product>(
            Product("Parrot", 100),
            Product("Apple", 200),
            Product("Orange", 300),
            Product("Banana", 400),
            Product("Pear", 500),
            Product("Strawberry", 600),
            Product("Blueberry", 700),
            Product("Cherry", 800),
            Product("Lemon", 900),
            Product("Kiwi", 1000),
            Product("Pineapple", 1100),
            Product("Watermelon", 1200),
            Product("Mango", 1300),
            Product("Peach", 1400),
            Product("Grape", 1500),
            Product("Avocado", 1600),
            Product("Pomegranate", 1700),
            Product("Plum", 1800),
            Product("Raspberry", 1900),
            Product("Blackberry", 2000)
        )
        val adapter = ExampleRecycleAdapter()
        binding.rcProducts.adapter = adapter

        adapter.submitList(listOfProduct)


    }
}