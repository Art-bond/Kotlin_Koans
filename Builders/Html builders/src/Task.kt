fun renderProductTable(): String {
    return html {
        table {
            tr(getTitleColor()){
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            for ((index, value) in products.withIndex()){
                tr{
                    td(getCellColor(index, 0)){
                        text(value.description)
                    }
                    td(getCellColor(index, 1)){
                        text(value.price)
                    }
                    td(getCellColor(index, 2)){
                        text(value.popularity)
                    }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) % 2 == 0) "#dce4ff" else "#eff2ff"
