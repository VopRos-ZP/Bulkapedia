package com.bulkapedia.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.GravityCompat
import androidx.core.view.forEach
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.bulkapedia.MainActivity
import com.bulkapedia.R
import com.bulkapedia.databinding.DrawerLayoutBinding
import com.bulkapedia.maps.MapList
import com.bulkapedia.models.MainViewModel
import com.bulkapedia.models.MapModel
import com.google.android.material.navigation.NavigationView

class MapsFragment (private val main: MainActivity)
    : Fragment(), NavigationView.OnNavigationItemSelectedListener {

    companion object {
        private const val GRAV_START = GravityCompat.START
        fun closeDrawer(drawer: DrawerLayout) {
            drawer.closeDrawer(GRAV_START)
        }
        fun openDrawer(drawer: DrawerLayout) {
            drawer.openDrawer(GRAV_START)
        }
    }

    private val model: MainViewModel by activityViewModels()

    lateinit var bind: DrawerLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bind = DrawerLayoutBinding.inflate(inflater, container, false)
        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Инициализация всех элеменотов
        initAllElements()
    }

    private fun initAllElements() {
        // Инициализируем Drawer
        openDrawer(bind.drawer)
        bind.drawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_OPEN)
        // Инициализируем нажатие на `настройки`
        bind.navView.itemIconTintList = null
        val header = bind.navView.getHeaderView(0)
        header.findViewById<TextView>(R.id.header_nav_view_tv).text =
            getString(R.string.select_map)
        header.findViewById<View>(R.id.settingsBtn)
            .setOnClickListener {
                // Закрываем шторку
                closeDrawer(bind.drawer)
                bind.drawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
                // Меняем holder на settings_fragment
                main.supportFragmentManager.beginTransaction().replace(
                    bind.holder.holder.id,
                    SettingsFragment.newInstance(main, bind.drawer)
                ).commit()
            }
        bind.navView.inflateMenu(R.menu.maps_menu)
        // Инициализируем нажатие на карту
        bind.navView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Закрываем шторку
        closeDrawer(bind.drawer)
        bind.drawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
        // Получаем карту
        val map = MapList.getMap(item.itemId)
        // Инициализируем ViewModel
        model.map.value = MapModel(map.mapImage, map.mapImageSpawns, map.mapName)
        // Меняем holder на map_fragment
        main.supportFragmentManager.beginTransaction().replace(
            bind.holder.holder.id,
            MapFragment.newInstance(bind.drawer)
        ).commit()
        return true
    }

    fun updateView() {
        // Переинициалируем элементы
        bind.navView.getHeaderView(0)
            .findViewById<TextView>(R.id.header_nav_view_tv)
            .text = getString(R.string.select_map)
        bind.navView.menu.forEach { item ->
            if (MapList.groups.containsKey(item.itemId)) {
                val groupName = MapList.getGroupName(item.itemId)
                item.title = getString(groupName)
                if (item.hasSubMenu()) {
                    item.subMenu.forEach { subItem ->
                        val name: Int = MapList.getMap(subItem.itemId).mapName
                        subItem.title = getString(name)
                    }
                }
            }
        }
    }

}