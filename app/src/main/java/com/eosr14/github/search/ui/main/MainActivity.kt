package com.eosr14.github.search.ui.main

import com.eosr14.github.search.R
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.eosr14.github.search.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel
    private val pagerAdapter by lazy { MainPagerAdapter(supportFragmentManager) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(tag, "LifeCycle Test :: onCreate Called")

        DataBindingUtil.setContentView<ActivityMainBinding>(this@MainActivity, R.layout.activity_main).apply {
            mainViewModel = MainViewModel()
            viewModel = mainViewModel

            viewpagerMain.adapter = pagerAdapter
            tabsMainMenu.setupWithViewPager(viewpagerMain)
        }
    }

    // -- TODO : TEST
    private val tag : String
        get() {
//            return MainActivity::class.java.canonicalName
            return "eosr14Test"
        }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "LifeCycle Test :: onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "LifeCycle Test :: onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "LifeCycle Test :: onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "LifeCycle Test :: onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "LifeCycle Test :: onDestory Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag, "LifeCycle Test :: onRestart Called")
    }

    override fun onBackPressed() {
        super.onBackPressed()
        Log.d(tag, "LifeCycle Test :: onBackPressed Called")
    }

    override fun onUserLeaveHint() {
        super.onUserLeaveHint()
        Log.d(tag, "LifeCycle Test :: onUserLeaveHint Called")
    }

    // -- TODO : TEST END



}

