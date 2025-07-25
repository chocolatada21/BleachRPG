package com.chocolatada.bleachrpg.data.dao.boss

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.chocolatada.bleachrpg.data.models.boss.BKidoSkill

@Dao
interface BKidoSkillDao {
    @Insert
    fun insert(bKidoSkill: BKidoSkill)
    @Query("SELECT * FROM BKidoSkill")
    fun getAll(): List<BKidoSkill>
}