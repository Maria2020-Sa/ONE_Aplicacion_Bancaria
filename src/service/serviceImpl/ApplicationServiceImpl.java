package service.serviceImpl;

import dto.ApplicationDTO;
import service.AplicationService;
import util.Tipo;

import java.util.Scanner;

public class ApplicationServiceImpl implements AplicationService {

    private Scanner scanner;
    private ApplicationDTO applicationDTO;
    private double saldoDisponible = 100000.00;
    private int numeroOpcionMenu;
    private String mensajeInicial;
    private String menuMensaje;

    public ApplicationServiceImpl(){
        this.scanner = new Scanner(System.in);
        this.applicationDTO = new ApplicationDTO();
        System.out.println("Ingrese su Nombre y Apellido: ");
        applicationDTO.setNombreCliente(scanner.nextLine());
        this.mensajeInicial= """
                    ******************************************
                    Nombre del cliente: %s
                    Tipo de cuenta: %s
                    Tipo de moneda: %s
                    Saldo disponible: $ %.2f
                    *******************************************
                    """.formatted(applicationDTO.getNombreCliente(), Tipo.CUENTA_CORRIENTE.valor, Tipo.TIPO_MONEDA.valor, saldoDisponible);
        System.out.println(mensajeInicial);
    }

    public void ejecutarMenuOpciones (){
        while (saldoDisponible > 0 && numeroOpcionMenu != 4){
            menuMensaje = """
                                MENÚ
                **Escriba el número de la opción deseada**
                1- Consultar saldo.
                2- Retirar dinero.
                3- Depositar dinero.
                4- Salir""";
            System.out.println(menuMensaje);
            numeroOpcionMenu = scanner.nextInt();

            switch (numeroOpcionMenu){
                case 1:
                    System.out.println("El saldo actual disponible es: "+ saldoDisponible);
                    break;
                case 2:
                    System.out.println("Ingreses el monto a retirar: ");
                    applicationDTO.setMontoRetiro(scanner.nextDouble());
                    if(applicationDTO.getMontoRetiro() <= saldoDisponible){
                        saldoDisponible -= applicationDTO.getMontoRetiro();
                        System.out.println("El saldo disponible restante es: "+ saldoDisponible);
                    }else
                        System.out.println("Su saldo es insuficiente");
                    break;
                case 3:
                    System.out.println("Ingrese el monto a depositar: ");
                    applicationDTO.setMontoDeposito(scanner.nextDouble());
                    saldoDisponible += applicationDTO.getMontoDeposito();
                    System.out.println("El saldo disponible actualizado es: "+ saldoDisponible);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("El número ingresado no corresponde a una opción del menu.");
            }
        }

        System.out.println("Muchas gracias por utilizar nuestros servicios.");
    }
}
