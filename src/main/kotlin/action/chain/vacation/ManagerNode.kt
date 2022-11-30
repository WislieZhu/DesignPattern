package action.chain.vacation

class ManagerNode(builder: ChainBuilder):AbstractNode(builder) {


    override fun proceed(vacation: Vacation) {
        if(vacation.days >10){
            println("经理审批")
            next().proceed(vacation)
        }else{
            println("经理审批通过")
        }
    }
}