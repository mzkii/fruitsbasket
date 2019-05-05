package com.mzkii.dev.fruitsbasket.pages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mzkii.dev.fruitsbasket.R

class ResultFragment : Fragment() {

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    return inflater.inflate(R.layout.fragment_result, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    // DEBUG
    val directions = ResultFragmentDirections.actionResultFragmentToDetailFragment(0)
    findNavController().navigate(directions)
  }
}
