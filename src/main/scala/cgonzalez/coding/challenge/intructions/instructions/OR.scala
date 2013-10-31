package cgonzalez.coding.challenge.intructions.instructions

import cgonzalez.coding.challenge.intructions.RegisterInstruction
import cgonzalez.coding.challenge.computer.{Registers, Register}

/**
 * Created with IntelliJ IDEA.
 * User: cgonzalez
 * Date: 10/30/13
 * Time: 4:08 PM
 * To change this template use File | Settings | File Templates.
 */
case class OR(register: Char, value: Long) extends RegisterInstruction {
  def process: Unit = {
    val reg = Registers.registers.get(register).get.binary
    val result = new Register()
    result.binary = or(reg, getBinary(value))
    Registers.registers.update(register, result)
  }
}
