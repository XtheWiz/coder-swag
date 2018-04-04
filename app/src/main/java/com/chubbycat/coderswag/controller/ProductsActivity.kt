package com.chubbycat.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.chubbycat.coderswag.R
import com.chubbycat.coderswag.utils.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
