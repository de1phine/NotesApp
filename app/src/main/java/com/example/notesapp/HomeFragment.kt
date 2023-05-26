package com.example.notesapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.notesapp.adapter.NoteAdapter
import com.example.notesapp.data.Datasource
import com.example.notesapp.databinding.FragmentHomeBinding

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.button.setOnClickListener { findNavController().navigate(R.id.action_homeFragment_to_noteFragment) }
        val myDataset = Datasource().loadNotes()
        val recyclerView = binding.notesList
        recyclerView.adapter = NoteAdapter(myDataset)
        recyclerView.setHasFixedSize(true)
        return view
    }
}