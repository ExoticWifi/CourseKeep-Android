package com.example.CourseKeep.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.CourseKeep.models.ClassModel
import com.example.CourseKeep.viewHolders.CustomViewHolder
import com.example.myapplication.R
import io.realm.RealmResults

class MainAdapter(private val classList: RealmResults<ClassModel>): RecyclerView.Adapter<CustomViewHolder>() {
    override fun getItemCount(): Int {
        return classList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.course_item, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.courseCode.text = classList[position]?.classCode
        holder.courseTitle.text = classList[position]?.className
        holder.deliveryMethod.text = classList[position]?.deliveryMethod
    }

}