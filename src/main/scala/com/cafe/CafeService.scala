package com.cafe

import com.cafe.model.ItemNotSupportedException
import com.cafe.service.DefaultCafeService

trait CafeService {
  type MenuItem = String
  type Price = Double

  @throws[ItemNotSupportedException]("if any MenuItem is not supported")
  def standardBillFor(items: Seq[MenuItem]): Price

}

object CafeService {
  def apply(): CafeService = new DefaultCafeService
}
