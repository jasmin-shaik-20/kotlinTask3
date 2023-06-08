sealed class Shape
{
    class Circle(var radius:Float):Shape()
    class Square(var side:Int):Shape()
    class Rectangle(var len:Int,var width:Int):Shape()
}



fun main()
{
    var circle=Shape.Circle(4.0f)
    var square=Shape.Square(4)
    var rectangle=Shape.Rectangle(3,2)
    area(circle)

}

fun area(shape:Shape)
{
    when(shape)
    {
        is Shape.Circle->println("${3.14*shape.radius*shape.radius}")
        is Shape.Square->println("${shape.side*shape.side}")
        is Shape.Rectangle->println("${shape.len*shape.width}")
    }
}
