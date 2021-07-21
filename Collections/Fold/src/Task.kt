// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> {
    val list = customers.flatMap { it.getOrderedProducts() }.toSet()
    return customers.fold(list, { partProduct, customer ->
        partProduct.intersect(customer.getOrderedProducts())
})
}

fun Customer.getOrderedProducts(): List<Product> =
        orders.flatMap { it.products }