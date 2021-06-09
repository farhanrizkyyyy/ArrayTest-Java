package ArrayTest;

public class ArrayExample {
	public static void main(String[] args) {
		String dataProdi[] = {"Administrasi", "Agroteknologi", "Teknik Elektro", 
				"Bahasa Arab", "Bahasa Inggris", "Teknik Informatika", "Fisika", 
				"Kimia", "Biologi", "Manajemen"};
		
		System.out.println("Index ke-1	: " + dataProdi[1]);
		System.out.println("Index ke-3	: " + dataProdi[3]);
		System.out.println("Index ke-5	: " + dataProdi[5]);
		
		System.out.println();
		
		for(int i = 0; i < dataProdi.length; i++) {
			if(i == 3) {
				continue;
			}
			
			System.out.println("Index ke-" + i + "	: " + dataProdi[i]);
		}
	}
}
