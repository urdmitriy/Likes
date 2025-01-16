fun main() {
    val likes: Int = 55

    val human: String = if(likes % 10 == 1) {
        "человеку"
    } else {
        "людям"
    }
    println("Понравилось $likes $human")
}