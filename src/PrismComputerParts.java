import java.util.*;

public class PrismComputerParts extends Components {
    private static PrismComputerParts pcp = new PrismComputerParts();
    private ArrayList<String[]> cartList = new ArrayList<String[]>();
    private String[] temp = new String[4];

    PrismComputerParts() {
        System.out.println("#######################################################\n#                                                     #\n#           Welcome to Prism Computer Parts           #\n#                                                     #\n#######################################################");
    }

    public static void main(String[] args) throws Exception {
        pcp.queryUserType();
    }

    // Calling the method queryCustomerOrders()
    private void queryCustomerOrders() {
        printBorder();
        displayComputerComponents();
        queryComponentsType();
    };

    /**
     * The function queries the user for the type of user they are, and then calls the appropriate
     * function to handle the user's request
     */
    private void queryUserType() {
        Scanner sc_userType = new Scanner(System.in);
        
        while(true) {
            printBorder();
            System.out.println("Please select the type of user:\n1. Administrator\n2. Customer");
            main: while(true) {
                System.out.print("Enter your choice (1 or 2): ");
                String userType = sc_userType.nextLine();

                switch(userType) {
                    case "1" -> { 
                        modifyComponents();
                        break main;
                    }
                    case "2" -> { 
                        queryCustomerOrders();
                        break main;
                    }
                    case default -> { System.out.println("Sorry, your input is invalid! Please try again.\n"); }
                }
            }
        }
    }

    /**
     * This function is used to display the list of components that the admin can modify
     */
    private void modifyComponents() {
        Scanner sc_modify = new Scanner(System.in);

        printBorder();
        System.out.println("Computer Component Details: \n");
        for(int i = 0; i < adminComponents.length; i++) System.out.println((i + 1) + ". " + adminComponents[i]);
        
        main: while(true) {
            System.out.print("\nItem of choice: ");
            String selectedComponent = sc_modify.nextLine();

            switch(selectedComponent) {
                case "1" -> { 
                    displayAdminComponentsList("PROCESSOR (CPU)", super.cpuList);
                    break main;
                }
                case "2" -> { 
                    displayAdminComponentsList("MOTHERBOARD", super.motherboardList);
                    break main;
                }
                case "3" -> { 
                    displayAdminComponentsList("GRAPHICS CARD (GPU)", super.gpuList);
                    break main;
                }
                case "4" -> {  
                    displayAdminComponentsList("MEMORY (RAM)", super.ramList);
                    break main;
                }
                case "5" -> { 
                    displayAdminComponentsList("HDD AND SDD (STORAGE)", super.storageList);
                    break main;
                }
                case "6" -> { 
                    displayAdminComponentsList("CPU COOLERS", super.cpuCoolerList);
                    break main;
                }
                case "7" -> { 
                    displayAdminComponentsList("MONITORS", super.monitorList);
                    break main;
                }
                case "8" -> { 
                    displayAdminComponentsList("MOUSE", super.mouseList);
                    break main;
                }
                case "9" -> { 
                    displayAdminComponentsList("KEYBOARD", super.keyboardList);
                    break main;
                }
                case "10" -> { 
                    displayAdminComponentsList("HEADPONES AND SPEAKER", super.headponesAndSpeakersList);
                    break main;
                }
                case "11" -> {
                    queryUserType();
                    break main;
                }
                case default -> { System.out.println("Sorry, your input is invalid! Please try again."); }
            }
        }
    }

    /**
     * This function displays the components/peripherals of a computer.
     */
    private void displayComputerComponents() {
        System.out.println("Please select the type of components/peripherals:");
        for(int i = 0; i < components.length; i++) System.out.println((i + 1) + ". " + components[i]);
    }

    /**
     * This function is used to display the list of components that the user can choose from
     */
    private void queryComponentsType() {
        Scanner sc_type = new Scanner(System.in);

        main: while(true) {
            System.out.print("Item of choice: ");
            String selectedComponent = sc_type.nextLine();

            switch(selectedComponent) {
                case "1" -> { 
                    displayComponentsList("PROCESSOR (CPU)", super.cpuList);
                    break main;
                 }
                case "2" -> { 
                    displayComponentsList("MOTHERBOARD", super.motherboardList);
                    break main;
                 }
                case "3" -> { 
                    displayComponentsList("GRAPHICS CARD (GPU)", super.gpuList);
                    break main;
                 }
                case "4" -> {  
                    displayComponentsList("MEMORY (RAM)", super.ramList);
                    break main;
                 }
                case "5" -> { 
                    displayComponentsList("HDD AND SDD (STORAGE)", super.storageList);
                    break main;
                 }
                case "6" -> { 
                    displayComponentsList("CPU COOLERS", super.cpuCoolerList);
                    break main;
                 }
                case "7" -> { 
                    displayComponentsList("MONITORS", super.monitorList);
                    break main;
                 }
                case "8" -> { 
                    displayComponentsList("MOUSE", super.mouseList);
                    break main;
                 }
                case "9" -> { 
                    displayComponentsList("KEYBOARD", super.keyboardList);
                    break main;
                 }
                case "10" -> { 
                    displayComponentsList("HEADPONES AND SPEAKER", super.headponesAndSpeakersList);
                    break main;
                }
                case "11" -> { 
                    displayCartList(); 
                    break main;
                }
                case "12" -> {
                    queryUserType();
                    break main;
                }
                case default -> { System.out.println("Sorry, your input is invalid! Please try again.\n"); }
            }
        }
    }

