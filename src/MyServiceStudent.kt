import java.util.Scanner

class MyServiceStudent : MyInterface {
    val input = Scanner(System.`in`)
    val jurnal = ArrayList<Student>()


    override fun addStudent() {
        print("Name student")
        val name = input.next()
        print("sourName student")
        val sourName= input.next()
        val student = Student(name,sourName)
        jurnal.add(student)
        println("Saqlandi")

    }

    override fun shovStudnets() {
        if (jurnal.isNotEmpty()){
            for (student in jurnal){
         println(student)
            }
        }else{
            println("Jurnal bo'sh😎😎")


        }
    }

    override fun attendance() {
        if (jurnal.isNotEmpty()) {
            for (i in 0 until jurnal.size){
                println("$i - ${jurnal[i]}")
            }
            print("Kim yo'q")
            val yoqniKirit =input.nextInt()
            jurnal[yoqniKirit].attendance =false
            println("Saqlandi")
        } else {
            println("Jurnal bo'sh😎😎")
        }

    }

    override fun gradeOfStudent() {
        if (jurnal.isNotEmpty()) {
            for (i in 0 until jurnal.size){
                println("$i - ${jurnal[i]}")
            }
            print("Kimga baho qoyamiz ")
            val bahoQoy =input.nextInt()
        print("Bahosi")
            val baho = input.nextDouble()
            jurnal[bahoQoy].grade =baho
            println("Muvoffaqqqiyatli baho qo'yildi")




            println("Saqlandi")
        } else {
            println("Jurnal bo'sh😎😎")
        }

    }


}