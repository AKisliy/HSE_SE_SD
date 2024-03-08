package shopTask

import shopTask.models.Item
import shopTask.models.Shop

fun main() {
    // mock info for testing
    val items: List<Item> = listOf(
        Item( "Audi A2", 30000, 1),
        Item( "Hyundai Solaris", 2500, 25),
        Item("Mosckvich 3 :)", 15000, 2),
        Item( "Bicycle", 100, 1000)
    )

    val shop = Shop()
    shop.addListOfItems(items)

    // example with sign up
    val customer = shop.registerCustomer()
    if(customer == null){
        println("We got unexpected error!!")
        return
    }
    println("Items before purchase:")
    shop.printAllItems()

    customer.addToCart(items[3], 1)

    // example of purchase
    shop.buyProduct(customer)
    // show that everything works correctly
    println("Items after purchase:")
    shop.printAllItems()
    println("Shop margin after purchase: ${shop.totalMargin}")
}