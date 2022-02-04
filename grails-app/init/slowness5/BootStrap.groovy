package slowness5

class BootStrap {
    PeopleService peopleService

    def init = { servletContext ->

        def p1 = new People(nome:'SDFLKSDJFKL', email:'sldfjksjdfl@gmail.com', phone: "1231231545" )
        peopleService.save(p1)
        def p2 = new People(nome:'SDFLKSDJFKL', email:'sldfjksjdfl@gmail.com', phone: "1231231545" )
        peopleService.save(p2)
        def p3 = new People(nome:'SDFLKSDJFKL', email:'sldfjksjdfl@gmail.com', phone: "1231231545" )
        peopleService.save(p3)
        def p4 = new People(nome:'SDFLKSDJFKL', email:'sldfjksjdfl@gmail.com', phone: "1231231545" )
        peopleService.save(p4)
        def p5 = new People(nome:'SDFLKSDJFKL', email:'sldfjksjdfl@gmail.com', phone: "1231231545" )
        peopleService.save(p5)
    }
    def destroy = {
    }
}
