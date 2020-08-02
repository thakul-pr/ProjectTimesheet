package com.example.projecttimesheet.android.app

import android.os.Bundle
import com.example.projecttimesheet.R

class MainActivity : AuthorizedActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}