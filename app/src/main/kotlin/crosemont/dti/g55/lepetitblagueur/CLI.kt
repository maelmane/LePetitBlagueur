package crosemont.dti.g55.lepetitblagueur

import java.util.Scanner
import java.io.PrintStream

class CLI(val flot_entrée : Scanner = Scanner(System.`in`), val flot_sortie : PrintStream = System.out ) : InterfaceUtilisateur {
	override fun questionner( énoncé : String, réponses : Array<String> ): String{
		val scan = flot_entrée
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
		flot_sortie.println( message )
	}
}
