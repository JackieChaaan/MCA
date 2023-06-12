import java.util.*;
class Publisher
{
    String pName;
    Publisher(String nm)
    {
        pName=nm;
    }
    void display()
    {
        System.out.println("Publisher Name:"+pName);
    }
}
class Book extends Publisher
{
    String bName;
    Book(String pName,String bn)
    {
        super(pName);
        bName=bn;
    }
    void display()
    {
        super.display();
        System.out.println("Book Name:"+bName);
    }
}
class Literature extends Book
{
    String litName;
    Literature(String pName,String bName,String ln)
    {
        super(pName,bName);
        litName=ln;
    }
    void display()
    {
        super.display();
        System.out.println("Literature:"+litName);
    }
}
class Fiction extends Book
{
    String ficName;
    Fiction(String pName,String bName,String fn)
    {
        super(pName,bName);
        ficName=fn;
    }
    void display()
    {
        super.display();
        System.out.println("Fiction:"+ficName);
    }
}
class BookPublisherLiterFict
{
    public static void main(String a[])
    {
        Literature l=new Literature("Penguin","I too had a love story","ITHALS");
        Fiction f=new Fiction("HP","Looking for Alaska","LFA");
        l.display();
        f.display();
    }
}