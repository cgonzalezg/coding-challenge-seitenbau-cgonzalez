package cgonzalez.coding.challenge

import cgonzalez.coding.challenge.computer.{Registers, Processor}
import scala.collection.JavaConversions._

/**
 * Created with IntelliJ IDEA.
 * User: cgonzalez
 * Date: 10/31/13
 * Time: 6:40 PM
 * To change this template use File | Settings | File Templates.
 */
object Application extends App with Configuration {

  while (!Processor(instructionsList(Registers.IP)).execute) {
  }
}