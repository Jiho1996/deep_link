package com.foo.deep_link

import android.app.Activity
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun setClipBoardLink(context: Context, link:String){
        val clipboardManager:ClipboardManager = context.getSystemService(Activity.CLIPBOARD_SERVICE)as ClipboardManager
        val clip: ClipData = ClipData.newPlainText("simple text", "Hello, World!")
        // clipboardManager.PrimaryClip = clipData
        Toast.makeText(context,"클립보드에 복사되었습니다.", Toast.LENGTH_SHORT).show()
    }

}
