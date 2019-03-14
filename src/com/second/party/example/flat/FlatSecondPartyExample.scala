package com.second.party.example.flat

import com.second.party.example.proto.api.Identifiable

object FlatSecondPartyExample extends App {
  // Initial commit
  println("I'm a second party example...")
  // Commit #2
  println("My lib name is 2nd_party_example_8af7967a")
  // Commit #3
  println("another change")

  Identifiable(id = "1", name = "name")

  def aMethod(p: String): Unit = {}
}
