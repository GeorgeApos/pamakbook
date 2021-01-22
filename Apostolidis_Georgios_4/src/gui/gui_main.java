package gui;

import main_package.closedGroups;
import main_package.connectedClass;
import main_package.groups;
import main_package.users;

public class gui_main {

	public static void main(String[] args) {
		
		connectedClass connector = new connectedClass();
		
		groups g1 = new groups("WebGurus","A group for web passionates", connector);
		closedGroups g2 = new closedGroups("ExamSolutions","Solutions to common exam questions", connector); 

		main_menu mainMenu = new main_menu();
		

	}

}
