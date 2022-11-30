package action.chain.vacation

class ChainBuilder {

    private val chains = mutableListOf<AbstractNode>()
    private var index = 0

    fun setChain(current: AbstractNode): ChainBuilder {
        if (!chains.contains(current)) {
            chains.add(current)
        }
        return this
    }

    fun build(): AbstractNode {
        return chains[index++]
    }

}