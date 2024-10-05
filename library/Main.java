package library;
import library.LibraryBook;
public  class Main
{
	Main()
	{}
	public static void main(String []args)
	{
		LibrarayBook lib=new LibraryBook();
		lib.addBook("Zain");
		lib.listBook();
	}

}