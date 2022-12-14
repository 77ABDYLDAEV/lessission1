package com.example.lessission1.ui.task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lessission1.R
import com.example.lessission1.databinding.FragmentTaskBinding

class TaskFragment : Fragment() {

    private lateinit var binding: FragmentTaskBinding

     override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding= FragmentTaskBinding.inflate(LayoutInflater.from(requireContext()))
        return inflater.inflate(R.layout.fragment_task, container, false)
    }

    companion object {
    }
}