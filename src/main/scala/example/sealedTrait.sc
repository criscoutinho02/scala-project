sealed trait Shape
case class  Rectangle(width: Int , height: Int) extends Shape
case class  Circle(radius: Int) extends Shape

val someShape: Shape = Circle(5)
val someShapeArea = someShape match
  case circle: Circle             => s"This is a circle with radius ${circle.radius}"
  case _                          => "This is not a circle


def area(shape: Shape): Double =
  shape match
    case rectangle: Rectangle => rectangle.width * rectangle.height
    case circle: Circle       => circle.radius * circle.radius * 3.14

def area(shape: Shape): Double =
  shape match
    case Rectangle(w, h) => w * h
    case Circle(r)       => r * r * 3.14


val shape: Circle = Rectangle(5, 4)

