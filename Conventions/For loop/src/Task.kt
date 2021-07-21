class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return object : Iterator<MyDate> {
            var startMyDate:MyDate = start


            override fun next(): MyDate {

                val result = startMyDate
                startMyDate = startMyDate.followingDate()
                return result
            }
            override fun hasNext(): Boolean {
                return startMyDate <= end
            }

        }
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}


