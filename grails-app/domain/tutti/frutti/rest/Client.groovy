package tutti.frutti.rest

import grails.rest.*

@Resource(uri='/clients', formats=['json', 'xml'])
class Client {

    String username
    String password

    static constraints = {
        username blank:false
        password blank:false
    }
}
