package action.chain.okhttp

class RealCall(private val okClient: OkClient, private val request: Request) {

    fun execute():Response?{
        return getResponseWithInterceptorChain()
    }

    private fun getResponseWithInterceptorChain():Response?{
        val interceptors = ArrayList<Interceptor>()
        interceptors.addAll(okClient.interceptors)
        val chain = RealInterceptorChain(request, interceptors, 0)
        return chain.proceed(request)
    }
}