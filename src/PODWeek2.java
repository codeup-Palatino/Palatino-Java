public class PODWeek2 {


//        MEDIUM JAVA EDABIT 1

//        Functioninator 8000
//        Create a function that takes a single word string and does the following:
//
//        Concatenates inator to the end if the word ends with a consonant otherwise, concatenate -inator instead.
//
//        Adds the word length of the original word to the end, supplied with '000'.
//
//        The examples should make this clear.
//
//                Examples
//        inatorInator("Shrink") ➞ "Shrinkinator 6000"
//
//        inatorInator("Doom") ➞ "Doominator 4000"
//
//        inatorInator("EvilClone") ➞ "EvilClone-inator 9000"
//        Notes
//        N/A

//    public class Challenge {
//        public static String inatorInator(String inv) {
//                String output;
//                String last = inv.substring(inv.length()-1);
//            String vowelString =  "aeiouAEIOU";
//
//                    if(vowelString.contains(last)){
//                        output = inv + "-inator " + inv.length() + "000";
//                 } else {
//                        output = inv + "inator " + inv.length() + "000";
//                 }
//        return output;
//        }
////    }
//    public static void main(String[] anythingIWantTo){
//        System.out.println(inatorInator("Shrink"));
//        System.out.println(inatorInator("Salami"));
//
//    }

//    ~~~~~~ MEDIUM JAVA EDABIT 2~~~~~~~


//    Simulate the Game "Rock, Paper, Scissors"
//    Create a function which simulates the game "rock, paper, scissors". The function takes the input of both players (rock, paper or scissors), first parameter from first player, second from second player. The function returns the result as such:
//
//            "Player 1 wins"
//            "Player 2 wins"
//            "TIE" (if both inputs are the same)
//    The rules of rock, paper, scissors, if not known:
//
//    Both players have to say either "rock", "paper" or "scissors" at the same time.
//    Rock beats scissors, paper beats rock, scissors beat paper.
//            Examples
//    rps("rock", "paper") ➞ "Player 2 wins"
//
//    rps("paper", "rock") ➞ "Player 1 wins"
//
//    rps("paper", "scissors") ➞ "Player 2 wins"
//
//    rps("scissors", "scissors") ➞ "TIE"
//
//    rps("scissors", "paper") ➞ "Player 1 wins"
//    Notes
//    There are several ways to solve this challenge.

//    public static String rps(String s1, String s2) {
//        if (s1.equals(s2)) {
//            return "TIE";
//        } else if ((s1.equals("rock") && s2.equals("scissors")) || (s1.equals("paper") && s2.equals("rock")) || (s1.equals(
//                "scissors") && s2.equals("paper"))) {
//            return "Player 1 wins";
//        } else {
//            return "Player 2 wins";
//        }
//    }




//    Backspace Attack
//    Suppose a hash # represents the backspace key being pressed. Write a function that transforms a string containing # into a string without any #.
//
//    Examples
//    erase("he##l#hel#llo") ➞ "hello"
//
//    erase("major# spar##ks") ➞ "majo spks"
//
//    erase("si###t boy") ➞ "t boy"
//
//    erase("####") ➞ ""
//    Notes
//    In addition to characters, backspaces can also remove whitespaces.
//    If the number of hashes exceeds the previous characters, remove those previous characters entirely (see example #3).
//    If there only exist backspaces, return an empty string (see example #4).


//    public static String erase(String str) {
//            String str2 = "";
//            for(int i = 0; i < str.length(); i++){
//                if (str.charAt(i) == '#'){
//                    if(str2.length() != 0){
//                       str2 = str2.substring(0, str2.length()-1);
//                    }
//                } else {
//                    str2 = str2 + str.charAt(i);
//                }
//            }
//            return str2;
//    }
//
//    public static void main(String[] args){
//        System.out.println(erase("####"));
//        System.out.println(erase("Tee#st ii#n"));
//    }


}

