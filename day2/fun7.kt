interface Drawable {
    fun drawInfo(): String
}
class Square : Drawable {
    override fun drawInfo(): String {
        return "I am drawing a square."
    }
}
class Triangle : Drawable {
    override fun drawInfo(): String {
        return "I am drawing a triangle."
    }
}
fun main() {
    val squareShape = Square()
    val triangleShape = Triangle()
    println(squareShape.drawInfo())
    println(triangleShape.drawInfo())
}

