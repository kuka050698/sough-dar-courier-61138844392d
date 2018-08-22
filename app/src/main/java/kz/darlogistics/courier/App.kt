/*
 * Copyright (c) DAR Ecosystem 2018.
 *
 * Created by sough on 14/08/2018.
 */

package kz.darlogistics.courier

import android.app.Application
import org.koin.android.ext.android.startKoin

/**
 * Custom application class
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, appModules)
    }

    companion object {
        @JvmStatic var instance: App? = null
            private set
    }
}