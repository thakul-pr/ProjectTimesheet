package com.example.projecttimesheet.android.app

import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.projecttimesheet.R

abstract class ToolbarActivity : AppCompatActivity() {
    private var customTitleTextView: TextView? = null

    override fun setContentView(layoutResID: Int) {
        super.setContentView(layoutResID)

        setupToolbar()
    }

    override fun setContentView(view: View?) {
        super.setContentView(view)

        setupToolbar()
    }

    override fun setContentView(view: View?, params: ViewGroup.LayoutParams?) {
        super.setContentView(view, params)

        setupToolbar()
    }

    override fun setTitle(@StringRes titleId: Int) {
        super.setTitle(title)
        customTitleTextView?.text = getText(titleId)
    }

    override fun setTitle(title: CharSequence?) {
        super.setTitle(title)
        customTitleTextView?.text = title
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            if (!onSupportNavigateUp()) {
                onBackPressed()
            }

            return true
        }

        return super.onOptionsItemSelected(item)
    }

    private fun setupToolbar() {
        findViewById<Toolbar>(R.id.toolbar)?.let { toolbar ->
            setSupportActionBar(toolbar)

            val a = theme.obtainStyledAttributes(intArrayOf(R.attr.displayOptions))

            if (a.hasValue(0)) {
                supportActionBar?.displayOptions = a.getInt(0, 0)
            }

            a.recycle()

            customTitleTextView = findViewById(R.id.pageTitle)
        }
    }
}