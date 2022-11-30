package action.chain.okhttp

data class Response(
    var bridgeInterceptor: String? = null,
    var logInterceptor: String? = null,
    var networkInterceptor: String? = null,
    var callServerInterceptor: String? = null
)