data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        val numberThis = year*1000+month*100+dayOfMonth
        val numberOther = other.year*1000+other.month*100+other.dayOfMonth
        return numberThis-numberOther
    }

}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
