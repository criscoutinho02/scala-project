import java.util.UUID

enum PrimaryColor:
  case Red , Blue , Green


def idProblematicForColorBlindPeople(color: PrimaryColor): Boolean =
  color match
    case PrimaryColor.Red => true
    case PrimaryColor.Blue => false
    case PrimaryColor.Green => true

PrimaryColor.values

PrimaryColor.valueOf("Green")
PrimaryColor.valueOf("Pink")

sealed trait User
object User:
  case object Guest extends User
  case class Registered(id: UUID) extends User
