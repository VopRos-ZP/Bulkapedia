package com.bulkapedia.sets

import com.bulkapedia.gears.GearsList

class SetList {

    companion object {
        val ARNIE_SETS = listOf(
            Set(PlayMode.BATTLE_ROYAL, mapOf(
                GearCell.HEAD to GearsList.TACTICAL_OPTICS,
                GearCell.BODY to GearsList.WHITE_INDEX_HEART,
                GearCell.ARM to GearsList.REGULAR_SHOULDER_PAD,
                GearCell.LEG to GearsList.WHITE_INDEX_LEG,
                GearCell.DECOR to GearsList.WHITE_INDEX_COLLAR,
                GearCell.DEVICE to GearsList.ECHO_RADAR)
            ),
            Set(PlayMode.BATTLE_ROYAL, mapOf(
                GearCell.HEAD to GearsList.TACTICAL_OPTICS,
                GearCell.BODY to GearsList.WHITE_INDEX_HEART,
                GearCell.ARM to GearsList.ARNIE_BANDAGE,
                GearCell.LEG to GearsList.WHITE_INDEX_LEG,
                GearCell.DECOR to GearsList.ARNIE_PONCHO,
                GearCell.DEVICE to GearsList.SCAN_FLASHLIGHT)
            ),
            Set(PlayMode.ALL, mapOf(
                GearCell.HEAD to GearsList.TACTICAL_OPTICS,
                GearCell.BODY to GearsList.WHITE_INDEX_HEART,
                GearCell.ARM to GearsList.REGULAR_SHOULDER_PAD,
                GearCell.LEG to GearsList.ARNIE_BOOTS,
                GearCell.DECOR to GearsList.WHITE_INDEX_COLLAR,
                GearCell.DEVICE to GearsList.ARNIE_ROTOR)
            ),
        )
        val CYCLOPS_SETS = listOf(
            Set(PlayMode.BATTLE_ROYAL, mapOf(
                GearCell.HEAD to GearsList.PROTECTIVE_GLASSES,
                GearCell.BODY to GearsList.INFANTRY_VEST,
                GearCell.ARM to GearsList.SPIKED_SHOULDER,
                GearCell.LEG to GearsList.PRECISION_IMPLANT,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.EXPLODER)
            ),
            Set(PlayMode.BATTLE_ROYAL, mapOf(
                GearCell.HEAD to GearsList.WHITE_INDEX_EYE,
                GearCell.BODY to GearsList.INFANTRY_VEST,
                GearCell.ARM to GearsList.SPIKED_SHOULDER,
                GearCell.LEG to GearsList.PRECISION_IMPLANT,
                GearCell.DECOR to GearsList.WHITE_INDEX_COLLAR,
                GearCell.DEVICE to GearsList.ECHO_RADAR)
            ),
            Set(PlayMode.ALL, mapOf(
                GearCell.HEAD to GearsList.COMBAT_HEADBAND,
                GearCell.BODY to GearsList.CYCLOPS_HEART,
                GearCell.ARM to GearsList.CYCLOPS_GLOVES,
                GearCell.LEG to GearsList.CYCLOPS_BOOTS,
                GearCell.DECOR to GearsList.CYCLOPS_COIN,
                GearCell.DEVICE to GearsList.ECHO_RADAR)
            )
        )
        val SPARKLE_SETS = listOf(
            Set(PlayMode.BATTLE_ROYAL, mapOf(
                GearCell.HEAD to GearsList.WHITE_INDEX_EYE,
                GearCell.BODY to GearsList.INFANTRY_VEST,
                GearCell.ARM to GearsList.TACTICAL_GLOVES,
                GearCell.LEG to GearsList.WHITE_INDEX_LEG,
                GearCell.DECOR to GearsList.WHITE_INDEX_COLLAR,
                GearCell.DEVICE to GearsList.ECHO_RADAR)
            ),
            Set(PlayMode.ALL, mapOf(
                GearCell.HEAD to GearsList.WHITE_INDEX_EYE,
                GearCell.BODY to GearsList.WHITE_INDEX_HEART,
                GearCell.ARM to GearsList.WHITE_INDEX_ARM,
                GearCell.LEG to GearsList.WHITE_INDEX_LEG,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.GAS_GRENADE)
            ),
            Set(PlayMode.ALL, mapOf(
                GearCell.HEAD to GearsList.SPARKLE_EYE,
                GearCell.BODY to GearsList.SPARKLE_BELT,
                GearCell.ARM to GearsList.SPARKLE_GLOVES,
                GearCell.LEG to GearsList.SPARKLE_BOOTS,
                GearCell.DECOR to GearsList.SPARKLE_CHOKER,
                GearCell.DEVICE to GearsList.SPARKLE_GRENADE)
            )
        )
        val HURRICANE_SETS = listOf(
            Set(PlayMode.ALL, mapOf(
                GearCell.HEAD to GearsList.TACTICAL_OPTICS,
                GearCell.BODY to GearsList.INFANTRY_VEST,
                GearCell.ARM to GearsList.SPIKED_SHOULDER,
                GearCell.LEG to GearsList.WHITE_INDEX_LEG,
                GearCell.DECOR to GearsList.WHITE_INDEX_COLLAR,
                GearCell.DEVICE to GearsList.GAS_GRENADE)
            ),
            Set(PlayMode.ALL, mapOf(
                GearCell.HEAD to GearsList.TACTICAL_OPTICS,
                GearCell.BODY to GearsList.HURRICANE_BELT,
                GearCell.ARM to GearsList.HURRICANE_HANDS,
                GearCell.LEG to GearsList.WHITE_INDEX_LEG,
                GearCell.DECOR to GearsList.WHITE_INDEX_COLLAR,
                GearCell.DEVICE to GearsList.HURRICANE_CRYSTAL)
            )
        )
        val GHOST_SETS = listOf(
            Set(PlayMode.ALL, mapOf(
                GearCell.HEAD to GearsList.EYE_PART,
                GearCell.BODY to GearsList.HEART_PART,
                GearCell.ARM to GearsList.ARM_PART,
                GearCell.LEG to GearsList.RUNNERS_BOOT,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.GAS_GRENADE)
            ),
            Set(PlayMode.ALL, mapOf(
                GearCell.HEAD to GearsList.EYE_PART,
                GearCell.BODY to GearsList.HEART_PART,
                GearCell.ARM to GearsList.ARM_PART,
                GearCell.LEG to GearsList.RUNNERS_BOOT,
                GearCell.DECOR to GearsList.GHOST_NECKLACE,
                GearCell.DEVICE to GearsList.GHOST_DYNAMO)
            ),
        )
        val FREDDIE_SETS = listOf(
            Set(PlayMode.BATTLE_ROYAL, mapOf(
                GearCell.HEAD to GearsList.EYE_PART,
                GearCell.BODY to GearsList.HEART_PART,
                GearCell.ARM to GearsList.SPIKED_SHOULDER,
                GearCell.LEG to GearsList.RUNNERS_BOOT,
                GearCell.DECOR to GearsList.THUG_KNUCKLE,
                GearCell.DEVICE to GearsList.ECHO_RADAR)
            ),
            Set(PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.EYE_PART,
                    GearCell.BODY to GearsList.HEART_PART,
                    GearCell.ARM to GearsList.ARM_PART,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.FREDDIE_GRENADE,
                )
            ),
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.EYE_PART,
                    GearCell.BODY to GearsList.HEART_PART,
                    GearCell.ARM to GearsList.FREDDIE_KNUCKLES,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.FREDDIE_GRENADE,
                )
            ),
        )
        val ANGEL_SETS = listOf(
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.EYE_PART,
                    GearCell.BODY to GearsList.HEART_PART,
                    GearCell.ARM to GearsList.ARM_PART,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.GAS_GRENADE,
                )
            ),
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.ANGEL_EYE,
                    GearCell.BODY to GearsList.HEART_PART,
                    GearCell.ARM to GearsList.ARM_PART,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.ANGEL_SPHERE,
                )
            ),
        )
        val RAVEN_SETS = listOf(
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.EYE_PART,
                    GearCell.BODY to GearsList.HEART_PART,
                    GearCell.ARM to GearsList.ARM_PART,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.GAS_GRENADE,
                )
            ),
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.EYE_PART,
                    GearCell.BODY to GearsList.HEART_PART,
                    GearCell.ARM to GearsList.RAVEN_GLOVES,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.RAVEN_RADAR,
                )
            ),
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.EYE_PART,
                    GearCell.BODY to GearsList.HEART_PART,
                    GearCell.ARM to GearsList.ARM_PART,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.RAVEN_NECKLACE,
                    GearCell.DEVICE to GearsList.RAVEN_RADAR,
                )
            ),
        )
        val BLOT_SETS = listOf(
            Set(
                PlayMode.BATTLE_ROYAL, mapOf(
                    GearCell.HEAD to GearsList.TACTICAL_OPTICS,
                    GearCell.BODY to GearsList.INFANTRY_VEST,
                    GearCell.ARM to GearsList.SPIKED_SHOULDER,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.GAS_GRENADE,
                )
            ),
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.TACTICAL_OPTICS,
                    GearCell.BODY to GearsList.REFLEX_IMPLANT,
                    GearCell.ARM to GearsList.ARM_DARK_IMPLANT,
                    GearCell.LEG to GearsList.LEG_DARK_IMPLANT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.GAS_GRENADE,
                )
            ),
            Set(
                PlayMode.BATTLE_ROYAL, mapOf(
                    GearCell.HEAD to GearsList.TACTICAL_OPTICS,
                    GearCell.BODY to GearsList.HEART_DARK_IMPLANT,
                    GearCell.ARM to GearsList.ARM_DARK_IMPLANT,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.ECHO_RADAR,
                )
            ),
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.COMBAT_HEADBAND,
                    GearCell.BODY to GearsList.BLOT_HEART,
                    GearCell.ARM to GearsList.ARM_DARK_IMPLANT,
                    GearCell.LEG to GearsList.BLOT_LEGS,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.RAD_DARK_IMPLANT,
                )
            ),
            Set(
                PlayMode.BATTLE_ROYAL, mapOf(
                    GearCell.HEAD to GearsList.TACTICAL_OPTICS,
                    GearCell.BODY to GearsList.BLOT_HEART,
                    GearCell.ARM to GearsList.BLOT_SHOULDER,
                    GearCell.LEG to GearsList.BLOT_LEGS,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.BLOT_DEVICE,
                )
            ),
            Set(
                PlayMode.SQUAD, mapOf(
                    GearCell.HEAD to GearsList.COMBAT_HEADBAND,
                    GearCell.BODY to GearsList.BLOT_HEART,
                    GearCell.ARM to GearsList.BLOT_SHOULDER,
                    GearCell.LEG to GearsList.BLOT_LEGS,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.BLOT_DEVICE,
                )
            ),
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.BLOT_BRAINPAN,
                    GearCell.BODY to GearsList.BLOT_HEART,
                    GearCell.ARM to GearsList.BLOT_SHOULDER,
                    GearCell.LEG to GearsList.BLOT_LEGS,
                    GearCell.DECOR to GearsList.BLOT_RING,
                    GearCell.DEVICE to GearsList.BLOT_DEVICE,
                )
            ),
        )
        val FIREFLY_SETS = listOf(
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.COMBAT_HEADBAND,
                    GearCell.BODY to GearsList.INFANTRY_VEST,
                    GearCell.ARM to GearsList.ARM_DARK_IMPLANT,
                    GearCell.LEG to GearsList.LEG_DARK_IMPLANT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.EXPLODER,
                )
            ),
            Set(
                PlayMode.BATTLE_ROYAL, mapOf(
                    GearCell.HEAD to GearsList.EYE_DARK_IMPLANT,
                    GearCell.BODY to GearsList.INFANTRY_VEST,
                    GearCell.ARM to GearsList.SPIKED_SHOULDER,
                    GearCell.LEG to GearsList.LEG_DARK_IMPLANT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.EXPLODER,
                )
            ),
            Set(
                PlayMode.BATTLE_ROYAL, mapOf(
                    GearCell.HEAD to GearsList.EYE_DARK_IMPLANT,
                    GearCell.BODY to GearsList.INFANTRY_VEST,
                    GearCell.ARM to GearsList.ARM_DARK_IMPLANT,
                    GearCell.LEG to GearsList.FIREFLY_BOOTS,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.FIREFLY_GRENADE,
                )
            ),
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.FIREFLY_GLASSES,
                    GearCell.BODY to GearsList.FIREFLY_HEART,
                    GearCell.ARM to GearsList.ARM_DARK_IMPLANT,
                    GearCell.LEG to GearsList.FIREFLY_BOOTS,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.FIREFLY_GRENADE,
                )
            ),
        )
        val SLAYER_SETS = listOf(
            Set(
                PlayMode.BATTLE_ROYAL, mapOf(
                    GearCell.HEAD to GearsList.TACTICAL_OPTICS,
                    GearCell.BODY to GearsList.INFANTRY_VEST,
                    GearCell.ARM to GearsList.ARM_DARK_IMPLANT,
                    GearCell.LEG to GearsList.LEG_DARK_IMPLANT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.EXPLODER,
                )
            ),
            Set(
                PlayMode.SQUAD, mapOf(
                    GearCell.HEAD to GearsList.COMBAT_HEADBAND,
                    GearCell.BODY to GearsList.SLAYER_POUCH,
                    GearCell.ARM to GearsList.ARM_DARK_IMPLANT,
                    GearCell.LEG to GearsList.LEG_DARK_IMPLANT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.EXPLODER,
                )
            ),
            Set(
                PlayMode.BATTLE_ROYAL, mapOf(
                    GearCell.HEAD to GearsList.TACTICAL_OPTICS,
                    GearCell.BODY to GearsList.SLAYER_POUCH,
                    GearCell.ARM to GearsList.SLAYER_BANDAGE,
                    GearCell.LEG to GearsList.LEG_DARK_IMPLANT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.EXPLODER,
                )
            ),
        )
        val MIRAGE_SETS = listOf(
            Set(
                PlayMode.BATTLE_ROYAL, mapOf(
                    GearCell.HEAD to GearsList.EYE_DARK_IMPLANT,
                    GearCell.BODY to GearsList.INFANTRY_VEST,
                    GearCell.ARM to GearsList.SPIKED_SHOULDER,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.RAD_DARK_IMPLANT,
                )
            ),
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.MIRAGE_EYE,
                    GearCell.BODY to GearsList.MIRAGE_BELT,
                    GearCell.ARM to GearsList.ARM_DARK_IMPLANT,
                    GearCell.LEG to GearsList.TECH_KNEE_PADS,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.RAD_DARK_IMPLANT,
                )
            ),
        )
        val SMOG_SETS = listOf(
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.TACTICAL_OPTICS,
                    GearCell.BODY to GearsList.HEART_HEAVY_PORT,
                    GearCell.ARM to GearsList.ARM_HEAVY_PORT,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.ECHO_RADAR,
                )
            ),
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.EYE_HEAVY_PORT,
                    GearCell.BODY to GearsList.SMOG_HEART,
                    GearCell.ARM to GearsList.ARM_HEAVY_PORT,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.SMOG_ROCKET,
                )
            ),
        )
        val DRAGOON_SETS = listOf(
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.PROTECTIVE_GLASSES,
                    GearCell.BODY to GearsList.INFANTRY_VEST,
                    GearCell.ARM to GearsList.REGULAR_SHOULDER_PAD,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.SCAN_FLASHLIGHT,
                )
            ),
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.DRAGOON_HAT,
                    GearCell.BODY to GearsList.HEART_HEAVY_PORT,
                    GearCell.ARM to GearsList.DRAGOON_CHAIN,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.SCAN_FLASHLIGHT,
                )
            ),
        )
        val BASTION_SETS = listOf(
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.EYE_HEAVY_PORT,
                    GearCell.BODY to GearsList.HEART_HEAVY_PORT,
                    GearCell.ARM to GearsList.SPIKED_SHOULDER,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.ECHO_RADAR,
                )
            ),
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.EYE_HEAVY_PORT,
                    GearCell.BODY to GearsList.HEART_HEAVY_PORT,
                    GearCell.ARM to GearsList.SPIKED_SHOULDER,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.BASTION_SPHERE,
                )
            ),
            Set(
                PlayMode.SQUAD, mapOf(
                    GearCell.HEAD to GearsList.BASTION_EYE,
                    GearCell.BODY to GearsList.INFANTRY_VEST,
                    GearCell.ARM to GearsList.BASTION_GLOVES,
                    GearCell.LEG to GearsList.BASTION_BOOTS,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.BASTION_SPHERE,
                )
            ),
        )
        val BERTHA_SETS = listOf(
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.EYE_HEAVY_PORT,
                    GearCell.BODY to GearsList.HEART_HEAVY_PORT,
                    GearCell.ARM to GearsList.SPIKED_SHOULDER,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.GAS_GRENADE,
                )
            ),
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.EYE_HEAVY_PORT,
                    GearCell.BODY to GearsList.HEART_HEAVY_PORT,
                    GearCell.ARM to GearsList.SPIKED_SHOULDER,
                    GearCell.LEG to GearsList.TECH_KNEE_PADS,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.ECHO_RADAR,
                )
            ),
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.EYE_HEAVY_PORT,
                    GearCell.BODY to GearsList.HEART_HEAVY_PORT,
                    GearCell.ARM to GearsList.BERTHA_SLEEVE,
                    GearCell.LEG to GearsList.TECH_KNEE_PADS,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.BERTHA_FLASHLIGHT,
                )
            ),
        )
        val LEVIATHAN_SETS = listOf(
            Set(
                PlayMode.BATTLE_ROYAL, mapOf(
                    GearCell.HEAD to GearsList.TACTICAL_OPTICS,
                    GearCell.BODY to GearsList.HEART_HEAVY_PORT,
                    GearCell.ARM to GearsList.ARM_HEAVY_PORT,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.GAS_GRENADE,
                )
            ),
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.EYE_HEAVY_PORT,
                    GearCell.BODY to GearsList.HEART_HEAVY_PORT,
                    GearCell.ARM to GearsList.LEVIATHAN_SHOULDER_PAD,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.LEVIATHAN_RING,
                    GearCell.DEVICE to GearsList.GAS_GRENADE,
                )
            ),
        )
        val STALKER_SETS = listOf(
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.BIO_NODE_EYE,
                    GearCell.BODY to GearsList.BIO_NODE_HEART,
                    GearCell.ARM to GearsList.SPIKED_SHOULDER,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.GAS_GRENADE,
                )
            ),
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.STALKER_HAT,
                    GearCell.BODY to GearsList.BIO_NODE_HEART,
                    GearCell.ARM to GearsList.SPIKED_SHOULDER,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.STALKER_RAZOR,
                )
            ),
        )
        val DOC_SETS = listOf(
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.PROTECTIVE_GLASSES,
                    GearCell.BODY to GearsList.INFANTRY_VEST,
                    GearCell.ARM to GearsList.SPIKED_SHOULDER,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.ECHO_RADAR,
                )
            ),
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.PROTECTIVE_GLASSES,
                    GearCell.BODY to GearsList.BIO_NODE_HEART,
                    GearCell.ARM to GearsList.SPIKED_SHOULDER,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.DOC_NECKLACE,
                    GearCell.DEVICE to GearsList.DOC_ROCKET,
                )
            ),
            Set(
                PlayMode.SQUAD, mapOf(
                    GearCell.HEAD to GearsList.DOC_MASK,
                    GearCell.BODY to GearsList.DOC_BELT,
                    GearCell.ARM to GearsList.DOC_GLOVES,
                    GearCell.LEG to GearsList.DOC_BOOTS,
                    GearCell.DECOR to GearsList.DOC_NECKLACE,
                    GearCell.DEVICE to GearsList.DOC_ROCKET,
                )
            ),
        )
        val LEVI_SETS = listOf(
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.COMBAT_HEADBAND,
                    GearCell.BODY to GearsList.BIO_NODE_HEART,
                    GearCell.ARM to GearsList.SPIKED_SHOULDER,
                    GearCell.LEG to GearsList.BIO_NODE_LEG,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.ECHO_RADAR,
                )
            )
        )
        val SATOSHI_SETS = listOf(
            Set(
                PlayMode.BATTLE_ROYAL, mapOf(
                    GearCell.HEAD to GearsList.PROTECTIVE_GLASSES,
                    GearCell.BODY to GearsList.INFANTRY_VEST,
                    GearCell.ARM to GearsList.SPIKED_SHOULDER,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.ECHO_RADAR,
                )
            ),
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.PROTECTIVE_GLASSES,
                    GearCell.BODY to GearsList.INFANTRY_VEST,
                    GearCell.ARM to GearsList.SATOSHI_HANDS,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.SATOSHI_RING,
                    GearCell.DEVICE to GearsList.ECHO_RADAR,
                )
            ),
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.PROTECTIVE_GLASSES,
                    GearCell.BODY to GearsList.BIO_NODE_HEART,
                    GearCell.ARM to GearsList.SATOSHI_HANDS,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.THUG_KNUCKLE,
                    GearCell.DEVICE to GearsList.SATOSHI_ORB,
                )
            ),
            Set(
                PlayMode.ALL, mapOf(
                    GearCell.HEAD to GearsList.PROTECTIVE_GLASSES,
                    GearCell.BODY to GearsList.BIO_NODE_HEART,
                    GearCell.ARM to GearsList.SATOSHI_HANDS,
                    GearCell.LEG to GearsList.RUNNERS_BOOT,
                    GearCell.DECOR to GearsList.SATOSHI_RING,
                    GearCell.DEVICE to GearsList.BIO_NODE_RAD,
                )
            ),
        )
    }

}