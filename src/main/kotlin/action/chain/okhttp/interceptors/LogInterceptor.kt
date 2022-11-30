package action.chain.okhttp.interceptors

import action.chain.okhttp.Interceptor
import action.chain.okhttp.Response

class LogInterceptor:Interceptor {

    override fun intercept(chain: Interceptor.IChain): Response? {
        val request = chain.request()
        with(request) {
            if (body.isNullOrBlank()) {
                body = "LogInterceptor"
            }
        }
        return chain.proceed(request)?.apply {
            if (logInterceptor.isNullOrBlank()) {
                logInterceptor = "LogInterceptor"
            }
        }
    }
}