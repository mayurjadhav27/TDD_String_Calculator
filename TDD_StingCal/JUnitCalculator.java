package TDD_StingCal;

public class JUnitCalculator {
    public static int Add(String text){
		if(text.length()==0){
		return 0;
		}
		else if(text.length()==1){
			int i=Integer.parseInt(text);
		  return i;
		}
		else if(text.contains(",")){
			String[] nums=text.split(",");
			return Integer.parseInt(nums[0])+Integer.parseInt(nums[1]);
		}
		else{
			return 0;
		}
	}
    
}
