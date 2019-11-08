package com.kiran.toastcustlib

import android.content.Context
import android.widget.Toast

public class Toast2Cust{

    fun s(c: Context, message: String) {
        //===Changed to Kotlin===========
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}