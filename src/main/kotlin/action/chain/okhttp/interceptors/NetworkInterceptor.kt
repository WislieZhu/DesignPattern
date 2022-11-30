package action.chain.okhttp.interceptors

import action.chain.okhttp.Interceptor
import action.chain.okhttp.Response

class NetworkInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.IChain): Response? {
        val request = chain.request()
        with(request) {
            if (header.isNullOrBlank()) {
                header = "RetryInterceptor"
            }
        }

        return chain.proceed(request)?.apply {
            if (networkInterceptor.isNullOrBlank()) {
                networkInterceptor = "NetworkInterceptor"
            }
        }
    }
}