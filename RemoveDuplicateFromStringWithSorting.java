class RemoveDuplicateFromStringWithSorting 
{
	public static void main(String[] args) 
	{
		String s="aebzabezaazz";
		String t="";
		for (int i=0;i<=s.length()-1 ;i++ )
		{
			if(t.contains(""+s.charAt(i)))
			{
			}
			else
			{
				t=t+s.charAt(i);
		}
		
	}
	System.out.println(t);
	}

}
