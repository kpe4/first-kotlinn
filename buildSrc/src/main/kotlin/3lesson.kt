//import kotlin.random.Random
//
//// class - ключевое слово для объявления класса
//// Сharacter - имя класса. Начинается с большой буквы обязательно
//// тело класса заключено в фигурные скобки {}
//class Character{
//    // Свойства класса (параметры) - писывают состояние объекта
//    var name: String = "Untitled"
//    var health: Int = 100
//    val maxHealth: Int = 100
//    var mana: Int = 20
//    var attack: Int = 15
//    var isAlive: Boolean = true
//    var shield: Boolean = false
//    val maxMana: Int = 20
//
//    // МЕТОДЫ КЛАССА - описывают "поведение" класса
//    // етодами описывается что может сделать объект или как с ним можно взаимодействовать
//    // fun - объявление метода внутри класса
//    // takeDamage - имя метода
//    // (damage: Int) - параметр метода (кол во урона)
//
//    fun takeDamage(damage: Int){
//        // -= health = health - damage
//        if (shield){
//            health -= (damage/2)
//            println("$name take ${damage/2} damage! HP: $health")
//            shield = false
//        }else{
//            health -= damage
//            println("$name take $damage damage! HP: $health")
//        }
//
//        health -= damage
//        println("$name take $damage damage! HP: $health")
//
//        // this. - необязательная ссылка на текущ объект
//        if (this.health <= 0){
//            isAlive = false
//            println("$name lose the game!")
//        }
//    }
//
//    fun heal(amount: Int){
//        // если в isAlive хранится true то if выполнится, если false то пропостится
//        if (isAlive){
//            // minOf(a, b) округляет значение a до значения b
//            health = minOf(health + amount, maxHealth)
//            println("$name regenerated $amount HP. Actual HP: $health / $maxHealth")
//        }else{
//            println("$name already die, and cant heal")
//        }
//    }
//
//    fun fireBall(target: Character) {
//        if (!isAlive) {
//            println("$name is dead and cant cast Fireball")
//            return
//        }
//        if (mana < 5) {
//            println("$name doesnt have enough mana to cast Fireball. Current mana: $mana")
//            return
//        }
//        mana -= 5
//        println("$name casts Fireball on ${target.name}, dealing 25 damage! Mana left: $mana")
//        target.takeDamage(25)
//    }
//
//    // В роли цели атакующий принимает другой объект Character
//    fun attack(target: Character){
//        if (!isAlive){
//            println("$name you dead/ and cant attack anymore")
//            return // пустой return выводит из выполнения метода без возврата
//        }else{
//            val damage = calculateDamage(attack)
//            println("$name attack ${target.name}")
//            target.takeDamage(damage)
//        }
//    }
//}
//
//class Item(val id:String, val name: String, val description: String, var cost: Int){
//    fun effect(player: Character){
//        if (id == "heal_potion"){
//            player.heal(25)
//            println("${player.name} healed 25 HP")
//        }else if(id == "mana_potion"){
//            player.mana += minOf(player.mana + 10, player.maxMana)
//            println("${player.name} recovered 10 mana")
//        }
//    }
//
//    fun shield(player: Character){
//        player.shield = true
//        println("${player.name} picked up the shield.")
//    }
//}
//fun main(){
//    println("=== CREATE GAME CHARACTERS FROM CLASSES ===")
//
//    // СОЗДАНИЕ ОБЪЕКТОВ (ЭКСЗЕМПЛЯРЫ КЛАССА CHARACTER)
//    // Character() - вызов конструктора по умолчанию
//    val player = Character() // player - объект типа Character
//    val monster = Character()
//
//    // настпойка и изменение свойсвт объектов
//    player.name = "Oleg"
//    player.health = 100
//    player.attack = 18
//
//    monster.name = "TunTunTun Sagurrr"
//    monster.health = 60
//    monster.attack = 12
//
//    // пример вызова методов объектов
//    println(">>> FIGHT! <<<")
//    player.attack(monster) // игрок атакует монстра (вызов метода атаки на цель)
//    monster.attack(player)
//
//    // проверка статуса после боя
//    println("--- Round status: ---")
//    println("Player ${player.name}: HP: ${player.health} / ${player.maxHealth}. Alive: ${player.isAlive}")
//    println("Player ${monster.name}: HP: ${monster.health} / ${monster.maxHealth}. Alive: ${monster.isAlive}")
//
//    // демонстрация прмера лечения игрока
//    println("\n--- Player find heal potion ---")
//    player.heal(25)
//
//    println("\n--- Player casts Fireball ---")
//    player.fireBall(monster)
//
//    // создание предметов
//    val healPotion = Item("heal_potion","Heal Potion", "Healing you by 25HP", 50)
//    val manaPotion = Item("mana_potion", "Mana Potion", "Recover 10 mana", 25)
//    val shield = Item("shield", "Shield", "Defend damage", 60)
//}
//
//// 1. создайте новое свойство у вашего Character (которе будет отвечать за ману игрока)
//// 2. добавить метод fireBall который наносит цели 25 урона и тратит у игрока 5 маны
//// 3. при испольозовании метода fireBall должна быть проверка на то хватает ли количества маны для использования