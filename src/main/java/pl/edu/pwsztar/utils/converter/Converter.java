package pl.edu.pwsztar.utils.converter;

@FunctionalInterface
public interface Converter<F, T> {

  T convert(F from);
}
