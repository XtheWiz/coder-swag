package com.chubbycat.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.chubbycat.coderswag.R
import com.chubbycat.coderswag.adapters.CategoryAdapter
import com.chubbycat.coderswag.model.Category
import com.chubbycat.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        listviewCategory.adapter = adapter
    }
}
