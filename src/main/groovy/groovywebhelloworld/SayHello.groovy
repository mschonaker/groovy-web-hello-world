package groovywebhelloworld

class SayHello {

	// A null or empty name gives the plain greeting.
	static String say(String who) {
		who ? "Hola, ${who}!!!" : "Hola"
	}

}
