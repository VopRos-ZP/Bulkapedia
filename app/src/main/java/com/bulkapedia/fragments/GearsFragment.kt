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
import com.bulkapedia.heroes.HeroList
import com.bulkapedia.models.HeroModel
import com.bulkapedia.models.MainViewModel
import com.google.android.material.navigation.NavigationView

class GearsFragment (private val main: MainActivity)
    : Fragment(), NavigationView.OnNavigationItemSelectedListener {

    companion object {
        const val GRAV_START = GravityCompat.START
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
        // Инициализируем навигационное меню
        bind.navView.inflateMenu(R.menu.heroes_menu)
        // Инициализируем нажатие на `настройки`
        bind.navView.itemIconTintList = null
        val headerView = bind.navView.getHeaderView(0)
        headerView.findViewById<TextView>(R.id.header_nav_view_tv).text =
            getString(R.string.select_hero)
        headerView.findViewById<View>(R.id.settingsBtn).setOnClickListener {
                // Закрываем шторку
                closeDrawer(bind.drawer)
                bind.drawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
                // Меняем holder на settings_fragment
                main.supportFragmentManager.beginTransaction().replace(
                    bind.holder.holder.id,
                    SettingsFragment.newInstance(main, bind.drawer)
                ).commit()
            }
        // Инициализируем нажатие на героя
        bind.navView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Закрываем шторку
        closeDrawer(bind.drawer)
        bind.drawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
        // Получаем героя
        val hero = HeroList.getHeroById(item.itemId)
        val heroName = HeroList.getHeroNameById(hero.id)
        // Инициализируем ViewModel
        model.hero.value = HeroModel(hero, hero.bigIcon, heroName, hero.sets)
        // Меняем holder на hero_fragment
        main.supportFragmentManager.beginTransaction().replace(
            bind.holder.holder.id,
            HeroFragment.newInstance(bind.drawer)).commit()
        return true
    }

    fun updateView() {
        bind.navView.getHeaderView(0)
            .findViewById<TextView>(R.id.header_nav_view_tv)
            .text = getString(R.string.select_hero)
        bind.navView.menu.forEach { item ->
            item.title = getString(HeroList.getHeroNameById(item.itemId))
        }
    }

}