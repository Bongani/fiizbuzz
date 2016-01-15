package main

import scala.io.Source
import scala.collection.mutable.ListBuffer

/**
  * Created by bongani on 2016/01/15.
  */
object app {

  def main(args: Array[String]) {
    val filename = args(0)
    var count = 0
    for (line <- Source.fromFile(filename).getLines()) {
      if (count > 0){
        println()
      }
      val lineSplit = line.split(" ")
      var results = new ListBuffer[String]()
      for (x <- 1 to lineSplit(2).toInt) {
        results += fizzBuzz(lineSplit(0).toInt, lineSplit(1).toInt, x)
      }
      print(results.mkString(" "))
      count += 1
    }

  }

  def fizzBuzz(dividerA:Int, dividerB:Int, value:Int) : String = {
    if (value % dividerA == 0 && value % dividerB == 0)
      return "FizzBuzz"
    else if (value % dividerA == 0)
      return "Fizz"
    else if (value % dividerB == 0)
      return "Buzz"
    else
      return value.toString
  }

}
