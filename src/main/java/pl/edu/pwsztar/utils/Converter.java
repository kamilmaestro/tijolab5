package pl.edu.pwsztar.utils;

@FunctionalInterface
public interface Converter<F, T> {

  T convert(F from);
}
