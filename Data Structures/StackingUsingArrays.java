import java.util.Arrays;
import java.util.Scanner;

public class  StackUsingArrays{
	
	public static class StackArrays
	{
		int size;
		int[] s;
		int top;
		
		public StackArrays(int size)
		{
			this.size = size;
			s = new int[this.size];
			top = -1;
		}
		
		public boolean stackEmpty()
		{
			if(top == -1)
				return true;
			return false;
		}
		
		public void push(int num)
		{
			if(top >= size - 1)
			{
				System.out.println("Stack Full!");
				return;
			}
			s[++top] = num;
		}
		
		public int pop()
		{
			if(top == -1)
			{
				System.out.println("Stack Empty");
				return -1;
			}
			return s[top--];
		}
		
		public int peek()
		{
			if(top == -1)
			{
				System.out.println("Stack Empty");
				return -1;
			}
			return s[top];
		}
		
		public void printStack()
		{
			if(top != -1)
			{
				System.out.println("Stack..");
				for(int i = top;i>=0;i--)
				{
					System.out.println(s[i]);
				}
			}
			else
				System.out.println("Stack Empty");
		}
		
		
	}
	
	public static void main(String args[])
	{
		StackArrays s = new StackArrays(10);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Push -> 1");
		System.out.println("Pop -> 2");
		System.out.println("Check Empty -> 3");
		System.out.println("Peek(see top element) -> 4");
		System.out.println("Print stack -> 5");
		int choice = scanner.nextInt();
		while(choice != 6)
		{
		switch(choice)
		{
		
		
		case 1:
		{
			System.out.println("Enter number to push");
			int n = scanner.nextInt();
			s.push(n);
			break;
		}
		case 2:
		{
			
			int n = s.pop();
			System.out.println("Popped number is " + n);
			break;
		}
		case 3:
		{		
			System.out.println("Stack empty ? " + s.stackEmpty());
			break;
		}
		case 4:
		{		
			System.out.println("Top element is  " + s.peek());
			break;
		}
		case 5:
		{		
			s.printStack();
			break;
		}
		}
		System.out.println("Push -> 1");
		System.out.println("Pop -> 2");
		System.out.println("Check Empty -> 3");
		System.out.println("Peek(see top element) -> 4");
		System.out.println("Print stack -> 5");
		choice = scanner.nextInt();
		
		
		
		
		}
	}
}
















