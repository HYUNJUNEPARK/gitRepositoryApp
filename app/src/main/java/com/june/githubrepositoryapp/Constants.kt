package com.june.githubrepositoryapp

object Constants {
    //RetrofitUtil
    const val GITHUB_BASE_URL = "https://github.com"
    const val GITHUB_BASE_API_URL = "https://api.github.com"

    //SharedPreference
    const val PREFERENCE_NAME_KEY_AUTH_TOKEN = "auth_token"
    const val PREFERENCE_NAME_AUTO_SIGN_IN = "auto_sign_in"
    const val AUTO_SIGN_IN_ON = true
    const val AUTO_SIGN_IN_OFF = false

    //LOCAL DB
    const val DB_NAME = "github_repository_app.db"
    const val ROOM_TABLE_NAME = "GithubRepository"
}