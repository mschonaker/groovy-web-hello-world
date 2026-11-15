import groovywebhelloworld.SayHello

// GroovyServlet runs this file on each request. The html builder writes the response.
html.html {

	head {
		meta(charset: 'UTF-8')
		title('Groovy Web Hello World')
	}

	body {
		// params is the query string, so ?name=Ana greets Ana.
		h1(SayHello.say(params.name))

		form(action: '.', method: 'GET') {
			input(type: 'text', name: 'name')
			input(type: 'submit')
		}
	}
}
