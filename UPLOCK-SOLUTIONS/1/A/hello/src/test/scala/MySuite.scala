object HelloWorld {
def printHello(): Unit = {
println("Hello, World!")
}
}

//helloTest.scala
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import org.scalatest._

class HelloWorldTest extends FlatSpec with Matchers {

"HelloWorld" should "print 'Hello, World!'" in {
val outputStream = new ByteArrayOutputStream()
Console.withOut(new PrintStream(outputStream)) {
HelloWorld.printHello()
}
val printedOutput = outputStream.toString.trim
printedOutput should be("Hello, World!")
}
}
