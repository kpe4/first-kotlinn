import kotlin.random.Random

fun calculateDamage(baseAttack: Int): Int{
    val variation = Random.nextInt(80,121)
    return (baseAttack * variation) / 100
}

fun performAttack(attackerName: String, attackerAttack: Int, defenderName: String, defenderHealth: Int):Int{
    println("Move: $attackerName: ")
    val damage = calculateDamage(attackerAttack)
    var newHealth = defenderHealth - damage

    println("$attackerName attack $defenderName with $damage damage")
    println("$defenderName HP: $newHealth")

    return newHealth
}

fun startBattle(){
    val playerName: String = "Olegzon"
    var playerHealth: Int = 100
    val playerAttack: Int = 18

    val monsterName = "TunTunTun Sagurrr"
    var monsterHealth = 60
    val monsterAttack = 12

    println("Player: $playerName (HP: $playerHealth, ATK: $playerAttack")
    println("Monster: $monsterName (HP: $monsterHealth, ATK: $monsterAttack")
    println("\n>>> FIGHT! <<<")

    var round = 1
    // ЦИКЛ БОЯ ДО ПРОИГРАВШЕГО

    // and - &&
    // or - ||
    while (playerHealth > 0 && monsterHealth > 0) {
        println("\n--- Round: $round ---")

        monsterHealth = performAttack(playerName, playerAttack, monsterName, monsterHealth)

        if (monsterHealth <= 0) break // break - немедленный выход из циклa

        // round++ то же самое что и round = round + 1
        round++
    }

    println("\n=== Fight is over ===")

    if (playerHealth > 0){
        println("You win! $playerName beat $monsterName")
    }else{
        println("You lose! $monsterName beat $playerName")
    }
}

fun main(){
    println("=== VOYNA S SATANOY ===")
    startBattle()
    println("=== GAME IS OVER ===")
}