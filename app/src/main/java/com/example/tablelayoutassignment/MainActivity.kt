package com.example.tablelayoutassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun click(view: View)  {
        addTable()
    }

    private fun addTable() {
        var tl : TableLayout = findViewById(R.id.table_main)
            var tr: TableRow = TableRow(this)
            var ntr1: TextView = TextView(this)
            var ntr2: TextView = TextView(this)
            var nameAndroid: EditText  = findViewById(R.id.androidName)
            var versionAndroid: EditText = findViewById(R.id.androidVersion)
            ntr1.text = nameAndroid.text
            tr.addView(ntr2)
            ntr2.text = versionAndroid.text
            tr.addView(ntr1)
            tl.addView(tr)
    }
}