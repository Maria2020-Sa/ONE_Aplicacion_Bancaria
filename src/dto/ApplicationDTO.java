package dto;

public class ApplicationDTO {

    private double montoRetiro;
    private double montoDeposito;

    private String nombreCliente;


    public ApplicationDTO() {
    }

    public double getMontoRetiro() {
        return montoRetiro;
    }

    public void setMontoRetiro(double montoRetiro) {
        this.montoRetiro = montoRetiro;
    }

    public double getMontoDeposito() {
        return montoDeposito;
    }

    public void setMontoDeposito(double montoDeposito) {
        this.montoDeposito = montoDeposito;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
}