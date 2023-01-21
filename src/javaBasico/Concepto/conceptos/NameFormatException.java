package javaBasico.Concepto.conceptos;

public class NameFormatException extends Exception{
    private static long serialVersionUID = 1L;

    public NameFormatException(String errorMessage){
        super(errorMessage);
    }
}
