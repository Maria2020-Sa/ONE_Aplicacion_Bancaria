package controller;

import serviceImpl.ApplicationServiceImpl;

public class MainController {

    public static void main(String[] args) {
        ApplicationServiceImpl applicationService = new ApplicationServiceImpl();
        applicationService.ejecutarMenuOpciones();
    }
}
