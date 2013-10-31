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
class STOP extends Instruction {
  def process: Unit = {
    Registers.stop = true
  }
}
