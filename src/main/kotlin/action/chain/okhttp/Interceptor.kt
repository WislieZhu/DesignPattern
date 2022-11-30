package action.chain.okhttp


interface Interceptor {

    fun intercept(chain:IChain):Response?

    interface IChain{

        fun request():Request

        fun proceed(request:Request):Response?
    }
}