import java.util.HashMap

fun buildMap(build: HashMap<Int, String>.() -> Unit): HashMap<Int, String>{
    val maps: HashMap<Int, String> = hashMapOf()
    maps.build()
    return maps
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
