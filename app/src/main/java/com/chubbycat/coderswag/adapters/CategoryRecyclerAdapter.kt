package com.chubbycat.coderswag.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.chubbycat.coderswag.R
import com.chubbycat.coderswag.model.Category
import kotlinx.android.synthetic.main.category_list_item.view.*

class CategoryRecyclerAdapter(val context: Context, val categories: List<Category>, val itemClicked: (Category) -> Unit) : RecyclerView.Adapter<CategoryRecyclerAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context)
                .inflate(R.layout.category_list_item, parent, false)

        return Holder(view, itemClicked)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindCategory(context, categories[position])
    }

    inner class Holder(itemView: View?, val itemClicked: (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {
        val categoryImage = itemView?.findViewById<ImageView>(R.id.imvCategory)
        val categoryName  = itemView?.findViewById<TextView>(R.id.tvCategory)

        fun bindCategory(context: Context, category: Category) {
            val resourceId = context.resources.getIdentifier(
                    category.image, "drawable", context.packageName
            )

            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.title

            itemView.setOnClickListener { itemClicked(category) }
        }
    }

}