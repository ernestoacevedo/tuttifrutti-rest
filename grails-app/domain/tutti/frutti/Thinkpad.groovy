package tutti.frutti
import grails.rest.*


@Resource(uri='/thinkpads')
class Thinkpad {

    String model
    String year
    Integer price

    static constraints = {
        model blank:false
        year blank:false
        price blank:false
    }
}
