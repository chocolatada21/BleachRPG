package com.chocolatada.bleachrpg.data.models.hollow

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.chocolatada.bleachrpg.data.models.Spirit

@Entity
class Hollow(
    @PrimaryKey val hollowId: Int,
    val reiatsuReward: Int,
    val goldReward: Int,
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
        return "Hollow(hollowId=$hollowId, reiatsuReward=$reiatsuReward, goldReward=$goldReward, name='$name', health=$health, currentHealth=$currentHealth, reiatsu=$reiatsu, physical=$physical, defense=$defense, criticalProbability=$criticalProbability, criticalDamage=$criticalDamage, dodgeProbability=$dodgeProbability)"
    }
}