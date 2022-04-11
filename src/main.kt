fun main(){
    var smd = Person("Jacinta",23,4.64F,23.87)
    var smd2 = Person("Witch",34,34.4F,23.99)
    var smd3 = Person("Zipporah",34,23.4F,23.90)
    var watu = listOf(smd,smd2,smd3)
    var sort = watu.sortedByDescending { s->s.age
//        val age
      //  println(age)
    }
    println(sort)
    //var watu = mutableListOf(smd,smd2,smd3)
  //  talk(girls = )
//    var girls = (Person("Pascaline",19,3.4F,45.65))
//    var pink = mutableListOf<String>()
   talk(watu)
//      var girls = mutableListOf(smd4,smd5
//       var new = watu.plus(girls)



}

data class Person(var name:String,var age:Int,var height:Float,var weight:Double)


fun talk(old:List<Person>){
//    var girls = mutableListOf<String>()
    var smd4 = Person("Cudra",12,45.54F,34.97)
    var smd5 = Person("Liz",34,45.6F,34.09)
    var girls = mutableListOf(smd4,smd5)
    var tot = old.plus(girls)
    println(tot)

}
data class  Car(var registeration:String,var mileage:Double)
fun  somebody (my:List<Car>){ // the function only takes in the classs to make an object but does not let function be part of class.
    var toyota = Car("ASD124",23.78)
    var you = Car("KJT456",34.00)//noticed my added objects are in function,NB,for you to make an aded list ,make it mutable.Data class no callib
    var start = 0.00 // we had to loop through to accesss each item,to find the total.
    my.forEach { rt->rt.mileage //because we want to access and work with the double value not whole class.
      start+=rt.mileage
    }
    var aver = start/my.count()//average which in turm will take total divide by (add the number of elements)

     


}


