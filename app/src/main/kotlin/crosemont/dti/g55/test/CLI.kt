package crosemont.dti.g55.test

import java.util.Scanner

class CLI : InterfaceUtilisateur {
	override fun questionner( énoncé : String, réponses : Array<String> ): String{
		val scan = Scanner(System.`in`)
		afficher( énoncé )

		var réponse = scan.nextLine()
		while( !(réponse in réponses )){
			afficher( "«$réponse» n'est pas une réponse comprise." )
			afficher( énoncé )

			réponse = scan.nextLine()
		}

		return réponse
	}
	
	override fun afficher( message : String ){
		println( message )
	}
}
