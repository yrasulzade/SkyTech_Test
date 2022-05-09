package com.skytechtest.utils

import android.app.ProgressDialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.WindowManager
import com.skytechtest.R

/**
 * Created by rasulmammadov on 17,July,2021
 */
class Utils {
    companion object {
        fun showLoadingDialog(context: Context?): ProgressDialog? {
            val progressDialog = ProgressDialog(context)
            progressDialog.show()
            if (progressDialog.window != null) {
                progressDialog.window!!
                    .setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                progressDialog.window!!
                    .clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND) // makes transparent background
            }
            progressDialog.setContentView(R.layout.progress)
            progressDialog.isIndeterminate = false
            progressDialog.setCancelable(false)
            progressDialog.setCanceledOnTouchOutside(false)
            return progressDialog
        }
    }
}