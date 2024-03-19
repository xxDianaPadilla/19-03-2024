package diana.padilla.programaciondiana

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val numero1 = findViewById<EditText>(R.id.txtNum1)
        val numero2 = findViewById<EditText>(R.id.txtNum2)
        val botonSumar = findViewById<Button>(R.id.btnSumar)
        val Resultado = findViewById<TextView>(R.id.txtResultado)

        val objCalculadora = Calculadora()


        botonSumar.setOnClickListener {
            val result = objCalculadora.Sumar(numero1.text.toString().toInt(), numero2.text.toString().toInt())
            Toast.makeText(this, "Este es el resultado: $result", Toast.LENGTH_LONG).show()

            Resultado.text = "El resultado es: $result"
        }
    }

}
