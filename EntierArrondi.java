package javaclass;

public class EntierArrondi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    double xd = 2.125;
		    double mult = xd * 100.0;
		    double add = mult + 0.5;
		    int reuslts = (int) add;

		    double result = reuslts / 100.0;

		    System.out.println(result);// 2.13
		}
	}

}
