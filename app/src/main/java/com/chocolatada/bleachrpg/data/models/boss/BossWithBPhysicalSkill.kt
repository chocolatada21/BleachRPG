package com.chocolatada.bleachrpg.data.models.boss

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

class BossWithBPhysicalSkill(
    @Embedded val boss: Boss,
    @Relation(
        parentColumn = "bossId",
        entityColumn = "bPhysicalSkillId",
        associateBy = Junction(BossBPhysicalSkillCrossRef::class)
    )
    val bPhysicalSkills: List<BPhysicalSkill>
) {
    override fun toString(): String {
        return "BossWithBPhysicalSkill(boss=$boss, bPhysicalSkills=$bPhysicalSkills)"
    }
}