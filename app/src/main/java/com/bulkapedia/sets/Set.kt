package com.bulkapedia.sets

import com.bulkapedia.gears.Gear

data class Set (
    val name: Int,
    val gears: Map<GearCell, Gear>
)