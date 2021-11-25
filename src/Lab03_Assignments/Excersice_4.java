package Lab03_Assignments;

import java.util.*;

class shiftDigits{
	
	public int modifyNumber(int number1) {
		
		Integer num = number1;
		int output;
		String str_num,new_num="";
		
		str_num = num.toString();
		StringBuffer sb = new StringBuffer(new_num);
		char[] charArray = str_num.toCharArray();
		
		for(int i=0;i<charArray.length-1;i++) {
			Integer temp = Math.abs(charArray[i] - charArray[i+1]);
			sb.append(temp.toString());
		}
		char digit = str_num.charAt(str_num.length()-1);
		sb.append(digit);
		output = Integer.parseInt(sb.toString());
		
		return output;
	}
}

public class Excersice_4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the int value : ");
		int number = input.nextInt();
		
		shiftDigits sd = new shiftDigits();
		System.out.println("Modified Number is : "+sd.modifyNumber(number));
		
	}

}

/*output : 
 * 
 *  Enter the int value : 45682
 *  Modified Number is : 11262
 * 
*/

/**PYTHON LOGIC

def modifyNumber(number1):
    str_num = str(number1);
    new_num = ""

    for i in range(len(str_num)-1):
        new_num += str(abs(eval("{}-{}".format(str_num[i],str_num[i+1]))))
    return "Modified Number is : {}".format(new_num+str_num[-1])
    
    
print(modifyNumber(input("Enter the Number : ")))

**/