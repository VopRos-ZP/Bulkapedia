package com.bulkapedia

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.core.view.forEach
import androidx.core.view.get
import com.bulkapedia.databinding.ActivityMainBinding
import com.bulkapedia.fragments.GearsFragment
import com.bulkapedia.fragments.MapsFragment
import com.bulkapedia.models.MainViewModel
import com.bulkapedia.preference.UserPreferences
import com.bulkapedia.utils.BottomMenuUtils
import com.bulkapedia.utils.Language
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(),
    BottomNavigationView.OnNavigationItemSelectedListener {

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
        // Инициализируем BottomNavigationView
        val selectedId = R.id.gearsItem
        bind.bottomNav.selectedItemId = selectedId
        bind.bottomNav.setOnItemSelectedListener(this)
        supportFragmentManager.beginTransaction().replace(
            bind.frame.id, GearsFragment(this)
        ).commit()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Смена фрагмента
        val fragment = when (item.itemId) {
            R.id.gearsItem -> GearsFragment(this)
            else -> MapsFragment(this)
        }
        supportFragmentManager.beginTransaction()
            .replace(bind.root[0].id, fragment).commit()
        return true
    }

    fun updateViews() {
        bind.bottomNav.menu.forEach {
            it.title = getString(BottomMenuUtils.mapMenuItems[it.itemId]!!)
        }
        // Update GearsFragment or MapsFragment
        val fragment = supportFragmentManager.findFragmentById(bind.root[0].id)
        if (fragment != null) {
            try {
                (fragment as GearsFragment).updateView()
            } catch (e: Exception) {
                (fragment as MapsFragment).updateView()
            }
        }
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

}