
public class Ex1116_11 {

	public static void main(String[] args) {
		//중첩된 사각형(5행 5열 * 출력)
		int i ; //행 
		int j ; //열
		/*for(i = 1; i <= 5; i++) {    //횟수만 처리하면 되므로 시작은 0부터 해도 됨
			System.out.print("\t");
			for (j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();     //내부 for문에서(print)가로로 5번 출력되면 여기는 외부 for문으로서(println)세로로 5번 출력한다. -를 의미
		} */
		
		
		
		/*삼각형 출력
		*
		**
		***
		****
		***** <-이렇게 */
		for	(i = 0; i < 5; i++) {    
			for (j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		
		
		
		/* 역삼각형 출력
		*****
		****
		***
		**
		*       <-이렇게 */
		for	(i = 0; i < 5; i++) {            //행 
			for (j = 0; j < 5-i; j++) {      //5-i가 진짜 엄청 큰 힌트였다. 
				System.out.print("*");
			}
			System.out.println();  //줄바꿈
		}
		
		
		
		
		
		
		
		
	}

}
