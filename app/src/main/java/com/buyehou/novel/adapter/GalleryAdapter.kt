package com.buyehou.novel.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.buyehou.novel.R

/**
 * 画廊效果
 * @author Rosen
 * @date 2023/8/28 18:16
 */
class GalleryAdapter(private val context: Context, private val data: List<Int>) : PagerAdapter() {


    override fun getCount(): Int {
        return data.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = View.inflate(container.context, R.layout.item_book, null)
        view.findViewById<ImageView>(R.id.iv_book_cover).setImageResource(data[position])
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

}