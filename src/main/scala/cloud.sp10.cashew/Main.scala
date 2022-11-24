package cloud.sp10.cashew

import org.scalajs.dom
import org.scalajs.dom.document

object Main {
  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    parNode.textContent = text
    targetNode.appendChild(parNode)
  }

  def main(args: Array[String]): Unit = {
      val node = document.getElementById("main-body")
    appendPar(node, "Hello, World!")
  }
}

