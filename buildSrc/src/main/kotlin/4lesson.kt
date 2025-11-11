/*
import kotlin.random.Random

// первичный конструктор - пишется в круглых скобках класса, я обязан быть задан при создании объекта
class Character(var name: String, var health: Int, var attack: Int){
    val maxHealth: Int = 100
    var isAlive: Boolean = true
    var shield: Boolean = false

    fun takeDamage(damage: Int){
        if (shield == true){
            health -= (damage/2) // если щит поднят то урона будет в два раза меньше по игроку
            println("player $name resistance x2 damage. And take ${damage/2} damage")
        }else{
            health -= damage
            println("Player $name take $damage damage")
        }

        if (health <= 0){
            isAlive = false
            println("Player $name umer")
        }
    }

    fun attack(target: Character){
        if (isAlive == false){
            println("You already umer, you cant fight anymore")
            return // выход из выполнения метода
        }

        println("$name beat ${target.name}")
        val damage = calculateDamage(attack)
        target.takeDamage(damage)
    }

    fun heal(amount: Int){
        if(!isAlive) return // если мертв то прорвать хилинг

        health = minOf((health+amount), maxHealth)
        println("player $name healing by $amount. HP: $health / $maxHealth")
    }
}

class Item(
    val id: String,
    val name: String,
    val description: String,
    val value: Int = 0,
    val useEffect: (Player) -> Unit // функ исп предм
    // unit - функ может быть пустой (т. е. у предмета может не быть свойств)

    // лямбда функция - функция без названия (она так же как и другие функции принимает аттрибуты
    // но выполняется только в момент обращения не называется извне

    // (Player) -> Unit = {} то же самое что и:
    // fun useEffect(Player){}
){
    fun use(player: Player){
        println("Used $name")
        useEffect(player)
    }

    fun displayUnfo(){
        println("$name - $description (Cost: $value)")
    }
}

class Inventory{
    // private - инкапсуляция не позволяет использовать это свойство другим классам
    // и в целом за пределами класса в котором обЪявлено (дочерние тоже)
    // mutableListOf - создание изменяемого (mutable) списка на данный момент пустого
    // <Item> - значит что в список можно положить только объекты класса Item (ограничитель)
    private val items = mutableListOf<Item>()

    fun addItem(item: Item){
        // .add - добавляет элемент в конец списка (аналог append в python)
        items.add(item)
        println("Item ${item.name} added to inventory")
    }

    fun removeItem(index: Int): Boolean{
        // проверяем введенный index на вхождение в диапазон индексов списка
        if (index in 0 until items.size){
            // .removeAt(index) - удаялет элемент списка по заданному индексу
            val removedItem = items.removeAt(index)
            println("Item ${removedItem.name} deleted from inventory")
            return true
        }
        println("Item dont exists")
        return false
        // ^проверяет входит^ ли индекс в диапазон от нуля до последнего
        // индекса списка (.size - выведет число элементов внутри списка)
    }
}*/
