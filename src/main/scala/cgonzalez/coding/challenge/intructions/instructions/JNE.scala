package cgonzalez.coding.challenge.intructions.instructions

import cgonzalez.coding.challenge.intructions.ExecutionInstruction
import cgonzalez.coding.challenge.computer.Registers

/**
 * Created with IntelliJ IDEA.
 * User: cgonzalez
 * Date: 10/30/13
 * Time: 4:47 PM
 * To change this template use File | Settings | File Templates.
 */
case class JNE(offset: Int) extends ExecutionInstruction {
  def process: Unit = {
    if (!Registers.Z)
      Registers.IP = Registers.IP - 1 + offset
  }
}




