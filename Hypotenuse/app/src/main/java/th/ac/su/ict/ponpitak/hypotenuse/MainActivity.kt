package th.ac.su.ict.ponpitak.hypotenuse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var inputA = findViewById<EditText>(R.id.inputA)
        var inputB = findViewById<EditText>(R.id.inputB)
        var showText = findViewById<TextView>(R.id.showSummary)
        var btn = findViewById<Button>(R.id.btnSolve)


        btn.setOnClickListener(){
            var inA: Double = inputA.text.toString().toDouble()
            var inB: Double = inputB.text.toString().toDouble()

            var calCD = (inA*inA)+(inB*inB)
            showText.text = "C ="+ sqrt(calCD)
        }
    }
}