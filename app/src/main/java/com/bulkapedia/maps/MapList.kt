package com.bulkapedia.maps

import com.bulkapedia.R

class MapList {

    companion object {

        private val maps = listOf(
            Map(R.id.hotelMapItem, R.drawable.hotel, R.drawable.hotel_spawns, R.string.hotel),
            Map(R.id.depotMapItem, R.drawable.depot, R.drawable.depot_spawns, R.string.depot),
            Map(R.id.casinoMapItem, R.drawable.casino, R.drawable.casino_spawns, R.string.casino),
            Map(R.id.willaMapItem, R.drawable.villa, R.drawable.villa_spawns, R.string.villa),
            Map(R.id.roadMotelMapItem, R.drawable.road_motel, R.drawable.road_motel_spawns, R.string.road_motel),
            Map(R.id.villageItem, R.drawable.village, R.drawable.village_spawns, R.string.village),
            Map(R.id.cityItem, R.drawable.city, R.drawable.city_spawns, R.string.city),
            Map(R.id.cityGardenItem, R.drawable.city_garden, R.drawable.city_garden_spawns, R.string.city_garden),
            Map(R.id.policeStationItem, R.drawable.police_station, R.drawable.police_station_spawns, R.string.police_station),
        )

        val groups = mapOf(
            R.id.br_group to R.string.battle_royale_mode
        )

        fun getGroupName(item: Int): Int {
            val index = groups.map { it.key }.indexOf(item)
            return groups.map { it.value }[index]
        }

        fun getMap(item: Int): Map {
            val index = maps.map { it.mapItem }.indexOf(item)
            return maps[index]
        }

    }

}