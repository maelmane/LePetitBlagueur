package crosemont.dti.g55.lepetitblagueur

import java.util.Scanner
import java.io.PrintStream

class CLI( val flot_entrée : Scanner = Scanner( System.`in` ),
		   val flot_sortie : PrintStream = System.out ) : InterfaceUtilisateur {

	override fun questionner( énoncé : String, réponses : Array<String> ): String {
		val scan = flot_entrée
		var réponseValidée: String? = null

		while( réponseValidée == null ) {
			afficher( énoncé )
			var réponse = scan.nextLine()
			réponseValidée = validerRéponse( réponse, réponses )

			if( réponseValidée == null ) {
				afficher( "«$réponse» n'est pas une réponse comprise." )
			}
		}

		return réponseValidée

	}

	fun validerRéponse( réponse: String, réponses: Array<String> ) : String? {
		var liste_choix_possibles = listOf<String>()
		liste_choix_possibles = réponses.filter { it.startsWith(réponse, true) }

		if (liste_choix_possibles.size == 1) {
			return liste_choix_possibles.first()
		}

		return null
	}

	override fun afficher( message : String ) {
		flot_sortie.println( message )
	}
}
