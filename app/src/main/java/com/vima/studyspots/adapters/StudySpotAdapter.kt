package com.vima.studyspots.adapters

import android.content.Context
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.vima.studyspots.ProfileActivity
import com.vima.studyspots.R
import com.vima.studyspots.data.DataSource


/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class StudySpotAdapter (
    private val context: Context?,
): RecyclerView.Adapter<StudySpotAdapter.StudySpotViewHolder>() {

        // Get the study spots data into a list from the DataSource
        private val studySpotsList = DataSource.studySpots
        /**
         * Initialize view elements
         */
        class StudySpotViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
            // Initialize the list contents
            val imageView: ImageView = view!!.findViewById(R.id.building_img)
            val buildingName: TextView = view!!.findViewById(R.id.building_name)
            val location: TextView = view!!.findViewById(R.id.building_location)
            val noiseLevel: TextView = view!!.findViewById(R.id.noise_building)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudySpotViewHolder {
            val adapterLayout =  LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item, parent, false)
            // return the layout chosen
            return StudySpotViewHolder(adapterLayout)
        }

        // returns the size of the list
        override fun getItemCount() : Int {
            return studySpotsList.size
        }

        override fun onBindViewHolder(holder: StudySpotViewHolder, position: Int) {
            // Get the data at the current position
            val curData = studySpotsList[position]
            // Set the image resource for the current member
            holder.imageView.setImageResource(curData.imageResourceId)
            // Set the text for the current member's name
            holder.buildingName.text = curData.name
            holder.location.text = curData.location
            holder.noiseLevel.text = curData.noiseLevel.toString()

            holder.itemView.setOnClickListener {
                // what to do when clicking on item
                goToProfile()
            }
            // MISSING PIECES ON GETSTRING METHOD
            // LAST TEXTVIEW IS SUPPOSED TO BE A DOUBLE
            val resources = context?.resources
            // TODO: Set string element
            // Set the text for the current building's location
            //holder.textView2.text = resources?.getString(R.string., curData.location)
            // Set the text for the current building's noise level
           // holder.textView3.text = resources?.getString(R.string., curData.noiseLevel)

        }

        // for play button
        fun goToProfile() {
            val intent = Intent(context, ProfileActivity::class.java)
            //intent.putExtra("Name", name)
            intent.setFlags(FLAG_ACTIVITY_NEW_TASK)
            context?.startActivity(intent)
        }
    }
