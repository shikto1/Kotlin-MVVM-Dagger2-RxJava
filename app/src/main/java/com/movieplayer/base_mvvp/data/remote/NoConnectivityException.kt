package com.movieplayer.base_mvvp.data.remote
import java.io.IOException

class NoConnectivityException : IOException() {
    override val message: String?
        get() = "No Internet Connection !"

}