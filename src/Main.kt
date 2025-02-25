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
    snacks.add(1, "Bacon Scratching")

    // Sort the list
    snacks.sort()
    println(snacks)

    // Get a random item from the list
    val item = snacks.random()
    println(item)

    // Loop though the list
    for (item in snacks) {

    }

}

