package com.example.myapplication

import android.os.Bundle
import android.service.autofill.Validators.not
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Fragment1 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Fragment1", container.toString())
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    private val viewModel: MyViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        var recyclerView: RecyclerView = view.findViewById(R.id.recyclerview)
        var list = ArrayList<Data>()
        list.add(Data("A"))
        list.add(Data("B"))
        list.add(Data("C"))
        list.add(Data("D"))
        list.add(Data("E"))
        list.add(Data("F"))
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = Adapter(list, requireContext(),viewModel)


//
//        view.findViewById<Button>(R.id.button).setOnClickListener {
//          //  viewModel.update((!viewModel.data.value!!))
//            if (viewModel.data.value == true) {
//
//                viewModel.update(false)
//            } else {
//                viewModel.update(true)
//
//            }
//            Log.d("Fragment1", viewModel.data.value.toString())
//
//            //get reference to fragment2
//            //  setFragmentResult("requestKey", bundleOf("bundleKey" to "messagexxx"))
//
//
//        }

    }
}