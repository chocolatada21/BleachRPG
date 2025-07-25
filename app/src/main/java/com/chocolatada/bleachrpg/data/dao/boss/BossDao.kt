package com.chocolatada.bleachrpg.data.dao.boss

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.chocolatada.bleachrpg.data.models.boss.Boss
import com.chocolatada.bleachrpg.data.models.boss.BossWithBKidoSkill
import com.chocolatada.bleachrpg.data.models.boss.BossWithBPhysicalSkill

@Dao
interface BossDao {
    @Insert
    fun insert(boss: Boss)
    @Query("SELECT * FROM Boss")
    fun getAll(): List<Boss>
    @Transaction
    @Query("SELECT * FROM Boss")
    fun getAllWithBPhysicalSkill(): List<BossWithBPhysicalSkill>
    @Transaction
    @Query("SELECT * FROM Boss")
    fun getAllWithBKidoSkill(): List<BossWithBKidoSkill>
}