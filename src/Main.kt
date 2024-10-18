import java.util.Scanner

fun main() {
 val input= Scanner(System.`in`)
    val myService = MyServiceStudent()

    while (true){
        println("1- Add student 2- show student 3->Attandance 4- Grade of student")
        val n = input.nextInt()
        when(n){
            1->myService.addStudent()
            2->myService.shovStudnets()
            3->myService.attendance()
            4->myService.gradeOfStudent()
            else-> println("Bunday funksiya hali yo'q")


        }

    }

}