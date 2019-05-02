package coroutines.alt

import coroutines.Credentials
import coroutines.UserData
import coroutines.UserID
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import javax.xml.bind.JAXBElement

// simple consecutive logic; blocking version
suspend fun login(credentials: Credentials): UserID {
    TODO("Do later")
}

suspend fun loadUserData(userID: UserID): UserData {
    TODO("Do later")

}

suspend fun showData(data: UserData) {
    TODO("Do later")
}

suspend fun showUserInfo(credentials: Credentials) {
    val userID = login(credentials)
    val userData = loadUserData(userID)
    showData(userData)
}

fun main(): Unit = runBlocking {
    launch {
        showUserInfo(Credentials("user", "password"))
    }
}
