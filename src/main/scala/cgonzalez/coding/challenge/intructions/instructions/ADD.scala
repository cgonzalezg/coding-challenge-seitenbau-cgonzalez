package cgonzalez.coding.challenge.intructions.instructions

import cgonzalez.coding.challenge.intructions.RegisterInstruction
import cgonzalez.coding.challenge.computer.{Registers, Register}

/**
 * Created with IntelliJ IDEA.
 * User: cgonzalez
 * Date: 10/30/13
 * Time: 3:32 PM
 * To change this template use File | Settings | File Templates.
 */
case class ADD(registerResult: Char, register1: Char, register2: Char) extends RegisterInstruction {
  def process {
    val reg1 = Registers.registers.get(register1).get.binary
    val reg2 = Registers.registers.get(register2).get.binary
    val result = new Register()
    result.binary = add(reg1, reg2)
    Registers.registers.update(registerResult, result)

  }
}
