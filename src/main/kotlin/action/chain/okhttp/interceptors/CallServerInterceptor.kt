package action.chain.okhttp.interceptors

import action.chain.okhttp.Interceptor
import action.chain.okhttp.Response

class CallServerInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.IChain): Response? {
        val request = chain.request()
        return with(request) {
            if (!header.isNullOrBlank() and
                !mediaType.isNullOrBlank() and
                !body.isNullOrBlank()) {
               Response(callServerInterceptor = "CallServerInterceptor")
            }
             Response(callServerInterceptor = "zhulaoda")
        }
    }
}