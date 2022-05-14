package idat.dadmi.ec1_grupo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import idat.dadmi.ec1_grupo1.databinding.ActivityInicioBinding

class Inicio : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityInicioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        binding= ActivityInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPregunta1.setOnClickListener(this)
    }



    override fun onClick(v: View?) {
        val intent = Intent(this,Pregunta1 ::class.java)
        startActivity(intent)
    }

    fun preguntaDos(p0:View){
        val intent = Intent(this,Pregunta2 ::class.java)
        startActivity(intent)
    }

    fun preguntaTres(p0:View){
        val intent = Intent(this,Pregunta3 ::class.java)
        startActivity(intent)
    }

    fun preguntaCuatro(p0:View){
        val intent = Intent(this,Pregunta4 ::class.java)
        startActivity(intent)
    }
}