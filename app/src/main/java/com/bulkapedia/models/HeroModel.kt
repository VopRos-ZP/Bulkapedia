package com.bulkapedia.models

import com.bulkapedia.heroes.Hero
import com.bulkapedia.sets.Set

data class HeroModel (
    val hero: Hero,
    val heroIcon: Int,
    val heroName: Int,
    val heroSets: List<Set>
)