package com.example.androidmvvmexample.model

data class Data(
    var usrName: String? = null,
    var password: String? = null
) {
    fun login(usrName: String?, password: String?): String {
        if (usrName == "abc" && password == "1234") {
            return "성공..!"
        } else {
            return "실패.."
        }
    }
}
