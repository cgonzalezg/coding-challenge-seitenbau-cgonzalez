package cgonzalez.coding.challenge.intructions.instructions

import cgonzalez.coding.challenge.intructions.RegisterInstruction
import cgonzalez.coding.challenge.computer.{RAM_Memory, Registers}

/**
 * Created with IntelliJ IDEA.
 * User: cgonzalez
 * Date: 10/30/13
 * Time: 3:33 PM
 * To change this template use File | Settings | File Templates.
 */
case class SETM(value: Int, registerName: Char) extends RegisterInstruction {
  def process {
    RAM_Memory.setMemory(value, Registers.registers.get(registerName).get.binary)
  }
}
