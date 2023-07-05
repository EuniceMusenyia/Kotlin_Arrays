fun main() {
    var friends = arrayOf("Liz","Tina","Susan","Eunice", "eve")
    val numbers= arrayOf(213, 5, 76, 98, 54, 2129)
    println(friends.count())
    println(friends.max())
    println(numbers.sum())
    println(numbers.max())
    println(friends.min())
    friends.forEach { friend -> println(friend) }

    for (friend in friends){
        println(friend)

        var squareOfNumbers= arrayOf(2, 3, 5, 4)
        squareOfNumbers.forEach { squareofnumber -> println(squareofnumber*squareofnumber) }

        println(friends.contentToString())
        println(friends.sortedArray().contentToString())
        println(friends.contentToString())
        println(friends.sort())
        numbers.sort()
        println(numbers.contentToString())
        //sort and sortedArray
    }



}



//fun citiesArray(){
//    var cities = arrayOf("harare", "mumbai", "dodoma","jakarta")
//    cities.forEach {city -> println(city.capitalize())











fun names(){


   var friends = arrayOf("Liz","Tina","Susan","Eunice")
   println(friends.get(2))
    println(friends[2])
    friends.set(3,"Fiona")
    friends[0]= "David"
    println(friends.get(0))
    println(friends.contentToString())
    var friends2023= friends.plus("Brenda")
    val febFriends= arrayOf("Bella","Timothy")
    var newFriends= friends2023.plus(febFriends)
    println(newFriends.contentToString())
    println(friends2023.contentToString())


}








