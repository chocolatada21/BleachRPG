package com.chocolatada.bleachrpg.data.models.boss

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class BPhysicalSkill(
    @PrimaryKey val bPhysicalSkillId: Int,
    val name: String,
    val multiplier: Float,
    val reiatsuCost: Int,
) {
    override fun toString(): String {
        return "BPhysicalSkill(bPhysicalSkillId=$bPhysicalSkillId, name='$name', multiplier=$multiplier, reiatsuCost=$reiatsuCost)"
    }
}