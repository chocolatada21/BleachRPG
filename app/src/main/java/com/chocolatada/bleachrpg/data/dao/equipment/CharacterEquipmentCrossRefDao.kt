package com.chocolatada.bleachrpg.data.dao.equipment

import androidx.room.Dao
import androidx.room.Insert
import com.chocolatada.bleachrpg.data.models.equipment.CharacterEquipmentCrossRef

@Dao
interface CharacterEquipmentCrossRefDao {
    @Insert
    fun insert(characterEquipmentCrossRef: CharacterEquipmentCrossRef)
}