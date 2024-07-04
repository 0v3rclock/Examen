package ec.over.practica

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class Splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)
        irNuevaActivity()
    }

    private fun irNuevaActivity() {
      var handler = Handler().postDelayed({
startActivity(Intent(this, MainActivity::class.java))
          finish()
      },2500)
    }
}