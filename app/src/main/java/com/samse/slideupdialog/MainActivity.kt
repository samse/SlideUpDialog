package com.samse.slideupdialog

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lv = findViewById<ListView>(R.id.listview);0
        lv.adapter = ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                arrayOf("SlideUp Dialog 1", "SlideUp Dialog 2")
        )
        lv.setOnItemClickListener { _: AdapterView<*>?, _: View?, position: Int, _: Long ->
            if (position == 0) {
                onSlideUpDialog();
            } else if (position == 1) {
                onSlideUpDialog2();
            }
        }
    }

    private fun onSlideUpDialog() {
        var contentView: View = (getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater).inflate(R.layout.popup_slideup, null)
        val slideupPopup = SlideUpDialog.Builder(this)
                .setContentView(contentView)
                .create()
        slideupPopup.show()
        contentView.findViewById<Button>(R.id.close).setOnClickListener {
            slideupPopup.dismissAnim()
        }
    }

    private fun onSlideUpDialog2() {
        var contentView: View = (getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater).inflate(R.layout.popup_slideup2, null)
        val slideupPopup = SlideUpDialog.Builder(this)
                .setContentView(contentView)
                .create()
        slideupPopup.show()
        contentView.findViewById<Button>(R.id.close).setOnClickListener {
            slideupPopup.dismissAnim()
        }
    }
}