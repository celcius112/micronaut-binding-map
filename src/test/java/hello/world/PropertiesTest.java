package hello.world;

import javax.inject.Inject;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@MicronautTest
class PropertiesTest {
    @Inject
    private MyProperties properties;

    @Test
    void test() {
        assertThat(properties.getMap())
                .extracting(e -> e.get("key").get("key2.property")) // that's a weird property name 🤔 😅
                .isEqualTo("i should be an int"); // test fails because a String cannot be cast to hello.world.MyProperties$Value
    }
}
