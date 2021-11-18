package fizzBuzz

fun whenFizzBuzz() {
    repeat(100) {
        val s = when {
            ((it % 3 == 0) && (it % 5 == 0)) -> "FizzBuzz"
            (it % 3 == 0) -> "Fizz"
            (it % 5 == 0) -> "Buzz"
            else -> it
        }
        println(s)
    }
}

fun main() {
    whenFizzBuzz()
}