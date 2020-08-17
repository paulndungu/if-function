fun main(){

    println("Gender(Male/Female *and use capital letters*): ")
    var gender= readLine()
    println("Enter the sector(private/public) you work in: ")
    var sector= readLine()

    if (sector=="public" && gender=="FEMALE"){
        println("-------FEMALE IN PUBLIC SECTOR-------")
        println("If you work in the $sector sector, you are allowed to proceed.")
        println("The services provided below are at your disposal:")
        println("Free healthcare, bonus and weekend offs and family planning services.")
        println("Salary rise annualy.")
    }else if (sector=="public" && gender=="MALE"){
        println("-------MALE IN PUBLIC SECTOR-------")
        println("If you work in the $sector sector, you are allowed to proceed.")
        println("Free healthcare, bonus and weekend offs")
        println("Salary rise annualy.")
    }
    if (sector=="private" && gender=="FEMALE"){
        println("-------FEMALE IN PRIVATE SECTOR-------")
        println("If you work in the $sector sector, you are allowed to proceed.")
        println("Ask your managment for the exact benefits they provide and get back to us:")
    }else if(sector=="private" && gender=="MALE"){
        println("-------MALE IN PRIVATE SECTOR-------")
        println("If you work in the $sector sector, you are allowed to proceed.")
        println("Ask your managment for the exact benefits they provide and get back to us:")
    }

    println("Thank you Mr/Ms for your participation")

}