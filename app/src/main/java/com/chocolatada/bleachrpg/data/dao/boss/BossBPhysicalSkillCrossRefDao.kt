package com.chocolatada.bleachrpg.data.dao.boss

import androidx.room.Dao
import androidx.room.Insert
import com.chocolatada.bleachrpg.data.models.boss.BossBPhysicalSkillCrossRef

@Dao
interface BossBPhysicalSkillCrossRefDao {
    @Insert
    fun insert(bossBPhysicalSkillCrossRef: BossBPhysicalSkillCrossRef)
}