import groovywebhelloworld.SayHello

html.html {
	
	head {
	  title('Groovy Web Hello World')
  }
	
	body { 
	  h1(SayHello.say(params.name))
	 
	  form(action: '.', method: 'GET') {
	 
	   input(type: 'text', name: 'name')
	   input(type: 'submit')
	   
	  }
  }
}
