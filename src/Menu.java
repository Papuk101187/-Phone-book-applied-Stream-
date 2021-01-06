import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Menu {


    public static void main(String[] args) throws IOException {


        InMemoryContactsService contactsService = new InMemoryContactsService();
        MenuPanel menuPanel = new MenuPanel(
                new AddContactMenuAction(contactsService),
                new ReadAllContactsMenuAction(contactsService),
                new RemoveContactMenuAction(contactsService),
                new Exitprogram(contactsService),
                new SearchbypartnumberMenuAction(contactsService),
                new SearchbeginningnameMenuAction(contactsService));
        menuPanel.starting();



    }

}
