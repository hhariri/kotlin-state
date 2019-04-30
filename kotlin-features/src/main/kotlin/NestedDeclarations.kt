
annotation class Routing() {
    enum class HttpVerb { GET, PUT, POST, DELETE, PATCH, OPTIONS } // Now possible
    annotation class Path(val path: String, val secondary: String) // Now possible
    annotation class Verb(val method: HttpVerb)

    // Members can now be part of companion objects
    companion object { // Now possible
        const val DEFAULT = "/"
    }

}

@Routing
@Routing.Path(path = "/home", secondary = Routing.DEFAULT)
@Routing.Verb(method = Routing.HttpVerb.GET)
class Controller() {

}
