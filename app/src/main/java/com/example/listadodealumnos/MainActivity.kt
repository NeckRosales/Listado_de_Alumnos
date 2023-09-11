package com.example.listadodealumnos



import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager


//import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val alumnos = mutableListOf<Alumno>()
    private lateinit var adapter: AlumnoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val btnAgregar: Button = findViewById(R.id.btnAgregar)

        adapter = AlumnoAdapter(alumnos)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        btnAgregar.setOnClickListener {
            // Agregar un nuevo alumno a la lista

            alumnos.add(Alumno("Carlos", "101815", R.drawable.staxx, "carlos@gmail.com"))
            adapter.notifyDataSetChanged()
            alumnos.add(Alumno("Alexander", "852714", R.drawable.alexby, "alexander@gmail.com"))
            adapter.notifyDataSetChanged()
            alumnos.add(Alumno("Fernanda", "171000", R.drawable.vegetta, "fernanda@gmail.com"))
            adapter.notifyDataSetChanged()
            alumnos.add(Alumno("Anya", "180503", R.drawable.willyrex, "anya@gmail.com"))
        }
    }
}