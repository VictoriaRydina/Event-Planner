package com.example.eventplanner.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.eventplanner.NewEventModel
import com.example.eventplanner.core.adapter.BaseItemCallback
import com.example.eventplanner.databinding.ItemOneEventBinding

class OneItemEventAdapter(private val onItemClickListener: (NewEventModel) -> Unit) :
    ListAdapter<NewEventModel, OneItemEventAdapter.ItemOneEventViewHolder>(
        BaseItemCallback<NewEventModel>()
    ) {

    class ItemOneEventViewHolder(private val binding: ItemOneEventBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(
            item: NewEventModel,
            onItemClickListener: (NewEventModel) -> Unit
        ) {
            binding.apply {
                eventName.text = item.name
                eventDate.text = item.date
                eventLocation.text = item.location
                degree.text = item.degree
                root.setOnClickListener { onItemClickListener(item) }
            }
        }
    }

    override fun onBindViewHolder(holder: ItemOneEventViewHolder, position: Int) {
        holder.bind(getItem(position), onItemClickListener)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemOneEventViewHolder {
        val binding = ItemOneEventBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ItemOneEventViewHolder(binding)
    }
}