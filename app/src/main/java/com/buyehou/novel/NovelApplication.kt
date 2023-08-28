package com.buyehou.novel

import android.app.Application

/**
 * @author Rosen
 * @date 2023/8/28-14:56
 */
class NovelApplication : Application() {

    companion object {
        lateinit var app: Application
    }

    override fun onCreate() {
        super.onCreate()
        app = this
    }

}