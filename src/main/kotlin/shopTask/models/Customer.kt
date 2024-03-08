package shopTask.models

class Customer(
    val login: String,
    val firstName: String,
    val lastName: String,
    private var password: String,
    private val cart: Cart) {
    init {
        password = password.hashCode().toString()
    }

    val customerItems: MutableMap<Item, Int>
        get() = cart.cartItems

    val sumInCart: Int
        get() = cart.totalSum

    fun addToCart(item: Item, quantity: Int = 1){
        cart.addItem(item, quantity)
    }

    override fun toString(): String {
        return "Welcome, $firstName, $lastName"
    }
}