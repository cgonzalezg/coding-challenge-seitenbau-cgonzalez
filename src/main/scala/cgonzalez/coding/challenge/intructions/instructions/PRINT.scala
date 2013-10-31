package cgonzalez.coding.challenge.intructions.instructions

import cgonzalez.coding.challenge.intructions.Instruction
import cgonzalez.coding.challenge.computer.Registers

/**
 * Created with IntelliJ IDEA.
 * User: cgonzalez
 * Date: 10/30/13
 * Time: 4:51 PM
 * To change this template use File | Settings | File Templates.
 */
case class PRINT(reg: Char) extends Instruction {
  def process: Unit = {
    print(Registers.registers.get(reg).get.getDecimal)
  }
}
