package jp.techacademy.yusuke.calapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value2nd = intent.getDoubleExtra("value", 0.0)

        textView.text = "$value2nd"

    }
}
