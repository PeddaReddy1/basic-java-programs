import java.util.Scanner;

	class Rainbow{
		public static void main(String[]args){
			System.out.println("main method started");
			char r='r';
			char v='v';
			char b='b';
			char g='g';
			char y='y';
			char i='i';
			char o='o';
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the color");
				char color=sc.next().charAt(0);
					if(color=='r'){
						System.out.println("Red");
					}
					else if(color=='v'){
						System.out.println("Voilet");
					}
					else if(color=='b'){
						System.out.println("Blue");
					}
					else if(color=='g'){
						System.out.println("Green");
					}
					else if(color=='y'){
						System.out.println("Yello");
					}
					else if(color=='o'){
						System.out.println("Orange");
					}
					else if(color=='i'){
						System.out.println("Indigo");
					}
					else{
						System.out.println("no color more");
					}
					System.out.println("main method ended");
		}
	}