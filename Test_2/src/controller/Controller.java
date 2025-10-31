package controller;

import service.Ui;

public class Controller {

    private Ui ui = new Ui();

    public void run() {
        
        ui.Welcome();

        while(true) {
            ui.Menu();
            Integer userInput = ui.UserInputCommand();
            if(ui.inputExit(userInput)) {
                break;
            }
            ui.executeService(userInput);
        }

        ui.ProgramExit();
    }    
}
