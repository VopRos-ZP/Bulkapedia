package com.bulkapedia.preference

import android.app.Application

class UserPreferences : Application() {

    companion object {
        const val PREFERENCES = "preferences"
        const val LANGUAGE = "language"
        const val RU_LANGUAGE = "ru"
        const val EN_LANGUAGE = "en"
    }

    private lateinit var language: String

    fun setLanguage(lang: String) {
        language = lang
    }

    fun getLanguage() : String = language

}