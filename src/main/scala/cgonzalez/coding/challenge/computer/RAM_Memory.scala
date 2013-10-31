package cgonzalez.coding.challenge.computer

import scala.collection.mutable

/**
 * Created with IntelliJ IDEA.
 * User: cesar
 * Date: 10/28/13
 * Time: 6:42 PM
 * To change this template use File | Settings | File Templates.
 */
class Register() extends BinaryOperations {
  var binary = Array[Char]()

  def setBinary(value: Short) = {
    binary = getBinary(value)

    this

  }

  def getDecimal: Short = getDecimal(binary)
}

object Registers {
  var registers = mutable.HashMap(
    'A' -> new Register().setBinary(0),
    'B' -> new Register().setBinary(0),
    'C' -> new Register().setBinary(0)
  )
  var Z: Boolean = false
  var IP: Int = 0
  def increaseIp = {
    IP = IP +1
  }

}

object RAM_Memory {
  var memory: Array[Char] = (0 to 255).map(x => '0').toArray

  def setMemory(offset: Int, value: Array[Char]) = {
    for (index <- 0 to value.size - 1) {

      memory(index) = value(index)
    }
  }

  def readMemory(offset: Int, size: Int): Array[Char] = {
    (offset to offset + size - 1).map(index => memory(index)).toArray

  }
}
