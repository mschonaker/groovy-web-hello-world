package groovywebhelloworld

import groovy.xml.MarkupBuilder
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.assertEquals

class SayHelloTest {

	@Test
	void greetsWithoutName() {
		assertEquals 'Hola', SayHello.say(null)
	}

	@Test
	void greetsWithName() {
		assertEquals 'Hola, Ana!!!', SayHello.say('Ana')
	}

	@Test
	void escapesMarkupInThePage() {
		def page = new StringWriter()
		new MarkupBuilder(page).h1(SayHello.say('<b>'))
		assertEquals '<h1>Hola, &lt;b&gt;!!!</h1>', page.toString()
	}

}
