package diana.padilla.programaciondiana

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_par_impar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_par_impar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txtnumero = findViewById<EditText>(R.id.txtNumero)
        val botonNumero = findViewById<Button>(R.id.btnNumero)

        botonNumero.setOnClickListener {
            val numero = txtnumero.text.toString()

            if (numero.isNotEmpty()){

                val numero1 = numero.toInt()

                val resultado = if (numero1 % 2 == 0){
                    Toast.makeText(this, "El número $numero es par", Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this, "El número $numero es impar", Toast.LENGTH_LONG).show()
                }

            }
        }
    }
}