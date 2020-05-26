
package papka;
import java.util.Scanner;

public class Flower
{

    double[] price = {1.5, 2.5, 3.0, 4.2, 1.2, 2.4, 6.0};
    String[] color = {"Red", "Blue", "Black", "White", "Green", "Pink", "Grey"};

    public void totalPrice()
    {
        String name = "";
        double total = 0;
        Scanner in = new Scanner(System.in);
        while (!name.equals("q"))
        {
            name = in.nextLine();
            for (int i = 0; i < color.length; i++)
            {
                if (color[i].equals(name))
                {
                    total = total + price[i];

                }
               /* else
                    {
                        System.out.println("input correct color.");
                    }*/
            }
        }
        System.out.println(total);
    }
}
