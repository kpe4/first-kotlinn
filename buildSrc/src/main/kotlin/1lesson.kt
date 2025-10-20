import kotlin.random.Random

fun main(){
    println("Привет, это моя первая строка на котлин")
    println("Добро пожаловать")

    // var - изменяемая перемернная
    // val - не изменяемая переменная
    // :String - задание явного типа данных для переменной
    var playerName: String = "Oleg"
    val maxHealth: Int = 100

    var currentHealth: Int = 100

    var playerAttack: Int = 15

    var isAlive: Boolean = true

    var gold: Int = 50

    println("Игрок $playerName входит в игру")
    println("Здоровье: $currentHealth / $maxHealth")
    println("Всего монет: $gold")
    println("Он жив? Ответ: $isAlive")

    println("\n >>> $playerName наступает на ловушку! <<<")
    val trapDamage: Int = 35

    // -= currentHealth = currentHealth - trapDamage
    currentHealth -= trapDamage

    if(currentHealth <= 0){
        isAlive = false
        println("Игрок $playerName помер в нищете")
    }else{
        println("$playerName пережил! у его осталось хп: $currentHealth")
    }

    val damageVariation = Random.nextInt(80,121)

    val actualDamage = (playerAttack * damageVariation) / 100
    val monsterName: String = "ТунТунТун Сагур"
    var monsterHealth: Int = 50
    val monsterAttack: Int = 12

    monsterHealth -= actualDamage
    println("$playerName наносит $monsterName $actualDamage урона")
    if (monsterHealth <= 0){
        println("$monsterName умер в нищете от руки $playerName")
    }else{
        println("$monsterName не умер, у него осталось $monsterHealth здоровья")
    }

    currentHealth -= monsterAttack

    isAlive = currentHealth > 0
    if (!isAlive){
        println("$monsterName победил BRUH")
    }else{
        println("$playerName получает $monsterAttack урона! \n Осталось $currentHealth здоровья")
    }

    // Зелье здоровья
    val healthPotion: Int = 30
    println("\n >>> $playerName находит зелье здоровья! <<<")
    println("$playerName решает его выпить")

    currentHealth += healthPotion
    if (currentHealth > maxHealth) {
        currentHealth = maxHealth
    }

    println("$playerName принял дозу, и у него стало $currentHealth / $maxHealth здоровья")

}