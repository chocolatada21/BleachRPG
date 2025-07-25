package com.chocolatada.bleachrpg.data.dao.hollow

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.chocolatada.bleachrpg.data.models.hollow.HPhysicalSkill

@Dao
interface HPhysicalSkillDao {
    @Insert
    fun insert(hPhysicalSkill: HPhysicalSkill)
    @Query("SELECT * FROM HPhysicalSkill")
    fun getAll(): List<HPhysicalSkill>
}