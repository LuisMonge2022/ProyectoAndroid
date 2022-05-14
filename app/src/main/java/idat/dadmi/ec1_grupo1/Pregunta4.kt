package idat.dadmi.ec1_grupo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import idat.dadmi.ec1_grupo1.databinding.ActivityPregunta4Binding

class Pregunta4 : AppCompatActivity(),View.OnClickListener {

    private lateinit var binding:ActivityPregunta4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta4)

        binding= ActivityPregunta4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPares.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var resultado:String =""
        var i=20
        while (i>=10 ){
            if(i%2!=0){
                i=i-1
                continue
            }else{
                resultado =resultado+","+i
                i=i-1
            }
            binding.txtResultado4.text = "$resultado"
        }

    }

    fun regresarInicio4(p0:View){
        val intent = Intent(this,Inicio ::class.java)
        startActivity(intent)
    }
}