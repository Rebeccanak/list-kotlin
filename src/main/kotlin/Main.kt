fun main() {
println(getStrings(listOf("a","b",",c","d","e","g","h","i","j","k")))
    println(calculateHeight(listOf(10.0,14.0,20.0,12.0,4.0,6.0,18.0)))
    println(crudential())
    val averageMileage = averageMileage(cars)
    println("Average mileage: $averageMileage")



    var books = Book("Noah","Born Crime",288,2016)
    println(books.author)
    println(books.title)
    println( books.pages)
    println(books.publishedyear)

    var word = "Akirachix"
    println(word[2])
    println(word.length)
    val getString = "It's possible"
    println(getString)
    getnumber()
    var hen = Human("name","Female","black",5.5,58,)
    hen.rest()
    hen.identity()

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

class AverageHeight(var avg:Double, var plus:Double)
fun calculateHeight(heights:List<Double>):List<Double>{
    val totalHeight = heights.sum()
    var average = totalHeight/heights.size
var all           =    listOf(totalHeight,average)
    return all



//fun calculateHeight(heights:List<Double>):List<Double>{
//    val totalHeight=heights.sum()
//    var average= totalHeight/heights.size
//    var all= listOf(totalHeight,average)
//    return all
//fun getHeight(height:List<Int>):String{
//    var high = height.average()
//    var n = height.sum()
//    var k = "the avaerage $high and the sum is $n"
//    return k

}
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age

data class Person(var name:String, var age:Int, var height:Float, var weight:Double)

fun crudential(){
//    val child = Person("Becky",20,1.9F,56.0)
//    val woman = Person("Marrion",28,55.8F,56.0)
//    val man = Person("Andrew",30,6.7F,56.0)
//    val boy = Person("Racheal",15,5.2F,56.0)
//    val girl = Person("Peace",19,6.4F,56.0)
//    var allPeople = listOf(child,woman,man,boy,girl)
//    val sortedPeople = allPeople.sortedByDescending { allPeople -> allPeople.age }
//    println(sortedPeople)

}
//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.


//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.

data class Car(var registration:String,var mileage:Double)
fun averageMileage(cars: List<Car>): Double {
    var totalMileage = 0.0
    for (car in cars) {
        totalMileage += car.mileage
    }
    return totalMileage / cars.size }

val cars = listOf(
        Car("ABC123", 2500.0),
        Car("DEF456", 3750.0),
        Car("GHI789", 4000.0)
)

//   fun getCars(list: List<Car>){
//
//
//       var Car = listOf(list)
//       val v = list.
////       val wish = Car("r20",5)
////       val ford = Car("K27",20)
//       val hammer = Car("UK5",15)
//       var allAccounts = listOf(wish,ford,hammer)
//


//Create a function that takes in an a array and find the largest number.
fun getnumber(){
    var name = arrayOf(10,30,50,90)
    println(name.max())
    order()


}
fun order(){
    var names = arrayOf("anitab","adalab","hopperlab","rwanda","kenya","tanzania")
    println(names.map {it.capitalize() }.sorted())
}

//5 Create a function that prints this in grammatical order  var names= array of
//        ("anita"b," adalab", "hopperlab", "rwanda", "kenya", "tanzania"

// create a class called Human with the properties name gender color height and weight. i)
//reate two functions one called rest and the other one identitiy. function rest prints out
// "sleep eight hours and   am female and my name is Phelisia."

class Human(var name:String, var gender:String, var color:String, var height:Double, var weight:Int ){
    fun rest() {
        println(" I sleep eight hours a day")
    }
    fun identity(){
        println("And am $gender and my $name is Phelisia")
    }
}


data class  Book(var author:String, var title:String, var pages:Int, var publishedyear:Int)

//)Create a string variable access the third character  then loop through it and print it in a vertical order.ii)g

//3 Write a function that takes in a parameter,
// if seven it prints out neutral if not prints base otherwise acidic.










