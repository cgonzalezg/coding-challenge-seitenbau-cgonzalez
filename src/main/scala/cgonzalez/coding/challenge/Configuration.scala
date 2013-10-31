package cgonzalez.coding.challenge

/**
 * Created with IntelliJ IDEA.
 * User: cgonzalez
 * Date: 10/31/13
 * Time: 6:55 PM
 * To change this template use File | Settings | File Templates.
 */

import com.typesafe.config.ConfigFactory

object Configuration {
  private val config = ConfigFactory.load

}

trait Configuration {
  // namespace of the apcConfig => override in your class if needed => defaults to package name of the class
  /**
   * load apc config
   */
  protected lazy val apcConfig = config.getConfig(this.getClass.getPackage.getName)

  def config = Configuration.config

  def instructionsList = config.getStringList("instructions")

}