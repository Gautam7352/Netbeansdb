package mvc2020;

import java.util.ArrayList;
import java.util.Scanner;

public class MVC2020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO MVC");
        while (true) {
            System.out.println();
            System.out.println("1.INSERT");
            System.out.println("2.DELETE");
            System.out.println("3.SEARCH");
            System.out.println("4.GET ALL");
            System.out.println("5.EXIT");
            System.out.println();
            System.out.print("ENTER YOUR CHOICE:");
            int v = sc.nextInt();
            switch (v) {
                case 1: {

                    RackBean rb = new RackBean();
                    System.out.println("Enter serial number to insert:");
                    rb.setRackno(sc.nextInt());
                    System.out.print("Enter name to insert:");
                    rb.setSubject(sc.next());
                    RackData rd = new RackData();
                    try {
                        String s = rd.insert(rb);
                        if (s.equals("success")) {
                            System.out.println("Data Saved");
                        } else {
                            System.out.println("Some Data Error");
                        }
                    } catch (Exception e) {
                        System.out.println(e.toString());
                    }
                    break;
                }
                case 2: {
                    System.out.print("Enter serial number of data to delete:");
                    RackData rd = new RackData();
                    try {
                        String s = rd.delete(sc.nextInt());
                        if (s.equals("success")) {
                            System.out.println("Data Deleted");
                        } else {
                            System.out.println("Some Data Error");
                        }
                    } catch (Exception e) {
                        System.out.println(e.toString());
                    }
                    break;
                }
                case 3: {
                    System.out.println("Enter serial number of data to search:");
                    RackData rd = new RackData();

                    try {
                        RackBean rb = rd.search(sc.nextInt());
                        if (rb != null) {
                            System.out.println(rb.getSubject());
                        } else {
                            System.out.println("Sorry this rack not exists");
                        }
                    } catch (Exception e) {
                        System.out.println(e.toString());
                    }
                    break;
                }
                case 4: {
                    RackData rd = new RackData();
                    RackBean rb;
                    try {
                        ArrayList al = rd.getAll();
                        for (int i = 0; i < al.size(); i++) {
                            rb = (RackBean) al.get(i);
                            System.out.println(rb.getRackno() + "\t" + rb.getSubject());
                        }
                    } catch (Exception e) {
                        System.out.println(e.toString());
                    }
                    break;
                }
                case 5: {
                    System.out.println("Now Exit");
                    System.exit(0);
                }
                default: {
                    System.out.println("Wrong choice please enter correct choice");
                }
            }
        }
    }
}
