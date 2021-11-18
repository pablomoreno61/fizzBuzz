package fizzBuzz

fun mapFizzBuzz() {
    (1..100).map { getMultiples(it) }.forEach { println(it) }
}

private fun getMultiples(it: Int) = when {
    ((it % 3 == 0) && (it % 5 == 0)) -> "FizzBuzz"
    (it % 3 == 0) -> "Fizz"
    (it % 5 == 0) -> "Buzz"
    else -> it
}

fun main() {
    mapFizzBuzz()
}