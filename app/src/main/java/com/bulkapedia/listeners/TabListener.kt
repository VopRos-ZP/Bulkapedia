package com.bulkapedia.listeners

import com.bulkapedia.sets.Set
import com.google.android.material.tabs.TabLayout

class TabListener (
    private val it: List<Set>,
    private val writeDescription: (Int) -> Unit
) : TabLayout.OnTabSelectedListener {

    override fun onTabSelected(tab: TabLayout.Tab?) {
        val description = it[tab?.position!!].description
        writeDescription(description)
    }

    override fun onTabUnselected(tab: TabLayout.Tab?) {
        // Когда выбрал другой таб (tab = предыдущий tab)
    }

    override fun onTabReselected(tab: TabLayout.Tab?) {
        // Когда обратно вернулся на предыдущий таб
    }
}