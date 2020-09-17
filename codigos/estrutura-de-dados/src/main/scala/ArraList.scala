package br.unb.cic.ed
class ArrayList extends List {
  val elements = new Array[Int](10)
  var total = 0

  def size(): Int = total 
  def insert(pos: Int, value: Int): Unit = {
    if(pos >= 0 && pos <= total) {
      elements(pos) = value
      total = total + 1
    }

  }
}


