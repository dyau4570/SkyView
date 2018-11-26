package DarrenYau;

public class SkyViewRunner {

    public static void main(String[] args) {
	double[] scan = {};
	double[] scan2 = {};

	SkyView sv1 = new SkyView();
	SkyView sv2 = new SkyView();

	System.out.println(sv1);
	System.out.println(sv2);

	System.out.println("Average 1: "+ sv1.getAverage());
	System.out.println("Average 2: "+ sv2.getAverage());
    }
}
