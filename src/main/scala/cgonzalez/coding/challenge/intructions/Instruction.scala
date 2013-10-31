package cgonzalez.coding.challenge.intructions

import cgonzalez.coding.challenge.computer.{Registers, BinaryOperations}

/**
 * Created with IntelliJ IDEA.
 * User: cesar
 * Date: 10/28/13
 * Time: 6:31 PM
 * To change this template use File | Settings | File Templates.
 */
trait Instruction extends BinaryOperations {
  // val NAME: String

  def process

  def execute: Boolean = {
    process

//    Registers.IP match {
//      case -1 => true
//      case _ => Registers.increaseIp; false
//    }
    Registers.increaseIp
    Registers.stop
  }

}






