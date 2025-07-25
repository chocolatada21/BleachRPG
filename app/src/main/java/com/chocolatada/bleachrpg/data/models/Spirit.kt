package com.chocolatada.bleachrpg.data.models

abstract class Spirit(
    val name: String,
    var health: Int,
    var currentHealth: Int,
    var reiatsu: Int,
    var physical: Int,
    var defense: Int,
    var criticalProbability: Int,
    var criticalDamage: Int,
    var dodgeProbability: Int
)
