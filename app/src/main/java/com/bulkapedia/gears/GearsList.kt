package com.bulkapedia.gears

import com.bulkapedia.R

class GearsList {

    companion object {
        val TACTICAL_OPTICS = Gear(GearSet.NONE, R.drawable.tactical_optics, listOf(
            Effect(-25, true, R.string.spread_in_not_focus_effect)))
        val COMBAT_HEADBAND = Gear(GearSet.NONE, R.drawable.combat_headband, listOf(
            Effect(24, false, R.string.fire_range_focus_effect)))
        val COMMANDERS_BERET = Gear(GearSet.NONE, 0, listOf(
            Effect(-25, true, R.string.running_volume_effect)))
        val PROTECTIVE_GLASSES = Gear(GearSet.NONE, R.drawable.protective_glasses, listOf(
            Effect(65, false, R.string.visibility_effect)))
        val SPECIAL_FORCES_OPTICS = Gear(GearSet.NONE, 0, listOf(
            Effect(-24, true, R.string.aiming_speed_effect)))
        val WHITE_INDEX_EYE = Gear(GearSet.WHITE_INDEX, R.drawable.white_index_eye, listOf(
            Effect(23, false, R.string.fire_range_focus_effect),
            Effect(63, false, R.string.visibility_effect)))
        val EYE_PART = Gear(GearSet.PARTS, R.drawable.eye_part, listOf(
            Effect(-36, true, R.string.spread_in_focus_effect),
            Effect(11, true, R.string.speed_effect)))
        val EYE_DARK_IMPLANT = Gear(GearSet.DARK_IMPLANT, R.drawable.dark_eye, listOf(
            Effect(62, false, R.string.visibility_effect),
            Effect(10, true, R.string.armor_damage_effect)))
        val EYE_HEAVY_PORT = Gear(GearSet.HEAVY_PORT, R.drawable.eye_heavy_port, listOf(
            Effect(62, false, R.string.visibility_effect),
            Effect(-24, true, R.string.running_volume_effect)))
        val BIO_NODE_EYE = Gear(GearSet.BIO_NODE, R.drawable.bio_node_eye, listOf(
            Effect(25, true, R.string.fire_range_focus_effect),
            Effect(18, true, R.string.speed_in_focus_effect)))
        /** Вещи на тело **/
        val REFLEX_IMPLANT = Gear(GearSet.NONE, R.drawable.reflex_implant, listOf(
            Effect(-37, true, R.string.spread_in_focus_effect)))
        val INFANTRY_VEST = Gear(GearSet.NONE, R.drawable.vest, listOf(
            Effect(12, true, R.string.max_health_effect)))
        val REGULAR_BODY_ARMOR = Gear(GearSet.NONE, 0, listOf(
            Effect(12, true, R.string.max_armor_effect)))
        val HEALING_IMPLANT = Gear(GearSet.NONE, 0, listOf(
            Effect(17, false, R.string.add_health_effect)))
        val BODY_ARMOR_IMPLANT = Gear(GearSet.NONE, 0, listOf(
            Effect(17, false, R.string.add_armor_effect)))
        val WHITE_INDEX_HEART = Gear(GearSet.WHITE_INDEX, R.drawable.white_index_heart, listOf(
            Effect(10, true, R.string.armor_damage_effect),
            Effect(12, true, R.string.max_armor_effect)))
        val HEART_PART = Gear(GearSet.PARTS, R.drawable.heart_part, listOf(
            Effect(16, false, R.string.add_health_effect),
            Effect(9, true, R.string.health_damage_effect)))
        val HEART_DARK_IMPLANT = Gear(GearSet.DARK_IMPLANT, R.drawable.dark_heart, listOf(
            Effect(16, false, R.string.add_armor_effect),
            Effect(11, true, R.string.max_armor_effect)))
        val HEART_HEAVY_PORT = Gear(GearSet.HEAVY_PORT, R.drawable.heart_heavy_port, listOf(
            Effect(9, false, R.string.piercing_effect),
            Effect(-37, true, R.string.time_up_bust_effect)))
        val BIO_NODE_HEART = Gear(GearSet.BIO_NODE, R.drawable.bio_node_heart, listOf(
            Effect(10, false, R.string.piercing_power_effect),
            Effect(9, false, R.string.piercing_effect)))
        /** Вещи на руки **/
        val SPIKED_SHOULDER = Gear(GearSet.NONE, R.drawable.spiked_shoulder, listOf(
            Effect(16, true, R.string.piercing_effect)))
        val TACTICAL_GLOVES = Gear(GearSet.NONE, R.drawable.tactical_gloves, listOf(
            Effect(-37, true, R.string.reloading_time_effect)))
        val REGULAR_SHOULDER_PAD = Gear(GearSet.NONE, R.drawable.regular_shoulder_pad, listOf(
            Effect(12, true, R.string.armor_damage_effect)))
        val SPECIAL_FORCES_GLOVES = Gear(GearSet.NONE, 0, listOf(
            Effect(-37, true, R.string.time_up_ammo_effect)))
        val TECHNICAL_SHOULDER = Gear(GearSet.NONE, 0, listOf(
            Effect(-37, true, R.string.time_up_bust_effect)))
        val WHITE_INDEX_ARM = Gear(GearSet.WHITE_INDEX, R.drawable.white_index_hand, listOf(
            Effect(-24, true, R.string.spread_in_focus_effect),
            Effect(-25, true, R.string.reloading_time_effect)))
        val ARM_PART = Gear(GearSet.PARTS, R.drawable.arm_part, listOf(
            Effect(6, false, R.string.add_patrons_effect),
            Effect(-37, true, R.string.time_up_bust_effect)))
        val ARM_DARK_IMPLANT = Gear(GearSet.DARK_IMPLANT, R.drawable.dark_arm, listOf(
            Effect(24, false, R.string.fire_range_focus_effect),
            Effect(6, false, R.string.add_patrons_effect)))
        val ARM_HEAVY_PORT = Gear(GearSet.HEAVY_PORT, R.drawable.arm_heavy_port, listOf(
            Effect(-25, true, R.string.spread_in_not_focus_effect),
            Effect(-37, true, R.string.time_up_ammo_effect)))
        val BIO_NODE_ARM = Gear(GearSet.BIO_NODE, R.drawable.bio_node_arm, listOf(
            Effect(-25, true, R.string.reloading_time_effect),
            Effect(-36, true, R.string.time_up_bust_effect)))
        /** Вещи на ноги **/
        val RUNNERS_BOOT = Gear(GearSet.NONE, R.drawable.runners_boots, listOf(
            Effect(12, true, R.string.speed_effect)))
        val REGULAR_BOOTS = Gear(GearSet.NONE, R.drawable.regular_boot, listOf(
            Effect(-25, true, R.string.spread_in_move_effect)))
        val PRECISION_IMPLANT = Gear(GearSet.NONE, R.drawable.precision_implant, listOf(
            Effect(30, true, R.string.speed_in_focus_effect)))
        val TECH_KNEE_PADS = Gear(GearSet.NONE, R.drawable.teck_knee_pads, listOf(
            Effect(12, true, R.string.fire_rate_effect)))
        val TACTICAL_KNEE_PADS = Gear(GearSet.NONE, R.drawable.tactical_knee_pads, listOf(
            Effect(-25, true, R.string.spread_in_focus_effect)))
        val WHITE_INDEX_LEG = Gear(GearSet.WHITE_INDEX, R.drawable.white_index_leg, listOf(
            Effect(10, true, R.string.fire_rate_effect),
            Effect(11, true, R.string.speed_effect)))
        val LEG_PART = Gear(GearSet.PARTS, R.drawable.leg_part, listOf(
            Effect(11, true, R.string.max_health_effect),
            Effect(-25, true, R.string.running_volume_effect)))
        val LEG_DARK_IMPLANT = Gear(GearSet.DARK_IMPLANT, R.drawable.dark_boot, listOf(
            Effect(9, false, R.string.piercing_power_effect),
            Effect(-24, true, R.string.spread_in_focus_effect)))
        val LEG_HEAVY_PORT = Gear(GearSet.HEAVY_PORT, R.drawable.leg_heavy_port, listOf(
            Effect(-37, true, R.string.spread_in_focus_effect),
            Effect(-24, true, R.string.spread_in_move_effect)))
        val BIO_NODE_LEG = Gear(GearSet.BIO_NODE, R.drawable.bio_node_leg, listOf(
            Effect(-25, true, R.string.aiming_speed_effect),
            Effect(-25, true, R.string.spread_in_move_effect)))
        /** Вещи на 5 слот **/
        val THUG_KNUCKLE = Gear(GearSet.NONE, R.drawable.knuckle, listOf(
            Effect(9, true, R.string.health_damage_effect)))
        val LOCK_AMULET = Gear(GearSet.NONE, 0, listOf(
            Effect(-17, true, R.string.time_up_ammo_effect)))
        val WEDDING_RING = Gear(GearSet.NONE, 0, listOf(
            Effect(9, true, R.string.armor_damage_effect)))
        val ENERGY_COILS = Gear(GearSet.NONE, 0, listOf(
            Effect(10, false, R.string.add_armor_effect)))
        val PERSONAL_ID_RING = Gear(GearSet.NONE, 0, listOf(
            Effect(10, false, R.string.add_health_effect)))
        val WHITE_INDEX_COLLAR = Gear(GearSet.WHITE_INDEX, R.drawable.white_index_collar, listOf(
            Effect(10, true, R.string.health_damage_effect)))
        val RING_PART = Gear(GearSet.PARTS, R.drawable.ring_part, listOf(
            Effect(-25, true, R.string.spread_in_move_effect)))
        val RING_DARK_IMPLANT = Gear(GearSet.DARK_IMPLANT, R.drawable.dark_ring, listOf(
            Effect(-37, true, R.string.time_up_bust_effect)))
        val COLLAR_HEAVY_PORT = Gear(GearSet.HEAVY_PORT, R.drawable.ring_heavy_port, listOf(
            Effect(18, true, R.string.speed_in_focus_effect)))
        val BIO_NODE_RING = Gear(GearSet.BIO_NODE, R.drawable.bio_node_ring, listOf(
            Effect(17, false, R.string.add_armor_effect)))
        /** Вещи на 6 слот **/
        val GAS_GRENADE = Gear(GearSet.NONE, R.drawable.gas_grenade, listOf(
            Effect(9, true, R.string.piercing_effect)))
        val EXPLODER = Gear(GearSet.NONE, R.drawable.exploder, listOf(
            Effect(15, false, R.string.fire_range_focus_effect)))
        val SCAN_FLASHLIGHT = Gear(GearSet.NONE, R.drawable.scan, listOf(
            Effect(9, true, R.string.max_health_effect)))
        val ECHO_RADAR = Gear(GearSet.NONE, R.drawable.echo_radar, listOf(
            Effect(49, false, R.string.visibility_effect)))
        val SPY_SPHERE = Gear(GearSet.NONE, R.drawable.sphere, listOf(
            Effect(9, true, R.string.max_armor_effect)))
        val WHITE_INDEX_SCOPE = Gear(GearSet.WHITE_INDEX, R.drawable.white_index_scan, listOf(
            Effect(-37, true, R.string.time_up_ammo_effect)))
        val PAD_PART = Gear(GearSet.PARTS, 0, listOf(
            Effect(-25, true, R.string.aiming_speed_effect)))
        val RAD_DARK_IMPLANT = Gear(GearSet.DARK_IMPLANT, R.drawable.dark_rad, listOf(
            Effect(17, false, R.string.add_health_effect)))
        val SCOPE_HEAVY_PORT = Gear(GearSet.HEAVY_PORT, 0, listOf(
            Effect(17, false, R.string.add_armor_effect)))
        val BIO_NODE_RAD = Gear(GearSet.BIO_NODE, R.drawable.bio_node_rad, listOf(
            Effect(-25, true, R.string.spread_in_focus_effect)))
        /** Персональные шмотки **/
        val ARNIE_CAP = Gear(GearSet.PERSONAL, R.drawable.arnie_cap, listOf(
            Effect(-25, true, R.string.reloading_time_effect),
            Effect(-26, true, R.string.spread_in_not_focus_effect)))
        val ARNIE_BANDOLIER = Gear(GearSet.PERSONAL, R.drawable.arnie_bandolier, listOf(
            Effect(65, false, R.string.visibility_effect),
            Effect(25, false, R.string.fire_range_effect)))
        val ARNIE_BANDAGE = Gear(GearSet.PERSONAL, R.drawable.arnie_bandage, listOf(
            Effect(10, false, R.string.piercing_effect),
            Effect(18, false, R.string.add_health_effect)))
        val ARNIE_BOOTS = Gear(GearSet.PERSONAL, R.drawable.arnie_boot, listOf(
            Effect(12, true, R.string.armor_damage_effect),
            Effect(-26, true, R.string.spread_in_move_effect)))
        val ARNIE_PONCHO = Gear(GearSet.PERSONAL, R.drawable.arnie_poncho, listOf(
            Effect(18, false, R.string.add_armor_effect),
            Effect(12, true, R.string.max_health_effect)))
        val ARNIE_ROTOR = Gear(GearSet.PERSONAL, R.drawable.arnie_rotor, listOf(
            Effect(11, true, R.string.health_damage_effect),
            Effect(-25, true, R.string.running_volume_effect)))

        val CYCLOPS_EYE = Gear(GearSet.PERSONAL, R.drawable.cyclops_eye, listOf(
            Effect(25, false, R.string.fire_range_focus_effect),
            Effect(18, false, R.string.add_health_effect)))
        val CYCLOPS_HEART = Gear(GearSet.PERSONAL, R.drawable.cyclops_heart, listOf(
            Effect(11, true, R.string.fire_rate_effect),
            Effect(12, true, R.string.max_health_effect)))
        val CYCLOPS_GLOVES = Gear(GearSet.PERSONAL, R.drawable.cyclops_gloves, listOf(
            Effect(11, true, R.string.armor_damage_effect),
            Effect(-25, true, R.string.reloading_time_effect)))
        val CYCLOPS_BOOTS = Gear(GearSet.PERSONAL, R.drawable.cyclops_boot, listOf(
            Effect(-30, true, R.string.aiming_speed_effect),
            Effect(12, true, R.string.speed_effect)))
        val CYCLOPS_COIN = Gear(GearSet.PERSONAL, R.drawable.cyclops_coin, listOf(
            Effect(65, false, R.string.visibility_effect),
            Effect(18, false, R.string.add_armor_effect)))
        val CYCLOPS_RADAR = Gear(GearSet.PERSONAL, R.drawable.cyclops_radar, listOf(
            Effect(10, false, R.string.piercing_power_effect),
            Effect(10, false, R.string.piercing_effect)))

        val SPARKLE_EYE = Gear(GearSet.PERSONAL, R.drawable.sparkle_eye, listOf(
            Effect(-24, true, R.string.spread_in_not_focus_effect),
            Effect(18, false, R.string.add_armor_effect)))
        val SPARKLE_BELT = Gear(GearSet.PERSONAL, R.drawable.sparkle_belt, listOf(
            Effect(12, true, R.string.max_armor_effect),
            Effect(-33, true, R.string.spread_in_focus_effect)))
        val SPARKLE_GLOVES = Gear(GearSet.PERSONAL, R.drawable.sparkle_gloves, listOf(
            Effect(9, false, R.string.piercing_effect),
            Effect(-37, true, R.string.time_up_bust_effect)))
        val SPARKLE_BOOTS = Gear(GearSet.PERSONAL, R.drawable.sparkle_boot, listOf(
            Effect(12, true, R.string.speed_effect),
            Effect(-25, true, R.string.running_volume_effect)))
        val SPARKLE_CHOKER = Gear(GearSet.PERSONAL, R.drawable.sparkle_chocker, listOf(
            Effect(18, false, R.string.add_armor_effect),
            Effect(12, true, R.string.max_health_effect)))
        val SPARKLE_GRENADE = Gear(GearSet.PERSONAL, R.drawable.sparkle_grenade, listOf(
            Effect(10, false, R.string.piercing_power_effect),
            Effect(-37, true, R.string.time_up_ammo_effect)))

        val HURRICANE_EYE = Gear(GearSet.PERSONAL, R.drawable.hurricane_eye, listOf(
            Effect(-26, true, R.string.spread_in_move_effect),
            Effect(65, false, R.string.visibility_effect)))
        val HURRICANE_BELT = Gear(GearSet.PERSONAL, R.drawable.hurricane_belt, listOf(
            Effect(12, true, R.string.max_health_effect),
            Effect(-37, true, R.string.spread_in_focus_effect)))
        val HURRICANE_HANDS = Gear(GearSet.PERSONAL, R.drawable.hurricane_gloves, listOf(
            Effect(10, false, R.string.piercing_effect),
            Effect(-37, true, R.string.time_up_bust_effect)))
        val HURRICANE_BOOTS = Gear(GearSet.PERSONAL, R.drawable.hurricane_boot, listOf(
            Effect(12, true, R.string.max_armor_effect),
            Effect(12, true, R.string.fire_rate_effect)))
        val HURRICANE_RING = Gear(GearSet.PERSONAL, R.drawable.hurricane_ring, listOf(
            Effect(-26, true, R.string.spread_in_not_focus_effect),
            Effect(11, true, R.string.armor_damage_effect)))
        val HURRICANE_CRYSTAL = Gear(GearSet.PERSONAL, R.drawable.hurricane_crystal, listOf(
            Effect(10, false, R.string.piercing_power_effect),
            Effect(18, false, R.string.add_health_effect)))

        val GHOST_EYE = Gear(GearSet.PERSONAL, R.drawable.ghost_eye, listOf(
            Effect(11, true, R.string.fire_rate_effect),
            Effect(-37, true, R.string.speed_in_focus_effect)))
        val GHOST_HEART = Gear(GearSet.PERSONAL, R.drawable.ghost_heart, listOf(
            Effect(12, true, R.string.max_armor_effect),
            Effect(10, true, R.string.health_damage_effect)))
        val GHOST_KNUCKLES = Gear(GearSet.PERSONAL, R.drawable.ghost_knuckle, listOf(
            Effect(11, true, R.string.armor_damage_effect),
            Effect(65, false, R.string.visibility_effect)))
        val GHOST_BOOTS = Gear(GearSet.PERSONAL, R.drawable.ghost_boot, listOf(
            Effect(12, true, R.string.speed_effect),
            Effect(-25, true, R.string.running_volume_effect)))
        val GHOST_NECKLACE = Gear(GearSet.PERSONAL, R.drawable.ghost_necklace, listOf(
            Effect(-26, true, R.string.spread_in_move_effect),
            Effect(9, true, R.string.max_health_effect)))
        val GHOST_DYNAMO = Gear(GearSet.PERSONAL, R.drawable.ghost_dynamo, listOf(
            Effect(-25, true, R.string.reloading_time_effect),
            Effect(-26, true, R.string.spread_in_focus_effect)))

        val FREDDIE_MASK = Gear(GearSet.PERSONAL, R.drawable.freddie_mask, listOf(
            Effect(11, true, R.string.armor_damage_effect),
            Effect(-37, true, R.string.spread_in_focus_effect)))
        val FREDDIE_BANDOLIER = Gear(GearSet.PERSONAL, R.drawable.freddie_bandolier, listOf(
            Effect(10, true, R.string.health_damage_effect),
            Effect(18, false, R.string.add_armor_effect)))
        val FREDDIE_KNUCKLES = Gear(GearSet.PERSONAL, R.drawable.freddie_knuckle, listOf(
            Effect(-26, true, R.string.spread_in_not_focus_effect),
            Effect(9, false, R.string.piercing_effect)))
        val FREDDIE_BOOTS = Gear(GearSet.PERSONAL, R.drawable.freddie_boot, listOf(
            Effect(12, true, R.string.speed_effect),
            Effect(65, false, R.string.visibility_effect)))
        val FREDDIE_RING = Gear(GearSet.PERSONAL, R.drawable.freddie_ring, listOf(
            Effect(25, false, R.string.fire_range_effect),
            Effect(25, false, R.string.fire_range_focus_effect)))
        val FREDDIE_GRENADE = Gear(GearSet.PERSONAL, R.drawable.freddie_grenade, listOf(
            Effect(-26, true, R.string.spread_in_move_effect),
            Effect(12, true, R.string.max_health_effect)))

        val ANGEL_EYE = Gear(GearSet.PERSONAL, R.drawable.angel_eye, listOf(
            Effect(65, false, R.string.visibility_effect),
            Effect(12, true, R.string.speed_effect)))
        val ANGEL_HEART = Gear(GearSet.PERSONAL, R.drawable.angel_heart, listOf(
            Effect(10, true, R.string.health_damage_effect),
            Effect(-37, true, R.string.time_up_ammo_effect)))
        val ANGEL_GLOVES = Gear(GearSet.PERSONAL, R.drawable.angel_gloves, listOf(
            Effect(12, true, R.string.max_health_effect),
            Effect(18, false, R.string.add_armor_effect)))
        val ANGEL_LEGS = Gear(GearSet.PERSONAL, R.drawable.angel_leg, listOf(
            Effect(-26, true, R.string.spread_in_not_focus_effect),
            Effect(18, false, R.string.add_health_effect)))
        val ANGEL_RING = Gear(GearSet.PERSONAL, R.drawable.angel_ring, listOf(
            Effect(-26, true, R.string.spread_in_move_effect),
            Effect(11, true, R.string.armor_damage_effect)))
        val ANGEL_SPHERE = Gear(GearSet.PERSONAL, R.drawable.angel_sphere, listOf(
            Effect(12, true, R.string.max_armor_effect),
            Effect(-25, true, R.string.running_volume_effect)))

        val RAVEN_MASK = Gear(GearSet.PERSONAL, R.drawable.raven_mask, listOf(
            Effect(-25, true, R.string.reloading_time_effect),
            Effect(12, true, R.string.speed_effect)))
        val RAVEN_HEART = Gear(GearSet.PERSONAL, R.drawable.raven_heart, listOf(
            Effect(10, true, R.string.health_damage_effect),
            Effect(-25, true, R.string.running_volume_effect)))
        val RAVEN_GLOVES = Gear(GearSet.PERSONAL, R.drawable.raven_gloves, listOf(
            Effect(25, false, R.string.fire_range_focus_effect),
            Effect(11, true, R.string.armor_damage_effect)))
        val RAVEN_BOOTS = Gear(GearSet.PERSONAL, R.drawable.raven_boot, listOf(
            Effect(-26, true, R.string.spread_in_move_effect),
            Effect(65, false, R.string.visibility_effect)))
        val RAVEN_NECKLACE = Gear(GearSet.PERSONAL, R.drawable.raven_necklace, listOf(
            Effect(12, true, R.string.max_health_effect),
            Effect(18, false, R.string.add_health_effect)))
        val RAVEN_RADAR = Gear(GearSet.PERSONAL, R.drawable.raven_radar, listOf(
            Effect(9, false, R.string.piercing_effect),
            Effect(19, true, R.string.speed_in_focus_effect)))

        val BLOT_BRAINPAN = Gear(GearSet.PERSONAL, R.drawable.blot_brainpan, listOf(
            Effect(-26, true, R.string.spread_in_not_focus_effect),
            Effect(18, false, R.string.add_health_effect)))
        val BLOT_HEART = Gear(GearSet.PERSONAL, R.drawable.blot_heart, listOf(
            Effect(-37, true, R.string.spread_in_focus_effect),
            Effect(12, true, R.string.max_health_effect)))
        val BLOT_SHOULDER = Gear(GearSet.PERSONAL, R.drawable.blot_shoulder, listOf(
            Effect(25, false, R.string.fire_range_focus_effect),
            Effect(-26, true, R.string.aiming_speed_effect)))
        val BLOT_LEGS = Gear(GearSet.PERSONAL, R.drawable.blot_leg, listOf(
            Effect(-26, true, R.string.spread_in_move_effect),
            Effect(12, true, R.string.speed_effect)))
        val BLOT_RING = Gear(GearSet.PERSONAL, R.drawable.blot_ring, listOf(
            Effect(10, false, R.string.piercing_power_effect),
            Effect(-25, true, R.string.running_volume_effect)))
        val BLOT_DEVICE = Gear(GearSet.PERSONAL, R.drawable.blot_device, listOf(
            Effect(9, false, R.string.piercing_effect),
            Effect(65, false, R.string.visibility_effect)))

        val FIREFLY_GLASSES = Gear(GearSet.PERSONAL, R.drawable.firefly_glasses, listOf(
            Effect(-25, true, R.string.reloading_time_effect),
            Effect(65, false, R.string.visibility_effect)))
        val FIREFLY_HEART = Gear(GearSet.PERSONAL, R.drawable.firefly_heart, listOf(
            Effect(25, false, R.string.fire_range_focus_effect),
            Effect(18, false, R.string.add_health_effect)))
        val FIREFLY_KNUCKLES = Gear(GearSet.PERSONAL, R.drawable.firefly_knuckle, listOf(
            Effect(11, true, R.string.fire_rate_effect),
            Effect(9, false, R.string.piercing_effect)))
        val FIREFLY_BOOTS = Gear(GearSet.PERSONAL, R.drawable.firefly_boot, listOf(
            Effect(-26, true, R.string.spread_in_focus_effect),
            Effect(12, true, R.string.speed_effect)))
        val FIREFLY_NECKLACE = Gear(GearSet.PERSONAL, R.drawable.firefly_necklace, listOf(
            Effect(-26, true, R.string.aiming_speed_effect),
            Effect(-37, true, R.string.spread_in_focus_effect)))
        val FIREFLY_GRENADE = Gear(GearSet.PERSONAL, R.drawable.firefly_grenade, listOf(
            Effect(11, true, R.string.health_damage_effect),
            Effect(-26, true, R.string.spread_in_move_effect)))

        val SLAYER_HEADPHONES = Gear(GearSet.PERSONAL, R.drawable.slayer_headphones, listOf(
            Effect(11, true, R.string.fire_rate_effect),
            Effect(-37, true, R.string.time_up_bust_effect)))
        val SLAYER_POUCH = Gear(GearSet.PERSONAL, R.drawable.slayer_pouch, listOf(
            Effect(25, false, R.string.fire_range_focus_effect),
            Effect(-26, true, R.string.spread_in_move_effect)))
        val SLAYER_BANDAGE = Gear(GearSet.PERSONAL, R.drawable.slayer_bandage, listOf(
            Effect(-26, true, R.string.spread_in_not_focus_effect),
            Effect(12, true, R.string.speed_effect)))
        val SLAYER_BOOTS = Gear(GearSet.PERSONAL, R.drawable.slayer_boot, listOf(
            Effect(-37, true, R.string.spread_in_focus_effect),
            Effect(10, false, R.string.piercing_power_effect)))
        val SLAYER_TAGS = Gear(GearSet.PERSONAL, R.drawable.slayer_tags, listOf(
            Effect(10, true, R.string.health_damage_effect),
            Effect(65, false, R.string.visibility_effect)))
        val SLAYER_RADAR = Gear(GearSet.PERSONAL, R.drawable.slayer_rad, listOf(
            Effect(18, false, R.string.add_armor_effect),
            Effect(-25, true, R.string.running_volume_effect)))

        val MIRAGE_EYE = Gear(GearSet.PERSONAL, R.drawable.mirage_eye, listOf(
            Effect(12, true, R.string.max_health_effect),
            Effect(-25, true, R.string.running_volume_effect)))
        val MIRAGE_BELT = Gear(GearSet.PERSONAL, R.drawable.mirage_belt, listOf(
            Effect(9, true, R.string.speed_effect),
            Effect(18, false, R.string.add_armor_effect)))
        val MIRAGE_KNUCKLES = Gear(GearSet.PERSONAL, R.drawable.mirage_knuckle, listOf(
            Effect(-37, true, R.string.time_up_bust_effect),
            Effect(25, false, R.string.fire_range_focus_effect)))
        val MIRAGE_BOOTS = Gear(GearSet.PERSONAL, R.drawable.mirage_boot, listOf(
            Effect(6, false, R.string.add_patrons_effect),
            Effect(12, true, R.string.fire_rate_effect)))
        val MIRAGE_CHOKER = Gear(GearSet.PERSONAL, R.drawable.mirage_choker, listOf(
            Effect(18, false, R.string.add_health_effect),
            Effect(10, true, R.string.health_damage_effect)))
        val MIRAGE_ANTIGRAV = Gear(GearSet.PERSONAL, R.drawable.mirage_antigrav, listOf(
            Effect(65, false, R.string.visibility_effect),
            Effect(7, true, R.string.max_armor_effect)))

        val SMOG_MASK = Gear(GearSet.PERSONAL, R.drawable.smog_mask, listOf(
            Effect(65, false, R.string.visibility_effect),
            Effect(25, false, R.string.add_health_effect)))
        val SMOG_HEART = Gear(GearSet.PERSONAL, R.drawable.smog_heart, listOf(
            Effect(12, true, R.string.max_health_effect),
            Effect(10, false, R.string.piercing_effect)))
        val SMOG_GLOVES = Gear(GearSet.PERSONAL, R.drawable.smog_gloves, listOf(
            Effect(25, false, R.string.fire_range_effect),
            Effect(25, false, R.string.fire_range_focus_effect)))
        val SMOG_BOOTS = Gear(GearSet.PERSONAL, R.drawable.smog_boot, listOf(
            Effect(12, true, R.string.speed_effect),
            Effect(-25, true, R.string.running_volume_effect)))
        val SMOG_TAG = Gear(GearSet.PERSONAL, R.drawable.smog_tag, listOf(
            Effect(-26, true, R.string.spread_in_not_focus_effect),
            Effect(-25, true, R.string.reloading_time_effect)))
        val SMOG_ROCKET = Gear(GearSet.PERSONAL, R.drawable.smog_rocket, listOf(
            Effect(11, true, R.string.armor_damage_effect),
            Effect(-26, true, R.string.spread_in_move_effect)))

        val BASTION_EYE = Gear(GearSet.PERSONAL, R.drawable.bastion_eye, listOf(
            Effect(65, false, R.string.visibility_effect),
            Effect(-25, true, R.string.reloading_time_effect)))
        val BASTION_HEART = Gear(GearSet.PERSONAL, R.drawable.bastion_heart, listOf(
            Effect(12, true, R.string.max_armor_effect),
            Effect(9, false, R.string.piercing_effect)))
        val BASTION_GLOVES = Gear(GearSet.PERSONAL, R.drawable.bastion_gloves, listOf(
            Effect(-26, true, R.string.spread_in_move_effect),
            Effect(10, true, R.string.fire_rate_effect)))
        val BASTION_BOOTS = Gear(GearSet.PERSONAL, R.drawable.bastion_boot, listOf(
            Effect(12, true, R.string.max_health_effect),
            Effect(-25, true, R.string.running_volume_effect)))
        val BASTION_RING = Gear(GearSet.PERSONAL, R.drawable.bastion_ring, listOf(
            Effect(10, true, R.string.health_damage_effect),
            Effect(-26, true, R.string.spread_in_focus_effect)))
        val BASTION_SPHERE = Gear(GearSet.PERSONAL, R.drawable.bastion_sphere, listOf(
            Effect(18, false, R.string.add_health_effect),
            Effect(12, true, R.string.speed_effect)))

        val DRAGOON_HAT = Gear(GearSet.PERSONAL, R.drawable.dragoon_hat, listOf(
            Effect(12, true, R.string.max_armor_effect),
            Effect(65, false, R.string.visibility_effect)))
        val DRAGOON_HEART = Gear(GearSet.PERSONAL, R.drawable.dragoon_heart, listOf(
            Effect(10, false, R.string.piercing_effect),
            Effect(-25, true, R.string.running_volume_effect)))
        val DRAGOON_SHOULDER_PAD = Gear(GearSet.PERSONAL, R.drawable.dragoon_shoulder_pad, listOf(
            Effect(5, false, R.string.add_patrons_effect),
            Effect(18, false, R.string.add_health_effect)))
        val DRAGOON_BOOTS = Gear(GearSet.PERSONAL, R.drawable.dragoon_boot, listOf(
            Effect(-26, true, R.string.spread_in_move_effect),
            Effect(12, true, R.string.speed_effect)))
        val DRAGOON_CHAIN = Gear(GearSet.PERSONAL, R.drawable.dragoon_chain, listOf(
            Effect(10, true, R.string.health_damage_effect),
            Effect(-37, true, R.string.spread_in_focus_effect)))
        val DRAGOON_ROTOR = Gear(GearSet.PERSONAL, R.drawable.dragoon_rotor, listOf(
            Effect(-25, true, R.string.reloading_time_effect),
            Effect(-37, true, R.string.time_up_ammo_effect)))

        val BERTHA_EYE = Gear(GearSet.PERSONAL, R.drawable.bertha_eye, listOf(
            Effect(25, false, R.string.fire_range_focus_effect),
            Effect(-25, true, R.string.running_volume_effect)))
        val BERTHA_BANDOLIER = Gear(GearSet.PERSONAL, R.drawable.bertha_belt, listOf(
            Effect(10, false, R.string.piercing_effect),
            Effect(12, true, R.string.max_health_effect)))
        val BERTHA_SLEEVE = Gear(GearSet.PERSONAL, R.drawable.bertha_sleeve, listOf(
            Effect(18, false, R.string.add_armor_effect),
            Effect(65, false, R.string.visibility_effect)))
        val BERTHA_BOOTS = Gear(GearSet.PERSONAL, R.drawable.bertha_boot, listOf(
            Effect(-25, true, R.string.reloading_time_effect),
            Effect(12, true, R.string.speed_effect)))
        val BERTHA_RING = Gear(GearSet.PERSONAL, R.drawable.bertha_ring, listOf(
            Effect(10, true, R.string.health_damage_effect),
            Effect(18, false, R.string.add_health_effect)))
        val BERTHA_FLASHLIGHT = Gear(GearSet.PERSONAL, R.drawable.bertha_scan, listOf(
            Effect(11, true, R.string.armor_damage_effect),
            Effect(-37, true, R.string.time_up_ammo_effect)))

        val LEVIATHAN_HAT = Gear(GearSet.PERSONAL, R.drawable.leviathan_cap, listOf(
            Effect(-26, true, R.string.spread_in_move_effect),
            Effect(8, false, R.string.piercing_power_effect)))
        val LEVIATHAN_IMPLANT = Gear(GearSet.PERSONAL, R.drawable.leviathan_implant, listOf(
            Effect(12, true, R.string.max_armor_effect),
            Effect(-37, true, R.string.spread_in_focus_effect)))
        val LEVIATHAN_SHOULDER_PAD = Gear(GearSet.PERSONAL, R.drawable.leviathan_shoulder, listOf(
            Effect(9, true, R.string.damage_effect),
            Effect(-25, true, R.string.reloading_time_effect)))
        val LEVIATHAN_BOOTS = Gear(GearSet.PERSONAL, R.drawable.leviathan_boot, listOf(
            Effect(12, true, R.string.fire_rate_effect),
            Effect(12, true, R.string.max_health_effect)))
        val LEVIATHAN_RING = Gear(GearSet.PERSONAL, R.drawable.leviathan_ring, listOf(
            Effect(11, true, R.string.health_damage_effect),
            Effect(18, false, R.string.add_armor_effect)))
        val LEVIATHAN_EXPLODER = Gear(GearSet.PERSONAL, R.drawable.leviathan_exploder, listOf(
            Effect(65, false, R.string.visibility_effect),
            Effect(9, false, R.string.piercing_effect)))

        val STALKER_HAT = Gear(GearSet.PERSONAL, R.drawable.stalker_hat, listOf(
            Effect(25, false, R.string.fire_range_focus_effect),
            Effect(65, false, R.string.visibility_effect)))
        val STALKER_BELT = Gear(GearSet.PERSONAL, R.drawable.stalker_belt, listOf(
            Effect(-26, true, R.string.spread_in_not_focus_effect),
            Effect(10, false, R.string.piercing_effect)))
        val STALKER_SHOULDER_PAD = Gear(GearSet.PERSONAL, R.drawable.stalker_shoulder_pad, listOf(
            Effect(12, true, R.string.max_health_effect),
            Effect(18, false, R.string.add_armor_effect)))
        val STALKER_BOOTS = Gear(GearSet.PERSONAL, R.drawable.stalker_boot, listOf(
            Effect(12, true, R.string.fire_rate_effect),
            Effect(-25, true, R.string.running_volume_effect)))
        val STALKER_CHAIN = Gear(GearSet.PERSONAL, R.drawable.stalker_chain, listOf(
            Effect(10, true, R.string.health_damage_effect),
            Effect(-37, true, R.string.time_up_ammo_effect)))
        val STALKER_RAZOR = Gear(GearSet.PERSONAL, R.drawable.stalker_razor, listOf(
            Effect(6, false, R.string.add_patrons_effect),
            Effect(-37, true, R.string.spread_in_focus_effect)))

        val DOC_MASK = Gear(GearSet.PERSONAL, R.drawable.doc_mask, listOf(
            Effect(-26, true, R.string.spread_in_not_focus_effect),
            Effect(65, false, R.string.visibility_effect)))
        val DOC_BELT = Gear(GearSet.PERSONAL, R.drawable.doc_belt, listOf(
            Effect(18, false, R.string.add_health_effect),
            Effect(-37, true, R.string.spread_in_focus_effect)))
        val DOC_GLOVES = Gear(GearSet.PERSONAL, R.drawable.doc_gloves, listOf(
            Effect(11, true, R.string.armor_damage_effect),
            Effect(25, false, R.string.fire_range_focus_effect)))
        val DOC_BOOTS = Gear(GearSet.PERSONAL, R.drawable.doc_boot, listOf(
            Effect(12, true, R.string.speed_effect),
            Effect(-25, true, R.string.running_volume_effect)))
        val DOC_NECKLACE = Gear(GearSet.PERSONAL, R.drawable.doc_necklace, listOf(
            Effect(12, true, R.string.max_health_effect),
            Effect(19, true, R.string.speed_in_focus_effect)))
        val DOC_ROCKET = Gear(GearSet.PERSONAL, R.drawable.doc_rocket, listOf(
            Effect(9, false, R.string.piercing_effect),
            Effect(-37, true, R.string.time_up_bust_effect)))

        val LEVI_PATCH = Gear(GearSet.PERSONAL, R.drawable.levi_patch, listOf(
            Effect(-26, true, R.string.spread_in_move_effect),
            Effect(25, false, R.string.fire_range_focus_effect)))
        val LEVI_BELT = Gear(GearSet.PERSONAL, R.drawable.levi_belt, listOf(
            Effect(12, true, R.string.max_armor_effect),
            Effect(10, false, R.string.piercing_power_effect)))
        val LEVI_WHIP = Gear(GearSet.PERSONAL, R.drawable.levi_whip, listOf(
            Effect(-26, true, R.string.aiming_speed_effect),
            Effect(9, false, R.string.piercing_effect)))
        val LEVI_BOOTS = Gear(GearSet.PERSONAL, R.drawable.levi_boot, listOf(
            Effect(-26, true, R.string.spread_in_focus_effect),
            Effect(12, true, R.string.fire_rate_effect)))
        val LEVI_TAG = Gear(GearSet.PERSONAL, R.drawable.levi_tag, listOf(
            Effect(18, false, R.string.add_armor_effect),
            Effect(65, false, R.string.visibility_effect)))
        val LEVI_RADIO = Gear(GearSet.PERSONAL, R.drawable.levi_radio, listOf(
            Effect(12, true, R.string.max_health_effect),
            Effect(-25, true, R.string.running_volume_effect)))

        val SATOSHI_EYE = Gear(GearSet.PERSONAL, R.drawable.satoshi_eye, listOf(
            Effect(12, true, R.string.max_armor_effect),
            Effect(-25, true, R.string.reloading_time_effect)))
        val SATOSHI_SHOULDER_PAD = Gear(GearSet.PERSONAL, R.drawable.satoshi_should, listOf(
            Effect(9, false, R.string.piercing_effect),
            Effect(19, true, R.string.speed_in_focus_effect)))
        val SATOSHI_HANDS = Gear(GearSet.PERSONAL, R.drawable.satoshi_hands, listOf(
            Effect(12, true, R.string.max_health_effect),
            Effect(-37, true, R.string.time_up_bust_effect)))
        val SATOSHI_LEGS = Gear(GearSet.PERSONAL, R.drawable.satoshi_leg, listOf(
            Effect(-37, true, R.string.spread_in_focus_effect),
            Effect(12, true, R.string.speed_effect)))
        val SATOSHI_RING = Gear(GearSet.PERSONAL, R.drawable.satoshi_ring, listOf(
            Effect(-26, true, R.string.spread_in_move_effect),
            Effect(65, false, R.string.visibility_effect)))
        val SATOSHI_ORB = Gear(GearSet.PERSONAL, R.drawable.satoshi_sphere, listOf(
            Effect(11, true, R.string.armor_damage_effect),
            Effect(-25, true, R.string.running_volume_effect)))
    }

}