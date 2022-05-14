package idat.dadmi.ec1_grupo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import idat.dadmi.ec1_grupo1.databinding.ActivityPregunta1Binding

class Pregunta1 : AppCompatActivity() , View.OnClickListener {

    private lateinit var binding:ActivityPregunta1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_pregunta1)
        binding = ActivityPregunta1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btncalcular.setOnClickListener(this)


    }

    override fun onClick(p0: View?) {

        var horas = binding.txthoras.text.toString()
        var minutos = binding.txtminutos.text.toString()
        var tarifa = 1.500


        if (horas == null || minutos == null || horas == "" || minutos == "" ) {
            binding.tvresultado.text = "Llene todos los campos"
        }else {
            var horas1 = horas.toInt()
            var minutos1 = minutos.toInt()
            if (minutos1>59){
                binding.tvresultado.text = "Cantidad de minutos inválida (máximo 59)"
            }else{
                if (minutos1 > 0) {
                    horas1 = horas1 + 1
                }
                var pago_total = horas1 * tarifa
                binding.tvresultado.text = "Su cuenta es $pago_total Soles por $horas horas y $minutos minutos"
                }
            }
        }




    fun regresarInicio1(p0:View){
        val intent = Intent(this,Inicio ::class.java)
        startActivity(intent)
    }
}