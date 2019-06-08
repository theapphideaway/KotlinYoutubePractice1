fun main(args: Array<String>) {
    var stillPlaying = true
    var myItems = ArrayList<String>()
    println("Welcome to the shopping center. What would you like to buy?")
    while (stillPlaying){
        val purchasedItem = readLine()

        myItems.add(purchasedItem!!)

        println("You bought $purchasedItem. Would you like to buy more?")

        val continuePlaying = readLine()

        if(continuePlaying == "no"){
            println("Here are your Items:")
            myItems.forEach { println(it)}
            println("Thanks for playing")
            stillPlaying = false
        } else{
            println("What else would you like to buy?")
        }
    }
}