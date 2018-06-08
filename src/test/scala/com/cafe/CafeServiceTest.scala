package com.cafe

import com.cafe.model.ItemNotSupportedException
import org.scalatest.{ Matchers, WordSpec }

class CafeServiceTest extends WordSpec with Matchers {
  private val cafeService = CafeService()

  "standard bill" should {

    "return 3.5 for input item list: [Cole, Coffee, Cheese Sandwich]" in {
      cafeService.standardBillFor(Seq("Cola", "Coffee", "Cheese Sandwich")) shouldBe 3.5
    }

    "return 0 for empty input list" in {
      cafeService.standardBillFor(Seq()) shouldBe 0
    }

    "throw an exception on items not in found the menu" in {
      a[ItemNotSupportedException] should be thrownBy {
        cafeService.standardBillFor(Seq("Not existing item"))
      }
    }

  }



}