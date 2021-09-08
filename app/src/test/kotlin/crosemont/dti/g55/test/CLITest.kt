/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package crosemont.dti.g55.test

import kotlin.test.Test
import kotlin.test.assertEquals

import java.util.Scanner
import java.io.PrintStream

import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner
import org.junit.runner.RunWith

@RunWith(MockitoJUnitRunner::class)
class CLITest {

		@Mock
		lateinit var scan : Scanner
		
		@Mock
		lateinit var sortie : PrintStream

		@Test fun `étant donné une question objective, lorsqu'on choisit la première réponse valable, on obtient cette réponse`() {

			Mockito.`when`( scan.nextLine() ).thenReturn( "oui" )

			var cli = CLI( scan )

			var réponse = cli.questionner("test", arrayOf<String>("oui", "non"))
			assertEquals( "oui", réponse )
		}
		
		@Test fun `étant donné une question objective, lorsqu'on choisit la seconde réponse valable, on obtient cette réponse`() {

			Mockito.`when`( scan.nextLine() ).thenReturn( "non" )

			var cli = CLI( scan )

			var réponse = cli.questionner("test", arrayOf<String>("oui", "non"))
			assertEquals( "non", réponse )
		}

		@Test fun `étant donné une question objective, lorsqu'on choisit une réponse non valable puis une valable, on obtient cette réponse`() {

			Mockito.`when`( scan.nextLine() ).thenReturn("tata").thenReturn( "oui" )

			var cli = CLI( scan )

			var réponse = cli.questionner("test", arrayOf<String>("oui", "non"))
			assertEquals( "oui", réponse )
		}

		@Test fun `étant donné un message d'une ligne, lorsqu'on le fait afficher, on obtient le message suivi d'un retour de chariot`(){

			var cli = CLI( scan, sortie )

			var réponse = cli.afficher("test")
			Mockito.verify( sortie ).println("test")

		}
		
}
