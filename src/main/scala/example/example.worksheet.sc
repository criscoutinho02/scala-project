import com.sun.javafx.geom.Rectangle

def house(facade : Double, window: Double):Double =
  val door = 2*1
  val subtractedArea = door + window * 2
  facade - subtractedArea
end house


case class Rectangle(width: Int  , height: Int):
  val area = width * height

case class Square(sideSize: Double):
  val area = sideSize * sideSize

case class Circus(radius: Double):
  val area = radius * radius * 3.14

val facade = Rectangle(width = 5  , height = 3)
val door = Rectangle(width = 1  , height = 2)
val window = Rectangle(width = 1  , height = 1)


house(facade.area, window.area)
house(4 * 4 , 1.5 * 1)

val square1 = Square(10)
println(square1.area)

val circus1 = Circus(1)
circus1.area

val tenSquared: Int =
  val ten = 10
  ten *ten


def marathonDuration( speed : Double) =
  val distance = 42.195
  val duration = distance / speed
  duration * 60
end marathonDuration

marathonDuration(speed = 12)
marathonDuration(14)

val smallRectangle = Rectangle(3 , 4)
val largeRectangle = smallRectangle.copy(width = smallRectangle.width *2)

