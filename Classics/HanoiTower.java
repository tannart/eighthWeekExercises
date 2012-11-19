public class HanoiTower{
    
	public int hanoiDisc(int n){
        if(n ==1){
		    return 1;
		} else {
		    int result = hanoiDisc(n-1) + 1 + hanoiDisc(n-1);
			return result;
		}
	}
}