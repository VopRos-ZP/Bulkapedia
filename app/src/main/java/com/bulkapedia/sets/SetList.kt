package com.bulkapedia.sets

import com.bulkapedia.R
import com.bulkapedia.gears.GearsList

class SetList {

    companion object {
        val ARNIE_SETS = listOf(
            Set(R.string.classical_set, mapOf(
                GearCell.HEAD to GearsList.TACTICAL_OPTICS,
                GearCell.BODY to GearsList.WHITE_INDEX_HEART,
                GearCell.ARM to GearsList.REGULAR_SHOULDER_PAD,
                GearCell.LEG to GearsList.WHITE_INDEX_LEG,
                GearCell.DECOR to GearsList.WHITE_INDEX_COLLAR,
                GearCell.DEVICE to GearsList.ECHO_RADAR),
                R.string.arnie_classical_set_desc
            ),
            Set(R.string.healing_set, mapOf(
                GearCell.HEAD to GearsList.TACTICAL_OPTICS,
                GearCell.BODY to GearsList.WHITE_INDEX_HEART,
                GearCell.ARM to GearsList.ARNIE_BANDAGE,
                GearCell.LEG to GearsList.WHITE_INDEX_LEG,
                GearCell.DECOR to GearsList.ARNIE_PONCHO,
                GearCell.DEVICE to GearsList.SCAN_FLASHLIGHT),
                R.string.arnie_survivability_set_desc
            ),
            Set(R.string.damage_set, mapOf(
                GearCell.HEAD to GearsList.ARNIE_CAP,
                GearCell.BODY to GearsList.WHITE_INDEX_HEART,
                GearCell.ARM to GearsList.ARNIE_BANDAGE,
                GearCell.LEG to GearsList.ARNIE_BOOTS,
                GearCell.DECOR to GearsList.WHITE_INDEX_COLLAR,
                GearCell.DEVICE to GearsList.ARNIE_ROTOR),
                R.string.arnie_damage_set_desc
            ),
        )
        val CYCLOPS_SETS = listOf(
            Set(R.string.classical_set, mapOf(
                GearCell.HEAD to GearsList.WHITE_INDEX_EYE,
                GearCell.BODY to GearsList.INFANTRY_VEST,
                GearCell.ARM to GearsList.SPIKED_SHOULDER,
                GearCell.LEG to GearsList.PRECISION_IMPLANT,
                GearCell.DECOR to GearsList.WHITE_INDEX_COLLAR,
                GearCell.DEVICE to GearsList.ECHO_RADAR),
                R.string.cyclops_classical_set_desc
            ),
            Set(R.string.recommended_set, mapOf(
                GearCell.HEAD to GearsList.TACTICAL_OPTICS,
                GearCell.BODY to GearsList.CYCLOPS_HEART,
                GearCell.ARM to GearsList.WHITE_INDEX_ARM,
                GearCell.LEG to GearsList.PRECISION_IMPLANT,
                GearCell.DECOR to GearsList.WHITE_INDEX_COLLAR,
                GearCell.DEVICE to GearsList.CYCLOPS_RADAR),
                R.string.cyclops_recommended_set_desc
            ),
        )
        val SPARKLE_SETS = listOf(
            Set(R.string.classical_set, mapOf(
                GearCell.HEAD to GearsList.WHITE_INDEX_EYE,
                GearCell.BODY to GearsList.WHITE_INDEX_HEART,
                GearCell.ARM to GearsList.TACTICAL_GLOVES,
                GearCell.LEG to GearsList.WHITE_INDEX_LEG,
                GearCell.DECOR to GearsList.WHITE_INDEX_COLLAR,
                GearCell.DEVICE to GearsList.ECHO_RADAR),
                R.string.sparkle_classical_set_desc
            ),
            Set(R.string.recommended_set, mapOf(
                GearCell.HEAD to GearsList.SPARKLE_EYE,
                GearCell.BODY to GearsList.SPARKLE_BELT,
                GearCell.ARM to GearsList.SPARKLE_GLOVES,
                GearCell.LEG to GearsList.SPARKLE_BOOTS,
                GearCell.DECOR to GearsList.SPARKLE_CHOKER,
                GearCell.DEVICE to GearsList.SPARKLE_GRENADE),
                R.string.sparkle_recommended_set_desc
            )
        )
        val HURRICANE_SETS = listOf(
            Set(R.string.classical_set, mapOf(
                GearCell.HEAD to GearsList.TACTICAL_OPTICS,
                GearCell.BODY to GearsList.INFANTRY_VEST,
                GearCell.ARM to GearsList.SPIKED_SHOULDER,
                GearCell.LEG to GearsList.WHITE_INDEX_LEG,
                GearCell.DECOR to GearsList.WHITE_INDEX_COLLAR,
                GearCell.DEVICE to GearsList.GAS_GRENADE),
                R.string.hurricane_classical_set_desc
            ),
            Set(R.string.recommended_set, mapOf(
                GearCell.HEAD to GearsList.HURRICANE_EYE,
                GearCell.BODY to GearsList.HURRICANE_BELT,
                GearCell.ARM to GearsList.HURRICANE_HANDS,
                GearCell.LEG to GearsList.WHITE_INDEX_LEG,
                GearCell.DECOR to GearsList.WHITE_INDEX_COLLAR,
                GearCell.DEVICE to GearsList.HURRICANE_CRYSTAL),
                R.string.hurricane_recommended_set_desc
            ),
        )
        val GHOST_SETS = listOf(
            Set(R.string.classical_set, mapOf(
                GearCell.HEAD to GearsList.EYE_PART,
                GearCell.BODY to GearsList.HEART_PART,
                GearCell.ARM to GearsList.ARM_PART,
                GearCell.LEG to GearsList.RUNNERS_BOOT,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.GAS_GRENADE),
                R.string.ghost_classical_set_desc
            ),
            Set(R.string.recommended_set, mapOf(
                GearCell.HEAD to GearsList.GHOST_EYE,
                GearCell.BODY to GearsList.HEART_PART,
                GearCell.ARM to GearsList.GHOST_KNUCKLES,
                GearCell.LEG to GearsList.GHOST_BOOTS,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.GHOST_DYNAMO),
                R.string.ghost_recommended_set_desc
            ),
        )
        val FREDDIE_SETS = listOf(
            Set(R.string.classical_set, mapOf(
                GearCell.HEAD to GearsList.EYE_PART,
                GearCell.BODY to GearsList.HEART_PART,
                GearCell.ARM to GearsList.ARM_PART,
                GearCell.LEG to GearsList.RUNNERS_BOOT,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.ECHO_RADAR),
                R.string.freddie_classical_set_desc
            ),
            Set(R.string.recommended_set, mapOf(
                GearCell.HEAD to GearsList.EYE_PART,
                GearCell.BODY to GearsList.FREDDIE_BANDOLIER,
                GearCell.ARM to GearsList.FREDDIE_KNUCKLES,
                GearCell.LEG to GearsList.FREDDIE_BOOTS,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.FREDDIE_GRENADE),
                R.string.freddie_recommended_set_desc
            ),
        )
        val ANGEL_SETS = listOf(
            Set(R.string.classical_set, mapOf(
                GearCell.HEAD to GearsList.EYE_PART,
                GearCell.BODY to GearsList.HEART_PART,
                GearCell.ARM to GearsList.ARM_PART,
                GearCell.LEG to GearsList.RUNNERS_BOOT,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.ECHO_RADAR,
                ),
                R.string.angel_classical_set_desc
            ),
            Set(R.string.protective_set, mapOf(
                GearCell.HEAD to GearsList.ANGEL_EYE,
                GearCell.BODY to GearsList.ANGEL_HEART,
                GearCell.ARM to GearsList.ARM_PART,
                GearCell.LEG to GearsList.RUNNERS_BOOT,
                GearCell.DECOR to GearsList.ANGEL_RING,
                GearCell.DEVICE to GearsList.ANGEL_SPHERE),
                R.string.angel_protection_set_desc
            ),
            Set(R.string.recommended_set, mapOf(
                GearCell.HEAD to GearsList.ANGEL_EYE,
                GearCell.BODY to GearsList.HEART_PART,
                GearCell.ARM to GearsList.ARM_PART,
                GearCell.LEG to GearsList.RUNNERS_BOOT,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.ANGEL_SPHERE),
                R.string.angel_recommended_set_desc
            ),
        )
        val RAVEN_SETS = listOf(
            Set(R.string.classical_set, mapOf(
                    GearCell.HEAD to GearsList.EYE_PART,
                    GearCell.BODY to GearsList.HEART_PART,
                    GearCell.ARM to GearsList.ARM_PART,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.GAS_GRENADE,
                ),
                R.string.raven_classical_set_desc
            ),
            Set(R.string.fire_range_set, mapOf(
                    GearCell.HEAD to GearsList.RAVEN_MASK,
                    GearCell.BODY to GearsList.RAVEN_HEART,
                    GearCell.ARM to GearsList.RAVEN_GLOVES,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.RAVEN_RADAR,
                ),
                R.string.raven_fire_range_set_desc
            ),
            Set(R.string.clip_size_set, mapOf(
                GearCell.HEAD to GearsList.RAVEN_MASK,
                GearCell.BODY to GearsList.RAVEN_HEART,
                GearCell.ARM to GearsList.ARM_PART,
                GearCell.LEG to GearsList.RUNNERS_BOOT,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.RAVEN_RADAR,
                ),
                R.string.raven_more_bullets_set_desc
            ),
        )
        val BLOT_SETS = listOf(
            Set(R.string.classical_set, mapOf(
                GearCell.HEAD to GearsList.TACTICAL_OPTICS,
                GearCell.BODY to GearsList.INFANTRY_VEST,
                GearCell.ARM to GearsList.SPIKED_SHOULDER,
                GearCell.LEG to GearsList.RUNNERS_BOOT,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.GAS_GRENADE,
                ),
                R.string.blot_classical_set_desc
            ),
            Set(R.string.spread_set, mapOf(
                GearCell.HEAD to GearsList.TACTICAL_OPTICS,
                GearCell.BODY to GearsList.REFLEX_IMPLANT,
                GearCell.ARM to GearsList.ARM_DARK_IMPLANT,
                GearCell.LEG to GearsList.LEG_DARK_IMPLANT,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.EXPLODER,
            ),
                R.string.blot_min_spread_set_desc
            ),
            Set(R.string.universe_set, mapOf(
                    GearCell.HEAD to GearsList.BLOT_BRAINPAN,
                    GearCell.BODY to GearsList.REFLEX_IMPLANT,
                    GearCell.ARM to GearsList.BLOT_SHOULDER,
                    GearCell.LEG to GearsList.BLOT_LEGS,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.BLOT_DEVICE,
                ),
                R.string.blot_universal_set_desc
            ),
            Set(R.string.fire_range_set, mapOf(
                GearCell.HEAD to GearsList.COMBAT_HEADBAND,
                GearCell.BODY to GearsList.BLOT_HEART,
                GearCell.ARM to GearsList.ARM_DARK_IMPLANT,
                GearCell.LEG to GearsList.BLOT_LEGS,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.RAD_DARK_IMPLANT,
                ),
                R.string.blot_fire_range_set_desc
            ),
            Set(R.string.damage_set, mapOf(
                GearCell.HEAD to GearsList.EYE_DARK_IMPLANT,
                GearCell.BODY to GearsList.BLOT_HEART,
                GearCell.ARM to GearsList.BLOT_SHOULDER,
                GearCell.LEG to GearsList.LEG_DARK_IMPLANT,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.BLOT_DEVICE,
                ),
                R.string.blot_damage_set_desc
            ),
        )
        val FIREFLY_SETS = listOf(
            Set(R.string.fire_range_set, mapOf(
                    GearCell.HEAD to GearsList.COMBAT_HEADBAND,
                    GearCell.BODY to GearsList.INFANTRY_VEST,
                    GearCell.ARM to GearsList.ARM_DARK_IMPLANT,
                    GearCell.LEG to GearsList.LEG_DARK_IMPLANT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.EXPLODER,
                ),
                R.string.firefly_fire_range_set_desc
            ),
            Set(R.string.classical_set, mapOf(
                    GearCell.HEAD to GearsList.EYE_DARK_IMPLANT,
                    GearCell.BODY to GearsList.INFANTRY_VEST,
                    GearCell.ARM to GearsList.SPIKED_SHOULDER,
                    GearCell.LEG to GearsList.LEG_DARK_IMPLANT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.EXPLODER,
                ),
                R.string.firefly_classical_set_desc
            ),
            Set(R.string.healing_set, mapOf(
                    GearCell.HEAD to GearsList.EYE_DARK_IMPLANT,
                    GearCell.BODY to GearsList.INFANTRY_VEST, // альтернатива - сердце
                    GearCell.ARM to GearsList.ARM_DARK_IMPLANT,
                    GearCell.LEG to GearsList.FIREFLY_BOOTS,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.FIREFLY_GRENADE,
                ),
                R.string.firefly_survivability_set_desc
            ),
        )
        val SLAYER_SETS = listOf(
            Set(R.string.classical_set, mapOf(
                GearCell.HEAD to GearsList.TACTICAL_OPTICS,
                GearCell.BODY to GearsList.INFANTRY_VEST,
                GearCell.ARM to GearsList.ARM_DARK_IMPLANT,
                GearCell.LEG to GearsList.LEG_DARK_IMPLANT,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.EXPLODER,
                ),
                R.string.slayer_classical_set_desc
            ),
            Set(R.string.squad_set, mapOf(
                    GearCell.HEAD to GearsList.COMBAT_HEADBAND,
                    GearCell.BODY to GearsList.SLAYER_POUCH,
                    GearCell.ARM to GearsList.ARM_DARK_IMPLANT,
                    GearCell.LEG to GearsList.LEG_DARK_IMPLANT,
                    GearCell.DECOR to GearsList.SLAYER_TAGS,
                    GearCell.DEVICE to GearsList.EXPLODER,
                ),
                R.string.slayer_squad_set_desc
            ),
            Set(R.string.spread_set, mapOf(
                GearCell.HEAD to GearsList.TACTICAL_OPTICS,
                GearCell.BODY to GearsList.SLAYER_POUCH,
                GearCell.ARM to GearsList.SLAYER_BANDAGE,
                GearCell.LEG to GearsList.LEG_DARK_IMPLANT, // приоритет - перс. нога
                GearCell.DECOR to GearsList.SLAYER_TAGS,
                GearCell.DEVICE to GearsList.EXPLODER,
                ),
                R.string.slayer_min_spread_set_desc
            ),
        )
        val MIRAGE_SETS = listOf(
            Set(R.string.classical_set, mapOf(
                GearCell.HEAD to GearsList.EYE_DARK_IMPLANT,
                GearCell.BODY to GearsList.INFANTRY_VEST,
                GearCell.ARM to GearsList.SPIKED_SHOULDER,
                GearCell.LEG to GearsList.RUNNERS_BOOT,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.RAD_DARK_IMPLANT,
                ),
                R.string.mirage_classical_set_desc
            ),
            Set(R.string.recommended_set, mapOf(
                GearCell.HEAD to GearsList.MIRAGE_EYE,
                GearCell.BODY to GearsList.MIRAGE_BELT,
                GearCell.ARM to GearsList.ARM_DARK_IMPLANT,
                GearCell.LEG to GearsList.TECH_KNEE_PADS,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.RAD_DARK_IMPLANT,
                ),
                R.string.mirage_recommended_set_desc
            ),
        )
        val SMOG_SETS = listOf(
            Set(R.string.classical_set, mapOf(
                GearCell.HEAD to GearsList.PROTECTIVE_GLASSES,
                GearCell.BODY to GearsList.HEART_HEAVY_PORT,
                GearCell.ARM to GearsList.REGULAR_SHOULDER_PAD,
                GearCell.LEG to GearsList.RUNNERS_BOOT,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.ECHO_RADAR),
                R.string.smog_classical_set_desc
            ),
            Set(R.string.recommended_set, mapOf(
                GearCell.HEAD to GearsList.SMOG_MASK,
                GearCell.BODY to GearsList.SMOG_HEART,
                GearCell.ARM to GearsList.SMOG_GLOVES,
                GearCell.LEG to GearsList.SMOG_BOOTS,
                GearCell.DECOR to GearsList.SMOG_TAG,
                GearCell.DEVICE to GearsList.SMOG_ROCKET),
                R.string.smog_recommended_set_desc
            ),
        )
        val DRAGOON_SETS = listOf(
            Set(R.string.classical_set, mapOf(
                GearCell.HEAD to GearsList.PROTECTIVE_GLASSES,
                GearCell.BODY to GearsList.INFANTRY_VEST,
                GearCell.ARM to GearsList.REGULAR_SHOULDER_PAD,
                GearCell.LEG to GearsList.RUNNERS_BOOT,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.SCAN_FLASHLIGHT),
                R.string.dragoon_classical_set_desc
            ),
            Set(R.string.recommended_set, mapOf(
                GearCell.HEAD to GearsList.DRAGOON_HAT,
                GearCell.BODY to GearsList.HEART_HEAVY_PORT,
                GearCell.ARM to GearsList.DRAGOON_SHOULDER_PAD,
                GearCell.LEG to GearsList.DRAGOON_BOOTS,
                GearCell.DECOR to GearsList.DRAGOON_CHAIN,
                GearCell.DEVICE to GearsList.SCAN_FLASHLIGHT),
                R.string.dragoon_recommended_set_desc
            ),
        )
        val BASTION_SETS = listOf(
            Set(R.string.classical_set, mapOf(
                GearCell.HEAD to GearsList.EYE_HEAVY_PORT,
                GearCell.BODY to GearsList.HEART_HEAVY_PORT,
                GearCell.ARM to GearsList.SPIKED_SHOULDER,
                GearCell.LEG to GearsList.RUNNERS_BOOT,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.ECHO_RADAR),
                R.string.bastion_classical_set_desc
            ),
            Set(R.string.recommended_set, mapOf(
                GearCell.HEAD to GearsList.BASTION_EYE,
                GearCell.BODY to GearsList.BASTION_HEART,
                GearCell.ARM to GearsList.SPIKED_SHOULDER,
                GearCell.LEG to GearsList.RUNNERS_BOOT,
                GearCell.DECOR to GearsList.BASTION_RING,
                GearCell.DEVICE to GearsList.BASTION_SPHERE),
                R.string.bastion_recommended_set_desc
            ),
        )
        val BERTHA_SETS = listOf(
            Set(R.string.classical_set, mapOf(
                GearCell.HEAD to GearsList.EYE_HEAVY_PORT,
                GearCell.BODY to GearsList.HEART_HEAVY_PORT,
                GearCell.ARM to GearsList.SPIKED_SHOULDER,
                GearCell.LEG to GearsList.RUNNERS_BOOT,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.ECHO_RADAR),
                R.string.bertha_classical_set_desc
            ),
            Set(R.string.recommended_set, mapOf(
                GearCell.HEAD to GearsList.BERTHA_EYE,
                GearCell.BODY to GearsList.BERTHA_BANDOLIER,
                GearCell.ARM to GearsList.BERTHA_SLEEVE,
                GearCell.LEG to GearsList.BERTHA_BOOTS,
                GearCell.DECOR to GearsList.BERTHA_RING,
                GearCell.DEVICE to GearsList.BERTHA_FLASHLIGHT),
                R.string.bertha_recommended_set_desc
            ),
        )
        val LEVIATHAN_SETS = listOf(
            Set(R.string.classical_set, mapOf(
                GearCell.HEAD to GearsList.TACTICAL_OPTICS,
                GearCell.BODY to GearsList.HEART_HEAVY_PORT,
                GearCell.ARM to GearsList.ARM_HEAVY_PORT,
                GearCell.LEG to GearsList.RUNNERS_BOOT,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.GAS_GRENADE),
                R.string.leviathan_classical_set_desc
            ),
            Set(R.string.recommended_set, mapOf(
                GearCell.HEAD to GearsList.LEVIATHAN_HAT,
                GearCell.BODY to GearsList.HEART_HEAVY_PORT,
                GearCell.ARM to GearsList.ARM_HEAVY_PORT,
                GearCell.LEG to GearsList.LEVIATHAN_BOOTS,
                GearCell.DECOR to GearsList.LEVIATHAN_RING,
                GearCell.DEVICE to GearsList.LEVIATHAN_EXPLODER),
                R.string.leviathan_recommended_set_desc
            ),
        )
        val STALKER_SETS = listOf(
            Set(R.string.classical_set, mapOf(
                GearCell.HEAD to GearsList.BIO_NODE_EYE,
                GearCell.BODY to GearsList.BIO_NODE_HEART,
                GearCell.ARM to GearsList.SPIKED_SHOULDER,
                GearCell.LEG to GearsList.RUNNERS_BOOT,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.GAS_GRENADE),
                R.string.stalker_classical_set_desc
            ),
            Set(R.string.recommended_set, mapOf(
                GearCell.HEAD to GearsList.STALKER_HAT,
                GearCell.BODY to GearsList.STALKER_BELT,
                GearCell.ARM to GearsList.SPIKED_SHOULDER,
                GearCell.LEG to GearsList.RUNNERS_BOOT,
                GearCell.DECOR to GearsList.STALKER_CHAIN,
                GearCell.DEVICE to GearsList.STALKER_RAZOR),
                R.string.stalker_recommended_set_desc
            ),
        )
        val DOC_SETS = listOf(
            Set(R.string.classical_set, mapOf(
                GearCell.HEAD to GearsList.PROTECTIVE_GLASSES,
                GearCell.BODY to GearsList.INFANTRY_VEST,
                GearCell.ARM to GearsList.SPIKED_SHOULDER,
                GearCell.LEG to GearsList.RUNNERS_BOOT,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.ECHO_RADAR),
                R.string.doc_classical_set_desc
            ),
            Set(R.string.universe_set, mapOf(
                GearCell.HEAD to GearsList.PROTECTIVE_GLASSES,
                GearCell.BODY to GearsList.BIO_NODE_HEART,
                GearCell.ARM to GearsList.SPIKED_SHOULDER,
                GearCell.LEG to GearsList.RUNNERS_BOOT,
                GearCell.DECOR to GearsList.DOC_NECKLACE,
                GearCell.DEVICE to GearsList.DOC_ROCKET),
                R.string.doc_universal_set_desc
            ),
            Set(R.string.recommended_set, mapOf(
                GearCell.HEAD to GearsList.DOC_MASK,
                GearCell.BODY to GearsList.DOC_BELT,
                GearCell.ARM to GearsList.DOC_GLOVES,
                GearCell.LEG to GearsList.DOC_BOOTS,
                GearCell.DECOR to GearsList.DOC_NECKLACE,
                GearCell.DEVICE to GearsList.DOC_ROCKET),
                R.string.doc_recommended_set_desc
            ),
        )
        val LEVI_SETS = listOf(
            Set(R.string.classical_set, mapOf(
                GearCell.HEAD to GearsList.COMBAT_HEADBAND,
                GearCell.BODY to GearsList.BIO_NODE_HEART,
                GearCell.ARM to GearsList.SPIKED_SHOULDER,
                GearCell.LEG to GearsList.BIO_NODE_LEG,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.ECHO_RADAR),
                R.string.levi_classical_set_desc
            ),
            Set(R.string.recommended_set, mapOf(
                GearCell.HEAD to GearsList.LEVI_PATCH,
                GearCell.BODY to GearsList.LEVI_BELT,
                GearCell.ARM to GearsList.LEVI_WHIP,
                GearCell.LEG to GearsList.LEVI_BOOTS,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.ECHO_RADAR),
                R.string.levi_recommended_set_desc
            ),
        )
        val SATOSHI_SETS = listOf(
            Set(R.string.classical_set, mapOf(
                GearCell.HEAD to GearsList.PROTECTIVE_GLASSES,
                GearCell.BODY to GearsList.INFANTRY_VEST,
                GearCell.ARM to GearsList.SPIKED_SHOULDER,
                GearCell.LEG to GearsList.RUNNERS_BOOT,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.ECHO_RADAR),
                R.string.satoshi_classical_set_desc
            ),
            Set(R.string.recommended_set, mapOf(
                GearCell.HEAD to GearsList.PROTECTIVE_GLASSES,
                GearCell.BODY to GearsList.SATOSHI_SHOULDER_PAD,
                GearCell.ARM to GearsList.SATOSHI_HANDS,
                GearCell.LEG to GearsList.SATOSHI_LEGS,
                GearCell.DECOR to GearsList.SATOSHI_RING,
                GearCell.DEVICE to GearsList.ECHO_RADAR),
                R.string.satoshi_recommended_set_desc
            ),
            Set(R.string.squad_set, mapOf(
                GearCell.HEAD to GearsList.SATOSHI_EYE,
                GearCell.BODY to GearsList.SATOSHI_SHOULDER_PAD,
                GearCell.ARM to GearsList.SATOSHI_HANDS,
                GearCell.LEG to GearsList.SATOSHI_LEGS,
                GearCell.DECOR to GearsList.SATOSHI_RING,
                GearCell.DEVICE to GearsList.SATOSHI_ORB),
                R.string.satoshi_squad_set_desc
            ),
        )
    }

}