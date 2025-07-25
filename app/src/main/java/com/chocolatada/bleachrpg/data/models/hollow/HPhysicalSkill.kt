package com.chocolatada.bleachrpg.data.models.hollow

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class HPhysicalSkill(
    @PrimaryKey val hPhysicalSkillId: Int,
    val name: String,
    val multiplier: Float,
    var reiatsuCost: Int
) {
    override fun toString(): String {
        return "HPhysicalSkill(hPhysicalSkillId=$hPhysicalSkillId, name='$name', multiplier=$multiplier, reiatsuCost=$reiatsuCost)"
    }
}