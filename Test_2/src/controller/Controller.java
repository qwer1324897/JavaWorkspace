package controller;

import service.Ui;

public class Controller {

    private Ui ui = new Ui();

    public void run() {
        
        ui.Welcome();

        while(true) {
            ui.Menu();
            
            if(ui.inputExit()) {
                break;
            }
            ui.executeService();
        }

        ui.ProgramExit();
    }    
}
