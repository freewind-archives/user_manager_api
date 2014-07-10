package controllers

import play.api.mvc._
import play.api.libs.json._

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

}
