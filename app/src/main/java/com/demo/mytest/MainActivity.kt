package com.demo.mytest

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.jaeger.library.OnSelectListener
import com.jaeger.library.SelectableTextHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var mSelectableTextHelper: SelectableTextHelper? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mSelectableTextHelper = SelectableTextHelper.Builder(tv_test)
            .setSelectedColor(resources.getColor(R.color.selected_blue))
            .setCursorHandleSizeInDp(20f)
            .setCursorHandleColor(resources.getColor(R.color.cursor_handle_color))
            .build()
    }
}