package slowness5

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import org.grails.datastore.mapping.core.Datastore
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

@Integration
@Rollback
class PeopleServiceSpec extends Specification {

    PeopleService peopleService
    @Autowired Datastore datastore

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new People(...).save(flush: true, failOnError: true)
        //new People(...).save(flush: true, failOnError: true)
        //People people = new People(...).save(flush: true, failOnError: true)
        //new People(...).save(flush: true, failOnError: true)
        //new People(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //people.id
    }

    void cleanup() {
        assert false, "TODO: Provide a cleanup implementation if using MongoDB"
    }

    void "test get"() {
        setupData()

        expect:
        peopleService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<People> peopleList = peopleService.list(max: 2, offset: 2)

        then:
        peopleList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        peopleService.count() == 5
    }

    void "test delete"() {
        Long peopleId = setupData()

        expect:
        peopleService.count() == 5

        when:
        peopleService.delete(peopleId)
        datastore.currentSession.flush()

        then:
        peopleService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        People people = new People()
        peopleService.save(people)

        then:
        people.id != null
    }
}