    /**
     * It displays a list of components in a table format
     * 
     * @param componentName The name of the component being displayed.
     * @param componentList a 2D array of strings that contains the component name, brand, quantity,
     * and cost.
     */
    private void displayAdminComponentsList(String componentName, String[][] componentList) {
        printBorder();
        System.out.println("--- " + componentName + " ---\n");
        System.out.println("Item" + " ".repeat(24) + "Brand" + " ".repeat(20) + "In Stock" + " ".repeat(17) + "Cost");
        System.out.println("----" + " ".repeat(24) + "-----" + " ".repeat(20) + "--------" + " ".repeat(17) + "----");
        for(int i = 0; i < componentList.length; i++) System.out.println((i + 1) + ") " + componentList[i][0] + " ".repeat(25-(componentList[i][0]).length()) + componentList[i][1] + " ".repeat(25-(componentList[i][1]).length()) + componentList[i][2] + " ".repeat(25-(componentList[i][2]).length()) + componentList[i][3]);

        setComputerComponentsValue(componentList);
    }

    /**
     * It's a function that allows the user to modify the quantity and price of a specific item
     * 
     * @param componentList The list of components that will be modified.
     */
    private void setComputerComponentsValue(String[][] componentList) {
        Scanner sc_value = new Scanner(System.in);
        mainLoop: while(true) {
            System.out.println("\nNote: Enter \"Back\" to go back.");
            System.out.print("Pick an item (Ex. 1): ");
            String selectedItem = sc_value.nextLine();

            if(selectedItem.equals("1") || selectedItem.equals("2") || selectedItem.equals("3")) {
                while(true) {
                    System.out.print("What would you like to modify from #" + selectedItem + " (Quantity / Price): ");
                    String toModify = sc_value.nextLine();

                    if(toModify.toLowerCase().equals("quantity")) {
                        while(true) {
                            System.out.print("Enter the new quantity of #" + selectedItem + ": ");
                            int newQuantity = sc_value.nextInt();
                            if(newQuantity >= 0) {
                                componentList[Integer.parseInt(selectedItem)-1][2] = (String.valueOf(newQuantity + Integer.parseInt(componentList[Integer.parseInt(selectedItem)-1][2])));
                                System.out.println("Successfuly modify the quantity of #" + selectedItem + "!");
                                break mainLoop;
                            } else System.out.println("Sorry, you can't have negative quantity! Please try again.\n");
                        }
                    } else if (toModify.toLowerCase().equals("price")) {
                        while(true) {
                            System.out.print("Enter the new price of #" + selectedItem + ": ");
                            int newPrice = sc_value.nextInt();
                            if(newPrice > 0) {
                                componentList[Integer.parseInt(selectedItem)-1][3] = (String.valueOf(newPrice));
                                System.out.println("Successfuly modify the price of #" + selectedItem + "!");
                                break mainLoop;
                            } else System.out.println("Sorry, you can't have negative quantity! Please try again.\n");
                        }
                    } else System.out.println("Sorry, your input is invalid! Please try again.\n");
                }
            } else if (selectedItem.equals("Back")) {
                modifyComponents();
                break mainLoop;
            } else System.out.println("Sorry, your input is invalid! Please try again.");
        }
    }

    /**
     * It displays a list of components, and then asks the user if they want to order any of them
     * 
     * @param componentName The name of the component being displayed.
     * @param componentList a 2D array of strings, where each row is a component and each column is a
     * component attribute.
     */
    private void displayComponentsList(String componentName, String[][] componentList) {
        printBorder();
        System.out.println("--- " + componentName + " ---\n");
        System.out.println("Item" + " ".repeat(24) + "Brand" + " ".repeat(20) + "In Stock" + " ".repeat(17) + "Cost");
        System.out.println("----" + " ".repeat(24) + "-----" + " ".repeat(20) + "--------" + " ".repeat(17) + "----");
        for(int i = 0; i < componentList.length; i++) System.out.println((i + 1) + ") " + componentList[i][0] + " ".repeat(25-(componentList[i][0]).length()) + componentList[i][1] + " ".repeat(25-(componentList[i][1]).length()) + componentList[i][2] + " ".repeat(25-(componentList[i][2]).length()) + componentList[i][3]);
        System.out.println();

        queryComponentsOrder(componentList);
    }

