package slowness5

import grails.rest.Resource

//@Resource(uri = "/people")
class People {
    Long id
    String nome
    String email
    String phone

    static constraints = {
    }
}
