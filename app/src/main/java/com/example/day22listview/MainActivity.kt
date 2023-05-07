package com.example.day22listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview = findViewById<ListView>(R.id.listview)
        val tasklist = arrayListOf<String>()
        tasklist.add("Attend the Exam ")
        tasklist.add("Prepare the preparation Plan ")
        tasklist.add("Complete the assignment ")
        tasklist.add("Create a Resume ")
        tasklist.add("Improving spoken English")

        val myadapter =ArrayAdapter(this,android.R.layout.simple_list_item_1,tasklist)
        listview.adapter = myadapter

        listview.setOnItemClickListener { adapterView, view, i, l ->
            val text = "Clicked on item : " + (view as TextView).text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }
    }
}