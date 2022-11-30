package action.chain.vacation

abstract class AbstractNode(private val builder: ChainBuilder) {

    fun next(): AbstractNode {
        return builder.build()
    }

    abstract fun proceed(vacation: Vacation)
}