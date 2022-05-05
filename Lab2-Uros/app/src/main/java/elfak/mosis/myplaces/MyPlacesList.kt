package elfak.mosis.myplaces

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import elfak.mosis.myplaces.databinding.ActivityMyPlacesListBinding


class MyPlacesList : AppCompatActivity() {

    private lateinit var binding: ActivityMyPlacesListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMyPlacesListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        val listView: ListView = findViewById<ListView>(R.id.my_places_list)
        val places = arrayOf("Tvrdjava", "Trg Kralja Milana", "Cair", "Park Svetog Save")

        val placesAdapter: ArrayAdapter<String> =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, places)
        listView.adapter = placesAdapter
    }

    override fun onSupportNavigateUp(): Boolean {
        return super.onSupportNavigateUp()
    }
}