package controllers

import java.io.FileNotFoundException

import play.api.mvc._
import play.api.libs.json._
import scala.io.Source

object Diagnostic extends Controller {
  def name: Action[AnyContent] = Action {
    Ok("User Manager Api")
  }

  def ping: Action[AnyContent] = Action {
    Ok("")
  }

  def hello: Action[JsValue] = Action(BodyParsers.parse.json) { request =>
    val name = (request.body \ "name")
    Ok(Json.obj("hello" -> name))
  }

  def version: Action[AnyContent] = Action {
    Ok(buildNumber)
  }

  private def buildNumber: String = {
    try {
      Source.fromFile("build_number").getLines.mkString
    } catch {
      case _: Exception => "unknown"
    }
  }
}
