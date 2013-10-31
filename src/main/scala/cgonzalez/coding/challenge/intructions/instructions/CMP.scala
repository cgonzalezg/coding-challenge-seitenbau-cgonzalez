package cgonzalez.coding.challenge.intructions.instructions

import cgonzalez.coding.challenge.intructions.ExecutionInstruction
import cgonzalez.coding.challenge.computer.Registers

/**
 * Created with IntelliJ IDEA.
 * User: cgonzalez
 * Date: 10/30/13
 * Time: 4:43 PM
 * To change this template use File | Settings | File Templates.
 */
case class CMP(reg: Char, value: Long) extends ExecutionInstruction {
  def process: Unit = {
    Registers.Z = Registers.registers.get(reg).get.getDecimal == (value)
  }
}