    /**
     * This function is used to query the customer's orders
     * 
     * @param componentList A 2D array that contains the components' information.
     */
    private void queryComponentsOrder(String[][] componentList) {
        orderLoop: while(true) {
            Scanner sc_orders = new Scanner(System.in);
            System.out.println("Note: Enter \"Back\" to go back.");
            System.out.print("Pick an item (Ex. 1): ");
            String order = sc_orders.nextLine();

            if(order.equals("1") || order.equals("2") || order.equals("3")) {
                int orderNumber = Integer.parseInt(order) - 1;
                if(Integer.parseInt(componentList[orderNumber][2]) <= 0) System.out.println("Sorry, component is out of stock.\n");
                else {
                    Scanner sc_quantity = new Scanner(System.in);
                    loop: while(true) {
                        System.out.print("Enter order quantity: ");
                        String quantity = sc_quantity.nextLine();

                        if((Integer.parseInt(quantity) <= Integer.parseInt(componentList[orderNumber][2])) && (Integer.parseInt(quantity) > 0)) {
                            componentList[orderNumber][2] = String.valueOf(Integer.parseInt(componentList[orderNumber][2]) - Integer.parseInt(quantity));
                            temp[0] = componentList[orderNumber][0];
                            temp[1] = componentList[orderNumber][1];
                            temp[2] = String.valueOf(Integer.parseInt(quantity));
                            temp[3] = componentList[orderNumber][3];

                            cartList.add(temp);
                            temp = new String[4]; // null, null...
                            System.out.println("Successfuly added to your cart list!");
                            printBorder();
                            break loop;
                        } else {
                            System.out.println("Sorry, we only have " + Integer.parseInt(componentList[orderNumber][2]) + "pcs of " + componentList[orderNumber][0] + " " + componentList[orderNumber][1] + "! Please try again.\n");
                        }
                    }
                }
            } else if (order.toLowerCase().equals("back")) { 
                queryCustomerOrders();
                break orderLoop;
            } else {
                System.out.println("Sorry, your input is invalid! Please try again.\n");
            }
        }
    }

    /**
     * It displays the cart list of the customer, and if the customer wants to proceed to payout, it
     * will ask for the amount of cash the customer has, and if the cash is sufficient, it will display
     * the change and thank the customer for purchasing
     */
    private void displayCartList() {
        if(cartList.size() > 0) {
            Scanner sc_payout = new Scanner(System.in);
            int total = 0;

            printBorder();
            System.out.println("Your Cart List: \n");
            System.out.println("Item" + " ".repeat(21) + "Brand" + " ".repeat(20) + "Quantity" + " ".repeat(17) + "Cost");
            System.out.println("----" + " ".repeat(21) + "-----" + " ".repeat(20) + "--------" + " ".repeat(17) + "----");
            for(String[] eachOrder : cartList) {
                total += (Integer.parseInt(eachOrder[2]) * Integer.parseInt(eachOrder[3]));
                for(String index : eachOrder) System.out.print(index + " ".repeat(25-index.length()));
                System.out.println();
            }


            System.out.print("\nWould you like to proceed to payout (Yes/No): ");
            String response = sc_payout.nextLine();

            if(response.equals("Yes")) {
                Scanner sc_cash = new Scanner(System.in);
                System.out.println("\nTotal Price: " + total);
                
                loop: while(true) {
                    System.out.print("Enter an amount: ");
                    int cash = sc_cash.nextInt();

                    if(cash >= total) {
                        System.out.println("Your change is: " + (cash - total) + ".00");
                        System.out.println("Thank you for purchasing! :D");
                        total = 0;
                        break loop;
                    } else System.out.println("Sorry, insufficient cash! Please try again!\n");
                }
            }
            else if(response.equals("No")) queryCustomerOrders();
            else System.out.println("Sorry, your input is invalid! Please try again.\n");
        } else {
            System.out.println("Sorry, you don't have any items in your cart list! Please try to order.\n");
            queryComponentsType();
        }
    }

    /**
     * // Java
     * private void printBorder() {
     *         System.out.println("\n
     */
    private void printBorder() {
        System.out.println("\n########################################################################################################\n");
    }
}