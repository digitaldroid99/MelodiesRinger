/*
 * *
 *  * Created by Youssef Assad on 6/2/18 11:22 AM
 *  * Copyright (c) 2018 . All rights reserved.
 *  * Last modified 6/2/18 11:04 AM
 *
 */

package com.nanosoft.melodies.Views

import android.content.Context
import android.graphics.Typeface
import android.support.v7.widget.AppCompatTextView
import android.util.AttributeSet
import com.nanosoft.melodies.R


/**
 * Created by Joseph27 on 2/1/16.
 */
class CustomTextView : AppCompatTextView {

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {

        init(attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init(attrs)
    }

    private fun init(attrs: AttributeSet?) {
        if (attrs != null) {
            val a = context.obtainStyledAttributes(attrs, R.styleable.MyTextView)
            val fontName = a.getString(R.styleable.MyTextView_fontName)
            if (fontName != null) {
                val myTypeface = Typeface.createFromAsset(context.assets, "fonts/" + fontName)
                typeface = myTypeface
            }
            a.recycle()
        }
    }

}
