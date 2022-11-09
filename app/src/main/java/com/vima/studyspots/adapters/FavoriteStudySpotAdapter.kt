package com.vima.studyspots.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vima.studyspots.R
import com.vima.studyspots.data.DataSource
import com.vima.studyspots.data.DataSource.studySpots

class FavoriteStudySpotAdapter (

    private val context: Context?,
    ): RecyclerView.Adapter<FavoriteStudySpotAdapter.FavoriteStudySpotHolder>() {

        // Get the study spots data into a list from the DataSource
        private val FavoriteStudySpotsList = studySpots
        /**
         * Initialize view elements
         */
        class FavoriteStudySpotHolder(view: View?): RecyclerView.ViewHolder(view!!) {
            // Initialize the list contents
            val imageView: ImageView = view!!.findViewById(R.id.building_img)
            val buildingName: TextView = view!!.findViewById(R.id.building_name)
            val location: TextView = view!!.findViewById(R.id.building_location)
            val noiseLevel: TextView = view!!.findViewById(R.id.noise_building)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteStudySpotHolder {
            val adapterLayout =  LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item, parent, false)
            // return the layout chosen
            return FavoriteStudySpotHolder(adapterLayout)
        }

        // returns the size of the list
        override fun getItemCount() : Int {
            return FavoriteStudySpotsList.size
        }

        override fun onBindViewHolder(holder: FavoriteStudySpotHolder, position: Int) {
            // Get the data at the current position
            val curData = FavoriteStudySpotsList[position]
            // Set the image resource for the current member
            holder.imageView.setImageResource(curData.imageResourceId)
            // Set the text for the current member's name
            holder.buildingName.text = curData.name
            holder.location.text = curData.location
            holder.noiseLevel.text = curData.noiseLevel.toString()
            // MISSING PIECES ON GETSTRING METHOD
            // LAST TEXTVIEW IS SUPPOSED TO BE A DOUBLE
            val resources = context?.resources
            // TODO: Set string element
            // Set the text for the current building's location
            //holder.textView2.text = resources?.getString(R.string., curData.location)
            // Set the text for the current building's noise level
            // holder.textView3.text = resources?.getString(R.string., curData.noiseLevel)

        }
    }