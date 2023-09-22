/**
 * @author Leonhard Leung
 * Date: 09/22/2023
 */

public class Executable {
    public static void main(String[] args) {
        Executable execute = new Executable();
        execute.run();
    } // end of main method;

    /**
     * As of now, it displays how the list is being sorted based on the brand name.
     * To do: create a user based program on managing an inventory of makeup products
     */
    public void run() {
        Makeup one = new Makeup("Maybelline", "Fit Me Matte", "Foundation", "Natural Beige", "Normal to oily skin", "Matte");
        Makeup two = new Makeup("Urban Decay", "Naked3 Eyeshadow Palette", "Eyeshadow Palette", "Multiple Shades", "All skin types", "Various");
        Makeup three = new Makeup("MAC Cosmetics", "Ruby Lipstick", "Lipstick", "Ruby", "All skin types", "Matte");
        Makeup four = new Makeup("L'Oréal Paris", "Voluminous Lash Paradise Mascara", "Mascara", "Blackest Black", "All skin types", "Volumizing");
        Makeup five = new Makeup("Viseart", "Eyeliner Ink", "Eyeliner", "Black", "All skin types", "Matte");


        Node<Makeup> list = new Node<>(null, null);
        list.insert(one);
        list.insert(two);
        list.insert(three);
        list.insert(four);
        list.insert(five);

        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i).toString());
        }
    } // end of run method
} // end of Executable class
