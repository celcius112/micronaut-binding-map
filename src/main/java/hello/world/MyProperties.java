package hello.world;

import java.util.HashMap;
import java.util.Map;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("test")
public class MyProperties {

    private Map<String, Map<String, Value>> map = new HashMap<>();

    public void setMap(Map<String, Map<String, Value>> map) {
        this.map = map;
    }

    public Map<String, Map<String, Value>> getMap() {
        return map;
    }

    public static class Value {
        private int property;
        private Value2 property2;

        public Value() {
        }

        public Value(int property, Value2 property2) {
            this.property = property;
            this.property2 = property2;
        }

        public int getProperty() {
            return property;
        }

        public void setProperty(int property) {
            this.property = property;
        }

        public Value2 getProperty2() {
            return property2;
        }

        public void setProperty2(Value2 property2) {
            this.property2 = property2;
        }
    }

    public static class Value2 {
        private int property;

        public Value2() {
        }

        public Value2(int property) {
            this.property = property;
        }

        public int getProperty() {
            return property;
        }

        public void setProperty(int property) {
            this.property = property;
        }
    }
}
