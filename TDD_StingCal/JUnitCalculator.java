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
		else if(text.contains(",") || text.contains("\\n")){
			int sum=0;
            String[] nums=text.split(",|\n");
			for(int i=0;i<nums.length;i++){
				sum+=Integer.parseInt(nums[i]);
			}
			return sum;
        }
		else{
			return 0;
		}
	}
    
}
