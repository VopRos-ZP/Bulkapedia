package com.bulkapedia.heroes

import com.bulkapedia.R
import com.bulkapedia.sets.SetList

class HeroList {
    companion object {
        val ARNIE = Hero(R.id.arnieItem, R.drawable.arnie_menu, R.drawable.arnie_icon, SetList.ARNIE_SETS)
        private val CYCLOPS = Hero(R.id.cyclopsItem, R.drawable.cyclops_menu, R.drawable.cyclops_icon, SetList.CYCLOPS_SETS)
        private val SPARKLE = Hero(R.id.sparkleItem, R.drawable.sparkle_menu, R.drawable.sparkle_icon, SetList.SPARKLE_SETS)
        private val HURRICANE = Hero(R.id.hurricaneItem, R.drawable.hurricane_menu, R.drawable.hurricane_icon, SetList.HURRICANE_SETS)
        private val GHOST = Hero(R.id.ghostItem, R.drawable.ghost_menu, R.drawable.ghost_icon, SetList.GHOST_SETS)
        private val FREDDIE = Hero(R.id.freddieItem, R.drawable.freddie_menu, R.drawable.freddie_icon, SetList.FREDDIE_SETS)
        private val ANGEL = Hero(R.id.angelItem, R.drawable.angel_menu, R.drawable.angel_icon, SetList.ANGEL_SETS)
        private val RAVEN = Hero(R.id.ravenItem, R.drawable.raven_menu, R.drawable.raven_icon, SetList.RAVEN_SETS)
        private val BLOT = Hero(R.id.blotItem, R.drawable.blot_menu, R.drawable.blot_icon, SetList.BLOT_SETS)
        private val FIREFLY = Hero(R.id.fireflyItem, R.drawable.firefly_menu, R.drawable.firefly_icon, SetList.FIREFLY_SETS)
        private val SLAYER = Hero(R.id.slayerItem, R.drawable.slayer_menu, R.drawable.slayer_icon, SetList.SLAYER_SETS)
        private val MIRAGE = Hero(R.id.mirageItem, R.drawable.mirage_menu, R.drawable.mirage_icon, SetList.MIRAGE_SETS)
        private val SMOG = Hero(R.id.smogItem, R.drawable.smog_menu, R.drawable.smog_icon, SetList.SMOG_SETS)
        private val BASTION = Hero(R.id.bastionItem, R.drawable.bastion_menu, R.drawable.bastion_icon, SetList.BASTION_SETS)
        private val DRAGOON = Hero(R.id.dragoonItem, R.drawable.dragoon_menu, R.drawable.dragoon_icon, SetList.DRAGOON_SETS)
        private val BERTHA = Hero(R.id.berthaItem, R.drawable.bertha_menu, R.drawable.bertha_icon, SetList.BERTHA_SETS)
        private val LEVIATHAN = Hero(R.id.leviathanItem, R.drawable.leviathan_menu, R.drawable.leviathan_icon, SetList.LEVIATHAN_SETS)
        private val STALKER = Hero(R.id.stalkerItem, R.drawable.stalker_menu, R.drawable.stalker_icon, SetList.STALKER_SETS)
        private val DOC = Hero(R.id.docItem, R.drawable.doc_menu, R.drawable.doc_icon, SetList.DOC_SETS)
        private val LEVI = Hero(R.id.leviItem, R.drawable.levi_menu, R.drawable.levi_icon, SetList.LEVI_SETS)
        private val SATOSHI = Hero(R.id.satoshiItem, R.drawable.satoshi_menu, R.drawable.satoshi_icon, SetList.SATOSHI_SETS)

        private val SHOTGUNS = listOf(ARNIE, CYCLOPS, SPARKLE, HURRICANE)
        private val SCOUTS = listOf(GHOST, FREDDIE, ANGEL, RAVEN)
        private val SNIPERS = listOf(BLOT, FIREFLY, SLAYER, MIRAGE)
        private val TANKS = listOf(SMOG, BASTION, DRAGOON, BERTHA, LEVIATHAN)
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