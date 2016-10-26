import tutti.frutti.Thinkpad

class BootStrap {

    def init = { servletContext ->
        if (!Thinkpad.count()) {
            new Thinkpad(model:"t430", year:2015, price:254333).save(failOnError: true)
            new Thinkpad(model:"t440p", year:2015, price:254333).save(failOnError: true)
            new Thinkpad(model:"t440s", year:2015, price:254333).save(failOnError: true)
            new Thinkpad(model:"t450", year:2015, price:254333).save(failOnError: true)
            new Thinkpad(model:"x1", year:2015, price:254333).save(failOnError: true)
        }
    }
    def destroy = {
    }
}
