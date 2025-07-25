package com.chocolatada.bleachrpg.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.chocolatada.bleachrpg.data.dao.boss.BKidoSkillDao
import com.chocolatada.bleachrpg.data.dao.boss.BPhysicalSkillDao
import com.chocolatada.bleachrpg.data.dao.boss.BossBKidoSkillCrossRefDao
import com.chocolatada.bleachrpg.data.dao.boss.BossBPhysicalSkillCrossRefDao
import com.chocolatada.bleachrpg.data.dao.boss.BossDao
import com.chocolatada.bleachrpg.data.dao.character.CKidoSkillDao
import com.chocolatada.bleachrpg.data.dao.character.CPhysicalSkillDao
import com.chocolatada.bleachrpg.data.dao.character.CharacterAndCharacterClassDao
import com.chocolatada.bleachrpg.data.dao.character.CharacterClassDao
import com.chocolatada.bleachrpg.data.dao.character.CharacterDao
import com.chocolatada.bleachrpg.data.dao.character.CharacterKidoSkillCrossRefDao
import com.chocolatada.bleachrpg.data.dao.character.CharacterPhysicalSkillCrossRefDao
import com.chocolatada.bleachrpg.data.dao.equipment.BossEquipmentCrossRefDao
import com.chocolatada.bleachrpg.data.dao.equipment.CharacterEquipmentCrossRefDao
import com.chocolatada.bleachrpg.data.dao.equipment.EquipmentDao
import com.chocolatada.bleachrpg.data.dao.hollow.HPhysicalSkillDao
import com.chocolatada.bleachrpg.data.dao.hollow.HollowDao
import com.chocolatada.bleachrpg.data.dao.hollow.HollowHPhysicalCrossRefDao
import com.chocolatada.bleachrpg.data.models.boss.BKidoSkill
import com.chocolatada.bleachrpg.data.models.boss.BPhysicalSkill
import com.chocolatada.bleachrpg.data.models.boss.Boss
import com.chocolatada.bleachrpg.data.models.boss.BossBKidoSkillCrossRef
import com.chocolatada.bleachrpg.data.models.boss.BossBPhysicalSkillCrossRef
import com.chocolatada.bleachrpg.data.models.character.CKidoSkill
import com.chocolatada.bleachrpg.data.models.character.CPhysicalSkill
import com.chocolatada.bleachrpg.data.models.character.Character
import com.chocolatada.bleachrpg.data.models.character.CharacterClass
import com.chocolatada.bleachrpg.data.models.character.CharacterKidoSkillCrossRef
import com.chocolatada.bleachrpg.data.models.character.CharacterPhysicalSkillCrossRef
import com.chocolatada.bleachrpg.data.models.equipment.BossEquipmentCrossRef
import com.chocolatada.bleachrpg.data.models.equipment.CharacterEquipmentCrossRef
import com.chocolatada.bleachrpg.data.models.equipment.Equipment
import com.chocolatada.bleachrpg.data.models.hollow.HPhysicalSkill
import com.chocolatada.bleachrpg.data.models.hollow.Hollow
import com.chocolatada.bleachrpg.data.models.hollow.HollowHPhysicalSkillCrossRef

@Database(
    entities = [
        // character
        Character::class,
        CharacterClass::class,
        CharacterKidoSkillCrossRef::class,
        CharacterPhysicalSkillCrossRef::class,
        CKidoSkill::class,
        CPhysicalSkill::class,
        // hollow
        Hollow::class,
        HollowHPhysicalSkillCrossRef::class,
        HPhysicalSkill::class,
        // boss
        Boss::class,
        BPhysicalSkill::class,
        BKidoSkill::class,
        BossBPhysicalSkillCrossRef::class,
        BossBKidoSkillCrossRef::class,
        // equipment
        Equipment::class,
        CharacterEquipmentCrossRef::class,
        BossEquipmentCrossRef::class
    ],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    // character related
    abstract fun characterDao(): CharacterDao
    abstract fun characterClassDao(): CharacterClassDao
    abstract fun characterAndCharacterClassDao(): CharacterAndCharacterClassDao
    abstract fun characterKidoSkillCrossRefDao(): CharacterKidoSkillCrossRefDao
    abstract fun characterPhysicalSkillCrossRefDao(): CharacterPhysicalSkillCrossRefDao
    abstract fun cKidoSkillDao(): CKidoSkillDao
    abstract fun cPhysicalSkillDao(): CPhysicalSkillDao
    // hollow related
    abstract fun hollowDao(): HollowDao
    abstract fun hollowHPhysicalCrossRefDao(): HollowHPhysicalCrossRefDao
    abstract fun hPhysicalSkillDao(): HPhysicalSkillDao
    // boss related
    abstract fun bossDao(): BossDao
    abstract fun bPhysicalSkillDao(): BPhysicalSkillDao
    abstract fun bKidoSkillDao(): BKidoSkillDao
    abstract fun bossBPhysicalSkillCrossRefDao(): BossBPhysicalSkillCrossRefDao
    abstract fun bossBKidoSkillCrossRefDao(): BossBKidoSkillCrossRefDao
    // equipment related
    abstract fun equipmentDao(): EquipmentDao
    abstract fun characterEquipmentCrossRefDao(): CharacterEquipmentCrossRefDao
    abstract fun bossEquipmentCrossRefDao(): BossEquipmentCrossRefDao
}