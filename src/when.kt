fun main(){

    var n= 50

     when(n) {
         50-> {
             println("value is 50")
         }
         2-> println("value is 20")
         3-> println("value is 30")
         4-> println("value is 40")
         6-> println("value is 136")
         else-> {
             print("Number doesn't fit the criteria")
         }
     }

    var n1=20

    when(n1) {
        10,20 ->{
            println("number is 10 or 20")
        }
        in 1..30-> ("number is between 10 and 30")
        else-> {
            print("Number doesn't fit the criteria")
        }
    }

}