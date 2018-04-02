package com.chubbycat.coderswag.services

import com.chubbycat.coderswag.model.Category
import com.chubbycat.coderswag.model.Product

object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslope Graphic Beanie", "$18", "hot1"),
            Product("Devslope Hat Black", "$20", "hot2"),
            Product("Devslope Hat White", "$18", "hot3"),
            Product("Devslope Hat Snapback", "$22", "hot4")
    )

    val hoodies = listOf(
            Product("Devslope Hoodie Gray", "$28", "hoodie1"),
            Product("Devslope Hoodie Red", "$32", "hoodie2"),
            Product("Devslope Gray Hoodie", "$28", "hoodie3"),
            Product("Devslope Black Hoodie", "$32", "hoodie4")
    )

    val shirts = listOf(
            Product("Devslope Shirt Black", "$18", "shirt1"),
            Product("Devslope Badge Light Gray", "$20", "shirt2"),
            Product("Devslope Logo Shirt Red", "$22", "shirt3"),
            Product("Devslope Hustle", "$22", "shirt4"),
            Product("Kickflips Studio", "$18", "shirt5")
    )
}