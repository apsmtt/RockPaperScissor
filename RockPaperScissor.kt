import kotlin.random.Random

class RockPaperScissor {
    private val rules = listOf("Rock", "Paper", "Scissor")
    private val randomChoice = rules[Random.nextInt(rules.size)]

    fun playGame(){
        println("Rock Paper Scissor? Q to quit")
        var userChoice = readln().replaceFirstChar { it.uppercase() }
        while(true){
            if(userChoice == "Q" || userChoice == "q"){
                break
            }

            if(userChoice == "Rock"){
                when(randomChoice){
                    "Rock" -> {
                        println("You choice $userChoice")
                        println("Computer choice $randomChoice")
                        println("The result is Draw!")
                    }

                    "Paper" -> {
                        println("You choice $userChoice")
                        println("Computer choice $randomChoice")
                        println("Computer win!")
                    }
                    else -> {
                        println("You choice $userChoice")
                        println("Computer choice $randomChoice")
                        println("User win!")
                    }
                }
            }

            else if(userChoice == "Paper"){
                when(randomChoice){
                    "Paper" -> {
                        println("You choice $userChoice")
                        println("Computer choice $randomChoice")
                        println("Draw")
                    }
                    "Scissor" -> {
                        println("You choice $userChoice")
                        println("Computer choice $randomChoice")
                        println("Computer win!")
                    }
                    else -> {
                        println("You choice $userChoice")
                        println("Computer choice $randomChoice")
                        println("User Win!")
                    }
                }
            }

            else if(userChoice == "Scissor"){
                when(randomChoice){
                    "Scissor" -> {
                        println("You choice $userChoice")
                        println("Computer choice $randomChoice")
                        println("Draw")
                    }
                    "Rock" -> {
                        println("You choice $userChoice")
                        println("Computer choice $randomChoice")
                        println("Computer win!")
                    }
                    else -> {
                        println("You choice $userChoice")
                        println("Computer choice $randomChoice")
                        println("You win!")
                    }
                }
            }
            println("Rock Paper Scissor? Q to quit")
            userChoice = readln().replaceFirstChar { it.uppercase() }
        }
    }
}