package pl.sda.bibliotekaonline

import pl.sda.bibliotekaonline.domain.BookService
import pl.sda.bibliotekaonline.infrastructure.dto.BookDto
import pl.sda.bibliotekaonline.infrastructure.entity.Book
import pl.sda.bibliotekaonline.infrastructure.repository.BookRepository
import spock.lang.Specification
import spock.lang.Subject

/**
 * Created by A.Wójcik on 30.06.2019.
 */
class BooksServiceSpec extends Specification {

    def repository = Mock(BookRepository)

    @Subject
    def sut = new BookService(repository)

    def 'should create new doctor'() {
        given:
        def dto = BookDto.builder()
                .title("10 murzynków")
                .author("Agatha Christie")
                .category("Kryminał")
                .build()
        when:
        sut.createOrUpdate(dto)
        then:
        1 * repository.save({
            it.title == "10 murzynków" &&
                    it.author == "Agatha Christie" &&
                    it.category == "Kryminał"
        } as Book)

    }
}
