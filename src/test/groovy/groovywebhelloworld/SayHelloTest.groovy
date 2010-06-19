package groovywebhelloworld

import org.junit.Assert
import org.junit.Test

class SayHelloTest {
	
	@Test
	void emtpyArgs() {
		
		SayHello sh = new SayHello();
		
		String s = sh.say(null)
		
		Assert.assertEquals "Hola", s
		
	}

}
