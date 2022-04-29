package com.bulkapedia.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.bulkapedia.R
import com.bulkapedia.databinding.MapFragmentBinding
import com.bulkapedia.models.MainViewModel

class MapFragment (private val drawer: DrawerLayout) : Fragment() {

    companion object {
        @JvmStatic
        fun newInstance(drawer: DrawerLayout): MapFragment = MapFragment(drawer)
    }

    private val model: MainViewModel by activityViewModels()
    private lateinit var bind: MapFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bind = MapFragmentBinding.inflate(inflater, container, false)
        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Получаем ViewModel и инициализируем содержимое фрагмента
        model.map.observe(viewLifecycleOwner) {
            // Инициализируем ActionBar
            bind.barInclude.actionBar.title = getString(it.mapName)
            bind.barInclude.actionBar.setNavigationIcon(R.drawable.menu)
            bind.barInclude.actionBar.setNavigationOnClickListener {
                GearsFragment.openDrawer(drawer)
            }
            // Инициализируем карту
            bind.mapImageView.setImageResource(it.map)
            // Инициализируем нажатие на ShowSpawnPoints
            bind.showSpawnPoints.setOnCheckedChangeListener { box, b ->
                val map = if (b) it.mapSpawns else it.map
                bind.mapImageView.setImageResource(map)
                val text = if (b) R.string.hide_spawns else R.string.show_spawns
                box.text = getString(text)
            }
        }
    }
}