package cgonzalez.coding.challenge.computer

/**
 * Created with IntelliJ IDEA.
 * User: cgonzalez
 * Date: 10/30/13
 * Time: 8:37 AM
 * To change this template use File | Settings | File Templates.
 */
trait BinaryOperations {
  def getDecimal(binary: Array[Char]): Short = {
    val s = if (binary(0) == '1') ("0", "1", -1) else ("1", "0", 1)
    val positive = binary.reverse.foldLeft("")((x, y) => {
      val z = y match {
        case '1' => s._1
        case '0' => s._2
      }
      z + x
    })
    (Integer.parseInt(positive, 2) * s._3).toShort
  }

  def getBinary(value: Long): Array[Char] = {
    if (value > -1)
      Integer.toBinaryString(0x10000 | value.toInt).substring(1).toArray
    else {
      value.toBinaryString.toList.reverse.slice(0, 15).reverse.toArray
    }
  }

  def add(a: Array[Char], b: Array[Char]): Array[Char] = {
    getBinary((getDecimal(a) + getDecimal(b)).toShort)
  }

  def sub(a: Array[Char], b: Array[Char]): Array[Char] = {
    getBinary((getDecimal(a) - getDecimal(b)).toShort)
  }

  def xor(a: Array[Char], b: Array[Char]): Array[Char] = {
    getBinary((getDecimal(a) ^ getDecimal(b)).toShort)
  }

  def or(a: Array[Char], b: Array[Char]): Array[Char] = getBinary((getDecimal(a) | getDecimal(b)).toShort)

  def and(a: Array[Char], b: Array[Char]): Array[Char] = getBinary((getDecimal(a) & getDecimal(b)).toShort)

  def inc(a: Array[Char]): Array[Char] = getBinary((getDecimal(a) + 1).toShort)

  def dec(a: Array[Char]): Array[Char] = getBinary((getDecimal(a) - 1).toShort)
}
