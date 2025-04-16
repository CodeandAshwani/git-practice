import java.util.Scanner;
public class first
{

public static void main(String args[])
{
    
int z, y, n;
System.out.println("Enter z and y");
Scanner sct = new Scanner(System.in);   
z = sct.nextInt();  
y = sct.nextInt();
System.out.println("Before Swapping\nz = "+z+"\ny = "+y);
n = z;   
z = y;
y = n;
System.out.println("After Swapping\nz = "+z+"\ny = "+y);
}
}
