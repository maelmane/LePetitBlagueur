package crosemont.dti.g55.lepetitblagueur

interface InterfaceUtilisateur{

	fun questionner( énoncé : String, réponses : Array<String> ): String
	fun afficher( message : String )
}
