package action.observer

fun main() {
    val temp = Temp()
    with(temp){
        addObserver(Weather())
        addObserver(Cloth())
        fetchTemp()
        println()
        fetchTemp()

        removeAllObservers()
        fetchTemp()
    }

}