package org.koin.log

/**
 * Logger - do nothing
 */
class EmptyLogger : Logger {
    override fun log(msg: String) {}

    override fun err(msg: String) {}
}