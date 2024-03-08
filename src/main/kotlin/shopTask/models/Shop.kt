package shopTask.models

import shopTask.controllers.InputController
import kotlin.system.exitProcess

class Shop {
    private val products: MutableList<Item> = mutableListOf()
    private val customers: MutableList<Customer> = mutableListOf()
    private var margin: Int = 0
    private val inputController = InputController(::println)

    val totalMargin:Int
        get() = margin

    /**
     * New customer registration
     */
    fun registerCustomer(): Customer? {
        println("You're on registration page.\nEnter your login.")
        val login: String = readlnOrNull() ?: exitProcess(1)
        val password = inputController.getUserPassword()
        if(password == null) {
            println("Error while registering")
            return null
        }
        println("Input your name:")
        val name = inputController.getUserString()
        println("Input your last name:")
        val lastName = inputController.getUserString()
        val customer = Customer(login, name, lastName, password, Cart())
        customers.add(customer)
        return customer
    }

    fun addNewItem(item: Item){
        products.add(item)
    }

    fun addListOfItems(items: List<Item>){
        for(item in items){
            addNewItem(item)
        }
    }

    /**
     * Get all items
     */
    fun printAllItems() {
        println("Available items:")
        products.forEach { product -> println(product) }
    }

    /**
     * Buy product
     */
    fun buyProduct(customer: Customer) {
        println("Make order screen")
        if (customer.customerItems.isEmpty()) {
            println("Nothing in cart...")
            return
        }

        println("Items in cart")
        customer.customerItems.forEach { (product, quantity) ->
            println("${product.name} x $quantity")
        }

        println("Confirming your order...")
        val totalCost = customer.sumInCart
        if(!proceedOrder(customer)){
            println("Error occurred while processing your order! :(")
            return
        }

        println("Success!! Total cost: $$totalCost")
        margin += totalCost;
    }

    private fun proceedOrder(customer: Customer): Boolean{
        Thread.sleep(1000)
        customer.customerItems.forEach { (product, quantity) ->
            val productFromShop = products.firstOrNull { it == product }
            if (productFromShop != null) {
                if (productFromShop.getAmount() < quantity) {
                    println("Sorry, we don't have this amount of ${productFromShop.name}. Only ${productFromShop.getAmount()} available")
                    println("Try to reduce amount in cart and return here to make order.")
                    return false
                }
                productFromShop.decreaseAmount(quantity)
            } else {
                println("No item with name: ${product.name} in the store")
                return false
            }
        }
        return true
    }
}