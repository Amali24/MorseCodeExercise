/*
A = .-
B = -...
C = -.-.
D = -..
E = .
F = ..-.
G = --.
H = ....
I = ..
J = .---
K = -.-
L = .-..
M = --
N = -.
O = ---
P = .--.
Q = --.-
R = .-.
S = ...
T = -
U = ..-
V = ...-
W = .--
X = -..-
Y = -.--
Z = --..
 */

fun main(args:Array<String>){
    val morseAlphabet = arrayOf(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")
    val encoded = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-." +
            " / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ..." +
            " / - --- -.. .- -.-- "
    var decoded = ""
    var nextLetter = ""

    for (i:Char in encoded){
        when {
            i != ' ' && i != '/' -> nextLetter += i
            i == ' ' -> {
                nextLetter = nextLetter.trim()

                val letterNumber = morseAlphabet.indexOf(nextLetter)
                when (letterNumber) {
                    0 -> decoded += "a"
                    1 -> decoded += "b"
                    2 -> decoded += "c"
                    3 -> decoded += "d"
                    4 -> decoded += "e"
                    5 -> decoded += "f"
                    6 -> decoded += "g"
                    7 -> decoded += "h"
                    8 -> decoded += "i"
                    9 -> decoded += "j"
                    10 -> decoded += "k"
                    11 -> decoded += "l"
                    12 -> decoded += "m"
                    13 -> decoded += "n"
                    14 -> decoded += "o"
                    15 -> decoded += "p"
                    16 -> decoded += "q"
                    17 -> decoded += "r"
                    18 -> decoded += "s"
                    19 -> decoded += "t"
                    20 -> decoded += "u"
                    21 -> decoded += "v"
                    22 -> decoded += "w"
                    23 -> decoded += "x"
                    24 -> decoded += "y"
                    25 -> decoded += "z"
                }
                nextLetter = ""
            }
            i == '/' -> decoded += " "
        }
    }
    print (decoded)
}