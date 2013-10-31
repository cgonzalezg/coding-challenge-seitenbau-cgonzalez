package cgonzalez.coding.challenge.intructions.instructions

import cgonzalez.coding.challenge.intructions.RegisterInstruction
import cgonzalez.coding.challenge.computer.{Registers, Register}

/**
 * Created with IntelliJ IDEA.
 * User: cgonzalez
 * Date: 10/30/13
 * Time: 3:50 PM
 * To change this template use File | Settings | File Templates.
 */
case class INC(register: Char) extends RegisterInstruction {
  def process: Unit = {
    val reg = Registers.registers.get(register).get.binary
    val result = new Register()
    result.binary = inc(reg)
    Registers.registers.update(register, result)
  }
}
