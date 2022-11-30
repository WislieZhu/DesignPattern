package action.observer

class Cloth : Observer() {
    override fun update(subject: Subject) {
        if (subject is Temp) {
            when (subject.temp) {
                in 0f..15f -> println("秋裤伺候")
                in 15f..20f -> println("长袖与汉服")
                in 20f..35f -> println("短袖很多")
                else -> println("秀肌肉")
            }
        }
    }
}