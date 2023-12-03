package com.crx.bestpractices.ui

import android.os.Bundle
import android.util.TypedValue
import com.crx.bestpractices.databinding.ActivitySecondBinding

class SecondActivity : BaseActivity() {

    private val lazyVb by lazy { ActivitySecondBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(lazyVb.root)
        lazyVb.tvNumbers.text = "fdfdfdf"
        lazyVb.tvNumbers.setOnClickListener {
            lazyVb.tvNumbers.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24f)
        }
    }


}