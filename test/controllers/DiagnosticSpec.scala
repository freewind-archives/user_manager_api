package controllers

import org.junit.runner._
import org.specs2.mutable._
import org.specs2.runner._
import play.api.test._
import play.api.test.Helpers._

@RunWith(classOf[JUnitRunner])
class DiagnosticSpec  extends Specification {
  "Diagnostic" should {
    "response app name" in new WithApplication() {
      val response = route(FakeRequest(GET, "/diagnostic/name")).get
      status(response) must equalTo(OK)
      contentType(response) must beSome.which(_ == "text/plain")
      contentAsString(response) must contain ("User Manager Api")
    }

    "return OK when ping" in new WithApplication{
      val ping = route(FakeRequest(GET, "/diagnostic/ping")).get

      status(ping) must equalTo(OK)
    }
  }

}
