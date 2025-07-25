package com.chocolatada.bleachrpg.data.dao.boss

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.chocolatada.bleachrpg.data.models.boss.BPhysicalSkill

@Dao
interface BPhysicalSkillDao {
    @Insert
    fun insert(bPhysicalSkill: BPhysicalSkill)
    @Query("SELECT * FROM BPhysicalSkill")
    fun getAll(): List<BPhysicalSkill>
}