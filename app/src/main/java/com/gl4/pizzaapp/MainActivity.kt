package com.gl4.pizzaapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {
    lateinit var nom: TextInputEditText
    lateinit var prenom: TextInputEditText
    lateinit var adresse: TextInputEditText
    lateinit var mini: RadioButton
    lateinit var moy: RadioButton
    lateinit var maxi: RadioButton
    lateinit var fromage: CheckBox
    lateinit var champignon: CheckBox
    lateinit var saucisson: CheckBox
    lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nom = findViewById(R.id.nom)
        prenom = findViewById(R.id.prenom)
        adresse = findViewById(R.id.adresse)
        mini = findViewById(R.id.radio_button_3)
        moy = findViewById(R.id.radio_button_2)
        maxi = findViewById(R.id.radio_button_1)
        fromage = findViewById(R.id.fromage)
        champignon = findViewById(R.id.champignon)
        saucisson = findViewById(R.id.saucisson)
        btn = findViewById(R.id.textButton)
    }

    var recipient: String = "pizzastore@pizza.tn"
    var objet: String = "Nouvelle Commande"
    var content: String = ""
    var taille: String = ""

    fun commander(view: View){
        if (mini.isChecked) {taille = "mini"}
        else if (moy.isChecked) {taille = "moyenne"}
        else taille = "maxi"

        content += "Mr/Mme ${prenom.text.toString()} ${nom.text.toString()}\n" +
                "Adresse : ${adresse.text.toString()}\n" +
                "Taille Pizza: ${taille}\n" +
                "Toppings : "

        if(fromage.isChecked) content += " fromage "
        if(champignon.isChecked) content += " champignon "
        if(saucisson.isChecked) content += " saucisson "

        val intentEmail = Intent(
            Intent.ACTION_SEND,
            Uri.parse("mailto:")
        )
        intentEmail.putExtra(Intent.EXTRA_EMAIL, recipient)
        intentEmail.putExtra(Intent.EXTRA_SUBJECT, objet)
        intentEmail.putExtra(Intent.EXTRA_TEXT, content)
        intentEmail.type = "text/plain"

        startActivity(Intent.createChooser(intentEmail, "Choisir une application"))
    }

}