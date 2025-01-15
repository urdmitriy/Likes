fun main() {
    val likes: Int = 21
    val lastNumber = likes.toString().last().toString().toInt()
    val human: String = if(lastNumber > 3) {
        "человекам"
    } else if(lastNumber == 2 || lastNumber == 3) {
        "людям"
    } else {
        "человеку"
    }
    println("Понравилось $likes $human")
}