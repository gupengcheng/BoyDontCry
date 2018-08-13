package com.gpc.boydoncry.activity

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager
import android.widget.TextView
import com.gpc.boydoncry.R

class SplashActivity : AppCompatActivity() {

    var mView: TextView? = null

    lateinit var mContext: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        mContext = this
        mView?.setText("ddd")

        // or add <item name="android:windowTranslucentStatus">true</item> in the theme
//        window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)

//        val attrib = window.attributes
//        attrib.layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES

    }

}