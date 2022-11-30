package action.chain.vacation

class GroupNode(builder: ChainBuilder):AbstractNode(builder) {


    override fun proceed(vacation: Vacation) {
        if(vacation.days >3){
            println("小组长审批")
            next().proceed(vacation)
        }else{
            println("小组长审批通过")
        }
    }
}