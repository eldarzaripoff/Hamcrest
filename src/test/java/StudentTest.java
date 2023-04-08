import org.example.Bookkeeper;
import org.example.Student;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;

public class StudentTest {
    @Test
    public void loosesFrankBooksOrNo_WhileAlexTakesIt() {
        Student alex = new Student("Steve", 5);
        Bookkeeper frank = new Bookkeeper(10, "Frank");
        int expectedForFrank = 9;

        frank.setBookCount(alex.takeBook(frank));

        Assertions.assertEquals(expectedForFrank, frank.getBookCount());
    }

    @Test
    public void loosesFrankBooksOrNo_WhileAlexTakesIt_Hamcrest() {
        Student alex = new Student("Steve", 5);
        Bookkeeper frank = new Bookkeeper(10, "Frank");
        int expectedForFrank = 9;

        frank.setBookCount(alex.takeBook(frank));

        MatcherAssert.assertThat(expectedForFrank, equalTo(frank.getBookCount()));
    }

    @Test
    public void getsAlexBooksOrNo_WhileAlexTakesIt() {
        Student alex = new Student("Steve", 20);
        Bookkeeper frank = new Bookkeeper(40, "Frank");
        int expectedForAlex = alex.bookCount + 1;

        frank.setBookCount(alex.takeBook(frank));

        Assertions.assertEquals(expectedForAlex, alex.getBookCount());
    }

    @Test
    public void getsAlexBooksOrNo_WhileAlexTakesItWithHamcrest() {
        Student alex = new Student("Steve", 20);
        Bookkeeper frank = new Bookkeeper(40, "Frank");
        int expectedForAlex = alex.bookCount + 1;

        frank.setBookCount(alex.takeBook(frank));

        MatcherAssert.assertThat(expectedForAlex, equalTo(alex.getBookCount()));
    }

    @Test
    public void exchangedTheirBooksOrNo_WhileItSimilar() {
        Student alex = new Student("Steve", 100);
        Bookkeeper frank = new Bookkeeper(100, "Frank");

        frank.setBookCount(alex.bringBookback(frank));

        Assertions.assertNotEquals(frank.getBookCount(), alex.getBookCount());
    }

    @Test
    public void exchangedTheirBooksOrNo_WhileItSimilarWithHamcrest() {
        Student alex = new Student("Steve", 100);
        Bookkeeper frank = new Bookkeeper(100, "Frank");

        frank.setBookCount(alex.bringBookback(frank));

        MatcherAssert.assertThat(frank.getBookCount(), not(equalTo(alex.getBookCount())));
    }
}
