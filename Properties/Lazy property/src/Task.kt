class LazyProperty(val initializer: () -> Int) {
    var number: Int? = null
    val lazy: Int
        get() {
            if (number == null){
                number = initializer()

            }
            return number!!
        }
}
