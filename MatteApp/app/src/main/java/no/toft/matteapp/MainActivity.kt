package no.toft.matteapp

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {


    lateinit var svar: EditText
    lateinit var  tilbakemelding1: TextView
    lateinit var  tilbakemelding2: TextView
    lateinit var mattestykke: TextView
    lateinit var knapp: Button

    var gangeObj : GangeClasse = GangeClasse(1, 10)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        svar = findViewById(R.id.svarInn)
        tilbakemelding1 = findViewById(R.id.Tilbakemelding1)
        tilbakemelding2 = findViewById(R.id.tilbakemelding2)
        mattestykke = findViewById(R.id.ReknestykkeOut)
        knapp = findViewById(R.id.SvarKanpp)

        knapp.setOnClickListener(this)

        mattestykke.text = gangeObj.getregnestykke()
    }


    override fun onClick(view: View?) {
        var svarTekst = svar.text.toString().toInt()
        var tilbakemeldingBoolean = gangeObj.sjekkSvar(svarTekst)

        if (tilbakemeldingBoolean){
            tilbakemelding1.text = "Riktig"
            tilbakemelding1.setTextColor(Color.GREEN)
        }
        else{
            tilbakemelding1.text = "Feil"
            tilbakemelding1.setTextColor(Color.RED)
        }

        tilbakemelding2.text = gangeObj.stat()
        mattestykke.text = gangeObj.getregnestykke()


    }


}
