/**
 * Learning about Kotlin collections, particularly
 * the MutableList type
 */

fun main() {
    println("Hello World!")

    // Create our list
    val snacks = mutableListOf<String>()

    // Show it
    println(snacks)

    // Add in some things...
    snacks.add("Nashi")
    snacks.add("Twiglets")
    snacks.add("Cranberries")

    // Show specific items
    println(snacks[0])
    println(snacks[2])
    println(snacks[1])
    // Println(snacks[3]) This would be out of bounds

    // Change the value
    println(snacks)
    snacks[2] = "Dog biscuits"

    // Remove an item
    snacks.removeAt(1)
    println(snacks)

    // Add in new items in specific places
    snacks.add(1, "Bacon Scratchings")

    // Sort the list
    snacks.sort()
    println(snacks)

    // Get a random item from the list
    val item = snacks.random()
    println(item)

    // Shuffle the list (randomise it)
    snacks.shuffle()
    println("shuffled: $snacks")

    // Loop though the list
    for (item in snacks) {

    }
    // Search for an item
  println("Cranberries is in the list: ${ snacks.contains("Cranberries") }")
    println("Twiglets is in the list: ${ snacks.contains("Twiglets") }")

    // Getting index of an item
    println("Cranberries index: ${snacks.indexOf("Cranberries")}")
    println("Twiglets index: ${snacks.indexOf("Twiglets")}")

    // Loop through the list
    for (Snack in snacks) {
        println(Snack)
    }

    // Loop using an index
    for (i in 0 ..< snacks.size) {
        println("$i: ${ snacks[i] }")
    }
    // Loop getting index and values
    for ((i, snack) in snacks.withIndex()) {
        println("$i: $snack")
    }

}