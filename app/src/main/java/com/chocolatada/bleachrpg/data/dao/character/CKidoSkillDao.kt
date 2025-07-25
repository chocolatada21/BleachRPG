package com.chocolatada.bleachrpg.data.dao.character

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.chocolatada.bleachrpg.data.models.character.CKidoSkill

@Dao
interface CKidoSkillDao {
    @Insert
    fun insert(kidoSkill: CKidoSkill)
    @Query("SELECT * FROM CKidoSkill")
    fun getAll(): List<CKidoSkill>
}