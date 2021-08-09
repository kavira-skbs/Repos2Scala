//Ceasar Cipher


object CeasarCipher extends App{

	//The alphabet used...
	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"


	//The letters of the input text must be shifted by "shift" number of places to encrypt of decrypt it.
	//shift = (number + 26) % 26
	val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size

	//The input text to be encrypted or decrypted
	val inputText = scala.io.StdIn.readLine("Secret Message: ")

	val outputText = inputText.map( (c: Char) => {

		val x = alphabet.indexOf(c.toUpper)

		if (x == -1){
			c
		}
		else{
			alphabet((x + shift) % alphabet.size)
			}
	});


	println(outputText);
}
