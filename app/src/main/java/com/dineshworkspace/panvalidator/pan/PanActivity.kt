package com.dineshworkspace.panvalidator.pan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dineshworkspace.panvalidator.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pan)
    }
}