package cgonzalez.coding.challenge.intructions.instructions

import cgonzalez.coding.challenge.intructions.RegisterInstruction
import cgonzalez.coding.challenge.computer.{Registers, Register}

/**
 * Created with IntelliJ IDEA.
 * User: cgonzalez
 * Date: 10/30/13
 * Time: 3:33 PM
 * To change this template use File | Settings | File Templates.
 */
case class LOAD(registerName: Char, value: Long) extends RegisterInstruction {
  def process {
    val register = new Register().setBinary(value.toShort)
    Registers.registers.put(registerName, register)
  }
}
