// NOTE: has to be this package or otherwise we won't be able to access private[typechecker] methods
package scala.tools.nsc.typechecker

import scala.tools.nsc.Global
import scala.tools.nsc.typechecker.{Analyzer => NscAnalyzer}

trait ParadiseAnalyzer extends NscAnalyzer {
  val global: Global
  import global._

  override def newTyper(context: Context) = new ParadiseTyper(context)
  class ParadiseTyper(context0: Context) extends Typer(context0) {
  }
}