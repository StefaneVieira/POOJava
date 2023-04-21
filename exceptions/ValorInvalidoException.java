package exceptions;

public class ValorInvalidoException extends RuntimeException {

    public ValorInvalidoException() {

    }

    public ValorInvalidoException(String message) {
        super(message);
    }

    public ValorInvalidoException(double valor) {
        super("Valor invalido: " + valor);
    }
}
