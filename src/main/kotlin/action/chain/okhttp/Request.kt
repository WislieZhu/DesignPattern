package action.chain.okhttp

class Request(
    var mediaType: String? = null,
    var body: String? = null,
    var header: String? = null,
    builder: Builder? = null
) {

    var url: String? = builder?.url

    class Builder {
        var url: String? = null
        fun url(url: String?): Builder {
            this.url = url
            return this
        }

        fun build(): Request {
            return Request(builder = this)
        }
    }

    override fun toString(): String {
        return "Request{url= $url mediaType= $mediaType body=$body header='$header}"
    }
}
