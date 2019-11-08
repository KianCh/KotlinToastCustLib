package com.kiran.toastcustlib

import android.content.Context
import android.widget.Toast



public object Toast2Cust{

    fun s(c: Context, message: String) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}