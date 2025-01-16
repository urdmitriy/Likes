fun main() {
    val likes: Int = 21

    val human: String = if(likes % 10 == 1 && likes % 100 != 11) {
        "человеку"
    } else {
        "людям"
    }
    println("Понравилось $likes $human")
}