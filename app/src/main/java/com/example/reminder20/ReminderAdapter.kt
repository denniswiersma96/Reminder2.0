package com.example.reminder20

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class ReminderAdapter(private val reminders: List<Reminder>) :
RecyclerView.Adapter<ReminderAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(android.R.layout.simple_list_item_1, parent, false)
        )
    }

    /**
     * Returns the size of the list
     */
    override fun getItemCount(): Int {
        return reminders.size
    }


    inner class ViewHolder(itemView: View) :
            RecyclerView.ViewHolder(itemView) {
        private val tvReminder: TextView =
            itemView.findViewById(android.R.id.text1)

        fun bind(reminder: Reminder) {
            tvReminder.text = reminder.reminder
        }
    }
}