package action.chain.okhttp

import action.chain.okhttp.interceptors.BridgeInterceptor
import action.chain.okhttp.interceptors.CallServerInterceptor
import action.chain.okhttp.interceptors.LogInterceptor
import action.chain.okhttp.interceptors.NetworkInterceptor

fun main() {

    val interceptors: MutableList<Interceptor> = mutableListOf()

    val okClient = OkClient
        .Builder(interceptors)
        .addInterceptor(BridgeInterceptor())
        .addInterceptor(LogInterceptor())
        .addInterceptor(NetworkInterceptor())
        .addInterceptor(CallServerInterceptor())
        .build()
    val request = Request.Builder()
        .url("http:123.com")
        .build()


    val response = okClient
        .newCall(request)
        .execute()
    println(request)
    println(response)
}