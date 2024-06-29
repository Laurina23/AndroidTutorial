abstract class Shape {
    abstract fun area(): Double
}
class Rectangle(val length: Double, val breadth: Double) : Shape() {
    override fun area(): Double {
        return length * breadth
    }
        fun perimeter(): Double {
        	return 2 * (length + breadth)
        }
}
class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
    fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}
fun main() {
    val shapes: Array<Shape> = arrayOf(
        Rectangle(5.0, 2.0),
        Circle(1.2)
    )
    
    for (shape in shapes) {
        println("Area: ${shape.area()}")
        when (shape) {
            is Rectangle -> println("Perimeter: ${shape.perimeter()}")
            is Circle -> println("Perimeter: ${shape.perimeter()}")
        }
    }
}

