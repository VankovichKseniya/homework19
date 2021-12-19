package com.example.homework19

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

object DisplayOnActivity {

    fun display(
        fragmentManager: FragmentManager,
        fragment: Fragment,
        container: Int,
        addToBackStack: Boolean = true
    ) {
        fragmentManager
            .beginTransaction()
            .replace(container, fragment, fragment.tag)
            .apply { if (addToBackStack) addToBackStack(fragment.tag) }
            .commit()
    }
}