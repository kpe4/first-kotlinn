// ZADANIE 2
class Character(
    val characterName: String,
    val characterLevel: Int
){
    fun checkLevel(){
        if (characterLevel > 5){
            println("$characterName - опытный Патапим!!!!")
        }else{
            println("$characterName - еще green(((")
        }
    }
}

// ZADANIE 4
fun calculateExperience(level: Int): Int{
    return level * 100
}

// NUMERO SINCO
open class Weapon(val name: String, val damage: Int) {
    open fun displayInfo() {
        println("$name (урон: $damage)")
    }
}

// ZADANIE 6
class MagicWeapon(name: String, damage: Int, val manaCost: Int) : Weapon(name, damage) {
    override fun displayInfo() {
        println("$name (урон: $damage, мана: $manaCost)")
    }
}

// MAIN
fun main(){
    // 2
    val hero1 = Character("Steve", 77)
    val hero2 = Character("Alex", 2)

    hero1.checkLevel()
    hero2.checkLevel()

    // 3
    val level1 = 3
    val level2 = 7

    // 4
    println("Для уровня $level1 нужно ${calculateExperience(level1)} опыта.")
    println("Для уровня $level2 нужно ${calculateExperience(level2)} опыта.")

    // 5
    val sword = Weapon("Меч", 25)

    sword.displayInfo()

    // 6
    val magicSword = MagicWeapon("Огненный Меч", 120, 50)
    magicSword.displayInfo()
}
