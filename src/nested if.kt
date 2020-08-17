fun main(){

    println("Please enter your exam grade: ")
    val grades= readLine()!!.toDouble()

    if (grades>=90){
        println("you've gotten an A*")
        if (grades>=95){
            println("Good job, a scholarship awaits you.")
        }
    }else if (grades>=80){
        println("you've gotten an A")
    }else if (grades>=70){
        println("you've gotten a B")
    }else if (grades>=60){
        println("you've gotten a C")
    }else if (grades>=50){
        println("you've gotten a D")
    }else if (grades>=40){
        println("you've gotten a E")
    }
    if (grades>=0){
        if (grades<15){
            println("you've gotten a U")
        }
        else{
            println("you've gotten an F")
        }
    }

}