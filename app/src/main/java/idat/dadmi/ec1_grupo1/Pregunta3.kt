package idat.dadmi.ec1_grupo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import idat.dadmi.ec1_grupo1.databinding.ActivityPregunta3Binding
import java.time.Instant

class Pregunta3 : AppCompatActivity(),View.OnClickListener {

    private lateinit var binding :ActivityPregunta3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_pregunta3)
        binding = ActivityPregunta3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnverificar.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        var nombre = binding.txtnombre.text.toString()
        var anio = binding.txtanio.text.toString()
        var resultado: String
        if (nombre == "" || anio == "" || anio == null) {
            resultado = "llenar los campo requeridos"

        } else {
            var anio1 = anio.toInt()
            var edad =  2022 - anio1
            if(edad<0){
                resultado = "Ingrese una año de nacimiento válido (2022 o antes)"
            }else if (edad > 120) {
                resultado = "señor(a) $nombre, tiene $edad años, el año que ingresó es incorrecto"
            }else if (edad >= 18 && edad <=120) {
                resultado = "señor(a) $nombre ya puede solicitar su DNI"
            } else {
                resultado = "señor(a) $nombre aun no puede solicitar su DNI"
            }
        }
        binding.txtresultado.text = "$resultado"
    }

    fun regresarInicio3(p0:View){
        val intent = Intent(this,Inicio ::class.java)
        startActivity(intent)
    }

}