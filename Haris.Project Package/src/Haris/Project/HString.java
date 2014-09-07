package Haris.Project;

public class HString {
	char[] charset;

	public HString(char[] inChars) {
		this.charset=inChars;
		}
	public char[] GetHString(){
		return this.charset;
	}
	public void Print(){
		for(int i=0 ;i < this.charset.length ; i++ ){
			System.out.print(this.charset[i]);
		}
	}

}
