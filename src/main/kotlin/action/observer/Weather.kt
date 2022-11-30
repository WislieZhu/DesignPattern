package action.observer

class Weather : Observer() {
    override fun update(subject: Subject) {
        if (subject is Temp) {
            when (subject.temp) {
                in 0f..10f -> println("天气很冷")
                in 10f..20f -> println("天气凉爽")
                in 20f..30f -> println("天气温暖")
                else -> println("天气炎热")
            }
        }
    }
}