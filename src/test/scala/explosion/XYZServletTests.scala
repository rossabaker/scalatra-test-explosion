package explosion

import org.scalatra.test.scalatest._
import org.scalatest.FunSuite

class XYZServletTests extends ScalatraSuite with FunSuite {
  addServlet(classOf[XYZServlet], "/*")

  test("simple get") {
    // this doesn't work yet!
    get("/index.html") {
      status should equal (200)
    }
  }
}
