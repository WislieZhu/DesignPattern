package action.chain.vacation

import java.util.*

fun main() {
    val days = Random().nextInt(20) + 1
    println("请假天数:$days")
    with(ChainBuilder()) {
        setChain(GroupNode(this))
        setChain(ManagerNode(this))
        setChain(BossNode(this))
        build()
    }.proceed(Vacation(days))
}