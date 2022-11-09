package com.vima.studyspots

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

/**
 * A simple [Fragment] subclass.
 * Use the [mapFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MapFragment : Fragment() {
    //private lateinit var binding: MapFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_map, container, false)
        val navToList = view.findViewById<Button>(R.id.listButton)
        val searchButton = view.findViewById<Button>(R.id.searchButton)
        navToList.setOnClickListener {
            goToList()
            //findNavController().navigate(R.id.action_mapFragment_to_studyListFragment)
        }
        searchButton.setOnClickListener {
            performSearch(view)
        }
        return view
    }

    // For Search button
    fun performSearch(view: View) {
        val searchTerm = view?.findViewById<EditText>(R.id.search_bar).text.toString()
        if (searchTerm.equals("")) {
            val duration = Toast.LENGTH_LONG
            val toast = Toast.makeText(context, "Please enter a search term", duration)
            toast.show()
            return
        } else {
            val duration = Toast.LENGTH_LONG
            val toast = Toast.makeText(context, searchTerm, duration)
            toast.show()
        }
        val intent = Intent(getActivity(), StudyListActivity::class.java)
        intent.putExtra("SearchTerm", searchTerm)
        startActivity(intent)
    }

    // for play button
    fun goToList() {
        val intent = Intent(getActivity(), StudyListActivity::class.java)
        intent.putExtra("SearchTerm", "")
        startActivity(intent)
    }
}