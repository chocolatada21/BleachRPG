package com.chocolatada.bleachrpg.data.dao.equipment

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.chocolatada.bleachrpg.data.models.equipment.BossWithEquipment
import com.chocolatada.bleachrpg.data.models.equipment.CharacterWithEquipment
import com.chocolatada.bleachrpg.data.models.equipment.Equipment

@Dao
interface EquipmentDao {
    @Insert
    fun insert(equipment: Equipment)
    @Query("SELECT * FROM Equipment")
    fun getAll(): List<Equipment>
    @Transaction
    @Query("SELECT * FROM Character")
    fun getAllCharacterWithEquipment() : List<CharacterWithEquipment>
    @Transaction
    @Query("SELECT * FROM Boss")
    suspend fun getAllBossesWithEquipment(): List<BossWithEquipment>
}
