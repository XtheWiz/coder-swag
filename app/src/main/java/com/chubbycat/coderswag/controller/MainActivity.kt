package com.chubbycat.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.Toast
import com.chubbycat.coderswag.R
import com.chubbycat.coderswag.adapters.CategoryAdapter
import com.chubbycat.coderswag.adapters.CategoryRecyclerAdapter
import com.chubbycat.coderswag.model.Category
import com.chubbycat.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerAdapter(this, DataService.categories)
        listviewCategory.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        listviewCategory.layoutManager = layoutManager
        listviewCategory.setHasFixedSize(true)

    }
}
