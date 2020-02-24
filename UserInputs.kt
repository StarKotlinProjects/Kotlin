// This code will take input as a string
/* fun main(args: Array<String>)
{
    print("Enter Your Name: ")
    val name= readLine()      //will take input AS A string
    print(name)
}
 */

//This code will convert it into int
/*
fun main(args: Array<String>)
{
    print("Enter Your Name: ")
    val name= readLine()!!
    var ky=name.toInt()
    val x:Int=15//will take input AS A string
    print(ky+x)
}
 */

//Using Java

import  java.util.Scanner
fun main(args: Array<String>)
{
   val temp=Scanner(System.`in`)
    //print("Enter number: ")
    //var x: Int= temp.nextInt()         //will take int as input
    //print(x)
    // OR
    print("Enter String")
    var x: String=temp.nextLine()          //will take string as input
    print(x)
}
