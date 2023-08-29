package com.buyehou.novel.page

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.buyehou.novel.BaseFragment
import com.buyehou.novel.R
import com.buyehou.novel.databinding.FragmentHomeBinding
import kotlin.math.abs

private const val MAX_SCALE = 1f

private const val MIN_SCALE = 0.8f

/**
 * @author Rosen
 * @date 2023/8/28 15:17
 */
class HomeFragment : BaseFragment() {

    private val data = listOf(
        R.drawable.img_book1,
        R.drawable.img_book1,
        R.drawable.img_book1,
        R.drawable.img_book1,
        R.drawable.img_book1
    )

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
        binding.rvBook.apply {
        }
    }

}