package cgonzalez.coding.challenge.intructions.instructions

import cgonzalez.coding.challenge.computer.{Registers, Register}
import cgonzalez.coding.challenge.intructions.Instruction

/**
 * class that represent the AND instruction
 * reg <- reg & value ; IP+=1 ; Z=0;
 * @param register Char
 * @param value Long
 */
case class AND(register: Char, value: Long) extends Instruction {
  def process: Unit = {
    val reg = Registers.registers.get(register).get.binary
    val result = new Register()
    result.binary = and(reg, getBinary(value))
    Registers.registers.update(register, result)
  }
}
