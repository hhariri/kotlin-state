package coroutines.coroutine

import coroutines.*
import kotlinx.coroutines.*


fun login(credentials: Credentials): UserID {
    TODO("Do later")
}

fun loadUserData(userID: UserID): UserData {
    TODO("Do later")
}

fun showData(data: UserData) {
    TODO("Do later")
}

suspend fun showUserInfo(credentials: Credentials) {
    val userData = withContext(Dispatchers.IO) {
        val userID = login(credentials)
        loadUserData(userID)
    }
    showData(userData)
}



