
package com.relsellglobal.exoplayerdemokotlin.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.relsellglobal.exoplayerdemokotlin.R
import com.relsellglobal.exoplayerdemokotlin.databinding.FragmentItemBinding
import com.relsellglobal.exoplayerdemokotlin.models.Song
import javax.inject.Inject

/**
 * [RecyclerView.Adapter] that can display a [DummyItem] and makes a call to the
 * specified [OnListFragmentInteractionListener].
 * TODO: Replace the implementation with code for your data type.
 */
class MyItemRecyclerViewAdapter (
    private val mValues: List<Song>,
    private val activity: FragmentActivity?
    ) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var binding : FragmentItemBinding
    private var VIEW_TYPE_HEADER = 0
    private var VIEW_TYPE_ITEM = 1


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.fragment_item, parent, false)
        if(viewType == VIEW_TYPE_HEADER) {
            // we can have different views here
            return ViewHolder(binding.root)
        } else if(viewType == VIEW_TYPE_ITEM) {
            // we can have different view here
            return ViewHolder(binding.root)
        } else {
            // we can have different view here
            return ViewHolder(binding.root)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = mValues[position]
        //holder.mContentView.text = item.songName

       // holder.mView.setOnClickListener({
            //lets do some thing
//            try {
//
//                val des = if(activity is MainActivityWithNavBar) activity else null
//                des?.launchDetailFragment(item)
//            } catch (e:Exception) {
//                e.printStackTrace()
//            }


 //       })

    }

    override fun getItemViewType(position: Int): Int {
        if(position == 1) return VIEW_TYPE_HEADER else return VIEW_TYPE_ITEM
    }

    override fun getItemCount(): Int = mValues.size

    class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {

        val mContentView: TextView = mView.findViewById(R.id.content)

        override fun toString(): String {
            return super.toString() + " '" + mContentView.text + "'"
        }
    }
}
