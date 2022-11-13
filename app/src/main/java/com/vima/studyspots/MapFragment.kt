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
import androidx.fragment.app.FragmentActivity
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions

/**
 * A simple [Fragment] subclass.
 * Use the [mapFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MapFragment : Fragment(), OnMapReadyCallback {
    //private lateinit var binding: MapFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
//        mapFragment.getMapAsync(this)
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
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
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

    override fun onMapReady(googleMap: GoogleMap) {
        googleMap.addMarker(
            MarkerOptions()
                .position(LatLng(30.28614, -97.73942))
                .title("UT Austin"))
        googleMap.addMarker(
            MarkerOptions()
                .position(LatLng(30.287183167191333, -97.73777850731048))
                .title("WEL"))
        googleMap.addMarker(
            MarkerOptions()
                .position(LatLng(30.28913631032302, -97.73551661569718))
                .title("EER"))
    }
}