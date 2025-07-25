package com.chocolatada.bleachrpg.data.models.boss

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

class BossWithBKidoSkill(
    @Embedded val boss: Boss,
    @Relation(
        parentColumn = "bossId",
        entityColumn = "bKidoSkillId",
        associateBy = Junction(BossBKidoSkillCrossRef::class)
    )
    val bKidoSkills: List<BKidoSkill>
) {
    override fun toString(): String {
        return "BossWithBKidoSkill(boss=$boss, bKidoSkills=$bKidoSkills)"
    }
}