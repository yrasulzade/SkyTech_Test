package com.skytechtest.utils

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import com.skytechtest.R

/**
 * Created by rasulmammadov on 28,April,2022
 */
class Progress @JvmOverloads constructor(
    context: Context?,
    theme: Int = R.style.dialogTheme
) :
    Dialog(context!!, theme) {
    private val view: View = View.inflate(context, R.layout.progress, null)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val lp = WindowManager.LayoutParams(
            WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )
        setContentView(view, lp)
    }



    init {
        setCanceledOnTouchOutside(false)
    }
}
