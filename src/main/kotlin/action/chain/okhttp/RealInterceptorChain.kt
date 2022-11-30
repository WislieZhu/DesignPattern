package action.chain.okhttp

class RealInterceptorChain(private val request: Request,
                           private val interceptors:List<Interceptor>,
                           private val index:Int):Interceptor.IChain {

    override fun request(): Request {
        return this.request
    }

    override fun proceed(request: Request): Response? {
        if (index >= interceptors.size) throw  Error("当前索引和拦截器长度不配")
        val chain = RealInterceptorChain(request, interceptors, index + 1 )
        return interceptors[index].intercept(chain)
    }
}