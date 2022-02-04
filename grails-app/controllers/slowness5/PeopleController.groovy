package slowness5

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.CREATED
import static org.springframework.http.HttpStatus.NOT_FOUND
import static org.springframework.http.HttpStatus.NO_CONTENT
import static org.springframework.http.HttpStatus.OK
import static org.springframework.http.HttpStatus.UNPROCESSABLE_ENTITY

import grails.gorm.transactions.ReadOnly
import grails.gorm.transactions.Transactional

@ReadOnly
class PeopleController {

    PeopleService peopleService

    static responseFormats = ['json', 'xml']
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    private def withExecutionTimeLog(Closure closure) {
        Long start = System.currentTimeMillis()
        def result = closure()
        log.warn "Execution time -> ${System.currentTimeMillis() - start} ms"

        result
    }

    def index(Integer max) {
        withExecutionTimeLog {
            params.max = Math.min(max ?: 10, 100)
            respond peopleService.list(params), model:[peopleCount: peopleService.count()]
        }


    }








}
