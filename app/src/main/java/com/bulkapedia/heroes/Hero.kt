package com.bulkapedia.heroes

import com.bulkapedia.sets.Set

data class Hero (
    val id: Int,
    val icon: Int,
    val bigIcon: Int,
    val sets: List<Set>
)
