package com.cafe.service

import com.cafe.{ CafeService, model }
import com.cafe.model.MenuItem

private[cafe] class DefaultCafeService extends CafeService {

  override def standardBillFor(items: Seq[MenuItem]) = {
    toModel(items).view.map(_.price).sum
  }

  private def toModel(items: Seq[MenuItem]): Seq[model.MenuItem] = items.map(name => MenuItem(name))

}
