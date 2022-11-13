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
import com.vima.studyspots.data.DataSource

/**
 * A simple [Fragment] subclass.
 * Use the [mapFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MapFragment : Fragment(), OnMapReadyCallback, GoogleMap.OnMarkerClickListener {
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
        // Marker for Welch building
        googleMap.addMarker(
            MarkerOptions()
                .position(LatLng(30.287183167191333, -97.73777850731048))
                .title("WEL"))
        // Marker for Engineering building
        googleMap.addMarker(
            MarkerOptions()
                .position(LatLng(30.28913631032302, -97.73551661569718))
                .title("EER"))
        // Marker for energy building
        googleMap.addMarker(
            MarkerOptions()
                .position(LatLng(30.28724, -97.73598))
                .title("GLT"))
        // Marker for gdc
                googleMap.addMarker(
                    MarkerOptions()
                        .position(LatLng(	30.28641, -97.7371))
                        .title("GDC"))
        // Marker for geoscience building
                googleMap.addMarker(
                    MarkerOptions()
                        .position(LatLng(	30.28591, 	-97.73716))
                        .title("JGB"))
        // Marker for PCL
                googleMap.addMarker(
                    MarkerOptions()
                        .position(LatLng(30.282830, -97.738020))
                        .title("PCL"))
        // Marker for NHB
                googleMap.addMarker(
                    MarkerOptions()
                        .position(LatLng(30.287808772986928, -97.73796525840517))
                        .title("NHB"))
        // Marker for FAC
                googleMap.addMarker(
                    MarkerOptions()
                        .position(LatLng(30.28668906845532, -97.74017027558799))
                        .title("FAC"))
        googleMap.setOnMarkerClickListener (this)

    }

    override fun onMarkerClick(marker: Marker): Boolean {
        val intent = Intent(getActivity(),ProfileActivity::class.java)
        val studySpots = DataSource.studySpots
        var position = 0
        for (spot in studySpots) {
            if (marker.title == spot.acronym) {
                intent.putExtra("Position", position.toString())
                startActivity(intent)
                return true
            }
            position++
        }
        return false
    }
}