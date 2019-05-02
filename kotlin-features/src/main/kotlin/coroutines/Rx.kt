package coroutines.rx

import coroutines.Credentials
import coroutines.UserData
import coroutines.UserID
import io.reactivex.Scheduler
import io.reactivex.Single

fun login(credentials: Credentials): Single<UserID> {
    TODO("Do later")
}

fun loadUserData(userID: UserID): Single<UserData> {
    TODO("Do later")
}

fun showData(data: UserData) {
    TODO("Do later")
}

fun showUserInfoRx(credentials: Credentials) {
    login(credentials)
        .flatMap { loadUserData(it) }
        .doOnSuccess { showData(it) }
        .subscribe()
}