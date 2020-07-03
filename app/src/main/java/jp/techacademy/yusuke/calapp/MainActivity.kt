package jp.techacademy.yusuke.calapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sum.setOnClickListener(this)
        dif.setOnClickListener(this)
        pro.setOnClickListener(this)
        quo.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v!=null) {
            when (v.id) {
                R.id.sum -> calcSum()
                R.id.dif -> calcdif()
                R.id.pro -> calcpro()
                R.id.quo -> calcquo()
            }
        }
    }

    private fun calcSum() {
        val intent = Intent(this, SecondActivity::class.java)
        val value1 = textView1.text.toString()
        val num1 = value1.toDouble()
        val value2 = textView2.text.toString()
        val num2 = value2.toDouble()
        intent.putExtra("value", num1 + num2)
        startActivity(intent)
    }

    private fun calcdif() {
        val intent = Intent(this, SecondActivity::class.java)
        val value1 = textView1.text.toString()
        val num1 = value1.toDouble()
        val value2 = textView2.text.toString()
        val num2 = value2.toDouble()
        intent.putExtra("value", num1 - num2)
        startActivity(intent)
    }

    private fun calcpro() {
        val intent = Intent(this, SecondActivity::class.java)
        val value1 = textView1.text.toString()
        val num1 = value1.toDouble()
        val value2 = textView2.text.toString()
        val num2 = value2.toDouble()
        intent.putExtra("value", num1 * num2)
        startActivity(intent)
    }

    private fun calcquo() {
        val intent = Intent(this, SecondActivity::class.java)
        val value1 = textView1.text.toString()
        val num1 = value1.toDouble()
        val value2 = textView2.text.toString()
        val num2 = value2.toDouble()
        intent.putExtra("value", num1 / num2)
        startActivity(intent)
    }
}

