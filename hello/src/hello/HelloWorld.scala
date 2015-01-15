package hello
import scala.collection.immutable.HashSet 
import scala.collection.mutable.Map
class a{
  def p(x: Int)=println(x);
}

object HelloWorld {
    def main(args: Array [String]){
      println("Hello, Scala!");
      
     // var n : Boolean = name.exist(_.isUpperCase);
      var t : String = "Test1234";
      val b = t.exists(_.isUpper);
      //while,foreach,for
        var i = 0
        while (i < args.length) {
            if (i != 0)
            print(" ")
            print(args(i))
            i += 1
        }
        println()
        
        args.foreach(println); //args.foreach(i => print(i));
        println();
        
        for(arg <- args) //對args中的arg做println
          println(arg);
        println();
        
        //val array = new Array[String](5);
        //var array = Array("one","two","three");
        val array: Array[String] = new Array[String](5);
        array(0) = "one";
        array(1) = "two";
        array(2) = "three";
        array(3) = "four";
        array(4) = "five";
        for(i <- 0 to 3)
          println(array(i));
        println();
        val one = List(1, 2, 3);
        val two = List(4,5);
        val three = one :: two; //List(List(1, 2, 3), 4, 5) 是左結合，將one插入到two的最前
         
        //List中的Tuple
        val ins = new a();
        ins.p(9);
        val t1 = (1,"one");
        val testList = List(t1,(9,"nine"),(10,"ten"));
        val testList2 = (2,"two")::testList
        testList2.foreach(println)
        testList2.foreach(i => print(i._2+" ")); //印出Tuple中第二個元素
        println();
         

        //Set
        var jetSet = Set("Boeing", "Airbus")
        jetSet += "Lear"
        println(jetSet.contains("QAQ"))// print "false"
        jetSet.foreach(println);
        //Hash Set
        //要先import scala.collection.immutable.HashSet 
        val hSet = HashSet("a","b","c")
        hSet.foreach(op => print(op + " "))
        println();
        
        //Map
        val map = Map[String, Int]();
        map += ("LDA" -> 54);
        map += ("STA" -> 0);
        println(map("LDA"));
        
        val map1 = Map("A" -> 1,"B" ->2,"C"->3);
        println(map1("B"))
        
        
        
        
    }
}