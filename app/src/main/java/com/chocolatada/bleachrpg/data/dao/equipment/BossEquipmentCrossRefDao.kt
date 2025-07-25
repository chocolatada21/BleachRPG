package com.chocolatada.bleachrpg.data.dao.equipment

import androidx.room.Dao
import androidx.room.Insert
import com.chocolatada.bleachrpg.data.models.equipment.BossEquipmentCrossRef

@Dao
interface BossEquipmentCrossRefDao {
    @Insert
    fun insert(bossEquipmentCrossRef: BossEquipmentCrossRef)
}