package com.chocolatada.bleachrpg.data.dao.boss

import androidx.room.Dao
import androidx.room.Insert
import com.chocolatada.bleachrpg.data.models.boss.BossBKidoSkillCrossRef

@Dao
interface BossBKidoSkillCrossRefDao {
    @Insert
    fun insert(bossBKidoSkillCrossRef: BossBKidoSkillCrossRef)
}