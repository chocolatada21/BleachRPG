package com.chocolatada.bleachrpg.data.models.hollow

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

class HollowWithHPhysicalSkill(
    @Embedded val hollow: Hollow,
    @Relation(
        parentColumn = "hollowId",
        entityColumn = "hPhysicalSkillId",
        associateBy = Junction(HollowHPhysicalSkillCrossRef::class)
    )
    val hPhysicalSkills: List<HPhysicalSkill>
) {
    override fun toString(): String {
        return "HollowWithHPhysicalSkill(hollow=$hollow, hPhysicalSkills=$hPhysicalSkills)"
    }
}