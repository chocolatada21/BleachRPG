package com.chocolatada.bleachrpg.data.models.character

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.chocolatada.bleachrpg.data.models.Spirit

@Entity
class Character(
    @PrimaryKey val characterId: Int,
    var gold: Int,
    var kido: Int,
    val characterClassId: Int,
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
        return "Character(characterId=$characterId, gold=$gold, kido=$kido, characterClassId=$characterClassId, name='$name', health=$health, currentHealth=$currentHealth, reiatsu=$reiatsu, physical=$physical, defense=$defense, criticalProbability=$criticalProbability, criticalDamage=$criticalDamage, dodgeProbability=$dodgeProbability)"
    }
}