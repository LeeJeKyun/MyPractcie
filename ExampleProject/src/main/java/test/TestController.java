package test;

public class TestController {
	public static void main(String[] args) {
		
		double loginLat =  37.48215177966;
		double loginLon =  126.887403008669;

		//직선거리 2km 위도 +0.019, 경도 +0.022
		
		double i = 3;
		
		double writeLat =  loginLat + 0.0129*i;
		double writeLon =  loginLon + 0.0159*i;
		
		double loginLatRad = Math.toRadians(loginLat);
		double loginLonRad = Math.toRadians(loginLon);
		double writeLatRad = Math.toRadians(writeLat);
		double writeLonRad = Math.toRadians(writeLon);
		
		double result = 6371 * Math.acos(
				
				Math.cos(loginLatRad) *
				Math.cos(writeLatRad) *
				Math.cos(writeLonRad - loginLonRad) +
				(Math.sin(loginLatRad) * Math.sin(writeLatRad))
				
				);
		
//		System.out.println(result);
		
		
		Double a = 123.123;
		
		double b = a;
		
		System.out.println(a + "," + b);
		
		
	}
}
