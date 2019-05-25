package work.kyanro.carlloevler

import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.core.awaitResponseResult
import com.github.kittinunf.fuel.coroutines.awaitStringResponseResult
import com.github.kittinunf.fuel.httpGet
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking {
    val url = args.getOrNull(0)

    if (url == null) {
        println("覚悟を決めた恐怖心 それが勇気だ。")
        return@runBlocking
    }

    try {
        val (_, _, result) = url
            .httpGet()
            .awaitStringResponseResult()
        result.fold(
            { data ->
                println(data)
            }, {
                println("まず考え、それから行動せよ。")
            }
        )
    } catch (e: Exception) {
        println("ある人間が、聖人になるために、天使になる必要はない。")
    }

}
