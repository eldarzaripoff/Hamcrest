import org.example.Bookkeeper;
import org.example.Librarian;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.typeCompatibleWith;

public class BookkeeperTest {
    @Test
    public void givenBookkeeper_whenHasValue_thenCorrect() {
        Bookkeeper bookkeeper = new Bookkeeper(5, "Frank");
        assertThat(bookkeeper, hasProperty("bookCount"));
    }

    @Test
    public void given2Classes_whenOneInheritsFromOther() {
        assertThat(Bookkeeper.class, typeCompatibleWith(Librarian.class));
    }
}
