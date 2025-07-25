package com.chocolatada.bleachrpg.data.dao.character

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.chocolatada.bleachrpg.data.models.character.CPhysicalSkill

@Dao
interface CPhysicalSkillDao {
    @Insert
    fun insert(physicalSkill: CPhysicalSkill)
    @Query("SELECT * FROM CPhysicalSkill")
    fun getAll(): List<CPhysicalSkill>
}