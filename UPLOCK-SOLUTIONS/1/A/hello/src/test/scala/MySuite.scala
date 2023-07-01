

//MySuite.scala
// java.io.ByteArrayOutputStream - This class implements an output stream in which the data is written into a byte array(buffer)
import java.io.ByteArrayOutputStream
// java.io.PrintStream - adds functionality
import java.io.PrintStream
// org.scalatest - This is the package name where ScalaTest is located. ScalaTest is a popular testing framework for Scala.
// funsuite
// anyFunSuite
import org.scalatest.funsuite.AnyFunSuite

class HelloWorldTest extends AnyFunSuite {
  test ("hello") {
   val outputStream = new ByteArrayOutputStream()
   Console.withOut(new PrintStream(outputStream)) {
    //this part is importan! I dont know if hello can be used here 
    hello()
   }
   val printedOutput = outputStream.toString.trim
   assert(printedOutput === "Hello, World!"))
  }
}
