package coroutines


data class UserID(val id: String, val username: String)
data class Credentials(val username: String, val passwword: String)
data class UserData(val fullname: String, val email: String)

fun login(credentials: Credentials): UserID {
    TODO("Do later")
}
fun loadUserData(userID: UserID): UserData {
    TODO("Do later")
}
fun showData(data: UserData) {
    TODO("Do later")
}

fun showUserInfo(credentials: Credentials) {
    val userID = login(credentials)
    val userData = loadUserData(userID)
    showData(userData)
}