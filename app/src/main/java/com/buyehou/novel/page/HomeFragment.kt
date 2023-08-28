package com.buyehou.novel.page

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.buyehou.novel.BaseFragment
import com.buyehou.novel.adapter.GalleryAdapter
import com.buyehou.novel.databinding.FragmentHomeBinding

/**
 * @author Rosen
 * @date 2023/8/28 15:17
 */
class HomeFragment : BaseFragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initBookCoverAdapter()
    }

    private fun initBookCoverAdapter() {
        binding.vpBook.apply {
            adapter = GalleryAdapter()
            currentItem = 1
            offscreenPageLimit = 34
            setPageTransformer(object : ViewPager2.PageTransformer {
                override fun transformPage(page: View, position: Float) {
                    if (position <= 1) {

                    }
                }
            })
        }
    }

}