package hello

import org.springframework.transaction.annotation.Transactional

@Transactional
class PersonService {

	Person findByFirstName(String firstName) {
		return Person.findByFirstName(firstName)
	}

	Person addPerson(String firstName, String lastName) {
		return new Person(firstName: firstName, lastName: lastName).save()
	}
}
