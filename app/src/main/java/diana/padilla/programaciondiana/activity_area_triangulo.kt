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

class activity_area_triangulo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_area_triangulo)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val baseTriangulo = findViewById<EditText>(R.id.txtBase)
        val alturaTriangulo = findViewById<EditText>(R.id.txtAltura)
        val botonArea = findViewById<Button>(R.id.btnArea)

        botonArea.setOnClickListener {
            val base = baseTriangulo.text.toString()
            val altura = alturaTriangulo.text.toString()

            if (base.isNotEmpty() && altura.isNotEmpty()){
                val base2 = base.toDouble()
                val altura2 = altura.toDouble()
                val area = base2 * altura2 / 2

                Toast.makeText(this, "El área del triángulo es: $area cm²", Toast.LENGTH_LONG).show()
            }
        }
    }
}