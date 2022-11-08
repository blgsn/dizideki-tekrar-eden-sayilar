import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
		int[] duplicate = new int[list.length];
		int index=0;
		for(int i=0;i<list.length;i++) {
			for(int j=0;j<list.length;j++) {
				if((i!=j)&&(list[i]==list[j])) {
					duplicate[index++]=list[i];
					break;
				}
			}
		}
System.out.println(Arrays.toString(duplicate));
}
}
