package com.bulkapedia

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.activity.viewModels
import androidx.core.view.GravityCompat
import androidx.core.view.forEach
import androidx.drawerlayout.widget.DrawerLayout
import androidx.drawerlayout.widget.DrawerLayout.LOCK_MODE_LOCKED_OPEN
import androidx.drawerlayout.widget.DrawerLayout.LOCK_MODE_UNLOCKED
import com.bulkapedia.databinding.ActivityMainBinding
import com.bulkapedia.fragments.HeroFragment
import com.bulkapedia.fragments.SettingsFragment
import com.bulkapedia.heroes.HeroList
import com.bulkapedia.models.HeroModel
import com.bulkapedia.models.MainViewModel
import com.bulkapedia.preference.UserPreferences
import com.bulkapedia.utils.Language
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    companion object {
        const val GRAV_START = GravityCompat.START
        fun closeDrawer(drawer: DrawerLayout) {
            drawer.closeDrawer(GRAV_START)
        }
        fun openDrawer(drawer: DrawerLayout) {
            drawer.openDrawer(GRAV_START)
        }
    }

    private val model: MainViewModel by viewModels()

    lateinit var prefs: UserPreferences
    lateinit var bind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        // Инициализация root элемента и bind
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        // Инициализация всех элеменотов
        initAllElements()
        // Инициализируем Preferences
        initPreferences()
        // Обновляем Views
        updateViews()
    }

    private fun initAllElements() {
        // Инициализируем Drawer
        openDrawer(bind.drawerLayout)
        bind.drawerLayout.setDrawerLockMode(LOCK_MODE_LOCKED_OPEN)
        // Инициализируем нажатие на `настройки`
        bind.navigationHeroes.itemIconTintList = null
        bind.navigationHeroes.getHeaderView(0)
            .findViewById<View>(R.id.settingsBtn)
            .setOnClickListener {
                // Закрываем шторку
                closeDrawer(bind.drawerLayout)
                bind.drawerLayout.setDrawerLockMode(LOCK_MODE_UNLOCKED)
                // Меняем holder на settings_fragment
                supportFragmentManager.beginTransaction().replace(
                    bind.holderInclude.holder.id,
                    SettingsFragment.newInstance(this)
                ).commit()
            }
        // Инициализируем нажатие на героя
        bind.navigationHeroes.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Закрываем шторку
        closeDrawer(bind.drawerLayout)
        bind.drawerLayout.setDrawerLockMode(LOCK_MODE_UNLOCKED)
        // Получаем героя
        val hero = HeroList.getHeroById(item.itemId)
        val heroName = HeroList.getHeroNameById(hero.id)
        // Инициализируем ViewModel
        model.hero.value = HeroModel(hero, hero.icon, heroName, hero.sets)
        // Меняем holder на hero_fragment
        supportFragmentManager.beginTransaction().replace(
            bind.holderInclude.holder.id,
            HeroFragment.newInstance(this)).commit()
        return true
    }

    private fun initPreferences() {
        prefs = application as UserPreferences
        val shared = getPreferences()
        val lang = shared.getString(UserPreferences.LANGUAGE, UserPreferences.EN_LANGUAGE)
        if (lang != null) {
            prefs.setLanguage(lang)
            Language.update(baseContext, prefs.getLanguage())
        }
    }

    fun getPreferences() : SharedPreferences {
        return getSharedPreferences(UserPreferences.PREFERENCES, MODE_PRIVATE)
    }

    fun updateViews() {
        // Обновляем заголовок в NavigationView
        bind.navigationHeroes.getHeaderView(0)
            .findViewById<TextView>(R.id.header_nav_view_tv)
            .text = getString(R.string.select_hero)
        // Обновляем имена героев в NavigationView
        bind.navigationHeroes.menu.forEach {
            it.title = getString(HeroList.getHeroNameById(it.itemId))
        }
    }

    override fun onBackPressed() {
        if (bind.drawerLayout.isDrawerOpen(GRAV_START)) {
            if (bind.drawerLayout.getDrawerLockMode(GRAV_START) != LOCK_MODE_LOCKED_OPEN)
                bind.drawerLayout.closeDrawer(GRAV_START)
        } else {
            super.onBackPressed()
        }
    }

}