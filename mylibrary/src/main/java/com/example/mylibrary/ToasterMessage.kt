package com.example.mylibrary

import android.content.Context
import android.widget.Toast

object ToasterMessage {
    fun showMessage(ctx: Context, message:String?){
        if(!message.isNullOrEmpty())
            Toast.makeText(ctx,message,Toast.LENGTH_LONG).show()
    }
}