package action.chain.vacation

class BossNode(builder: ChainBuilder) : AbstractNode(builder) {
    override fun proceed(vacation: Vacation) {
        println("老板审批通过")
    }
}