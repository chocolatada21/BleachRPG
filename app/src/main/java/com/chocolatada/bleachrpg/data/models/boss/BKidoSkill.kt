package com.chocolatada.bleachrpg.data.models.boss

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class BKidoSkill(
    @PrimaryKey val bKidoSkillId: Int,
    val name: String,
    val multiplier: Float,
    val reiatsuCost: Int
) {
    override fun toString(): String {
        return "BKidoSkill(bKidoSkillId=$bKidoSkillId, name='$name', multiplier=$multiplier, reiatsuCost=$reiatsuCost)"
    }
}