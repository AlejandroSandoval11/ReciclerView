package com.example.reciclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.reciclerview.R
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)

        val listaDeLugares = ArrayList<Lugar>()
        listaDeLugares.add(Lugar("Ameca","https://talajalisconoticias.com/wp-content/uploads/2020/05/ameca.jpg","Venden Picones"))
        listaDeLugares.add(Lugar("San Martin de Hidalgo","https://media.ocioenlinea.com/uploads/media/2021/04/05/san-martin-de-hidalgo-gr.jpg","Venden Birria"))
        listaDeLugares.add(Lugar("Tapalpa","https://udgtv.com/wp-content/uploads/2020/08/Tapalpa-Mart%C3%ADn-%C3%81guilar.jpeg","Venden Rompope"))
        listaDeLugares.add(Lugar("Hacienda San Isidro Mazatepec","https://images.trvl-media.com/hotels/46000000/45630000/45622300/45622264/02eb061c.jpg?impolicy=resizecrop&rw=1200&ra=fit", "Hacienda San Isidro"))
        listaDeLugares.add(Lugar("Mazamitla", "https://mediaim.expedia.com/destination/9/cb5a82939242b7f9f71114f0568092a8.jpg", "Renta de Cabanas"))

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = LugarAdapter(listaDeLugares,this )
    }
}