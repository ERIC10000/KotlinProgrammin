
import java.util.Scanner
fun main(){
    // Getting string input

    println("Enter Car Name: ")
    var carName  = readLine().toString()
//    var count = 0
//    count = count + 1
//
//
//    // Hey name the sum is sum
//    var name = "Modcom"
//    var number1 = 100
//    var number2 = 500
//
//    var sum = number1 + number2
//    println("Hey $name The sum is $sum") // concatenation
//    println(" Hey $name the sum is $sum") // templateling/formatting


    var input = Scanner(System.`in`)
    println("Enter Principle : ")

    var principal = input.nextInt()

    println("Enter the Rate : ")
    var rate = input.nextDouble()

    println("Enter Duration : ")
    var time = input.nextInt()

    var interest = (principal * rate * time)/100
    println(" Your interest is $interest")
}




// principal
// rate
// time

// interest = (principal * rate * time)/100
