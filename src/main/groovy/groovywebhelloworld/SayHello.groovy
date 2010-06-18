package groovywebhelloworld

class SayHello {
	
	static say(who) {
		who ? "Hola, ${who}!!!" : "Hola"
	}
	
}
