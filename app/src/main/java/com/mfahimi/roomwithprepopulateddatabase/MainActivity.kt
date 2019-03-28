package com.mfahimi.roomwithprepopulateddatabase

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.Executors

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Executors.newSingleThreadExecutor().execute {

            val db = AppDatabase.getInstance(this)
            val content = db.contentDao()

            Log.e("TAG", "db size: ${content.getFirstItem().size}")
            text.setText(content.getFirstItem().get(0).english)

        }

    }

}
