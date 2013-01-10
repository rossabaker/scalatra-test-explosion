package explosion

import org.scalatra.test.scalatest._
import org.scalatest.FunSuite
import org.eclipse.jetty.servlet.{ServletHolder, DefaultServlet}

class XYZServletTests extends ScalatraSuite with FunSuite {
  addServlet(classOf[XYZServlet], "/*")
  servletContextHandler.addServlet(new ServletHolder("default", new DefaultServlet), "/")

  test("simple get") {
    // this doesn't work yet!
    get("/index.html") {
      status should equal (200)
    }
  }
}
