package namedpackage;

import com.sun.source.tree.WhileLoopTree;

import java.util.*;

import java.util.Objects;
import java.util.Scanner;


public class PoisedProjectmain {

    public static void main(String[] args) {

        PoisedProjectClass project = projectdetails();
        //The code starts by creating an instance of the class, which is called project.

        // The main method then prints out the contents of the object that was created in step 1.

        Scanner menuInput = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("""
                        would you like to try to add another project(if you made an error while inputing a project)? type ap
                        
                        !!! NOTE TO PICK THE FOLLOWING OPTION A PROJECT SHOULD HAVE BEEN CREATED FIRST!!!
                        
                        would you like to change the due date of a project?,type pdd
                        would you like to change the amount paid to date? type apd
                        would you like to update a contractors detals? type ud
                        type exit to exit the programm
                        """);
                //The code is designed to ask the user if they would like to change the due date of a project.
                // The code is designed to ask the user if they would like to change the amount paid to date?
                //The code is designed to ask the user if they would like to update a contractors detals?

                String projectMenu = menuInput.nextLine();
                if (Objects.equals(projectMenu,"ap")){
                    PoisedProjectClass reproject = projectdetails();


                }

                if (Objects.equals(projectMenu, "exit")) {
                    break;

                }//break statement

                else if (Objects.equals(projectMenu, "pdd")) {
                    Scanner projectDueDate = new Scanner(System.in);
                    System.out.println("please enter the new date");
                    String userEdit = projectDueDate.nextLine();
                    project.setDate(userEdit);
                    System.out.println("the new date is.");
                    System.out.println(project);

                }//else if to set new project due date

                else if (Objects.equals(projectMenu, "apd")) {
                    Scanner amountPaidToDate = new Scanner(System.in);
                    System.out.println("please enter the new amount paid to date");
                    String newmount = amountPaidToDate.nextLine();
                    project.setAmountpaidtodate(newmount);
                    System.out.println("the new amount paid to date is");
                    System.out.println(project);
                }// else if to set new amount paid to date

                else if (Objects.equals(projectMenu, "ud")) {

                    Scanner ud = new Scanner(System.in);

                    while (true) {

                        System.out.println("""
                                please enter which detail you would like to update,
                                n = name 
                                t = telephone
                                e = email 
                                a = address
                                d = done """);

                        String userEdit = ud.nextLine();

                        if (Objects.equals(userEdit, "d")) {
                            break;
                        }// break statement

                        else if (Objects.equals(userEdit, "n")) {
                            System.out.println("please enter the new name of the contractor");


                            String newName = ud.nextLine();

                            project.getContractor().setName(newName);


                            System.out.println(project);


                        }// set method for the contractors new name

                        else if (Objects.equals(userEdit, "t")) {
                            System.out.println("please enter the new telephone of the contractor");

                            new Scanner(System.in);

                            long newTele = Integer.parseInt(ud.nextLine());

                            project.getContractor().setTelenum(newTele);


                            System.out.println(project);


                        }// set method for the contractors new telephone

                        else if (Objects.equals(userEdit, "e")) {
                            System.out.println("please enter the new email of the contractor");

                            new Scanner(System.in);

                            String newEmail = ud.nextLine();

                            project.getContractor().setEmail(newEmail);


                            System.out.println(project);


                        }// set method for the contractors new email

                        else if (Objects.equals(userEdit, "a")) {
                            System.out.println("please enter the new addres of the contractor");

                            new Scanner(System.in);

                            String newAddy = ud.nextLine();

                            project.getContractor().setAddress(newAddy);


                            System.out.println(project);


                        }// set method for the contractors new address


                    }// while loop menu if the user chooses to edit contractor details

                }

            }

        } catch (NumberFormatException e) {
            System.out.println("please dont enter the value encapsulated by quotation marks.");
        }

    }

    public static PoisedProjectClass projectdetails() {
        int projectnum = 0;
        String projectname = null;
        String buildingtype = null;
        int erfnumb = 0;
        int totalfee = 0;
        int amountpaid = 0;
        String projectdeadline = null;
        String physicaladd = null;
        PoisedPersonClass architect = null;
        PoisedPersonClass contractor = null;
        PoisedPersonClass customer = null;

        Scanner userInput = new Scanner(System.in);


        while (true){
            try {

                System.out.println("please select one of the options below:" +
                        "1- ADD NEW PROJECT [ANP]" +
                        "2 - EXIT[E]");

                String choice = userInput.nextLine();

                if (choice.equalsIgnoreCase("e")){
                    break;
                }else{
                    System.out.println("please enter the project number\n");

                    projectnum = Integer.parseInt(userInput.nextLine());





                    userInput = new Scanner(System.in);

                    System.out.println("please enter the project name\n");

                    projectname = userInput.nextLine();

                    userInput = new Scanner(System.in);

                    System.out.println("please enter what type of building it is");
                    buildingtype = userInput.nextLine();

                    userInput = new Scanner(System.in);
                    System.out.println("please enter the physical address");
                    physicaladd = userInput.nextLine();

                    userInput = new Scanner(System.in);
                    System.out.println("please enter the ERF number");
                    erfnumb = Integer.parseInt(userInput.nextLine());

                    userInput = new Scanner(System.in);
                    System.out.println("please enter the total fee being charged for the project");
                    totalfee = Integer.parseInt(userInput.nextLine());

                    userInput = new Scanner(System.in);
                    System.out.println("please enter the amount paid to date");
                    amountpaid = Integer.parseInt(userInput.nextLine());

                    userInput = new Scanner(System.in);
                    System.out.println(" please enter the project deadline. in this format YYYY,MM,DD seperated by a comma.");
                    projectdeadline = userInput.nextLine();

                    contractor = peopledetails();
                    architect = peopledetails();
                    customer = peopledetails();

                }







            } catch (NumberFormatException e) {
                System.out.println("please dont enter the value encapsulated by quotation marks//the value you have entered is of the wrong type.");
                break;
            }catch (InputMismatchException e) {
                System.err.println("Not a valid input. Error :" + e.getMessage());
                break;
            }


        }
        return new PoisedProjectClass(projectnum, projectname, buildingtype, erfnumb, totalfee, amountpaid, projectdeadline, physicaladd, architect, contractor, customer);
    }// project method used to create a project object


    public static PoisedPersonClass peopledetails() {
        String name = null;
        int tele = 0;
        String mail = null;
        String addy = null;
        String Out = null;
        while (true){
            try {
                Scanner breakState = new Scanner(System.in);
                System.out.println("after entering 3 person details please exit the programm. type exit");

                Scanner userInputOne = new Scanner(System.in);
                System.out.println("please enter your name");
                name = userInputOne.nextLine();

                userInputOne = new Scanner(System.in);
                System.out.println("please enter your telephone");
                tele = Integer.parseInt(userInputOne.nextLine());

                userInputOne = new Scanner(System.in);
                System.out.println("please enter your email");
                mail = userInputOne.nextLine();

                userInputOne = new Scanner(System.in);
                System.out.println("please enter your address");
                addy = userInputOne.nextLine();

                System.out.println("is this the last entry if yes type exit, or else ull be in a loop.");
                Out = breakState.nextLine();

                if (Objects.equals(Out,"exit")){
                    break;

                }








            } catch (NumberFormatException e) {
                System.out.println("please dont enter the value encapsulated by quotation marks//the value you have entered is of the wrong type.");
                break;
            }


        }


        return new PoisedPersonClass(name, tele, mail, addy);
    }// perso method used to create a new person object


}
