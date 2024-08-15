fun main() {
    var numberOne = 994678474






    val startTime = System.nanoTime()

    println("number $numberOne:")

    if(isPerfectNumber(numberOne)){
        println("The number is perfect")
    }else{
        println("The number not is perfect")
    }

    val endTime = System.nanoTime()


    val duration = endTime - startTime

    println("tha duration is the $duration ms")
}


fun isPerfectNumber(number: Int): Boolean {
    if (number <= 1) return false
    var sum = 0
    for (i in 1 until number) {
        if (number % i == 0) {
            sum += i
        }
    }
    return sum == number


}