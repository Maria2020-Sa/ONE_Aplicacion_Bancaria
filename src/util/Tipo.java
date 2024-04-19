package util;

public enum Tipo {
    CUENTA_CORRIENTE("Corriente"),
    TIPO_MONEDA("Pesos");

    public final String valor;
    private Tipo (String valor){
        this.valor = valor;
    }
}
