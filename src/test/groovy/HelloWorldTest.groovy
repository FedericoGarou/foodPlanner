import spock.lang.Specification

class HelloWorldTest extends Specification{

    def "testHelloWorld"(){
        given: "Un hello world"
            HelloWorld hw = new HelloWorld()
        when: "Saluda"
            String saludo = hw.saludar()
        then: "El saludo es 'helloWorld'"
            saludo == "HelloWorld"
    }

}
