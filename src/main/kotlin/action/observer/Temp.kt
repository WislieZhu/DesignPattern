package action.observer

import java.util.*

class Temp: Subject() {

    var temp:Float = -100f
        private set


    fun fetchTemp(){
        val rdTemp = Random().nextFloat() * 50
        if(rdTemp != temp){
            temp = rdTemp
            println("temp=$temp")
            notifyObservers()
        }
    }

}