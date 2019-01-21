package edu.hcu.assignment4

import org.scalatest.FunSuite

class Assignment4Test extends FunSuite {

  val obj = new Assignment4

  test("line count") {
    val result = obj.getLineCountFromFile("/home/surekha/learning-scala/scala-exercise-03/test.txt")
    val expectResult = 4
    assert(result === expectResult)
  }

  test("word count") {
    val result = obj.getWordCountFromFile("/home/surekha/learning-scala/scala-exercise-03/test.txt")
    val expectResult = 44
    assert(result === expectResult)
  }

  test("word count from a directory") {
    val result = obj.getWordCountFromDir("/home/surekha/learning-scala/scala-exercise-01/src/main/scala/edu/hcu/assignment")
    val expectResult = 1615
    assert(result === expectResult)
  }

  test("write in a file") {
    val result = obj.writeIntoFile("/home/surekha/learning-scala/scala-exercise-03/example.txt", List("Hey \t", "Hi\t", "Hello\t", "Hey again"))

  }
}
