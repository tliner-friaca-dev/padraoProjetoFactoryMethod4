package br.com.projeto.padraoProjetoFactoryMethod;

public final class Inteiro extends Number {

    static Integer value;

    public static Integer retornaTriplo(int value) {

        return value * 2;

    }

    public static Integer retornaTriplo() {

        return value * 3;

    }

    @Override
    public int intValue() {
        return value * 2;
    }

    @Override
    public long longValue() {
        return (long)value * 2;
    }

    @Override
    public float floatValue() {
        return (float)value * 2;
    }

    @Override
    public double doubleValue() {
        return (double)value * 2;
    }
    
}
