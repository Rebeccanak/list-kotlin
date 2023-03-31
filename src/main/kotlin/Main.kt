fun main() {
println(getStrings(listOf("a","b",",c","d","e","g","h","i","j","k")))
    println(getHeight(listOf(10,14,20,12,4,6,18)))
    println(crudential())

}

//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun getStrings(name:List<String>):List<String>{
  // val even = listOf("a","b",",c","d","e","g","h","i","j","k")
    var filteredList = mutableListOf<String>()
    name.forEachIndexed { index, d ->
        if (index%2==0)
            filteredList.add(d)
    }
    return filteredList

}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height

fun getHeight(height:List<Int>):String{
    var high = height.average()
    var n = height.sum()
    var k = "the avaerage $high and the sum is $n"
    return k
}
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age

data class Person(var name:String, var age:Int, var height:Float, var weight:Double)

fun crudential(){
    val child = Person("Becky",20,1.9F,56.0)
    val woman = Person("Marrion",28,55.8F,56.0)
    val man = Person("Andrew",30,6.7F,56.0)
    val boy = Person("Racheal",15,5.2F,56.0)
    val girl = Person("Peace",19,6.4F,56.0)
    var allPeople = listOf(child,woman,man,boy,girl)
    val sortedPeople = allPeople.sortedByDescending { allPeople -> allPeople.age }
    println(sortedPeople)

}
//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.

//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.

data class Car(var registration:Int,var mileage:Int):Int{
//    fun getCars(list: List<Car>){
//
//    }
//
//}



