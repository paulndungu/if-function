fun main(){

    println("Gender(Male/Female *and use capital letters*): ")
    var gender= readLine()
    println("Enter the sector(private/public) you work in: ")
    var sector= readLine()

    if (sector=="public" && gender=="FEMALE"){
//        here's where the block of code supporting the above requirements are written
        println("If you work in the $sector sector, you are allowed to proceed.")
        println("The services provided below are at your disposal:")
        println("Free healthcare, bonus and weekend offs and family planning services.")
    }
    if (sector=="private" && gender=="FEMALE"){
        println("If you work in the $sector sector, you are allowed to proceed.")
        println("Ask your managment for the exact benefits they provide and get back to us:")
    }

    println("Thank you Mr/Ms for your participation")

}