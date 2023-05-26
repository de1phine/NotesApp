package com.example.notesapp.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.notesapp.R
import com.example.notesapp.model.Note

class NoteAdapter(private val context: Context,
                  private val dataset: List<Note>
) : RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {

    class NoteViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.list_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.notes_list, parent, false)
        return NoteViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getText(item.stringResourceId)
    }
}