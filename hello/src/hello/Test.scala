package hello

object A{
  class A{
    private var sum = 0
        def add(b: Byte) { sum += b }
        def checksum(): Int = ~(sum & 0xFF) + 1
  }
  def main(args:Array[String]){
    val tmp = new A
    tmp.add("A".toByte)
    println(tmp.checksum)
  }
}