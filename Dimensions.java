/*
 * Nhi Vu
 * CS A170
 * Sep 08 2020
 * 
 * Exercise #02
 */
public class Dimensions
{
    public static void main(String[] args)
    {
        int paperLentgh = 11;
        double paperWidth = 8.5;
        final double inch_to_mm = 25.4;
        
        double paper_Lentgh_mm = 11 * inch_to_mm;
        double paper_Width_mm = 8.5 * inch_to_mm;
        
        System.out.print("The metric dimensions of a letter-sized sheet of paper are ");
        System.out.print(paper_Width_mm);
        System.out.print(" mm by ");
        System.out.print(paper_Lentgh_mm);
        System.out.print(" mm.");
    }
}