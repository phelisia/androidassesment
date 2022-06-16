package dev.phelisia.assesmentandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class calculateActivity : AppCompatActivity() {
    lateinit var tilnum1:TextInputLayout
    lateinit var etnum1:TextInputEditText
    lateinit var tilnum2:TextInputLayout
    lateinit var etnum2:TextInputEditText
    lateinit var tvResult:TextView
    lateinit var btnadd:Button
    lateinit var btnsubtract:Button
    lateinit var btnmodulus:Button
    lateinit var btndivide:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilnum1=findViewById(R.id.tilnum1)
        etnum1=findViewById(R.id.etnum1)
        tilnum2=findViewById(R.id.tilnum2)
        etnum2=findViewById(R.id.etnum2)
        btnadd=findViewById(R.id.btnadd)
        btnsubtract=findViewById(R.id.btnSubtract)
        btnmodulus=findViewById(R.id.btnmodulus)
        btndivide=findViewById(R.id.btndivide)
        tvResult=findViewById(R.id.tvResult)
        btnadd.setOnClickListener {
            tvResult.text=""
            val num1=etnum1.text.toString()
            val num2=etnum2.text.toString()
            if(num1.isBlank()){
                tilnum1.setError("number is required")
                return@setOnClickListener

            }

            if(num2.isBlank()){
                tilnum2.setError("number is required")
                return@setOnClickListener

            }
           add(num1.toDouble(),num2.toDouble())
        }
        btnsubtract.setOnClickListener {
            tvResult.text=""
            val num1=etnum1.text.toString()
            val num2=etnum2.text.toString()
            if(num1.isBlank()){
                tilnum1.setError("number is required")
                return@setOnClickListener

            }
            if(num2.isBlank()){
                tilnum2.setError("number is required")
                return@setOnClickListener

            }
            subtract(num1.toDouble(),num2.toDouble())
        }
        btnmodulus.setOnClickListener {
            tvResult.text=""
            val num1=etnum1.text.toString()
            val num2=etnum2.text.toString()
            if(num1.isBlank()){
                tilnum1.setError("number is required")
                return@setOnClickListener

            }
            if(num2.isBlank()){
                tilnum2.setError("number is required")
                return@setOnClickListener

            }
            modulus(num1.toDouble(),num2.toDouble())
        }
        btndivide.setOnClickListener {
            tvResult.text=""
            val num1=etnum1.text.toString()
            val num2=etnum2.text.toString()
            if(num1.isBlank()){
                tilnum1.setError("number is required")
                return@setOnClickListener

            }
            if(num2.isBlank()){
                tilnum2.setError("number is required")
                return@setOnClickListener

            }
            divide(num1.toDouble(),num2.toDouble())
        }



    }
    fun add(num1:Double,num2: Double){
        val total=num1+num2
        tvResult.text=total.toString()

    }
    fun subtract(num1:Double,num2: Double){
        val total=num1-num2
        tvResult.text=total.toString()

    }
    fun modulus(num1:Double,num2: Double){
        val total=num1%num2
        tvResult.text=total.toString()

    }
    fun divide(num1:Double,num2: Double){
        val total=num1/num2
        tvResult.text=total.toString()

    }



}