package jp.techacademy.yusuke.calapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.support.v7.app.AlertDialog
import android.util.Log

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
            if (textView1.text.toString() == "" || textView2.text.toString() == "") {
                showAlertDialog()
            } else {
                when (v.id) {
                    R.id.sum -> calcSum()
                    R.id.dif -> calcdif()
                    R.id.pro -> calcpro()
                    R.id.quo -> calcquo()
                }
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

    private fun showAlertDialog() {
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("エラー")
        alertDialogBuilder.setMessage("数値が入力されていません")

        alertDialogBuilder.setPositiveButton("OK"){dialog, which ->
            Log.d("UI_PARTS", "肯定ボタン")
        }

        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }
}

