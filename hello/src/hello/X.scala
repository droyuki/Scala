package hello

//different between class and object
/*class is a definition, a description.
  It defines a type in terms of methods and composition of other types*/
class X {
  // Prefix to call
  def m(x: Int) = X.f(x)
  def p(x: Int) = print(x);
  // Import and use
  import X._
  def n(x: Int) = f(x)
  
}

/*An object is a singleton -- an instance of a class which is guaranteed to be unique*/
object X {
  def f(x: Int) = x * x;
  def main(args: Array[String]){
    val insX = new X();
    insX.p(5);
  }
}

