package controller;

import service.AplicationService;
import service.serviceImpl.ApplicationServiceImpl;

public class MainController {

    private static AplicationService aplicationService;

    public MainController(){
        aplicationService = new ApplicationServiceImpl();
    }

    public static void main(String[] args) {
        new MainController();
        aplicationService.ejecutarMenuOpciones();
    }
}
