package com.chocolatada.bleachrpg.data.dao.hollow

import androidx.room.Dao
import androidx.room.Insert
import com.chocolatada.bleachrpg.data.models.hollow.HollowHPhysicalSkillCrossRef

@Dao
interface HollowHPhysicalCrossRefDao {
    @Insert
    fun insert(hollowHPhysicalCrossRef: HollowHPhysicalSkillCrossRef)
}