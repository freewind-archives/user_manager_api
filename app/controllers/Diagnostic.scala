package controllers

import play.api.mvc._

object Diagnostic extends Controller {
  def name = Action {
    Ok("User Manager Api")
  }

  def ping = Action {
    Ok("")
  }

}
