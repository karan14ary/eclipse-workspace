package PowerCalculator;

public class PowerCalculator {
static int powerCalculator(int b,int e) {
	int p=1;
	for(int i=1;i<=e;i++) {//for loop for iteration of exponent 0 to e
		p=p*b;//get power raised base
	}

return p;
}

}
