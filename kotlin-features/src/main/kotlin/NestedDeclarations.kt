
annotation class Routing() {

    enum class HttpVerb { GET, PUT, POST, DELETE, PATCH, OPTIONS }

    annotation class Path(val path: String, val secondary: String)

    annotation class Verb(val method: HttpVerb)

    companion object {
        const val DEFAULT = "/"
    }

}

@Routing
@Routing.Path(path = "/home", secondary = Routing.DEFAULT)
@Routing.Verb(method = Routing.HttpVerb.GET)
class Controller
