package com.chocolatada.bleachrpg.data.models.hollow

import androidx.room.Entity

@Entity(primaryKeys = ["hollowId", "hPhysicalSkillId"])
data class HollowHPhysicalSkillCrossRef(
    val hollowId: Int,
    val hPhysicalSkillId: Int
)