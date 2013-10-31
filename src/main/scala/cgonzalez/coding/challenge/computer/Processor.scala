package cgonzalez.coding.challenge.computer

import cgonzalez.coding.challenge.intructions.instructions._
import cgonzalez.coding.challenge.intructions._

/**
 * Created with IntelliJ IDEA.
 * User: cgonzalez
 * Date: 10/30/13
 * Time: 4:52 PM
 * To change this template use File | Settings | File Templates.
 */
object Processor {
  def apply(instruction: String): Instruction = {
    val tokenizer = instruction.split(Array(' ', ',')).toList.filterNot(_ == "").toArray
    tokenizer.head match {
      case "ADD" => ADD(tokenizer(1).charAt(0), tokenizer(2).charAt(0), tokenizer(3).charAt(0))
      case "SUB" => SUB(tokenizer(1).charAt(0), tokenizer(2).charAt(0), tokenizer(3).charAt(0))
      case "AND" => AND(tokenizer(1).charAt(0), tokenizer(2).toLong)
      case "CMP" => CMP(tokenizer(1).charAt(0), tokenizer(2).toLong)
      case "LOAD" => LOAD(tokenizer(1).charAt(0), tokenizer(2).toLong)
      case "LOADM" => LOADM(tokenizer(1).charAt(0), tokenizer(2).toLong)
      case "XOR" => XOR(tokenizer(1).charAt(0), tokenizer(2).toLong)
      case "OR" => OR(tokenizer(1).charAt(0), tokenizer(2).toInt)
      case "SETM" => SETM(tokenizer(1).toInt, tokenizer(2).charAt(0))
      case "DEC" => DEC(tokenizer(1).charAt(0))
      case "INC" => INC(tokenizer(1).charAt(0))
      case "JNE" => JNE(tokenizer(1).toInt)
      case "PRINT" => PRINT(tokenizer(1).charAt(0))
      case "STOP" => new STOP
      case _ => new Instruction {
        def process: Unit = {
          println("Instruction not supported please visit " +
            "http://seitenbau.github.io/coding-challenge/ for more information")
        }
      }
    }
  }
}