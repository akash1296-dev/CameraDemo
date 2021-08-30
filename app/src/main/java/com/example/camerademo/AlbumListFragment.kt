package com.example.camerademo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.camerademo.databinding.FragmentAlbumListBinding

class AlbumListFragment : Fragment() {

    lateinit var fragmentAlbumListBinding: FragmentAlbumListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentAlbumListBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_album_list, container, false)
        fragmentAlbumListBinding.fabCamera.setOnClickListener {
            Navigation.findNavController(requireActivity(), R.id.nav_host_fragment).navigate(R.id.cameraFragment)
        }
        return fragmentAlbumListBinding.root
    }
}