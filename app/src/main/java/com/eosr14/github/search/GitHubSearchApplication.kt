package com.eosr14.github.search

import android.app.Application
import android.content.Context

class GitHubSearchApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        private lateinit var instance: GitHubSearchApplication

        fun applicationContext(): Context {
            return instance.applicationContext
        }
    }

}