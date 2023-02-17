package my.edu.tarc.hellocxl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

//Instant Name: Data Type/Class Name
class MainActivity : AppCompatActivity() {

    //onCreate = main function
    override fun onCreate(savedInstanceState: Bundle?) {

        //super = parent class
        super.onCreate(savedInstanceState)

        //Load UI to Memory
        //R = resources
        setContentView(R.layout.activity_main)

        //Declare variable : val=value(cannot change), var=variable (can change)
        val imageViewQR:ImageView=findViewById(R.id.imageViewQR);
        val textViewName:TextView=findViewById(R.id.textViewName);
        val buttonShow:Button=findViewById(R.id.buttonShow);
        val buttonHide:Button=findViewById(R.id.buttonHide);

        buttonShow.setOnClickListener{
            imageViewQR.visibility=View.VISIBLE
            textViewName.visibility=View.VISIBLE
        }

        buttonHide.setOnClickListener {
            imageViewQR.visibility=View.INVISIBLE
            textViewName.visibility=View.INVISIBLE
        }
    }

}