package work.kyanro.carlloevler

import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.core.awaitResponseResult
import com.github.kittinunf.fuel.coroutines.awaitStringResponseResult
import com.github.kittinunf.fuel.httpGet
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking {
    val (req, res, result) = "http://httpbin.org/get"
        .httpGet()
        .awaitStringResponseResult()

    result.fold(
        { data ->
            println(data)
        }, { error ->
            println("An error of type ${error.exception} happened: ${error.message}")
        }
    )

}
