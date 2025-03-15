/* generujemy losowo tablice 3x3
 * Wyliczymy wyznacznik ze schematu Sarrusa
 */

import java.util.Random;

public class WyznacznikSchematSarrusa {
	public static void main(String[] args) {
		double macierz[][] = new double [3][3];
		Random los = new Random();
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				macierz[i][j] = los.nextDouble();
				System.out.printf("%1.3f ",macierz[i][j]);
			}
			System.out.println();
		}
		double wyznacznik = macierz[0][0]*macierz[1][1]*macierz[2][2]+macierz[0][1]*macierz[1][2]*macierz[2][0]+macierz[0][2]*macierz[1][0]*macierz[2][1]-macierz[0][2]*macierz[1][1]*macierz[2][0]-macierz[0][0]*macierz[1][2]*macierz[2][1]-macierz[0][1]*macierz[1][0]*macierz[2][2];
		System.out.printf("Wyznacznik = %1.3f.",wyznacznik);
	}
}
