// The code checks if the give string of parenthesis is Balanced or Not

import java.util.*;

public class BalancedString {
		
	public static void main(String[]args)
	{
		String s = "{{}}[](()){{}}[]{{{}}}";
		
		boolean isBalanced = true;
		
		char[] c = s.toCharArray();
		
		Stack<Character> st = new Stack<>();
		
		st.push(c[0]);
		
		if (s.length() %2 != 0)
		{
			System.out.println("String is not Balanced");
		}
		else
		{
			for (int i = 1; i < c.length ; i++)
			{
				if ((c[i] == '{') || (c[i] == '(') || (c[i] == '['))
				{
					st.push(c[i]) ;
				}
				{
					if ((c[i] == '}') || (c[i] == ')') || (c[i] == ']'))
					{
						if (st.isEmpty())
						{
							isBalanced = false;
							break;
						}
						else
						{
							if (c[i] == '}')
							{
								if (st.pop() != '{')
								{
									isBalanced = false;
									break;
								}
							}
							else if (c[i] == ')')
							{
								if (st.pop() != '(')
								{
									isBalanced = false;
									break;
								}
							}
							else if (c[i] == ']')
							{
								if (st.pop() != '[')
								{
									isBalanced = false;
									break;
								}
							}
						}
					}
				}
			}
			
			if (!isBalanced)
			{
				System.out.println("String is not Balanced");
			}
			else if ((isBalanced) && (!st.isEmpty()))
			{
				System.out.println("String is not Balanced");
			}
			else
			{
				System.out.println("String is Balanced");
			}
		}
	}
}
