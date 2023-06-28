

//MySuite.scala
// java.io.ByteArrayOutputStream - This class implements an output stream in which the data is written into a byte array
import java.io.ByteArrayOutputStream
import java.io.PrintStream
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
