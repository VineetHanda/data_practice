package com.data.practice

class TDDPracticeScalaApp {

  def checkNumberInRange(num: Option[Int]): Option[Boolean] = {
    val result = num match {
      case Some(num) =>
        if (num >= 0 && num <= 10) true else false
      case None => false
      case _ => false
    }
    Option(result)
  }

}
