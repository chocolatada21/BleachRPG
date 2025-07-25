package com.chocolatada.bleachrpg.data.models.boss

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.chocolatada.bleachrpg.data.models.Spirit

@Entity
class Boss(
    @PrimaryKey val bossId: Int,
    val reiatsuReward: Int,
    val goldReward: Int,
    val kido: Int,
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
        return "Boss(bossId=$bossId, reiatsuReward=$reiatsuReward, goldReward=$goldReward, kido=$kido, name='$name', health=$health, currentHealth=$currentHealth, reiatsu=$reiatsu, physical=$physical, defense=$defense, criticalProbability=$criticalProbability, criticalDamage=$criticalDamage, dodgeProbability=$dodgeProbability)"
    }
}