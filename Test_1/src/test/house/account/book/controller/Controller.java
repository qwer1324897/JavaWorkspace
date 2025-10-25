package test.house.account.book.controller;

import test.house.account.book.ui.UI;

public class Controller {

    UI ui = new UI(){};

    public void run() {
        ui.welcome();
        while (true) {
            ui.showMainMenu();
            Integer userinput = ui.userInputCommand();
            if(ui.commandIsExit(userinput)) {
                break;
            }
            ui.showSubMenu(userinput); 
        }
        ui.exitProgram();
    }
}
