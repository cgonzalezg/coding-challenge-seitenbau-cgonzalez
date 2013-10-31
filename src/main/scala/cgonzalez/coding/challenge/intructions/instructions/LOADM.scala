package cgonzalez.coding.challenge.intructions.instructions

import cgonzalez.coding.challenge.intructions.RegisterInstruction
import cgonzalez.coding.challenge.computer.{RAM_Memory, Registers, Register}

/**
 * Created with IntelliJ IDEA.
 * User: cgonzalez
 * Date: 10/30/13
 * Time: 3:33 PM
 * To change this template use File | Settings | File Templates.
 */
case class LOADM(registerName: Char, value: Long) extends RegisterInstruction {
  def process {
    val register = new Register
    register.binary = RAM_Memory.readMemory(value.toInt, 16)
    Registers.registers.put(registerName, register)
  }
}
