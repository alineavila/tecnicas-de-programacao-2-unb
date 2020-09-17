package br.unb.cic.ed

trait List {
  def size(): Int
  def insert(pos: Int, value: Int): Unit
}
