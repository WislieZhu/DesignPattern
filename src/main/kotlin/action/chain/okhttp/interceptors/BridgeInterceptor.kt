package action.chain.okhttp.interceptors

import action.chain.okhttp.Interceptor
import action.chain.okhttp.Response

class BridgeInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.IChain): Response? {
        val request = chain.request()
        with(request) {
            if (mediaType.isNullOrBlank()) {
                mediaType = "BridgeInterceptor"
            }
        }

        return chain.proceed(request)?.apply {
            if (bridgeInterceptor.isNullOrBlank()) {
                bridgeInterceptor = "BridgeInterceptor"
            }
        }
    }
}