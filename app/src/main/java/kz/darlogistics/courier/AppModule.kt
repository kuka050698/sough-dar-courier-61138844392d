/*
 * Copyright (c) DAR Ecosystem 2018.
 *
 * Created by sough on 15/08/2018.
 */

package kz.darlogistics.courier

import kz.darlogistics.courier.auth.authModule
import kz.darlogistics.courier.core.coreModule

/**
 * Gather all app modules
 */
val appModules = listOf(authModule, coreModule)