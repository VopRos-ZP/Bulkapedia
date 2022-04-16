package com.bulkapedia.heroes

import com.bulkapedia.R
import com.bulkapedia.sets.SetList

class HeroList {
    companion object {
        val ARNIE = Hero(R.id.arnieItem, R.drawable.arnie, SetList.ARNIE_SETS)
        val CYCLOPS = Hero(R.id.cyclopsItem, R.drawable.cyclops, SetList.CYCLOPS_SETS)
        val SPARKLE = Hero(R.id.sparkleItem, R.drawable.sparkle, SetList.SPARKLE_SETS)
        val HURRICANE = Hero(R.id.hurricaneItem, R.drawable.hurricane, SetList.HURRICANE_SETS)
        val GHOST = Hero(R.id.ghostItem, R.drawable.ghost, SetList.GHOST_SETS)
        val FREDDIE = Hero(R.id.freddieItem, R.drawable.freddie, SetList.FREDDIE_SETS)
        val ANGEL = Hero(R.id.angelItem, R.drawable.angel, SetList.ANGEL_SETS)
        val RAVEN = Hero(R.id.ravenItem, R.drawable.raven, SetList.RAVEN_SETS)
        val BLOT = Hero(R.id.blotItem, R.drawable.blot, SetList.BLOT_SETS)
        val FIREFLY = Hero(R.id.fireflyItem, R.drawable.firefly, SetList.FIREFLY_SETS)
        val SLAYER = Hero(R.id.slayerItem, R.drawable.slayer, SetList.SLAYER_SETS)
        val MIRAGE = Hero(R.id.mirageItem, R.drawable.mirage, SetList.MIRAGE_SETS)
        val SMOG = Hero(R.id.smogItem, R.drawable.smog, SetList.SMOG_SETS)
        val BASTION = Hero(R.id.bastionItem, R.drawable.bastion, SetList.BASTION_SETS)
        val DRAGOON = Hero(R.id.dragoonItem, R.drawable.dragoon, SetList.DRAGOON_SETS)
        val BERTHA = Hero(R.id.berthaItem, R.drawable.bertha, SetList.BERTHA_SETS)
        val LEVIATHAN = Hero(R.id.leviathanItem, R.drawable.leviathan, SetList.LEVIATHAN_SETS)
        val STALKER = Hero(R.id.stalkerItem, R.drawable.stalker, SetList.STALKER_SETS)
        val DOC = Hero(R.id.docItem, R.drawable.doc, SetList.DOC_SETS)
        val LEVI = Hero(R.id.leviItem, R.drawable.levi, SetList.LEVI_SETS)
        val SATOSHI = Hero(R.id.satoshiItem, R.drawable.satoshi, SetList.SATOSHI_SETS)

        val SHOTGUNS = listOf(ARNIE, CYCLOPS, SPARKLE, HURRICANE)
        val SCOUTS = listOf(GHOST, FREDDIE, ANGEL, RAVEN)
        val SNIPERS = listOf(BLOT, FIREFLY, SLAYER, MIRAGE)
        val TANKS = listOf(SMOG, BASTION, DRAGOON, BERTHA, LEVIATHAN)
        private val TROOPERS = listOf(STALKER, DOC, LEVI, SATOSHI)

        val HEROES = SHOTGUNS + SCOUTS + SNIPERS + TANKS + TROOPERS

        fun getHeroById(id: Int) : Hero = HEROES.filter { it.id == id }[0]

        fun getHeroNameById(id: Int) : Int = when (id) {
            ARNIE.id -> R.string.arnie
            CYCLOPS.id -> R.string.cyclops
            SPARKLE.id -> R.string.sparkle
            HURRICANE.id -> R.string.hurricane
            GHOST.id -> R.string.ghost
            FREDDIE.id -> R.string.freddie
            ANGEL.id -> R.string.angel
            RAVEN.id -> R.string.raven
            BLOT.id -> R.string.blot
            FIREFLY.id -> R.string.firefly
            SLAYER.id -> R.string.slayer
            MIRAGE.id -> R.string.mirage
            SMOG.id -> R.string.smog
            DRAGOON.id -> R.string.dragoon
            BASTION.id -> R.string.bastion
            BERTHA.id -> R.string.bertha
            LEVIATHAN.id -> R.string.leviathan
            STALKER.id -> R.string.stalker
            DOC.id -> R.string.doc
            LEVI.id -> R.string.levi
            SATOSHI.id -> R.string.satoshi
            else -> 0
        }
    }
}