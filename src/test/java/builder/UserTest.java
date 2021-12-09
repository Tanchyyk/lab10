package builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user1;
    @BeforeEach
    void setUp() {
       user1 = User.builder().age(18).gender("f").occupation("ucu").build();
    }

    @Test
    void testToString() {
        assertEquals(user1.toString(), "User(name=null, age=18, gender=f, weight=0, height=0, race=null, occupations=[ucu])");
    }
}