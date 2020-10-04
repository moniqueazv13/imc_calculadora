package com.example.imc
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        calcular.setOnClickListener {
            val x = (altura.text).toString().toFloat() / 100
            val y = (peso.text).toString().toFloat()
            val total = y / (x * x)
          val  imc = "%.2f".format(total)

                 if (total <= 18.5) {
                     Toast.makeText(this, "O seu IMC é: "+imc+"  e a sua condição é de magreza", Toast.LENGTH_SHORT).show()
            } else if (total>= 18.5 && total<=24.9) {
                     Toast.makeText(this, "O seu IMC é: "+imc+"  e a sua condição é normal", Toast.LENGTH_SHORT).show()

                 } else if (total>= 25 && total<=29.9) {
                     Toast.makeText(this, "O seu IMC é: "+imc+"  e a sua condição é de sobrepeso", Toast.LENGTH_SHORT).show()


                 } else if (total>= 30 && total<=39.9) {
            Toast.makeText(this, "O seu IMC é: "+imc+"  e a sua condição é de obesidade", Toast.LENGTH_SHORT).show()


                 } else if (total>= 40) {
                     Toast.makeText(this, "O seu IMC é: "+imc+"  e a sua condição é obesidade grave", Toast.LENGTH_SHORT).show()


                 }else{


            Toast.makeText(this, "Preencha os campos corretamente", Toast.LENGTH_SHORT).show()
            }

        }
    }
}









