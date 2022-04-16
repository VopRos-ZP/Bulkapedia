package com.bulkapedia.gears

import com.bulkapedia.R
import com.bulkapedia.heroes.*

class PersonalGears {

    companion object {
        fun getPersonalGears(hero: Hero, count: Int) : List<Effect> {
            return when (hero) {
                HeroList.ARNIE -> {
                    when (count) {
                        2, 3 -> listOf(
                            Effect(30, false, R.string.health_after_team_health_effect),
                            Effect(10, true, R.string.speed_effect)
                        )
                        4, 5 -> listOf(
                            Effect(30, false, R.string.health_after_team_health_effect),
                            Effect(10, true, R.string.speed_effect),
                            Effect(50, false, R.string.jump_distance_effect),
                            Effect(5, false, R.string.team_health_up_effect),
                        )
                        6 -> listOf(
                            Effect(30, false, R.string.health_after_team_health_effect),
                            Effect(10, true, R.string.speed_effect),
                            Effect(50, false, R.string.jump_distance_effect),
                            Effect(5, false, R.string.team_health_up_effect),
                            Effect(9, true, R.string.fire_rate_effect),
                            Effect(-75, false, R.string.jump_damage_effect),
                        )
                        else -> listOf()
                    }
                }
//                HeroList.CYCLOPS -> {
//                    when (count) {
//                        2, 3 -> listOf(
//                            Effect(30, false, EffectType.HEALTH_AFTER_TEAM_HEALTH),
//                            Effect(-18, true, EffectType.SPREAD_IN_NOT_FOCUS)
//                        )
//                        4, 5 -> listOf(
//                            Effect(30, false, EffectType.HEALTH_AFTER_TEAM_HEALTH),
//                            Effect(-18, true, EffectType.SPREAD_IN_NOT_FOCUS),
//                            Effect(100, false, EffectType.SCAN_RADIUS),
//                            Effect(5, false, EffectType.TEAM_HEALTH_UP),
//                        )
//                        6 -> listOf(
//                            Effect(30, false, EffectType.HEALTH_AFTER_TEAM_HEALTH),
//                            Effect(-18, true, EffectType.SPREAD_IN_NOT_FOCUS),
//                            Effect(100, false, EffectType.SCAN_RADIUS),
//                            Effect(5, false, EffectType.TEAM_HEALTH_UP),
//                            Effect(9, true, EffectType.HEALTH_DAMAGE),
//                            Effect(8, true, EffectType.SCAN_DAMAGE),
//                        )
//                        else -> listOf()
//                    }
//                }
//                HeroList.SPARKLE -> {
//                    when (count) {
//                        2, 3 -> listOf(
//                            Effect(30, false, EffectType.HEALTH_AFTER_TEAM_HEALTH),
//                            Effect(-21, true, EffectType.RECHARGE_RATE)
//                        )
//                        4, 5 -> listOf(
//                            Effect(30, false, EffectType.HEALTH_AFTER_TEAM_HEALTH),
//                            Effect(-21, true, EffectType.RECHARGE_RATE),
//                            Effect(60, false, EffectType.MAX_GRENADE_RADIUS),
//                            Effect(5, false, EffectType.TEAM_HEALTH_UP),
//                        )
//                        6 -> listOf(
//                            Effect(30, false, EffectType.HEALTH_AFTER_TEAM_HEALTH),
//                            Effect(-21, true, EffectType.RECHARGE_RATE),
//                            Effect(60, false, EffectType.MAX_GRENADE_RADIUS),
//                            Effect(5, false, EffectType.TEAM_HEALTH_UP),
//                            Effect(1, false, EffectType.ADD_PATRONS),
//                            Effect(12, true, EffectType.MAX_GRENADE_DAMAGE),
//                        )
//                        else -> listOf()
//                    }
//                }
//                HeroList.HURRICANE -> {
//                    when (count) {
//                        2, 3 -> listOf(
//                            Effect(30, false, EffectType.HEALTH_AFTER_TEAM_HEALTH),
//                            Effect(10, true, EffectType.SPEED)
//                        )
//                        4, 5 -> listOf(
//                            Effect(30, false, EffectType.HEALTH_AFTER_TEAM_HEALTH),
//                            Effect(10, true, EffectType.SPEED),
//                            Effect(5, false, EffectType.SHIELD_PROTECTION),
//                            Effect(5, false, EffectType.TEAM_HEALTH_UP),
//                        )
//                        6 -> listOf(
//                            Effect(30, false, EffectType.HEALTH_AFTER_TEAM_HEALTH),
//                            Effect(10, true, EffectType.SPEED),
//                            Effect(5, false, EffectType.SHIELD_PROTECTION),
//                            Effect(5, false, EffectType.TEAM_HEALTH_UP),
//                            Effect(9, true, EffectType.HEALTH_DAMAGE),
//                            Effect(1, false, EffectType.SHIELD_DURATION),
//                        )
//                        else -> listOf()
//                    }
//                }
//                HeroList.GHOST -> {
//                    when (count) {
//                        2, 3 -> listOf(
//                            Effect(5, true, EffectType.SPEED_AFTER_STIMULATOR),
//                            Effect(-18, true, EffectType.SPREAD_IN_NOT_FOCUS)
//                        )
//                        4, 5 -> listOf(
//                            Effect(5, true, EffectType.SPEED_AFTER_STIMULATOR),
//                            Effect(-18, true, EffectType.SPREAD_IN_NOT_FOCUS),
//                            Effect(10, true, EffectType.SPEED_AFTER_INVISIBLE),
//                            Effect(7, false, EffectType.STIMULATOR_HEALTH),
//                        )
//                        6 -> listOf(
//                            Effect(5, true, EffectType.SPEED_AFTER_STIMULATOR),
//                            Effect(-18, true, EffectType.SPREAD_IN_NOT_FOCUS),
//                            Effect(10, true, EffectType.SPEED_AFTER_INVISIBLE),
//                            Effect(7, false, EffectType.STIMULATOR_HEALTH),
//                            Effect(9, true, EffectType.ARMOR_DAMAGE),
//                            Effect(5, true, EffectType.DAMAGE_AFTER_INVISIBLE),
//                        )
//                        else -> listOf()
//                    }
//                }
//                HeroList.FREDDIE -> {
//                    when (count) {
//                        2, 3 -> listOf(
//                            Effect(5, true, EffectType.SPEED_AFTER_STIMULATOR),
//                            Effect(-18, true, EffectType.SPREAD_IN_FOCUS)
//                        )
//                        4, 5 -> listOf(
//                            Effect(5, true, EffectType.SPEED_AFTER_STIMULATOR),
//                            Effect(-18, true, EffectType.SPREAD_IN_FOCUS),
//                            Effect(30, false, EffectType.MAX_GRENADE_RADIUS),
//                            Effect(7, false, EffectType.STIMULATOR_HEALTH),
//                        )
//                        6 -> listOf(
//                            Effect(5, true, EffectType.SPEED_AFTER_STIMULATOR),
//                            Effect(-18, true, EffectType.SPREAD_IN_FOCUS),
//                            Effect(30, false, EffectType.MAX_GRENADE_RADIUS),
//                            Effect(7, false, EffectType.STIMULATOR_HEALTH),
//                            Effect(21, false, EffectType.FIRE_RANGE_IN_FOCUS),
//                            Effect(20, false, EffectType.MAX_GRENADE_DAMAGE),
//                        )
//                        else -> listOf()
//                    }
//                }
//                HeroList.ANGEL -> {
//                    when (count) {
//                        2, 3 -> listOf(
//                            Effect(5, true, EffectType.SPEED_AFTER_STIMULATOR),
//                            Effect(-21, true, EffectType.RECHARGE_RATE)
//                        )
//                        4, 5 -> listOf(
//                            Effect(5, true, EffectType.SPEED_AFTER_STIMULATOR),
//                            Effect(-21, true, EffectType.RECHARGE_RATE),
//                            Effect(2, false, EffectType.SHIELD_PROTECTION),
//                            Effect(7, false, EffectType.STIMULATOR_HEALTH),
//                        )
//                        6 -> listOf(
//                            Effect(5, true, EffectType.SPEED_AFTER_STIMULATOR),
//                            Effect(-21, true, EffectType.RECHARGE_RATE),
//                            Effect(2, false, EffectType.SHIELD_PROTECTION),
//                            Effect(7, false, EffectType.STIMULATOR_HEALTH),
//                            Effect(21, false, EffectType.FIRE_RANGE_IN_FOCUS),
//                            Effect(1, false, EffectType.SHIELD_DURATION),
//                        )
//                        else -> listOf()
//                    }
//                }
//                HeroList.RAVEN -> {
//                    when (count) {
//                        2, 3 -> listOf(
//                            Effect(5, true, EffectType.SPEED_AFTER_STIMULATOR),
//                            Effect(-18, true, EffectType.SPREAD_IN_NOT_FOCUS)
//                        )
//                        4, 5 -> listOf(
//                            Effect(5, true, EffectType.SPEED_AFTER_STIMULATOR),
//                            Effect(-18, true, EffectType.SPREAD_IN_NOT_FOCUS),
//                            Effect(2, false, EffectType.SCAN_DURATION),
//                            Effect(7, false, EffectType.STIMULATOR_HEALTH),
//                        )
//                        6 -> listOf(
//                            Effect(5, true, EffectType.SPEED_AFTER_STIMULATOR),
//                            Effect(-18, true, EffectType.SPREAD_IN_NOT_FOCUS),
//                            Effect(2, false, EffectType.SCAN_DURATION),
//                            Effect(7, false, EffectType.STIMULATOR_HEALTH),
//                            Effect(9, true, EffectType.ARMOR_DAMAGE),
//                            Effect(7, true, EffectType.SCAN_DAMAGE),
//                        )
//                        else -> listOf()
//                    }
//                }
//                HeroList.BLOT -> {
//                    when (count) {
//                        2, 3 -> listOf(
//                            Effect(-20, true, EffectType.BAND_RUNNING_VOLUME),
//                            Effect(9, true, EffectType.ARMOR_DAMAGE)
//                        )
//                        4, 5 -> listOf(
//                            Effect(-20, true, EffectType.BAND_RUNNING_VOLUME),
//                            Effect(9, true, EffectType.ARMOR_DAMAGE),
//                            Effect(5, false, EffectType.WALL_PROTECTION),
//                            Effect(30, false, EffectType.BAND_HEALTH_UP),
//                        )
//                        6 -> listOf(
//                            Effect(-20, true, EffectType.BAND_RUNNING_VOLUME),
//                            Effect(9, true, EffectType.ARMOR_DAMAGE),
//                            Effect(5, false, EffectType.WALL_PROTECTION),
//                            Effect(30, false, EffectType.BAND_HEALTH_UP),
//                            Effect(9, true, EffectType.HEALTH_DAMAGE),
//                            Effect(15, false, EffectType.FIRE_RANGE_IN_ACTIVE_WALL),
//                        )
//                        else -> listOf()
//                    }
//                }
//                HeroList.FIREFLY -> {
//                    when (count) {
//                        2, 3 -> listOf(
//                            Effect(-20, true, EffectType.BAND_RUNNING_VOLUME),
//                            Effect(10, true, EffectType.MAX_HEALTH)
//                        )
//                        4, 5 -> listOf(
//                            Effect(-20, true, EffectType.BAND_RUNNING_VOLUME),
//                            Effect(10, true, EffectType.MAX_HEALTH),
//                            Effect(50, false, EffectType.MAX_GRENADE_RADIUS),
//                            Effect(30, false, EffectType.BAND_HEALTH_UP),
//                        )
//                        6 -> listOf(
//                            Effect(-20, true, EffectType.BAND_RUNNING_VOLUME),
//                            Effect(10, true, EffectType.MAX_HEALTH),
//                            Effect(50, false, EffectType.MAX_GRENADE_RADIUS),
//                            Effect(30, false, EffectType.BAND_HEALTH_UP),
//                            Effect(8, false, EffectType.BREAKING_WALLS),
//                            Effect(10, true, EffectType.MAX_GRENADE_DAMAGE),
//                        )
//                        else -> listOf()
//                    }
//                }
//                HeroList.SLAYER -> {
//                    when (count) {
//                        2, 3 -> listOf(
//                            Effect(-20, true, EffectType.BAND_RUNNING_VOLUME),
//                            Effect(-21, true, EffectType.RECHARGE_RATE)
//                        )
//                        4, 5 -> listOf(
//                            Effect(-20, true, EffectType.BAND_RUNNING_VOLUME),
//                            Effect(-21, true, EffectType.RECHARGE_RATE),
//                            Effect(1, false, EffectType.VISION_DURATION),
//                            Effect(30, false, EffectType.BAND_HEALTH_UP),
//                        )
//                        6 -> listOf(
//                            Effect(-20, true, EffectType.BAND_RUNNING_VOLUME),
//                            Effect(-21, true, EffectType.RECHARGE_RATE),
//                            Effect(1, false, EffectType.VISION_DURATION),
//                            Effect(30, false, EffectType.BAND_HEALTH_UP),
//                            Effect(-18, true, EffectType.AIMING_SPEED),
//                            Effect(2, false, EffectType.BREAKING_WALL_IN_VISION),
//                        )
//                        else -> listOf()
//                    }
//                }
//                HeroList.MIRAGE -> {
//                    when (count) {
//                        2, 3 -> listOf(
//                            Effect(-20, true, EffectType.BAND_RUNNING_VOLUME),
//                            Effect(-21, true, EffectType.RECHARGE_RATE)
//                        )
//                        4, 5 -> listOf(
//                            Effect(-20, true, EffectType.BAND_RUNNING_VOLUME),
//                            Effect(-21, true, EffectType.RECHARGE_RATE),
//                            Effect(50, false, EffectType.JUMP_DISTANCE),
//                            Effect(30, false, EffectType.BAND_HEALTH_UP),
//                        )
//                        6 -> listOf(
//                            Effect(-20, true, EffectType.BAND_RUNNING_VOLUME),
//                            Effect(-21, true, EffectType.RECHARGE_RATE),
//                            Effect(50, false, EffectType.JUMP_DISTANCE),
//                            Effect(30, false, EffectType.BAND_HEALTH_UP),
//                            Effect(10, true, EffectType.MAX_ARMOR),
//                            Effect(5, true, EffectType.SPEED_AFTER_JUMP),
//                        )
//                        else -> listOf()
//                    }
//                }
//                HeroList.SMOG -> {
//                    when (count) {
//                        2, 3 -> listOf(
//                            Effect(10, true, EffectType.MAX_HEALTH_AFTER_HEAL),
//                            Effect(10, true, EffectType.MAX_ARMOR)
//                        )
//                        4, 5 -> listOf(
//                            Effect(10, true, EffectType.MAX_HEALTH_AFTER_HEAL),
//                            Effect(10, true, EffectType.MAX_ARMOR),
//                            Effect(50, false, EffectType.MAX_ROCKET_RADIUS),
//                            Effect(10, true, EffectType.TANK_HEALTH_ON_ACTIVATE),
//                        )
//                        6 -> listOf(
//                            Effect(10, true, EffectType.MAX_HEALTH_AFTER_HEAL),
//                            Effect(10, true, EffectType.MAX_ARMOR),
//                            Effect(50, false, EffectType.MAX_ROCKET_RADIUS),
//                            Effect(10, true, EffectType.TANK_HEALTH_ON_ACTIVATE),
//                            Effect(10, true, EffectType.SPEED),
//                            Effect(10, true, EffectType.MAX_ROCKET_DAMAGE),
//                        )
//                        else -> listOf()
//                    }
//                }
//                HeroList.DRAGOON -> {
//                    when (count) {
//                        2, 3 -> listOf(
//                            Effect(10, true, EffectType.MAX_HEALTH_AFTER_HEAL),
//                            Effect(10, true, EffectType.MAX_HEALTH),
//                        )
//                        4, 5 -> listOf(
//                            Effect(10, true, EffectType.MAX_HEALTH_AFTER_HEAL),
//                            Effect(10, true, EffectType.MAX_HEALTH),
//                            Effect(50, false, EffectType.JUMP_DISTANCE),
//                            Effect(10, true, EffectType.TANK_HEALTH_ON_ACTIVATE),
//                        )
//                        6 -> listOf(
//                            Effect(10, true, EffectType.MAX_HEALTH_AFTER_HEAL),
//                            Effect(10, true, EffectType.MAX_HEALTH),
//                            Effect(50, false, EffectType.JUMP_DISTANCE),
//                            Effect(10, true, EffectType.TANK_HEALTH_ON_ACTIVATE),
//                            Effect(3, false, EffectType.ADD_PATRONS),
//                            Effect(-75, false, EffectType.JUMP_DAMAGE),
//                        )
//                        else -> listOf()
//                    }
//                }
//                HeroList.BASTION -> {
//                    when (count) {
//                        2, 3 -> listOf(
//                            Effect(10, true, EffectType.MAX_HEALTH_AFTER_HEAL),
//                            Effect(-29, true, EffectType.SPREAD_IN_FOCUS)
//                        )
//                        4, 5 -> listOf(
//                            Effect(10, true, EffectType.MAX_HEALTH_AFTER_HEAL),
//                            Effect(-29, true, EffectType.SPREAD_IN_FOCUS),
//                            Effect(3, false, EffectType.SHIELD_PROTECTION),
//                            Effect(10, true, EffectType.TANK_HEALTH_ON_ACTIVATE),
//                        )
//                        6 -> listOf(
//                            Effect(10, true, EffectType.MAX_HEALTH_AFTER_HEAL),
//                            Effect(-29, true, EffectType.SPREAD_IN_FOCUS),
//                            Effect(3, false, EffectType.SHIELD_PROTECTION),
//                            Effect(10, true, EffectType.TANK_HEALTH_ON_ACTIVATE),
//                            Effect(10, true, EffectType.MAX_HEALTH),
//                            Effect(1, false, EffectType.SHIELD_DURATION),
//                        )
//                        else -> listOf()
//                    }
//                }
//                HeroList.BERTHA -> {
//                    when (count) {
//                        2, 3 -> listOf(
//                            Effect(10, true, EffectType.MAX_HEALTH_AFTER_HEAL),
//                            Effect(10, true, EffectType.MAX_ARMOR),
//                        )
//                        4, 5 -> listOf(
//                            Effect(10, true, EffectType.MAX_HEALTH_AFTER_HEAL),
//                            Effect(10, true, EffectType.MAX_ARMOR),
//                            Effect(-10, true, EffectType.RECHARGE_RATE_AFTER_SUPPRESSION),
//                            Effect(10, true, EffectType.TANK_HEALTH_ON_ACTIVATE),
//                        )
//                        6 -> listOf(
//                            Effect(10, true, EffectType.MAX_HEALTH_AFTER_HEAL),
//                            Effect(10, true, EffectType.MAX_ARMOR),
//                            Effect(-10, true, EffectType.RECHARGE_RATE_AFTER_SUPPRESSION),
//                            Effect(10, true, EffectType.TANK_HEALTH_ON_ACTIVATE),
//                            Effect(10, true, EffectType.MAX_HEALTH),
//                            Effect(1, false, EffectType.BREAKING_WALL_ON_SUPPRESSION),
//                        )
//                        else -> listOf()
//                    }
//                }
//                HeroList.LEVIATHAN -> {
//                    when (count) {
//                        2, 3 -> listOf(
//                            Effect(10, true, EffectType.MAX_HEALTH_AFTER_HEAL),
//                            Effect(-18, true, EffectType.SPREAD_IN_NOT_FOCUS),
//                        )
//                        4, 5 -> listOf(
//                            Effect(10, true, EffectType.MAX_HEALTH_AFTER_HEAL),
//                            Effect(-18, true, EffectType.SPREAD_IN_NOT_FOCUS),
//                            Effect(10, true, EffectType.TURRET_DAMAGE),
//                            Effect(10, true, EffectType.TANK_HEALTH_ON_ACTIVATE),
//                        )
//                        6 -> listOf(
//                            Effect(10, true, EffectType.MAX_HEALTH_AFTER_HEAL),
//                            Effect(-18, true, EffectType.SPREAD_IN_NOT_FOCUS),
//                            Effect(10, true, EffectType.TURRET_DAMAGE),
//                            Effect(10, true, EffectType.TANK_HEALTH_ON_ACTIVATE),
//                            Effect(10, true, EffectType.SPEED),
//                            Effect(9, true, EffectType.HEALTH_ARMOR_TURRETS),
//                        )
//                        else -> listOf()
//                    }
//                }
//                HeroList.STALKER -> {
//                    when (count) {
//                        2, 3 -> listOf(
//                            Effect(-20, false, EffectType.BUFF_DAMAGE_ON_ACTIVATE_TROOPER),
//                            Effect(10, true, EffectType.SPEED),
//                        )
//                        4, 5 -> listOf(
//                            Effect(-20, false, EffectType.BUFF_DAMAGE_ON_ACTIVATE_TROOPER),
//                            Effect(10, true, EffectType.SPEED),
//                            Effect(1, false, EffectType.INVISIBLE_DURATION),
//                            Effect(10, false, EffectType.BUFF_HEALTH_ON_ACTIVATE_TROOPER),
//                        )
//                        6 -> listOf(
//                            Effect(-20, false, EffectType.BUFF_DAMAGE_ON_ACTIVATE_TROOPER),
//                            Effect(10, true, EffectType.SPEED),
//                            Effect(1, false, EffectType.INVISIBLE_DURATION),
//                            Effect(10, false, EffectType.BUFF_HEALTH_ON_ACTIVATE_TROOPER),
//                            Effect(9, true, EffectType.ARMOR_DAMAGE),
//                            Effect(5, true, EffectType.DAMAGE_AFTER_INVISIBLE),
//                        )
//                        else -> listOf()
//                    }
//                }
//                HeroList.DOC -> {
//                    when (count) {
//                        2, 3 -> listOf(
//                            Effect(-20, false, EffectType.BUFF_DAMAGE_ON_ACTIVATE_TROOPER),
//                            Effect(9, true, EffectType.FIRE_RATE),
//                        )
//                        4, 5 -> listOf(
//                            Effect(-20, false, EffectType.BUFF_DAMAGE_ON_ACTIVATE_TROOPER),
//                            Effect(9, true, EffectType.FIRE_RATE),
//                            Effect(50, false, EffectType.MAX_ROCKET_RADIUS),
//                            Effect(10, false, EffectType.BUFF_HEALTH_ON_ACTIVATE_TROOPER),
//                        )
//                        6 -> listOf(
//                            Effect(-20, false, EffectType.BUFF_DAMAGE_ON_ACTIVATE_TROOPER),
//                            Effect(9, true, EffectType.FIRE_RATE),
//                            Effect(50, false, EffectType.MAX_ROCKET_RADIUS),
//                            Effect(10, false, EffectType.BUFF_HEALTH_ON_ACTIVATE_TROOPER),
//                            Effect(9, true, EffectType.HEALTH_DAMAGE),
//                            Effect(10, true, EffectType.MAX_ROCKET_DAMAGE),
//                        )
//                        else -> listOf()
//                    }
//                }
//                HeroList.LEVI -> {
//                    when (count) {
//                        2, 3 -> listOf(
//                            Effect(-20, false, EffectType.BUFF_DAMAGE_ON_ACTIVATE_TROOPER),
//                            Effect(-21, true, EffectType.RECHARGE_RATE),
//                        )
//                        4, 5 -> listOf(
//                            Effect(-20, false, EffectType.BUFF_DAMAGE_ON_ACTIVATE_TROOPER),
//                            Effect(-21, true, EffectType.RECHARGE_RATE),
//                            Effect(1, false, EffectType.VISION_DURATION),
//                            Effect(10, false, EffectType.BUFF_HEALTH_ON_ACTIVATE_TROOPER),
//                        )
//                        6 -> listOf(
//                            Effect(-20, false, EffectType.BUFF_DAMAGE_ON_ACTIVATE_TROOPER),
//                            Effect(-21, true, EffectType.RECHARGE_RATE),
//                            Effect(1, false, EffectType.VISION_DURATION),
//                            Effect(10, false, EffectType.BUFF_HEALTH_ON_ACTIVATE_TROOPER),
//                            Effect(-29, true, EffectType.SPREAD_IN_FOCUS),
//                            Effect(2, false, EffectType.BREAKING_WALL_IN_VISION),
//                        )
//                        else -> listOf()
//                    }
//                }
//                HeroList.SATOSHI -> {
//                    when (count) {
//                        2, 3 -> listOf(
//                            Effect(-20, true, EffectType.BUFF_DAMAGE_ON_ACTIVATE_TROOPER),
//                            Effect(-18, true, EffectType.SPREAD_IN_FOCUS)
//                        )
//                        4, 5 -> listOf(
//                            Effect(-20, true, EffectType.BUFF_DAMAGE_ON_ACTIVATE_TROOPER),
//                            Effect(-18, true, EffectType.SPREAD_IN_FOCUS),
//                            Effect(1, false, EffectType.WALL_DURATION),
//                            Effect(10, false, EffectType.BUFF_HEALTH_ON_ACTIVATE_TROOPER),
//                        )
//                        6 -> listOf(
//                            Effect(-20, true, EffectType.BUFF_DAMAGE_ON_ACTIVATE_TROOPER),
//                            Effect(-18, true, EffectType.SPREAD_IN_FOCUS),
//                            Effect(1, false, EffectType.WALL_DURATION),
//                            Effect(10, false, EffectType.BUFF_HEALTH_ON_ACTIVATE_TROOPER),
//                            Effect(21, false, EffectType.FIRE_RANGE_IN_FOCUS),
//                            Effect(5, false, EffectType.WALL_PROTECTION),
//                        )
//                        else -> listOf()
//                    }
//                }
                else -> listOf()
            }
        }
    }
}