package action.observer

abstract class Subject {

    private val observers: MutableList<Observer> = mutableListOf()

    open fun addObserver(observer: Observer) {
        if (!observers.contains(observer)) observers.add(observer)
    }

    open fun removeObserver(observer: Observer) {
        if (observers.contains(observer)) observers.remove(observer)
    }

    fun removeAllObservers(){
        observers.clear()
    }

    fun notifyObservers() {
        observers.forEach { observer ->
            observer.update(this)
        }
    }
}
