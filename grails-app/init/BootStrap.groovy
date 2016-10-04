import tutti.frutti.rest.Client

class BootStrap {

    def init = { servletContext ->
        new Client(username:"eacevedo", password:"qwerty").save()
        new Client(username:"cjorquera", password:"qwerty").save()
    }

    def destroy = {
    }

}
