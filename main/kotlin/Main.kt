fun main(args: Array<String>) {
    //syntax reps
    val x: Int = 3
    var d: Double = 23.34
    var someToggle: Boolean = (d >= x)
   if(someToggle == true){
      println("nice dude")
   }
    else if(d != d){
        println("never gonna happen")
   }

    // nullable type
    var a: Int? = null

    //val number1: String? = readlnOrNull()
    //val number2: String? = readlnOrNull()

    // the problem with this statement is that since readline COULD be null it woldnt be able to add these two values.

    //val result = number1?.toInt() + number2?.toInt()

    // Since kotlin is a null safe language, it will not let you compile if there is a potential null related safety concern.
    // to fix it you can use !! which is similar to rust's unsafe blocks. We are telling kotlin that we are sure this value will exist, and accepting that it may crash
    // val result = number1!!.toInt() + number2!!.toInt()
    //println(result)

    //optional assignment
    //val something: String = readlnOrNull() ?: "0"
    //val somethingElse: String = readlnOrNull() ?: "0"
    // not a fan of list's being returned from a function rather than being its own datatype with []
    // this is an Immutable list
    val shoppingList = listOf<String>("av", " av")
    // this is a mutable list
    val games = mutableListOf<String>("")
    games.add("some game")

    var counter: Int = 0
    while(counter < shoppingList.size){
        println(shoppingList[counter])
        counter ++
    }

    for(i in 1..100){
        println(i)
    }
    val e = isEven(5)
    println(e)
}
// type defenitions for functions works exactly like TS so far.
fun isEven(number: Int = 2): Boolean{
    return number % 2 == 0;
}

// when functions operate similar to case statements in javascript. Runs the checks in order.
fun whenFunctions(obj: Any): Any{
    when(obj){
        1 -> println("One")
        5 -> println("Five")
        "Hello" -> println("World")
    }
    return ""
}