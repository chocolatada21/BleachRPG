package com.chocolatada.bleachrpg.data.dao.hollow

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.chocolatada.bleachrpg.data.models.hollow.Hollow
import com.chocolatada.bleachrpg.data.models.hollow.HollowWithHPhysicalSkill

@Dao
interface HollowDao {
    @Insert
    fun insert(hollow: Hollow)
    @Query("SELECT * FROM Hollow")
    fun getAll(): List<Hollow>
    @Transaction
    @Query("SELECT * FROM Hollow")
    fun getAllWithHPhysicalSkill() : List<HollowWithHPhysicalSkill>
}