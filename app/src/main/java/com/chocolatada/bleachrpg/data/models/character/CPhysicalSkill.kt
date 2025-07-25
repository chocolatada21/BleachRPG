package com.chocolatada.bleachrpg.data.models.character

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class CPhysicalSkill(
    @PrimaryKey val physicalSkillId: Int,
    var name: String,
    var multiplier: Float,
    var reiatsuCost: Int,
    var goldNeeded: Int,
    var reiatsuNeeded: Int
) {
    override fun toString(): String {
        return "CPhysicalSkill(physicalSkillId=$physicalSkillId, name='$name', multiplier=$multiplier, reiatsuCost=$reiatsuCost, goldNeeded=$goldNeeded, reiatsuNeeded=$reiatsuNeeded)"
    }
}