package shopTask.models

class Cart {
    private val items: MutableMap<Item, Int> = mutableMapOf()

    val totalSum: Int
        get() = items.values.sumOf { x -> x }

    val cartItems: MutableMap<Item, Int>
        get() = items.toMutableMap()
    fun addItem(product: Item, quantity: Int = 1) {
        items[product] = items.getOrDefault(product, 0) + quantity
    }

    fun removeItem(product: Item, quantity: Int = 1){
        if(!items.containsKey(product)){
            return
        }
        items[product] = items[product]!! - quantity
    }

}