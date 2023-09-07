/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package crosemont.dti.g55.lepetitblagueur

class App(val iu: InterfaceUtilisateur){
	fun démarrer(){
		val réponse = iu.questionner("Voulez-vous entendre une blague?", arrayOf<String>("oui", "non", "ou", "n", "no"))

		if (réponse.take(2) == "ou"){
			iu.afficher("""
Madeleine interpelle son mari :

- Je descends chez la voisine lui emprunter un peu de farine…
J’en ai pour cinq minutes !

- D’accord, chérie ! répond le mari.

- En attendant, sois gentil d’arroser le gigot toutes les demi-heures…
""")
		}
		else{
			iu.afficher("Tant pis, elle était vraiment bonne. Au revoir.")
		}
	}
}

fun main() {
    App( CLI() ).démarrer()
}
