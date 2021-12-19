package com.example.homework19

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.homework19.databinding.FragmentFirstBinding

class ThirdFragment : Fragment(R.layout.fragment_third) {

    private val binding: FragmentFirstBinding by viewBinding(FragmentFirstBinding::bind)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    companion object {
        fun newInstance() = FirstFragment()
    }
}