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
                .extracting(e -> e.get("key"))
                .isNull(); // this should not be null, it should instead be an object
    }
}
