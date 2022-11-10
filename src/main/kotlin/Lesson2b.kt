import java.util.Scanner
fun main(){
// write a kotlin program to request weight and height from the user then calculates the BMI
    var input = Scanner(System.`in`)
    println("enter weight : ")
    var weight:Int = input.nextInt()

    println("enter height : ")
    var height = input.nextFloat()

    var bmi = weight / (height * height)
    println(" BMI is $bmi")


}

