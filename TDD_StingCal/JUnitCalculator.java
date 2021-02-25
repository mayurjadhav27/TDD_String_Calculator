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
        else if(text.contains("//")){
            char delimiter=text.charAt(2);
            String s=text.substring(4);
            int sum=0;
            String[] nums=s.split(Character.toString(delimiter));
			for(int i=0;i<nums.length;i++){
                if(Integer.parseInt(nums[i])<0){
                    throw new IllegalArgumentException("negatives not allowed: " +text );
                }
				sum+=Integer.parseInt(nums[i]);
			}
			return sum;
        
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
