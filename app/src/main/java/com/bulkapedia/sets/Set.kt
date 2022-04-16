package com.bulkapedia.sets

import com.bulkapedia.gears.Gear

data class Set (
    val mode: PlayMode,
    val gears: Map<GearCell, Gear>
)