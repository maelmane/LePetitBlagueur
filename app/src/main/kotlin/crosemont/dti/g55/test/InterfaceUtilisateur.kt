package crosemont.dti.g55.test

interface InterfaceUtilisateur{

	fun questionner( énoncé : String, réponses : Array<String> ): String
	fun afficher( message : String )
}
