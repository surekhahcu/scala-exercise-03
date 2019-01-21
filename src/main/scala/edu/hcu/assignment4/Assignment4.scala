package edu.hcu.assignment4


import java.io._

import scala.io.Source

class Assignment4 {
  //1st
  def getLineCountFromFile(filePath: String): Long = {
    val source: Iterator[String] = Source.fromFile(filePath).getLines()
    source.foldLeft(0) { (acc, _) => acc + 1 }

  }

  /*def getLineCountFromFile(filePath:String):Long={
    val s1 = Source.fromFile(filePath).mkString
    val str2 = s1.split("\n")
    str2.size

  }*/

  //2nd
  def getWordCountFromFile(filePath: String): Long = {
    val source: Iterator[String] = Source.fromFile(filePath).getLines()
    source.foldLeft(0) { (acc, line) => acc + (line.split(" ").size) }
  }

  /*
  def getWordCountFromFile(filePath:String):Long={
    val s1 = Source.fromFile(filePath).mkString.split("\\s+")
   // val str2 = s1.split("\\s+")
    s1.size
  }
*/


  //3rd
  def getWordCountFromDir(dir: String): Long = {
    // read a file (scala doc: https://www.scala-lang.org/api/2.12.3/scala/io/Source$.html )
    val files = new File(dir).listFiles.toList
    val words = for {i <- files
                     source: Iterator[String] = Source.fromFile(i.getPath).getLines()
                     sum = source.foldLeft(0) { (acc, line) => acc + (line.split(" ").size) }
    } yield sum
    words.foldLeft(0) { (acc, words) => acc + words }
  }


  //4th
  def writeIntoFile(filePath: String, list: List[String]): Unit = {
    // write a list element into file
    val pw = new PrintWriter(new File(filePath))
    //list.foreach(pw.write)
    pw.write(list(2))
    pw.close
  }
}



