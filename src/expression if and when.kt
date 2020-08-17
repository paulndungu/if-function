fun main(){

    var n1=10
    var n2=20
//    THIS IS THE LONG WAY
//    var high:Int?
//    if (n1>=n2){
//        max=n1
//    }else{
//        max=n2
//    }

//    THIS IS THE SHORT WAY
    var high= if (n1>=n2) n1 else n2
    println("Highest number: $high")

    var grade=90
    var A= when(grade){
        in 90..100-> true
        else ->false
    }
    println("Grade= $A")

}