fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    if (date in first..last) return true
    return false
}
