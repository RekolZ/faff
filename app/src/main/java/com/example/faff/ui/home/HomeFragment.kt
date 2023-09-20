package com.example.faff.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.faff.R
import com.example.faff.databinding.FragmentHomeBinding
import com.example.faff.recadapters.FeelRecycler
import com.example.faff.recadapters.MyFeel
import com.example.faff.recadapters.MyState
import com.example.faff.recadapters.StateRecycler

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val state_recycler: RecyclerView = root.findViewById(R.id.state_rec)
        val feel_recycler : RecyclerView = root.findViewById(R.id.feel_rec)
        feel_recycler.adapter = FeelRecycler(requireContext(),MyFeel().list)
        state_recycler.adapter = StateRecycler(requireContext(),MyState().state_list)
        return root
    }


}