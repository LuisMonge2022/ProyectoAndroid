package idat.dadmi.ec1_grupo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import idat.dadmi.ec1_grupo1.databinding.ActivityPregunta2Binding


class Pregunta2 : AppCompatActivity() , View.OnClickListener{

    private lateinit var binding:ActivityPregunta2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_pregunta2)

        binding= ActivityPregunta2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVerPromedio.setOnClickListener(this)

    }

    override fun onClick(p0: View) {


        var resultado: Double=0.0
        var nota1 = binding.edtNota1.text.toString()
        var nota2 = binding.edtNota2.text.toString()
        var nota3 = binding.edtNota3.text.toString()
        var nota4 = binding.edtNota4.text.toString()

        if (nota1==null || nota2==null ||nota3==null ||nota4==null||
            nota1=="" || nota2=="" ||nota3=="" ||nota4=="" ){
            binding.txtResultado.text = "Llene todos los campos"
        }else {
            var notafin1=nota1.toDouble()
            var notafin2=nota2.toDouble()
            var notafin3=nota3.toDouble()
            var notafin4=nota4.toDouble()
            if(notafin1>20 || notafin2>20 ||notafin3>20 ||notafin4>20||
                notafin1<0 || notafin2<0 ||notafin3<0 ||notafin4<0) {
                binding.txtResultado.text = "Ingrese notas válidas (0-20)"

            }else{
                if(notafin1 <= notafin2 && notafin1 <= notafin3 && notafin1 <= notafin4 ){
                    resultado = notafin2 * 0.2 + notafin3 *0.3 + notafin4 * 0.5
                }else if (notafin2 <= notafin1 && notafin2 <= notafin3 && notafin2 <= notafin4 ){
                    resultado = notafin1 * 0.2 + notafin3 *0.3 + notafin4 * 0.5
                }else if(notafin3 <= notafin2 && notafin3 <= notafin1 && notafin3 <= notafin4 ){
                    resultado = notafin1 * 0.2 + notafin2 *0.3 + notafin4 * 0.5
                }else if(notafin4 <= notafin2 && notafin4 <= notafin3 && notafin4 <= notafin1 ){
                    resultado = notafin1 * 0.2 + notafin2 *0.3 + notafin3 * 0.5
                }

                /*val notas = doubleArrayOf(notafin1, notafin2, notafin3, notafin4)
                notas.sort()

                resultado = notas[1] * 0.2 + notas[2] * 0.3 + notas[3] * 0.5*/

                binding.txtResultado.text = "El promedio es $resultado"
            }
        }

    }


    fun regresarInicio2(p0:View){
       val intent = Intent(this,Inicio ::class.java)
        startActivity(intent)
    }
}