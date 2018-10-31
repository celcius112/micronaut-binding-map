package hello.world;

import java.util.Map;
import java.util.Optional;

import javax.inject.Singleton;

import io.micronaut.core.convert.ConversionContext;
import io.micronaut.core.convert.TypeConverter;

@Singleton
public class MyValueConverter implements TypeConverter<Map, MyProperties.Value> {

    @Override
    public Optional<MyProperties.Value> convert(Map object, Class<MyProperties.Value> targetType, ConversionContext context) {
        throw new IllegalArgumentException("MyValueConverter has been called");
    }
}
