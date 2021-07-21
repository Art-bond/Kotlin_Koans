import java.util.*


fun partitionWordsAndLines() {
    val (words, lines) = listOf("a", "a b", "c", "d e")
        .partitionTo(ArrayList(), ArrayList()) { s -> !s.contains(" ") }
    check(words == listOf("a", "c"))
    check(lines == listOf("a b", "d e"))
}

fun <T, E : MutableCollection<T>> Collection<T>.partitionTo(
    list1: E,
    list2: E,
    function: (T) -> Boolean
): Pair<E, E> {
    for (element in this) {
        if (function(element)) {
            list1.add(element)
        } else {
            list2.add(element)
        }
    }
    return Pair(list1, list2)
}


fun partitionLettersAndOtherSymbols() {
    val (letters, other) = setOf('a', '%', 'r', '}')
        .partitionTo(HashSet(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z' }
    check(letters == setOf('a', 'r'))
    check(other == setOf('%', '}'))
}
