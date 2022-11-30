package action.chain.okhttp

class OkClient(builder: Builder) {

    val interceptors: MutableList<Interceptor> = builder.interceptors

    fun newCall(request: Request):RealCall{
        return RealCall(this, request)
    }

    class Builder(val interceptors: MutableList<Interceptor>) {
        fun addInterceptor(interceptor: Interceptor): Builder {
            interceptors += interceptor
            return this
        }

        fun build(): OkClient {
            return OkClient(this)
        }
    }
}