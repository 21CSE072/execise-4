import java.util.Scanner;


abstract class book
{
    void abstractsetdetails()
    {
        
    }   
    void abstractgettitle()
    {
        
    }
    
}
    
class mybook extends book
{
    String title;
    String author;
    int price;
    void setdetails()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("details of books");
        System.out.println("enter the title of the book");
        title=obj.nextLine();
        System.out.println("enter the author of the book");
        author=obj.nextLine();
        System.out.println("enter the price of the book");
        price+=obj.nextInt();
        System.out.println("total price of the books");
        System.out.println(price);
    }     
     
}

public class exe4 {

     public static void main(String[] args) {
        mybook obj=new mybook();
        for(int i=0;i<3;i++)
        {   
            obj.setdetails();
            
        }
       
        
    }
     

    
    
}
