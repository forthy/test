package com.example.practice.domain

import com.github.kolotaev.ride.Id

final case class ID(id: Id = Id()) extends AnyVal

object ID {
  def fromString(s: String): ID = ID(Id(s))
}
