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
case class SUB(registerResult: Char, register1: Char, register2: Char) extends RegisterInstruction {
  def process {
    val reg1 = Registers.registers.get(register1).get
    val reg2 = Registers.registers.get(register2).get
    //    val as = reg1.binary ^ reg2.binary
    //    as

    val result = new Register().setBinary((reg1.getDecimal - reg2.getDecimal).toShort)
    Registers.registers.put(registerResult, result)

  }
}
