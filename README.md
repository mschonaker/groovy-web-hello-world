# Groovy Web Hello World

A hello world web application written in Groovy in June 2010. It was an experiment
with pure Groovy site generation: the page is a `.groovy` file that the server
compiles and runs on each request. No JSP, no template engine, no view layer.

The stack is modernized. The idea is the same.

## How it works

1. `WEB-INF/web.xml` maps `*.groovy` to `groovy.servlet.GroovyServlet`.
2. A request for `/` resolves to `index.groovy` through the welcome file list.
3. `GroovyServlet` compiles `index.groovy` and runs it with a `MarkupBuilder` in the binding.
4. The closure syntax writes the HTML: `html { body { h1('...') } }`.
5. The heading comes from `SayHello.say(params.name)`.

## Requirements

- JDK 17 or newer
- Maven 3.9 or newer

## Run

```bash
mvn jetty:run
```

Then open <http://localhost:8080/>.

## Test

```bash
mvn test
```

## Layout

```text
src/main/groovy/groovywebhelloworld/SayHello.groovy      greeting
src/main/webapp/index.groovy                             the page
src/main/webapp/WEB-INF/web.xml                          servlet mapping
src/test/groovy/groovywebhelloworld/SayHelloTest.groovy  JUnit 5 tests
pom.xml                                                  WAR build
```

## Notes

- The `html` builder escapes the text, so a name with markup is shown, not executed.
- Not maintained. It is here as a record of what server-side Groovy looked like
  at the time, with a build that still runs.
