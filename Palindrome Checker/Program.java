class Program 
{
	public static void main(String[] args)
	{
		String palindrome = "kayak";
		String notPalindrome = "not";
		CheckPalindrome checker = new CheckPalindrome();
		System.out.println(palindrome+" ? : "+ checker.IsPal(palindrome));
		System.out.println(notPalindrome+" ? : "+ checker.IsPal(notPalindrome));
	}
}