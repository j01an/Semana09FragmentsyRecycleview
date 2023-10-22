package com.example.semana06fragments.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.semana06fragments.R
import com.example.semana06fragments.adapter.SongAdapter
import com.example.semana06fragments.model.SongModel
import java.util.ArrayList


class MusicaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View= inflater.inflate(R.layout.fragment_musica, container, false)

        val rvMusica: RecyclerView = view.findViewById(R.id.rvMusica)
        rvMusica.layoutManager = LinearLayoutManager(requireContext())
        rvMusica.adapter=SongAdapter(Songlist())


        return view
    }

    private fun Songlist(): List<SongModel>{
        val lstSong: ArrayList<SongModel> = ArrayList()

        lstSong.add(SongModel(1,R.drawable.cancion1,"in the end","theory","30000","2:00"))
        lstSong.add(SongModel(2,R.drawable.cancion2,"cancion2","album all","30000","3:00"))
        lstSong.add(SongModel(3,R.drawable.cancion3,"cancion 3","almbun nuevo","30000","2:40"))
        lstSong.add(SongModel(1,R.drawable.cancion4,"cancion 4","este si sale","30000","2:10"))
        lstSong.add(SongModel(1,R.drawable.cancion5,"cancion 5","ya salio","30000","5:00"))

        return lstSong
    }

}