package Leetcode6;

public class Leetcode1861 {
	public static void main(String[] args) {
		char[][] boxGrid = { { '#', '#', '*', '.', '*', '.' }, { '#', '#', '#', '*', '.', '.' },
				{ '#', '#', '#', '.', '#', '.' } };// {"#",".","*","."},{"#","#","*","."
		char[][] res = new char[boxGrid[0].length][boxGrid.length];
		for (int i = 0; i < boxGrid.length; i++) {
			for (int j = 0; j < boxGrid[i].length; j++) {
				if (boxGrid[i][j] == ('#')) {
					continue;
				} else if (boxGrid[i][j] == ('*')) {
					continue;
				} else if (boxGrid[i][j] == ('.')) {
					for (int l = j; l >= 0; l--) {
						if (boxGrid[i][l] == '.') {
							char str = boxGrid[i][l];
							int n = 0;
							for (int k = j; k >= 0; k--) {
								if (boxGrid[i][k] == '*') {
									break;
								} else if (boxGrid[i][k] == '#') {
									boxGrid[i][l] = boxGrid[i][k];
									boxGrid[i][k] = str;
									break;
								}
							}
						}
					}
				}
			}
		}
		int a = 0, b = 0;
		for (int i = boxGrid.length - 1; i >= 0; i--) {
			for (int j = 0; j < boxGrid[i].length; j++) {
				res[a++][b] = boxGrid[i][j];
				if (a == res.length) {
					b++;
					a = 0;
				}
			}
		}
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				System.out.print(res[i][j]);
			}
			System.out.println();
		}
	}
}
