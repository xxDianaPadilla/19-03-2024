package diana.padilla.programaciondiana

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Calendar

class Calculadora_de_Edad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calculadora_de_edad)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val añoNacimiento = findViewById<EditText>(R.id.txtAñoNacimiento)
        val botonEdad = findViewById<Button>(R.id.btnEdad)

        botonEdad.setOnClickListener {
            val result = añoNacimiento.text.toString()

            if (result.isNotEmpty()){
                val añoActual = Calendar.getInstance().get(Calendar.YEAR)
                val nacimiento = result.toInt()
                val edad = añoActual - nacimiento

                Toast.makeText(this, "Tú edad actual es: $edad", Toast.LENGTH_LONG).show()
            }
        }
    }
}