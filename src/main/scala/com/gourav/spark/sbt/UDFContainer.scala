package com.gourav.spark.sbt

import org.apache.spark.sql.functions._

class UDFContainer {

  def addKumarBwName(x: String, y: String): String = {
    if ((x != null && !x.isEmpty()) && (y != null && !y.isEmpty())) {
      x + "Kumar" + y
    } else {
      "name is empty"
    }
  }

  val addKumarBwNameUDF = udf(addKumarBwName _)

}