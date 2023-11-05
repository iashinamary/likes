fun main() {
    val likes = 311
    val lastDigit = likes % 10

    if (likes % 100 == 11){
        println("Нравится " + likes + " людям")
    } else if (lastDigit.equals(1)){
        println("Нравится " + likes + " человеку")
    } else {
        println("Нравится " + likes + " людям")
    }


}