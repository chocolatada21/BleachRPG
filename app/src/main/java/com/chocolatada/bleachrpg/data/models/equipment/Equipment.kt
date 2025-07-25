package com.chocolatada.bleachrpg.data.models.equipment

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.chocolatada.bleachrpg.data.models.Spirit

@Entity
class Equipment(
    @PrimaryKey val equipmentId: Int,
    val isBossDrop: Boolean,
    val rarity: String,
    name: String,
    health: Int,
    reiatsu: Int,
    physical: Int,
    defense: Int,
    criticalProbability: Int,
    criticalDamage: Int,
    dodgeProbability: Int,
) : Spirit(
    name = name,
    health = health,
    currentHealth = health,
    reiatsu = reiatsu,
    physical = physical,
    defense = defense,
    criticalProbability = criticalProbability,
    criticalDamage = criticalDamage,
    dodgeProbability = dodgeProbability
) {
    override fun toString(): String {
        return "Equipment(equipmentId=$equipmentId, isBossDrop=$isBossDrop, rarity='$rarity', name='$name', health=$health, currentHealth=$currentHealth, reiatsu=$reiatsu, physical=$physical, defense=$defense, criticalProbability=$criticalProbability, criticalDamage=$criticalDamage, dodgeProbability=$dodgeProbability)"
    }
}