package ec.over.practica

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val num1 = findViewById<EditText>(R.id.editText)
        val num2 = findViewById<EditText>(R.id.editText2)
        val sumar = findViewById<Button>(R.id.sumar)
        val restar = findViewById<Button>(R.id.restar)
        val multiplicar = findViewById<Button>(R.id.multiplicar)
        var Resultado = findViewById<TextView>(R.id.Resultado)
        val salir = findViewById<ImageButton>(R.id.salir)
        val dividir = findViewById<Button>(R.id.dividir)
        val potencia = findViewById<Button>(R.id.potencia)

sumar.setOnClickListener {
    val num1: Int = num1.text.toString().toInt()
    val num2 = num2.text.toString().toInt()
    val suma = num1 + num2
    Resultado.setText(suma.toString())
} //cierre de setonclicklistener sumar
        restar.setOnClickListener {
            val num1 = num1.text.toString().toInt()
            val num2 = num2.text.toString().toInt()
            val resta = num1 - num2
            Resultado.setText(resta.toString())
            } //cierre de setonclicklistener restar
multiplicar.setOnClickListener {
    val num1 = num1.text.toString().toInt()
    val num2 = num2.text.toString().toInt()
    val multiplicacion = num1 * num2
    Resultado.setText(multiplicacion.toString())
} //cierre de setonclicklistener multiplicar
        dividir.setOnClickListener {
            val num1 = num1.text.toString().toInt()
            val num2 = num2.text.toString().toInt()
            val division = num1 / num2
            Resultado.setText(division.toString())}//cierre de setonclicklistener dividir
        potencia.setOnClickListener {
            val num1 = num1.text.toString().toInt()
            val num2 = num2.text.toString().toInt()
            val potencia = Math.pow(num1.toDouble(), num2.toDouble())
            Resultado.setText(potencia.toString())
        }//cierre de setonclicklistener potencia
        salir.setOnClickListener {
            finish()
        } //cierre de setonclicklistener salir

    }//llave de cierre metodo oncreate


}