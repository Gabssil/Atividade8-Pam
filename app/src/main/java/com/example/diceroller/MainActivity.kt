package com.example.diceroller
//Feito por Gabriela Silva - 3º DS A
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.btnRoll)
        rollButton.setOnClickListener { rollDice()


    }

}
    private fun rollDice() {
    val dice = Diceroller(6)
    val diceRoll = dice.roll()
    val diceImage: ImageView = findViewById(R.id.imageView)

    when (diceRoll) {
        1 -> diceImage.setImageResource(R.drawable.dado1)
        2 -> diceImage.setImageResource(R.drawable.dado2)
        3 -> diceImage.setImageResource(R.drawable.dado3)
        4 -> diceImage.setImageResource(R.drawable.dado4)
        5 -> diceImage.setImageResource(R.drawable.dado5)
        6 -> diceImage.setImageResource(R.drawable.dado6)
    }

    val sortRoll = dice.roll()
    val sortTextView: TextView = findViewById(R.id.luckyNumber)
    val txtResultado: TextView = findViewById(R.id.txtRes)

    sortTextView.text = sortRoll.toString();


        txtResultado.setText("Você pontuou!!")
}
}