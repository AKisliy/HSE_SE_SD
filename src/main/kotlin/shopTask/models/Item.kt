package shopTask.models

class Item(
    val name: String,
    val price: Int,
    private var amount: Int) {

    fun getAmount(): Int{
        return amount
    }
    fun increaseAmount(by: Int = 1){
        amount += by
    }

    fun decreaseAmount(by: Int = 1){
        amount -= by
    }
    override fun toString(): String {
        return "Item: $name, $price$. Available: $amount"
    }
}