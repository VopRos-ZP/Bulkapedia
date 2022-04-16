package com.bulkapedia.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.bulkapedia.MainActivity
import com.bulkapedia.R
import com.bulkapedia.databinding.HeroFragmentBinding
import com.bulkapedia.gears.GearSet
import com.bulkapedia.listeners.ViewPagerAdapter
import com.bulkapedia.models.MainViewModel
import com.bulkapedia.sets.Set
import com.google.android.material.tabs.TabLayoutMediator

class HeroFragment (private val main: MainActivity) : Fragment() {

    companion object {
        @JvmStatic
        fun newInstance(act: MainActivity): HeroFragment = HeroFragment(act)
    }

    private val model: MainViewModel by activityViewModels()
    private lateinit var bind: HeroFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bind = HeroFragmentBinding.inflate(inflater, container, false)
        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Получаем ViewModel и инициализируем содержимое фрагмента
        model.hero.observe(viewLifecycleOwner) { it ->
            // Инициализируем ActionBar
            bind.barInclude.actionBar.title = getString(it.heroName)
            bind.barInclude.actionBar.setNavigationIcon(R.drawable.menu)
            bind.barInclude.actionBar.setNavigationOnClickListener {
                MainActivity.openDrawer(main.bind.drawerLayout)
            }
            // Инициализируем иконку героя
            bind.heroIcon.setImageResource(it.heroIcon)
            // Инициализируем фрагменты сетов
            bind.ignoreBox.setOnCheckedChangeListener { _, b ->
                val set = if (b) it.heroSets.filter { s ->
                    !s.gears.map { e -> e.value.gearSet }.contains(GearSet.PERSONAL)
                } else it.heroSets
                initSetFragments(set)
            }
            val set = if (bind.ignoreBox.isChecked) it.heroSets.filter { s ->
                !s.gears.map { e -> e.value.gearSet }.contains(GearSet.PERSONAL)
            } else it.heroSets
            initSetFragments(set)
        }
    }

    private fun initSetFragments(sets: List<Set>) {
        val fragments = mutableListOf<SetFragment>()
        sets.forEach { fragments.add(SetFragment.newInstance(it)) }
        bind.viewPager.adapter = ViewPagerAdapter(
            activity as AppCompatActivity, fragments)
        TabLayoutMediator(bind.tabLayout, bind.viewPager) { tab, pos ->
            tab.text = getString(sets[pos].mode.str)
        }.attach()
    }

}